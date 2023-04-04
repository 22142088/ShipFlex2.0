import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Klant {
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        List<Persoon> people = readDataFromFile("klanten.json");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Kies een optie:");
            System.out.println("1: Regristreer een nieuwe klant");
            System.out.println("2: Lijst Klanten");
            System.out.println("3: Klant aanpassen");
            System.out.println("0: Exit Klantmanagement");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Persoon> newPeople = getPeopleFromInput(scanner);
                    people.addAll(newPeople);
                    writeDataToFile(people, "klanten.json");
                    break;
                case 2:
                    printData(people);
                    break;
                case 3:
                    editPersoon(scanner, people, "klanten.json");
                    break;
                case 0:
                    System.out.println("Verlaten...");
                    break;
                default:
                    System.out.println("Onjuiste keuze");
                    break;
            }
        } while (choice != 0);
    }

    public static void writeDataToFile(List<Persoon> people, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(people, writer);
            System.out.println("Lijst geupdate: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Persoon> readDataFromFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(true);
            Persoon[] peopleArray = gson.fromJson(jsonReader, Persoon[].class);
            List<Persoon> peopleList = new ArrayList<>(Arrays.asList(peopleArray));
            System.out.println("Lijst opgehaald:");
            return peopleList;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void editPersoon(Scanner scanner, List<Persoon> people, String filePath) {
        System.out.print("Vul de naam in van de klant: ");
        String naam = scanner.nextLine();
        boolean found = false;
        for (Persoon persoon : people) {
            if (persoon.getNaam().equals(naam)) {
                System.out.print("Update de categorie waarin de klant zit: ");
                String kortingNaam = scanner.nextLine();
                persoon.setkortingNaam(kortingNaam);
                System.out.print("Update de korting percentage voor de klant: ");
                int kortingPercentage = scanner.nextInt();
                persoon.setkortingPercentage(kortingPercentage);
                found = true;
                break;
            }
        }
        if (found) {
            writeDataToFile(people, filePath);
            System.out.println("Klant gewijzigd!");
        } else {
            System.out.println("Persoon niet gevonden :(");
        }
    }

    private static List<Persoon> getPeopleFromInput(Scanner scanner) {
        List<Persoon> people = new ArrayList<>();
        while (true) {
            System.out.print("Vul een naam in (Type 'klaar' als u klaar bent): ");
            String naam = scanner.nextLine();
            if (naam.equalsIgnoreCase("klaar")) {
                break;
            }
            System.out.print("Vul de categorie van de klant in: ");
            String kortingNaam = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Vul de hoeveelheid korting de klant krijgt: ");
            int kortingPercentage = scanner.nextInt();
            scanner.nextLine();

            people.add(new Persoon(naam, kortingNaam, kortingPercentage));
        }
        return people;
    }

    private static void printData(List<Persoon> people) {
        for (Persoon persoon : people) {
            System.out.println("Naam: " + persoon.getNaam() + ", Categorie: " + persoon.getkortingNaam() + ", Korting: " + persoon.getkortingPercentage());
        }
    }

    private static class Persoon {
        private String naam;
        private String kortingNaam;
        private int kortingPercentage;

        public Persoon(String naam, String kortingNaam, int kortingPercentage) {
            this.naam = naam;
            this.kortingNaam = kortingNaam;
            this.kortingPercentage = kortingPercentage;
        }

        public String getNaam() {
            return naam;
        }

        public void setNaam(String naam) {
            this.naam = naam;
        }

        public String getkortingNaam() {
            return kortingNaam;
        }

        public void setkortingNaam(String kortingNaam) {
            this.kortingNaam = kortingNaam;
        }

        public int getkortingPercentage() {
            return kortingPercentage;
        }

        public void setkortingPercentage(int kortingPercentage) {
            this.kortingPercentage = kortingPercentage;
        }
    }
}

//class Klant {
//
//    protected String naam;
//    protected String kortingNaam;
//    protected int kortingPercentage;
//
//    public Klant(String naam, String kortingNaam, int kortingPercentage){
//        this.naam = naam;
//        this.kortingNaam = kortingNaam;
//        this.kortingPercentage = kortingPercentage;
//
//    }
//
//}
//
//class Particulier extends Klant {
//    public Particulier(String naam, String kortingNaam, int kortingPercentage) {
//        super(naam, kortingNaam, kortingPercentage);
//
//    }
//}
//
//class Bedrijf extends Klant{
//    public Bedrijf(String naam, String kortingNaam,int kortingPercentage){
//        super(naam, kortingNaam, kortingPercentage);
//}
//
//}
//
//class Overheid extends Klant {
//
//
//    public Overheid(String naam, String kortingNaam, int kortingPercentage) {
//        super(naam, kortingNaam, kortingPercentage);
//    }
//}


