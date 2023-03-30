import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HoofdMenu hmenu = new HoofdMenu();
        hmenu.createMenu();
        hmenu.executeMenu(hmenu.printMenu());
    }
}