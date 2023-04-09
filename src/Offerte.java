import java.util.ArrayList;

public class Offerte {

    private String klantNaam;
    private String boottype;
    private ArrayList<Optie> gekozenOpties;
    private double totalePrijs;
    private double kortingsPercentage;
    public Offerte(String klantNaam, String bootType, ArrayList<Optie> gekozenOpties, double totalePrijs, double kortingsPercentage){
        this.klantNaam = klantNaam;
        this.boottype = bootType;
        this.gekozenOpties = gekozenOpties;
        this.totalePrijs = totalePrijs;
        this.kortingsPercentage = kortingsPercentage;

    }

    public String getKlantNaam() {
        return klantNaam;
    }

    public void setKlantNaam(String klantNaam) {
        this.klantNaam = klantNaam;
    }

    public ArrayList<Optie> getGekozenOpties() {
        return gekozenOpties;
    }

    public void setGekozenOpties(ArrayList<Optie> gekozenOpties) {
        this.gekozenOpties = gekozenOpties;
    }

    public double getTotalePrijs() {
        return totalePrijs;
    }

    public void setTotalePrijs(double totalePrijs) {
        this.totalePrijs = totalePrijs;
    }

    public String getBoottype() {
        return boottype;
    }

    public void setBoottype(String boottype) {
        this.boottype = boottype;
    }

    public double getKortingsPercentage() {
        return kortingsPercentage;
    }

    public void setKortingsPercentage(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    public double test() {
        ConsolePrinter printer = new ConsolePrinter();
        double prijs = OptieLijst.prijsIndicatie(OptieLijst.getBootInput());
        return prijs;
    }


}


