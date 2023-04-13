import java.util.ArrayList;
public class Menu {
    protected ArrayList<MenuItem> menu = new ArrayList<>();
    protected void printMenu(IO io) {
        Reader reader = new Reader(io);
        int index = 1;
        io.println("Kies uw optie:");
        for (MenuItem item : menu) {
            io.println(index + ": " + item.getName());
            index++;
        }
        menu.get((reader.getNumBetweenTwoNums(1, menu.size()))-1).execute(io);
    }
}
class HoofdMenu extends Menu {
    public void createMenu(IO io) {
        menu.add(new OfferteMakenItem("Offerte Maken"));
        menu.add(new KlantenManagnementItem("Klanten Management"));
        menu.add(new OptieOptiesItem("Opties Inzien"));
        menu.add(new ExitItem("Exit"));
        printMenu(io);
    }
}

class OptieKeuzeMenu extends Menu {
    public void createMenu(IO io) {
        menu.add(new BootOptieLijstItem("Alle Opties Inzien"));
        menu.add(new PrijsIndicatieItem("Prijs indicatie"));
        menu.add(new HoofdMenuItem("Terug"));
        printMenu(io);
    }
}
class KlantBeheerMenu extends Menu{
    public void createMenu(IO io) {
        menu.add(new PrintKlantenItem("Klanten inzien"));
        menu.add(new KlantToevoegenItem("Nieuwe klant toevoegen"));
        menu.add(new KlantAanpassenItem("Pas een klant aan"));
        menu.add(new KlantVerwijderenItem("Klant verwijderen"));
        menu.add(new HoofdMenuItem("Terug"));
        printMenu(io);
    }
}

class TerugMenu extends Menu {
    public void createMenu(IO io) {
        menu.add(new HoofdMenuItem("Terug"));
        printMenu(io);
    }
}