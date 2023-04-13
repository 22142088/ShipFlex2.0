
public class Main {
    public static IO printer = new ConsoleIO();
    public static void main(String[] args) {
        OptieLijst.initialiseOptieLijst();
        new HoofdMenu().createMenu();
    }
}