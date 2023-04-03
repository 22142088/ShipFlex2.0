import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    protected ArrayList<MenuItem> menu = new ArrayList<>();
    protected Scanner scanner = new Scanner(System.in);

    //hier worden de menu's geprint via de menu arraylist
    protected void printMenu() {
        int index = 1;
        System.out.println("Kies uw optie:");
        for (MenuItem item : menu) {
            System.out.println(index + ": " + item.getName());
            index++;
        }
        menu.get(scanner.nextInt()-1).execute();
    }
}
class HoofdMenu extends Menu {
    public void createMenu() {
        menu.add(new OfferteMakenItem("Offerte Maken"));
        menu.add(new KlantenManagnementItem("Klanten Managnement"));
        menu.add(new OptieOptiesItem("Opties Inzien"));
        printMenu();
    }
}

class OptieKeuzeMenu extends Menu {
    public void createMenu() {
        menu.add(new BootOptieLijstItem("Opties Inzien"));
        menu.add(new PrijsIndicatieItem("Prijs indicatie"));
        menu.add(new HoofdMenuItem("Terug"));
        printMenu();
    }
}
class TerugMenu extends Menu {
    public void createMenu() {
        menu.add(new HoofdMenuItem("Terug"));
        printMenu();
    }
}