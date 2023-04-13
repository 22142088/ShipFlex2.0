    import java.io.InputStream;
    import java.util.Scanner;

    public class Reader {
        private Scanner sc;
        Reader() {
            this.sc = new Scanner(System.in);
        }
        Reader(InputStream inputStream) {
            this.sc = new Scanner(inputStream);
        }
        public int getNumBetweenTwoNums(int min, int max) {
            Scanner sc = new Scanner(System.in);
            int input = 0;
            boolean validInput = false;
            while (!validInput) {
                if (sc.hasNextInt()) {
                    input = sc.nextInt();
                    if (input >= min && input <= max) {
                        validInput = true;
                    }
                    else {
                        sc.nextLine();
                        Main.printer.println("Vekeerde input, probeer het opnieuw!");
                    }
                } else {
                    sc.nextLine();
                    Main.printer.println("Vekeerde input, voer een nummer in!");
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
                    Main.printer.println("Vekeerde input, probeer het opnieuw!");
                }
            }
            return input;
        }
    }
