import java.util.Scanner;
public class Offerte {
    static Scanner scanner = new Scanner(System.in);
    public static double motorVragenLijst() {
        ConsolePrinter printer = new ConsolePrinter();
        printer.println("€" + OptieLijst.prijsIndicatie(OptieLijst.getBootInput()));

        return 0.00;
    }
}
