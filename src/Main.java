import java.util.Scanner;


class Menu{

    public static void printMenu(){
        System.out.println("1: offerte maken");
        System.out.println("2: klanten management");
        System.out.println("3: optie lijst");
    }

    public static void checkKeuze(int keuze) {
        switch (keuze) {
            case 1 -> {
                System.out.println("offerte maken");
            }
            case 2 -> {
                System.out.println("lijst met klanten");
            }
            case 3 -> {
                System.out.println("lijst met opties");
                Lijst.initialiseList();
                Lijst.printLijst();
            }
            default -> {
                System.out.println("geen geldige keuze");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.printMenu();
        System.out.println("Kies een optie in het menu");
        int input1 = scanner.nextInt();
        System.out.println("u heeft gekozen voor optie " + input1);
        Menu.checkKeuze(input1);
    }
}