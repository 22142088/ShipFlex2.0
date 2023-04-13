
public class Main {
    public static IO io = new ConsoleIO();
    public static void main(String[] args) {
        OptieLijst.initialiseOptieLijst();
        new HoofdMenu().createMenu(io);
    }
}