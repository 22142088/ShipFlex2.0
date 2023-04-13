import java.util.Scanner;

interface IO {
    public void println(String tekst);
    public void printf(String tekst, Object ... args) ;
    public boolean hasNextInt();
    public String nextLine();
    public int nextInt();
}
class ConsoleIO implements IO {
    public void println(String tekst) {
        System.out.println(tekst);
    }
    public void printf(String format, Object ... args) {
        System.out.printf(format, args);
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public boolean hasNextInt() {
        return sc.hasNextInt();
    }

    @Override
    public String nextLine() {
        return sc.nextLine();
    }

    @Override
    public int nextInt() {
        return sc.nextInt();
    }
}