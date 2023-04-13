
public class Main {
    private static IO io = new ConsoleIO();
    public static void main(String[] args) {
        OptieLijst.initialiseOptieLijst();
        new HoofdMenu().createMenu(io);
    }
}