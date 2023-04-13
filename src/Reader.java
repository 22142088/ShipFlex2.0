    import java.io.InputStream;
    import java.util.Scanner;

    public class Reader {
        private IO io;
        Reader(IO io) {
            this.io = io;
        }
        public int getNumBetweenTwoNums(int min, int max) {
            int input = 0;
            boolean validInput = false;
            while (!validInput) {
                if (io.hasNextInt()) {
                    input = io.nextInt();
                    if (input >= min && input <= max) {
                        validInput = true;
                    }
                    else {
                        io.nextLine();
                        io.println("Vekeerde input, probeer het opnieuw!");
                    }
                } else {
                    io.nextLine();
                    io.println("Vekeerde input, voer een nummer in!");
                }
            }
            return input;
        }
        public String getStringInput() {
            boolean validInput = false;
            String input = "";
            int i = 0;
            while (!validInput) {
                input = io.nextLine();
                if (!input.trim().isEmpty()) {
                    validInput = true;
                } else if (i >= 1) {
                    io.println("Vekeerde input, probeer het opnieuw!");
                }
                i++;
            }
            return input;
        }
    }
