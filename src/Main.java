import java.util.Scanner;


class Menu{

    public void printMenu(){
        System.out.println("1: offerte maken");
        System.out.println("2: klanten management");
        System.out.println("3: optie lijst");
    }

    public static void checkKeuze(int keuze){
        if(keuze == 1){
            System.out.println("offerte maken");
        }
        else if (keuze == 2){
            System.out.println("lijst met klanten");
        }
        else if (keuze == 3){
            System.out.println("lijst met opties");
        }
        else {
            System.out.println("geen geldige keuze");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.printMenu();
        System.out.println("Kies een optie in het menu");
        int input1 = scanner.nextInt();
        System.out.println("u heeft gekozen voor optie " + input1);
        Menu.checkKeuze(input1);
    }
}