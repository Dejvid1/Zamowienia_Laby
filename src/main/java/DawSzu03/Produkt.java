package DawSzu03;

public class Produkt {

    private String kod_Produktu;
    private float ilosc;
    private  String jednostka_Miary;

    public String getKod_Produktu() {
        return kod_Produktu;
    }
    public float getIlosc() {
        return ilosc;
    }
    public String getJednostka_Miary() {
        return jednostka_Miary;
    }

    public void setKod_Produktu(String kod_Produktu) {
        this.kod_Produktu = kod_Produktu;
    }
    public void setIlosc(float ilosc) {
        this.ilosc = ilosc;
    }
    public void setJednostka_Miary(String jednostka_Miary) {
        this.jednostka_Miary = jednostka_Miary;
    }
}
