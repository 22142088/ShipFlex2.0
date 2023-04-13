import java.util.ArrayList;
import java.util.List;

public class Offerte {
    private String klantnaam;
    private String bootType;
    private ArrayList<Optie> opties;

    public Offerte(String klantnaam, String bootType, ArrayList<Optie> opties) {
        this.klantnaam = klantnaam;
        this.bootType = bootType;
        this.opties = opties;
    }

    public String getKlantnaam() {
        return klantnaam;
    }

    public void setOpties(ArrayList<Optie> opties) {
        this.opties = opties;
    }

    public void setBootType(String bootType) {
        this.bootType = bootType;
    }

    public void setKlantnaam(String klantnaam) {
        this.klantnaam = klantnaam;
    }

    public String getBootType() {
        return bootType;
    }

    public List<Optie> getOpties() {
        return opties;
    }

    public void addOptie(Optie optie) {
        opties.add(optie);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Optie optie : opties) {
            if (optie.getSelected()) {
                totalPrice += optie.getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Offerte:\n");
        sb.append(String.format("Klantnaam: %s\n", klantnaam));
        sb.append(String.format("Bootttype: %s\n", bootType));
        sb.append("Gekozen opties:\n");
        for (Optie optie : opties) {
            if (optie.getSelected()) {
                sb.append(String.format("- %-25s| €%-6d\n", optie.getName(), optie.getPrice()));
            }
        }
        sb.append(String.format("Totaalprijs: €%d\n", calculateTotalPrice()));
        return sb.toString();

    }
        public double test () {
            double prijs = OptieLijst.prijsIndicatie(OptieLijst.getBootInput());
            return prijs;
        }
    }


