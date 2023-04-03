import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    protected ArrayList<MenuItem> menu = new ArrayList<>();
    protected Scanner scanner = new Scanner(System.in);

    //hier worden de menu's geprint via de menu arraylist
    protected int printMenu() {
        int index = 1;
        System.out.println("Kies uw optie:");
        for (MenuItem item : menu) {
            System.out.println(index + ": " + item.getName());
            index++;
        }
        return scanner.nextInt();
    }

    public void executeMenu() {
    }
}
class HoofdMenu extends Menu {
    public void createMenu() {
        menu.add(new OfferteMakenItem("Offerte Maken"));
        menu.add(new KlantenManagnementItem("Klanten Managnement"));
        menu.add(new OptieOptiesItem("Opties Inzien"));
        printMenu();
    }

    public void executeMenu(int input) {
        menu.get(input-1).execute();
    }
}

class BootMenu extends Menu {
    public void createMenu() {
        menu.add(new SpeedbootItem("Speedboot"));
        menu.add(new ZeilbootItem("Zeilboot"));
        menu.add(new VrachtSchipItem("Vrachtschip"));
        menu.add(new DinghyItem("Dinghy"));
        menu.add(new TerugItem("Terug"));

    }

    public void executeMenu(int input) {
        OptieLijst.initialiseOptieLijst();
        menu.get(input-1).execute();
    }
}
class OptieKeuzeMenu extends Menu {
    public void createMenu() {
        menu.add(new BootOptieLijstItem("Opties Inzien"));
        menu.add(new PrijsIndicatieItem("Prijs indicatie"));
        menu.add(new HoofdMenuItem("Terug"));
        printMenu();
    }
    public void executeMenu(int input) {
        menu.get(input-1).execute();
    }
}
class TerugMenu extends Menu {
    public void createMenu() {
        menu.add(new HoofdMenuItem("Terug"));
        printMenu();
    }
}