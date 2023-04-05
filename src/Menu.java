import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    protected ArrayList<MenuItem> menu = new ArrayList<>();
    protected Reader reader = new Reader();

    protected void printMenu() {
        int index = 1;
        ConsolePrinter printer = new ConsolePrinter();
        printer.println("Kies uw optie:");
        for (MenuItem item : menu) {
            printer.println(index + ": " + item.getName());
            index++;
        }
        menu.get((reader.getNumBetweenTwoNums(1, menu.size()))-1).execute();
    }
}
class HoofdMenu extends Menu {
    public void createMenu() {
        menu.add(new OfferteMakenItem("Offerte Maken"));
        menu.add(new KlantenManagnementItem("Klanten Management"));
        menu.add(new OptieOptiesItem("Opties Inzien"));
        printMenu();
    }
}

class OptieKeuzeMenu extends Menu {
    public void createMenu() {
        menu.add(new BootOptieLijstItem("Alle Opties Inzien"));
        menu.add(new PrijsIndicatieItem("Prijs indicatie"));
        menu.add(new HoofdMenuItem("Terug"));
        printMenu();
    }
}
class KlantBeheerMenu extends Menu{
    public void createMenu(){
        menu.add(new PrintKlantenItem("Klanten inzien"));
        menu.add(new KlantToevoegenItem("Nieuwe klant toevoegen"));
        menu.add(new KlantAanpassenItem("Pas een klant aan"));
        menu.add(new KlantVerwijderenItem("Klant verwijderen"));
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