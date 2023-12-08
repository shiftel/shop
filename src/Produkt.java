abstract public class Produkt {
    private double cena;
    private String name;
    private int ilosc_w_magazynie;
    private String opis;
    private String material;
    private String kolor;

    public Produkt(double cena, String name, int ilosc_w_magazynie, String opis, String material, String kolor) {
        this.cena = cena;
        this.name = name;
        this.ilosc_w_magazynie = ilosc_w_magazynie;
        this.opis = opis;
        this.material = material;
        this.kolor = kolor;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIlosc_w_magazynie() {
        return ilosc_w_magazynie;
    }

    public void setIlosc_w_magazynie(int ilosc_w_magazynie) {
        this.ilosc_w_magazynie = ilosc_w_magazynie;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
