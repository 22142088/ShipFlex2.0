import java.util.ArrayList;
import java.util.Scanner;





//    public static void checkKeuze(int keuze, Scanner scanner) {
//        switch (keuze) {
//            case 1 -> {
//                System.out.println("offerte maken");
//            }
//            case 2 -> {
//                System.out.println("lijst met klanten");
//            }
//            case 3 -> {
//                System.out.println("lijst met opties");
//                System.out.println("1: speedboat");
//                System.out.println("2: vrachtschip");
//                System.out.println("3: zeilboot");
//                System.out.println("4: dinghy");
//                System.out.println("kies een boot en voer het juiste nummer in");
//
//                int input2 = scanner.nextInt();
//                Lijst lijst = new Lijst();
//                Lijst.initialiseList();
//
//                if (input2 == 1){
//                    Lijst.printLijst(lijst.getLijstSpeedboot());
//                }else if (input2 == 2){
//                    Lijst.printLijst(lijst.getLijstVrachtschip());
//                }else if (input2 == 3){
//                    Lijst.printLijst(lijst.getLijstZeilboot());
//                }else if (input2 == 4){
//                    Lijst.printLijst(lijst.getLijstDinghy());
//                }else {
//                    System.out.println("niet geldig nummer uitgekozen");
//                }
//
//            }
//            default -> {
//                System.out.println("geen geldige keuze");
//            }
//        }
//    }
//

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoofdMenu hmenu = new HoofdMenu();
        hmenu.createMenu();
        hmenu.execute(hmenu.printMenu());
        //menu.createMenuItems();
        //Scanner scanner = new Scanner(System.in);
        //menu.printMenu();
//        System.out.println("Kies een optie in het menu");
       int input1 = sc.nextInt();
//        System.out.println("u heeft gekozen voor optie " + input1);
    }
}