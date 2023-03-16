import java.util.Scanner;
class Menu{

    public void printMenu(){
        System.out.println("1: offerte maken");
        System.out.println("2: klanten management");
        System.out.println("3: optie lijst");
        System.out.println("3: optie lijst");
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
    }
}