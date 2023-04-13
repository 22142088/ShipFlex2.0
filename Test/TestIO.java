import java.util.ArrayList;

public class TestIO implements IO {
    private ArrayList<String> outputs = new ArrayList<>();
    private ArrayList<Integer> nextIntInputs = new ArrayList<>();
    private ArrayList<String> nextStringInputs = new ArrayList<>();
    int intInputIndex = 0;
    int stringInputIndex = 0;

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
        return true;
    }

    @Override
    public String nextLine() {
        stringInputIndex++;
        return nextStringInputs.get(stringInputIndex-1);

    }

    @Override
    public int nextInt() {
        intInputIndex++;
        return nextIntInputs.get(intInputIndex-1);
    }

    public ArrayList<String> getOutputs() {
        return outputs;
    }
    public ArrayList<Integer> getNextIntInputs() {
        return nextIntInputs;
    }
    public void setNextIntInputs(ArrayList<Integer> nextIntInputs) {
        this.nextIntInputs = nextIntInputs;
    }
    public void addNextIntInputs(int input) {
        nextIntInputs.add(input);
    }
    public ArrayList<String> getNextStringInputs() {
        return nextStringInputs;
    }
    public void setNextStringInputs(ArrayList<String> nextStringInputs) {
        this.nextStringInputs = nextStringInputs;
    }
    public void addNextStringInputs(String input) {
        nextStringInputs.add(input);
    }
}

