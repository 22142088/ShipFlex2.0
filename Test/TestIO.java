import java.util.ArrayList;

public class TestIO implements IO {
    private ArrayList<String> outputs = new ArrayList<>();
    @Override
    public void println(String tekst) {
        outputs.add(tekst);
    }

    @Override
    public void printf(String tekst, Object... args) {
        String txt = String.format(tekst, args);
        outputs.add(txt);
    }

    @Override
    public boolean hasNextInt() {
        return false;
    }

    @Override
    public String nextLine() {
        return null;
    }

    @Override
    public int nextInt() {
        return 0;
    }
}
