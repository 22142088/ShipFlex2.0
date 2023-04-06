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
    public void writeDataToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(klanten, writer);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deleteKlant() {
        printer.println("Vul de naam in van de klant: ");
        String naam = reader.getStringInput();
        boolean persoonBestaat = false;
        for (Klant klant : klanten) {
            if (klant.getNaam().equals(naam)) {
                klanten.remove(klant);
                persoonBestaat = true;
                break;
            }
        }
        if (!persoonBestaat) {
            printer.println("Persoon niet gevonden :(");
        } else {
            writeDataToFile();
            printer.println("Klant verwijderd!");
        }
        new KlantBeheerMenu().createMenu();
    }
    public void editKlant() {
        printer.println("Vul de naam in van de klant: ");
        String naam = reader.getStringInput();
        boolean persoonBestaat = false;
        for (Klant klant : klanten) {
            if (klant.getNaam().equals(naam)) {
                printer.println("Niewue naam voor de klant: ");
                String newNaam = reader.getStringInput();
                klant.setNaam(newNaam);
                printer.println("Nieuwe kortingspercentage voor de klant: ");
                int kortingspercentage = reader.getNumBetweenTwoNums(0,100);
                klant.setkortingspercentage(kortingspercentage);
                persoonBestaat = true;
                break;
            }
        }
        if (!persoonBestaat) {
            printer.println("Persoon niet gevonden :(");
        } else {
            writeDataToFile();
            printer.println("Klant gewijzigd!");
        }
        new KlantBeheerMenu().createMenu();
    }

    public void addKlant() {
        int kortingspercentage = 0;
        String naam = "";
        printer.println("Vul de klant zijn naam in: ");
        naam = reader.getStringInput();
        printer.println("Vul de klant zijn kortingspercentage in: ");
        kortingspercentage = reader.getNumBetweenTwoNums(0,100);
        klanten.add(new Klant(naam, kortingspercentage));
        writeDataToFile();
        printer.println("De klant is toegevoegd.");
        new KlantBeheerMenu().createMenu();
    }
    public void printData() {
        for (Klant klant : klanten) {
            printer.printf("Naam: %s, Kortingspercentage: %d \n", klant.getNaam(), klant.getKortingspercentage());
        }
        printer.println("");
    }
}