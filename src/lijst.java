import java.util.ArrayList;

public class lijst {
    private ArrayList<Optie> lijst;

    public void addToLijst(Optie optie) {
        if (!lijst.contains(optie))
            lijst.add(optie);
        else {
            System.out.println("Optie staat al in de lijst.");
        }
    }
}
