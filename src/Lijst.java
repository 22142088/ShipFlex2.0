import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lijst {
    private static final ArrayList<Optie> speedboot = new ArrayList<>();
    private static final ArrayList<Optie> vrachtschip = new ArrayList<>();
    private static final ArrayList<Optie> zeilboot = new ArrayList<>();
    private static final ArrayList<Optie> dinghy = new ArrayList<>();

    public static void initialiseList() {
        //motor opties
        //speedboat
        speedboot.add(new Optie("standaard motor","standaart 2000pk motor",1000,"motor" ));
        speedboot.add(new Optie("sport motor","sport uitvoering 2500pk motor",1000,"motor" ));
        speedboot.add(new Optie("electrische motor","standaart 200pk motor",1000,"motor" ));
        speedboot.add(new Optie("zuinige motor","zuinige 1800pk motor",1000,"motor" ));

        //vrachtschip
        vrachtschip.add(new Optie("standaard motor","50000 pk motor",10000,"motor" ));
        vrachtschip.add(new Optie("zuinige millieu vriendelijke motor","45000 pk motor",12000,"motor" ));

        //zeilboot
        zeilboot.add(new Optie("standaard motor","standaart 100pk motor",1000,"motor" ));
        zeilboot.add(new Optie("electrische motor","80pk motor",1200,"motor" ));

        //dinghy
        dinghy.add(new Optie("standaard motor","standaart 15pk motor",1000,"motor" ));
        dinghy.add(new Optie("sportieve motor","sportuitvoering 30pk motor",1000,"motor" ));
        dinghy.add(new Optie("zuinige motor","milieu vriendelijke 15pk motor",1000,"motor" ));

        //verf opties
        //speedboat
        speedboot.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        speedboot.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));

        //vrachtschip
        vrachtschip.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        vrachtschip.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));        //zeilboot

        //zeilboot
        zeilboot.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        zeilboot.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));        //zeilboot

        //dinghy
        dinghy.add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        dinghy.add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));

        //schipmateriaal opties
        //speedboat
        speedboot.add(new Optie("gerecycled hout","gerecycled hout wat gehaald is van andere schepen",300,"materiaal" ));
        speedboot.add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"materiaal" ));
        speedboot.add(new Optie("aluminium","aluminium ",300,"materiaal" ));
        speedboot.add(new Optie("glasvezel","glasvezel",300,"materiaal" ));
        speedboot.add(new Optie("carbon fiber","voor de luxe afwerking van het schip",300,"materiaal" ));

        //vrachtschip
        vrachtschip.add(new Optie("gerecycled aluminium","standaard verf die word aangebracht op de hul van uw boot",200,"materiaal" ));
        vrachtschip.add(new Optie("aluminium","aluminium",300,"materiaal" ));
        vrachtschip.add(new Optie("glasvezel","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"materiaal" ));

        //zeilboot
        zeilboot.add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"materiaal" ));
        zeilboot.add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"materiaal" ));
        zeilboot.add(new Optie("aluminium","aluminium",300,"materiaal" ));
        zeilboot.add(new Optie("glasvezel","glasvezel",300,"materiaal" ));


        //dinghy
        dinghy.add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"materiaal" ));
        dinghy.add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"materiaal" ));
        dinghy.add(new Optie("rubber","beschikbaar rubber",300,"materiaal" ));


        //cockpit
        //speedboat
        speedboot.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        speedboot.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        speedboot.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));

        //vrachtschip
        vrachtschip.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        vrachtschip.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        vrachtschip.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));

        //zeilboot
        zeilboot.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        zeilboot.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        zeilboot.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));

        //dinghy
        dinghy.add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        dinghy.add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        dinghy.add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));

        //zeil voor zeilboot
        zeilboot.add(new Optie("standaard","standaard zeil",300,"zeil" ));
        zeilboot.add(new Optie("gerecycled","millieu vriendelijke optie",300,"zeil" ));
        zeilboot.add(new Optie("met print","een zeil met custom print erop die u levert",300,"zeil" ));




    }
    public ArrayList<Optie> getLijstSpeedboot() {
        return speedboot;
    }
    public ArrayList<Optie> getLijstVrachtschip() {
        return vrachtschip;
    }
    public ArrayList<Optie> getLijstZeilboot() {
        return zeilboot;
    }
    public ArrayList<Optie> getLijstDinghy() {
        return dinghy;
    }

    public static void printLijst(ArrayList<Optie> lijst) {
        // prints every optie in lijst and their information
        for (Optie optie : lijst) {
            switch (optie.getCategory()) {
                case "motor":
                    System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    break;
                case "verf":
                    System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    break;
                case "materiaal":
                    System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    break;
                case "cockpit":
                    System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    break;
                case "zeil":
                    System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
                    break;
            }
        }
    }
}
