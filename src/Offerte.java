public class Offerte {
    public double test() {
        ConsolePrinter printer = new ConsolePrinter();
        double prijs = OptieLijst.prijsIndicatie(OptieLijst.getBootInput());
        printer.println("€" + prijs);
        return prijs;
    }
}
