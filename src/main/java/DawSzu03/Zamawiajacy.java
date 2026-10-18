package DawSzu03;

public class Zamawiajacy {

    private  String imie;
    private  String nazwisko;
    private  String email;
    private  String numer_telefonu;

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public String getNumer_telefonu() {
        return numer_telefonu;
    }
    public String getEmail() {
        return email;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public String getImie() {
        return imie;
    }

}
