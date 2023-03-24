import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    protected String menuNaam;
    protected ArrayList<MenuItem> menu = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public int printMenu() {
        int index = 1;
        System.out.println("Kies uw optie:");
        for (MenuItem item : menu) {
            System.out.println(index + ": " + item.getName());
            index++;
        }
        return sc.nextInt();
    }
}
class HoofdMenu extends Menu {
    public void createMenu() {
        menu.add(new OfferteMakenItem("Offerte Maken"));
        menu.add(new KlantenManagnementItem("Klanten Managnement"));
        menu.add(new OptieLijstItem("Opties Inzien"));
    }

    public void execute(int input) {
        menu.get(input-1).execute();
    }
}
class BootMenu extends Menu {
    public void createMenu() {
        menu.add(new SpeedbootItem("Speedboot"));
        menu.add(new ZeilbootItem("Zeilboot"));
        menu.add(new VrachtSchipItem("Vrachtschip"));
        menu.add(new DinghyItem("Dinghy"));
    }
    public void execute(int input) {
        Lijst lijst = new Lijst();
        lijst.addLists();
        lijst.initialiseList();
        lijst.printLijst(lijst.getLijst(),input);
    }
}