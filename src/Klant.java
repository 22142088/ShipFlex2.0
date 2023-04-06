public class Klant {
    private String naam;
    private int kortingspercentage;
    Klant(String naam, int kortingspercentage) {
        this.naam = naam;
        this.kortingspercentage = kortingspercentage;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public int getKortingspercentage() {
        return kortingspercentage;
    }
    public void setkortingspercentage(int kortingspercentage) {
        this.kortingspercentage = kortingspercentage;
    }
}