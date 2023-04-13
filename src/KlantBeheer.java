import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class KlantBeheer {
    String filePath = "klanten.json";
    Reader reader;
    IO io;
    ArrayList<Klant> klanten = new ArrayList<>();
    KlantBeheer(IO io) {
        reader = new Reader(io);
        this.io = io;
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
        io.println("Vul de naam in van de klant: ");
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
            io.println("Persoon niet gevonden :(");
        } else {
            writeDataToFile();
            io.println("Klant verwijderd!");
        }
        new KlantBeheerMenu().createMenu(io);
    }
    public void editKlant() {
        io.println("Vul de naam in van de klant: ");
        String naam = reader.getStringInput();
        boolean persoonBestaat = false;
        for (Klant klant : klanten) {
            if (klant.getNaam().equals(naam)) {
                io.println("Niewue naam voor de klant: ");
                String newNaam = reader.getStringInput();
                klant.setNaam(newNaam);
                io.println("Nieuwe kortingspercentage voor de klant: ");
                int kortingspercentage = reader.getNumBetweenTwoNums(0,100);
                klant.setkortingspercentage(kortingspercentage);
                persoonBestaat = true;
                break;
            }
        }
        if (!persoonBestaat) {
            io.println("Persoon niet gevonden :(");
        } else {
            writeDataToFile();
            io.println("Klant gewijzigd!");
        }
        new KlantBeheerMenu().createMenu(io);
    }

    public void addKlant() {
        int kortingspercentage = 0;
        String naam = "";
        io.println("Vul de klant zijn naam in: ");
        naam = reader.getStringInput();
        io.println("Vul de klant zijn kortingspercentage in: ");
        kortingspercentage = reader.getNumBetweenTwoNums(0,100);
        klanten.add(new Klant(naam, kortingspercentage));
        writeDataToFile();
        io.println("De klant is toegevoegd.");
        new KlantBeheerMenu().createMenu(io);
    }
    public void printData() {
        for (Klant klant : klanten) {
            io.printf("Naam: %s, Kortingspercentage: %d \n", klant.getNaam(), klant.getKortingspercentage());
        }
        io.println("");
    }
}