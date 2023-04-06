import java.io.PrintStream;

public interface Printer {
    public void println(String tekst);
    public void printf(String tekst, Object ... args) ;
}
class ConsolePrinter implements Printer {
    public void println(String tekst) {
        System.out.println(tekst);
    }
    public void printf(String format, Object ... args) {
        System.out.printf(format, args);
    }
}
