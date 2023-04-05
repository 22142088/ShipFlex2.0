import java.util.Scanner;

public class Reader {
    private Scanner sc;
    Reader() {
        this.sc = new Scanner(System.in);
    }
    public int getNumBetweenTwoNums(int start, int end) {
        boolean validInput = false;
        int input = -1;
        ConsolePrinter printer = new ConsolePrinter();
        while (!validInput) {
            input = sc.nextInt();
            if (input >= start && input <= end) {
                validInput = true;
            }
            else if (input == 69 || input == 420) {
                printer.println("Nice.");
            }
            else {
                printer.println("Vekeerde input, probeer het opnieuw!");
            }
        }
        return input;
    }

    public String getStringInput() {
        boolean validInput = false;
        String input = "";
        while (!validInput) {
            input = sc.nextLine();
            if (!input.trim().isEmpty()) {
                validInput = true;
            } else {
                System.out.println("Vekeerde input, probeer het opnieuw!");
            }
        }
        return input;
    }
}
