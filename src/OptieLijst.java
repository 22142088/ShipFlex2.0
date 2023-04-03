import java.util.ArrayList;
import java.util.Calendar;

public class OptieLijst {

    private static ArrayList<Optie> optieLijst = new ArrayList<>();
    private static ArrayList<String> categorieLijst = new ArrayList<>();
    public static void initialiseOptieLijst() {
        //speedboat
        //motor opties
        optieLijst.add(new Optie("standaard motor","standaart 2000pk motor",1000,"speedboot","motor" ));
        optieLijst.add(new Optie("sport motor","sport uitvoering 2500pk motor",1000,"speedboot","motor" ));
        optieLijst.add(new Optie("electrische motor","standaart 200pk motor",1000,"speedboot","motor" ));
        optieLijst.add(new Optie("zuinige motor","zuinige 1800pk motor",1000,"speedboot","motor" ));
        //verf opties
        optieLijst.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"speedboot","verf" ));
        optieLijst.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"speedboot","verf" ));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout","gerecycled hout wat gehaald is van andere schepen",300,"speedboot","materiaal" ));
        optieLijst.add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"speedboot","materiaal" ));
        optieLijst.add(new Optie("aluminium","aluminium ",300,"speedboot","materiaal" ));
        optieLijst.add(new Optie("glasvezel","glasvezel",300,"speedboot","materiaal" ));
        optieLijst.add(new Optie("carbon fiber","voor de luxe afwerking van het schip",300,"speedboot","materiaal" ));
        //cockpit
        optieLijst.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"speedboot","cockpit" ));
        optieLijst.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"speedboot","cockpit" ));
        optieLijst.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"speedboot","cockpit" ));

        //vrachtschip
        //motor opties
        optieLijst.add(new Optie("standaard motor","50000 pk motor",10000,"vrachtschip","motor" ));
        optieLijst.add(new Optie("zuinige millieu vriendelijke motor","45000 pk motor",12000,"vrachtschip","motor" ));
        //verf opties
        optieLijst.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"vrachtschip","verf" ));
        optieLijst.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"vrachtschip","verf" ));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled aluminium","standaard verf die word aangebracht op de hul van uw boot",200,"vrachtschip","materiaal" ));
        optieLijst.add(new Optie("aluminium","aluminium",300,"vrachtschip","materiaal" ));
        optieLijst.add(new Optie("glasvezel","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"vrachtschip","materiaal" ));
        //cockpit
        optieLijst.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"vrachtschip","cockpit" ));
        optieLijst.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"vrachtschip","cockpit" ));
        optieLijst.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"vrachtschip","cockpit" ));

        //zeilboot
        //motor opties
        optieLijst.add(new Optie("standaard motor","standaart 100pk motor",1000,"zeilboot","motor" ));
        optieLijst.add(new Optie("electrische motor","80pk motor",1200,"zeilboot","motor" ));
        //verf opties
        optieLijst.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"zeilboot","verf" ));
        optieLijst.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"zeilboot","verf" ));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"zeilboot","materiaal" ));
        optieLijst.add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"zeilboot","materiaal" ));
        optieLijst.add(new Optie("aluminium","aluminium",300,"zeilboot","materiaal" ));
        optieLijst.add(new Optie("glasvezel","glasvezel",300,"zeilboot","materiaal" ));
        //cockpit
        optieLijst.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"zeilboot","cockpit" ));
        optieLijst.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"zeilboot","cockpit" ));
        optieLijst.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"zeilboot","cockpit" ));
        //zeil
        optieLijst.add(new Optie("standaard","standaard zeil",300,"zeilboot","zeil" ));
        optieLijst.add(new Optie("gerecycled","millieu vriendelijke optie",300,"zeilboot","zeil" ));
        optieLijst.add(new Optie("met print","een zeil met custom print erop die u levert",300,"zeilboot","zeil" ));

        //dinghy
        //motor opties
        optieLijst.add(new Optie("standaard motor","standaart 15pk motor",1000,"dinghy","motor" ));
        optieLijst.add(new Optie("sportieve motor","sportuitvoering 30pk motor",1000,"dinghy","motor" ));
        optieLijst.add(new Optie("zuinige motor","milieu vriendelijke 15pk motor",1000,"dinghy","motor" ));
        //verf opties
        optieLijst.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"dinghy","verf" ));
        optieLijst.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"dinghy","verf" ));
        //schipmateriaal opties
        optieLijst.add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"dinghy","materiaal" ));
        optieLijst.add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"dinghy","materiaal" ));
        optieLijst.add(new Optie("rubber","beschikbaar rubber",300,"dinghy","materiaal" ));
        //cockpit
        optieLijst.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"dinghy","cockpit" ));
        optieLijst.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"dinghy","cockpit" ));
        optieLijst.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"dinghy","cockpit" ));
    }
    public static ArrayList<Optie> getLijst(){
        return optieLijst;
    }


    public static void printLijst(String typeBoot)  {
        // prints every optie in lijst and their information
        for (Optie optie : optieLijst) {
            if (typeBoot.equalsIgnoreCase(optie.getTypeBoot())) {
                if (!categorieLijst.contains(optie.getCategory())) {
                    categorieLijst.add(optie.getCategory());
                }
            }
        }
        for (String categorie : categorieLijst) {
            System.out.println("\n" + categorie.substring(0, 1).toUpperCase() + categorie.substring(1));
                for (Optie optie : optieLijst) {
                    if (categorie.equalsIgnoreCase(optie.getCategory())) {
                        if (typeBoot.equalsIgnoreCase(optie.getTypeBoot())) {
                        System.out.printf("%-25s| %-70s| €%-6d| %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    }
                }
            }
        }

    }
}

