package DawSzu03;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import tools.jackson.databind.ObjectMapper;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.setProperty("org.apache.commons.configuration2.io.FileLocationStrategy.schemes", "file,http,https,jar,nested");
        Parameters params = new Parameters();
        FileBasedConfigurationBuilder<PropertiesConfiguration> builder =
                new FileBasedConfigurationBuilder<>(PropertiesConfiguration.class)
                        .configure(params.properties()
                                .setFileName("appsettings.properties"));
        try {
            Configuration config = builder.getConfiguration();
            String sciezka = config.getString("sciezka_katalog_zamowien");

            System.out.println("Sciezka do katalogu zamowien to: " + sciezka);

            File katalog = new File(sciezka);

            if (katalog.exists()) {
                File[] plikiJson = katalog.listFiles();

                if (plikiJson != null) {
                    ObjectMapper objectMapper = new ObjectMapper();

                    for (File plik : plikiJson) {
                        if (plik.isFile() && plik.getName().endsWith(".json")) {
                            Zamowienie wczytaneZamowienie = objectMapper.readValue(plik, Zamowienie.class);
                            System.out.println("Wczytano plik: " + plik.getName());
                            System.out.println("Zamawiajacy: " + wczytaneZamowienie.getZamawiajacy().getImie() + " " +
                                    wczytaneZamowienie.getZamawiajacy().getNazwisko());
                        }
                    }
                }
            }
        } catch(Exception ex) {
            System.err.println("Wystapil blad: ");
            ex.printStackTrace();
        }
    }
}