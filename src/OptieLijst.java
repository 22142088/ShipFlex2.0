import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class OptieLijst {
    private static ArrayList<Optie> optieLijst = new ArrayList<>();
    public static void initialiseOptieLijst() {
        //speedboat
        //motor opties
        optieLijst.add(new Optie("standaard motor", "standaart 2000pk motor", 1000, "Speedboot", "motor", false));
        optieLijst.add(new Optie("sport motor", "sport uitvoering 2500pk motor", 1000, "Speedboot", "motor", false));
        optieLijst.add(new Optie("electrische motor", "standaart 200pk motor", 1000, "Speedboot", "motor", false));
        optieLijst.add(new Optie("zuinige motor", "zuinige 1800pk motor", 1000, "Speedboot", "motor",false));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Speedboot", "verf", false));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Speedboot", "verf", false));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout", "gerecycled hout wat gehaald is van andere schepen", 300, "Speedboot", "materiaal", false));
        optieLijst.add(new Optie("hout", "hout van de hout markt type ligt aan de soort die beschikbaar is", 300, "Speedboot", "materiaal", false));
        optieLijst.add(new Optie("aluminium", "aluminium ", 300, "Speedboot", "materiaal", false));
        optieLijst.add(new Optie("glasvezel", "glasvezel", 300, "Speedboot", "materiaal", false));
        optieLijst.add(new Optie("carbon fiber", "voor de luxe afwerking van het schip", 300, "Speedboot", "materiaal", false));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Speedboot", "cockpit", false));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Speedboot", "cockpit", false));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Speedboot", "cockpit", false));

        //vrachtschip
        //motor opties
        optieLijst.add(new Optie("standaard motor", "50000 pk motor", 10000, "Vrachtschip", "motor", false));
        optieLijst.add(new Optie("millieu vriendelijke motor", "45000 pk motor", 12000, "Vrachtschip", "motor", false));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Vrachtschip", "verf", false));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Vrachtschip", "verf", false));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled aluminium", "standaard verf die word aangebracht op de hul van uw boot", 200, "Vrachtschip", "materiaal", false));
        optieLijst.add(new Optie("aluminium", "aluminium", 300, "Vrachtschip", "materiaal", false));
        optieLijst.add(new Optie("glasvezel", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Vrachtschip", "materiaal", false));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Vrachtschip", "cockpit", false));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Vrachtschip", "cockpit", false));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Vrachtschip", "cockpit", false));

        //zeilboot
        //motor opties
        optieLijst.add(new Optie("standaard motor", "standaart 100pk motor", 1000, "Zeilboot", "motor", false));
        optieLijst.add(new Optie("electrische motor", "80pk motor", 1200, "Zeilboot", "motor", false));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Zeilboot", "verf", false));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Zeilboot", "verf", false));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout", "hout dat is gered van andere schepen", 200, "Zeilboot", "materiaal", false));
        optieLijst.add(new Optie("hout", "hout van de hout markt type ligt aan de soort die beschikbaar is", 300, "Zeilboot", "materiaal", false));
        optieLijst.add(new Optie("aluminium", "aluminium", 300, "Zeilboot", "materiaal", false));
        optieLijst.add(new Optie("glasvezel", "glasvezel", 300, "Zeilboot", "materiaal", false));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Zeilboot", "cockpit", false));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Zeilboot", "cockpit", false));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Zeilboot", "cockpit", false));
        //zeil
        optieLijst.add(new Optie("standaard", "standaard zeil", 300, "Zeilboot", "zeil", false));
        optieLijst.add(new Optie("gerecycled", "millieu vriendelijke optie", 300, "Zeilboot", "zeil", false));
        optieLijst.add(new Optie("met print", "een zeil met custom print erop die u levert", 300, "Zeilboot", "zeil", false));

        //dinghy
        //motor opties
        optieLijst.add(new Optie("standaard motor", "standaart 15pk motor", 1000, "Dinghy", "motor", false));
        optieLijst.add(new Optie("sportieve motor", "sportuitvoering 30pk motor", 1000, "Dinghy", "motor", false));
        optieLijst.add(new Optie("zuinige motor", "milieu vriendelijke 15pk motor", 1000, "Dinghy", "motor", false));
        //verf opties
        optieLijst.add(new Optie("standaard verf", "standaard verf die word aangebracht op de hul van uw boot", 200, "Dinghy", "verf", false));
        optieLijst.add(new Optie("millieu vriendelijke verf", "millieu vriendelijke verf die geen gifstoffen afgeeft", 300, "Dinghy", "verf", false));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout", "hout dat is gered van andere schepen", 200, "Dinghy", "materiaal", false));
        optieLijst.add(new Optie("hout", "hout van de hout markt type ligt aan de soort die beschikbaar is", 300, "Dinghy", "materiaal", false));
        optieLijst.add(new Optie("rubber", "beschikbaar rubber", 300, "Dinghy", "materiaal", false));
        //cockpit
        optieLijst.add(new Optie("basic", "voor de basic cockpit van het schip daaronder valt...", 300, "Dinghy", "cockpit", false));
        optieLijst.add(new Optie("luxe", "voor de luxe cockpit van het schip daaronder valt...", 300, "Dinghy", "cockpit", false));
        optieLijst.add(new Optie("advanced", "voor de advanced afwerking van het schip hieronder valt...", 300, "Dinghy", "cockpit", false));
    }
    public static ArrayList<Optie> getLijst() {
        return optieLijst;
    }
    public static void printLijst(String bootType) {
        ArrayList<String> categorieLijst = new ArrayList<>();
        ConsolePrinter printer = new ConsolePrinter();
        for (Optie optie : optieLijst) {
            if (bootType.equalsIgnoreCase(optie.getBootType())) {
                if (!categorieLijst.contains(optie.getCategory())) {
                    categorieLijst.add(optie.getCategory());
                }
            }
        }
        for (String categorie : categorieLijst) {
            printer.println("\n" + categorie.substring(0, 1).toUpperCase() + categorie.substring(1));
            for (Optie optie : optieLijst) {
                if (categorie.equalsIgnoreCase(optie.getCategory())) {
                    if (bootType.equals(optie.getBootType())) {
                        printer.printf("%-30s| %-70s| €%-6d| %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    }
                }
            }
        }
    }

    public static int prijsIndicatie(String bootType) {
        int prijs = 0;
        int index = 1;
        ArrayList<Optie> tempLijst = new ArrayList<>();
        ArrayList<String> categorieLijst = new ArrayList<>();
        ConsolePrinter printer = new ConsolePrinter();
        Reader reader = new Reader();
        for (Optie optie : optieLijst) {
            if (bootType.equalsIgnoreCase(optie.getBootType())) {
                tempLijst.add(optie);
                if (!categorieLijst.contains(optie.getCategory())) {
                    categorieLijst.add(optie.getCategory());
                }
            }
        }
        for (String categorie : categorieLijst) {
            int index2 = index;
            printer.println("\n" + categorie.substring(0, 1).toUpperCase() + categorie.substring(1));
            for (Optie optie : optieLijst) {
                if (categorie.equalsIgnoreCase(optie.getCategory())) {
                    if (bootType.equalsIgnoreCase(optie.getBootType())) {
                        printer.printf("%-3d: %-25s| %-70s| €%-6d| %s\n", index, optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                        index++;
                    }
                }
            }
            prijs += tempLijst.get(reader.getNumBetweenTwoNums(index2, index-1)-1).getPrice();

        }
        return prijs;
    }
    public static String getBootInput() {
        int index = 0;
        Reader reader = new Reader();
        ConsolePrinter printer = new ConsolePrinter();
        ArrayList<String> bootTypeLijst = new ArrayList<>();
        for (Optie optie : optieLijst) {
            if (!bootTypeLijst.contains(optie.getBootType())) {
                bootTypeLijst.add(optie.getBootType());

            }
        }
        for (String bootType : bootTypeLijst) {
            index++;
            printer.printf("%-3d: %s\n", index, bootType);
        }
        return bootTypeLijst.get(reader.getNumBetweenTwoNums(1, index)-1);
    }
}