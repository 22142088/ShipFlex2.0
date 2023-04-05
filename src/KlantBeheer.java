import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class KlantBeheer {
    String filePath = "klanten.json";
    Reader reader = new Reader();
    ArrayList<Klant> klanten = new ArrayList<>();
    ConsolePrinter printer = new ConsolePrinter();
    KlantBeheer() {
        readDataFromFile();
    }
    private static final Gson gson = new Gson();

    public void Menu() {
        int choice;
        do {
            printer.println("Kies een optie:");
            printer.println("1: Regristreer een nieuwe klant");
            printer.println("2: Weergeef alle klanten");
            printer.println("3: Klant aanpassen");
            printer.println("0: Terug");

            choice = reader.getNumBetweenTwoNums(0,3);

            switch (choice) {
                case 1:
                    addKlant();
                    writeDataToFile();
                    break;
                case 2:
                    printData();
                    break;
                case 3:
                    editKlant();
                    break;
                case 0:
                    new HoofdMenu().createMenu();
                default:
                    printer.println("Onjuiste keuze");
                    break;
            }
        } while (choice != 0);
    }

    public void writeDataToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(klanten, writer);
            printer.println("Lijst geupdate: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() {
        try (FileReader reader = new FileReader(filePath)) {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(true);
            Klant[] klantenArray = gson.fromJson(jsonReader, Klant[].class);
            klanten.clear();
            klanten.addAll(Arrays.asList(klantenArray));
            printer.println("Klanten lijst opgehaald van " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editKlant() {
        printer.println("Vul de naam in van de klant: ");
        String naam = reader.getStringInput();
        boolean found = false;
        for (Klant klant : klanten) {
            if (klant.getNaam().equals(naam)) {
                printer.println("Update de kortingspercentage voor de klant: ");
                int kortingspercentage = reader.getNumBetweenTwoNums(0,100);
                klant.setkortingspercentage(kortingspercentage);
                found = true;
                break;
            }
        }
        if (found) {
            writeDataToFile();
            printer.println("Klant gewijzigd!");
        } else {
            printer.println("Persoon niet gevonden :(");
        }
    }

    private void addKlant() {
        int kortingspercentage = 0;
        String naam = "";
        while (true) {
            printer.println("Vul een naam in: ");
            naam = reader.getStringInput();
            printer.println("Vul het kortingspercentage in die de klant krijgt: ");
            kortingspercentage = reader.getNumBetweenTwoNums(0,100);
            klanten.add(new Klant(naam, kortingspercentage));
        }
    }

    private void printData() {
        for (Klant klant : klanten) {
            printer.printf("Naam: %s, Kortingspercentage: %d", klant.getNaam(), klant.getKortingspercentage());
        }
    }
}