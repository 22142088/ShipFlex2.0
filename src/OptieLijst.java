import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class OptieLijst {

    private static ArrayList<Optie> optieLijst = new ArrayList<>();


    public static void initialiseOptieLijst() {
        //speedboat
        //motor opties
        optieLijst.add(new Optie("standaard motor", "standaart 2000pk motor", 1000, "Speedboot", "motor"));
        optieLijst.add(new Optie("sport motor", "sport uitvoering 2500pk motor", 1000, "Speedboot", "motor"));
        optieLijst.add(new Optie("electrische motor", "standaart 200pk motor", 1000, "Speedboot", "motor"));
        optieLijst.add(new Optie("zuinige motor", "zuinige 1800pk motor", 1000, "Speedboot", "motor"));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Speedboot", "verf"));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Speedboot", "verf"));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout", "gerecycled hout wat gehaald is van andere schepen", 300, "Speedboot", "materiaal"));
        optieLijst.add(new Optie("hout", "hout van de hout markt type ligt aan de soort die beschikbaar is", 300, "Speedboot", "materiaal"));
        optieLijst.add(new Optie("aluminium", "aluminium ", 300, "Speedboot", "materiaal"));
        optieLijst.add(new Optie("glasvezel", "glasvezel", 300, "Speedboot", "materiaal"));
        optieLijst.add(new Optie("carbon fiber", "voor de luxe afwerking van het schip", 300, "Speedboot", "materiaal"));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Speedboot", "cockpit"));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Speedboot", "cockpit"));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Speedboot", "cockpit"));

        //vrachtschip
        //motor opties
        optieLijst.add(new Optie("standaard motor", "50000 pk motor", 10000, "Vrachtschip", "motor"));
        optieLijst.add(new Optie("zuinige millieu vriendelijke motor", "45000 pk motor", 12000, "Vrachtschip", "motor"));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Vrachtschip", "verf"));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Vrachtschip", "verf"));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled aluminium", "standaard verf die word aangebracht op de hul van uw boot", 200, "Vrachtschip", "materiaal"));
        optieLijst.add(new Optie("aluminium", "aluminium", 300, "Vrachtschip", "materiaal"));
        optieLijst.add(new Optie("glasvezel", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Vrachtschip", "materiaal"));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Vrachtschip", "cockpit"));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Vrachtschip", "cockpit"));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Vrachtschip", "cockpit"));

        //zeilboot
        //motor opties
        optieLijst.add(new Optie("standaard motor", "standaart 100pk motor", 1000, "Zeilboot", "motor"));
        optieLijst.add(new Optie("electrische motor", "80pk motor", 1200, "Zeilboot", "motor"));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Zeilboot", "verf"));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Zeilboot", "verf"));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout", "hout dat is gered van andere schepen", 200, "Zeilboot", "materiaal"));
        optieLijst.add(new Optie("hout", "hout van de hout markt type ligt aan de soort die beschikbaar is", 300, "Zeilboot", "materiaal"));
        optieLijst.add(new Optie("aluminium", "aluminium", 300, "Zeilboot", "materiaal"));
        optieLijst.add(new Optie("glasvezel", "glasvezel", 300, "Zeilboot", "materiaal"));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Zeilboot", "cockpit"));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Zeilboot", "cockpit"));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Zeilboot", "cockpit"));
        //zeil
        optieLijst.add(new Optie("standaard", "standaard zeil", 300, "Zeilboot", "zeil"));
        optieLijst.add(new Optie("gerecycled", "millieu vriendelijke optie", 300, "Zeilboot", "zeil"));
        optieLijst.add(new Optie("met print", "een zeil met custom print erop die u levert", 300, "Zeilboot", "zeil"));

        //dinghy
        //motor opties
        optieLijst.add(new Optie("standaard motor", "standaart 15pk motor", 1000, "Dinghy", "motor"));
        optieLijst.add(new Optie("sportieve motor", "sportuitvoering 30pk motor", 1000, "Dinghy", "motor"));
        optieLijst.add(new Optie("zuinige motor", "milieu vriendelijke 15pk motor", 1000, "Dinghy", "motor"));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Dinghy", "verf"));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Dinghy", "verf"));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout", "hout dat is gered van andere schepen", 200, "Dinghy", "materiaal"));
        optieLijst.add(new Optie("hout", "hout van de hout markt type ligt aan de soort die beschikbaar is", 300, "Dinghy", "materiaal"));
        optieLijst.add(new Optie("rubber", "beschikbaar rubber", 300, "Dinghy", "materiaal"));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Dinghy", "cockpit"));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Dinghy", "cockpit"));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Dinghy", "cockpit"));
    }

    public static ArrayList<Optie> getLijst() {
        return optieLijst;
    }

    public static ArrayList<Optie> printCategorie(String bootType, String categorie) {
        ArrayList<Optie> tempLijst = new ArrayList<>();
        int index = 1;
        for (Optie optie : optieLijst) {
            if (bootType.equalsIgnoreCase(optie.getBootType())) {
                if (categorie.equalsIgnoreCase(optie.getCategory())) {
                    tempLijst.add(optie);
                    System.out.printf(" %d: %-25s| %-70s| €%-6d| %s\n", index, optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    index++;
                }
            }
        }
        return tempLijst;
    }

    


    public static void printLijst(String bootType) {
        ArrayList<String> categorieLijst = new ArrayList<>();
        // prints every optie in lijst and their information
        for (Optie optie : optieLijst) {
            if (bootType.equalsIgnoreCase(optie.getBootType())) {
                if (!categorieLijst.contains(optie.getCategory())) {
                    categorieLijst.add(optie.getCategory());
                }
            }
        }
        for (String categorie : categorieLijst) {
            System.out.println("\n" + categorie.substring(0, 1).toUpperCase() + categorie.substring(1));
            for (Optie optie : optieLijst) {
                if (categorie.equalsIgnoreCase(optie.getCategory())) {
                    if (bootType.equals(optie.getBootType())) {
                        System.out.printf("%-25s| %-70s| €%-6d| %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    }
                }
            }
        }

    }
}

