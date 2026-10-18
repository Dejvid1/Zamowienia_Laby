package DawSzu03;

import java.util.List;

public class Zamowienie {
    private Zamawiajacy zamawiajacy;
    private List<Produkt> produkty;

    public Zamawiajacy getZamawiajacy() {
        return zamawiajacy;
    }
    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setZamawiajacy(Zamawiajacy zamawiajacy) {
        this.zamawiajacy = zamawiajacy;
    }
    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }
}