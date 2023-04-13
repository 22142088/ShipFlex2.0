
public class Main {
    public static Printer printer = new ConsolePrinter();
    public static void main(String[] args) {
        OptieLijst.initialiseOptieLijst();
        new HoofdMenu().createMenu();

    }
}