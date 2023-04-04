import java.util.Scanner;

public class Reader {
    Reader() {}
    public int getNumBetweenTwoNums(int start, int end) {
        boolean validInput = false;
        int input = -1;
        ConsolePrinter printer = new ConsolePrinter();
        Scanner sc = new Scanner(System.in);
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
}
