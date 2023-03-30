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
        menu.add(new OptieLijstItem("Opties Inzien"));

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
        OptieLijst.addLists();
        OptieLijst.initialiseList();
        menu.get(input-1).execute();
    }
}





//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Menu {
//    protected ArrayList<MenuItem> menu = new ArrayList<>();
//    private Scanner sc = new Scanner(System.in);
//    public int printMenu() {
//        int index = 1;
//        System.out.println("Kies uw optie:");
//        for (MenuItem item : menu) {
//            System.out.println(index + ": " + item.getName());
//            index++;
//        }
//        return sc.nextInt();
//    }
//}
//class HoofdMenu extends Menu {
//    public void createMenu() {
//        menu.add(new OfferteMakenItem("Offerte Maken"));
//        menu.add(new KlantenManagnementItem("Klanten Managnement"));
//        menu.add(new OptieLijstItem("Opties Inzien"));
//    }
//
//    public void execute(int input) {
//        menu.get(input-1).execute();
//    }
//}
//class BootMenu extends Menu {
//    public void createMenu() {
//        menu.add(new SpeedbootItem("Speedboot"));
//        menu.add(new ZeilbootItem("Zeilboot"));
//        menu.add(new VrachtSchipItem("Vrachtschip"));
//        menu.add(new DinghyItem("Dinghy"));
//        menu.add(new TerugItem("Terug"));
//    }
//    public void execute(int input) {
//        Lijst.addLists();
//        Lijst.initialiseList();
//        menu.get(input-1).execute();
//    }
//}