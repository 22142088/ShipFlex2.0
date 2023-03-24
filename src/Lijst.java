import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lijst {

    private static ArrayList<ArrayList<Optie>> lists = new ArrayList<>();

    public static void addLists(){
        for (int i = 0; i<4; i++) {
            lists.add(new ArrayList<Optie>());
        }
    }

    public static void initialiseList() {
        //speedboat
        //motor opties
        lists.get(0).add(new Optie("standaard motor","standaart 2000pk motor",1000,"motor" ));
        lists.get(0).add(new Optie("sport motor","sport uitvoering 2500pk motor",1000,"motor" ));
        lists.get(0).add(new Optie("electrische motor","standaart 200pk motor",1000,"motor" ));
        lists.get(0).add(new Optie("zuinige motor","zuinige 1800pk motor",1000,"motor" ));
        //verf opties
        lists.get(0).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        lists.get(0).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));
        //schipmateriaal opties
        lists.get(0).add(new Optie("gerecycled hout","gerecycled hout wat gehaald is van andere schepen",300,"materiaal" ));
        lists.get(0).add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"materiaal" ));
        lists.get(0).add(new Optie("aluminium","aluminium ",300,"materiaal" ));
        lists.get(0).add(new Optie("glasvezel","glasvezel",300,"materiaal" ));
        lists.get(0).add(new Optie("carbon fiber","voor de luxe afwerking van het schip",300,"materiaal" ));
        //cockpit
        lists.get(0).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(0).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(0).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));

        //vrachtschip
        //motor opties
        lists.get(1).add(new Optie("standaard motor","50000 pk motor",10000,"motor" ));
        lists.get(1).add(new Optie("zuinige millieu vriendelijke motor","45000 pk motor",12000,"motor" ));
        //verf opties
        lists.get(1).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        lists.get(1).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));
        //schipmateriaal opties
        lists.get(1).add(new Optie("gerecycled aluminium","standaard verf die word aangebracht op de hul van uw boot",200,"materiaal" ));
        lists.get(1).add(new Optie("aluminium","aluminium",300,"materiaal" ));
        lists.get(1).add(new Optie("glasvezel","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"materiaal" ));
        //cockpit
        lists.get(1).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(1).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(1).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));

        //zeilboot
        //motor opties
        lists.get(2).add(new Optie("standaard motor","standaart 100pk motor",1000,"motor" ));
        lists.get(2).add(new Optie("electrische motor","80pk motor",1200,"motor" ));
        //verf opties
        lists.get(2).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        lists.get(2).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));
        //schipmateriaal opties
        lists.get(2).add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"materiaal" ));
        lists.get(2).add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"materiaal" ));
        lists.get(2).add(new Optie("aluminium","aluminium",300,"materiaal" ));
        lists.get(2).add(new Optie("glasvezel","glasvezel",300,"materiaal" ));
        //cockpit
        lists.get(2).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(2).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(2).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));
        //zeil
        lists.get(2).add(new Optie("standaard","standaard zeil",300,"zeil" ));
        lists.get(2).add(new Optie("gerecycled","millieu vriendelijke optie",300,"zeil" ));
        lists.get(2).add(new Optie("met print","een zeil met custom print erop die u levert",300,"zeil" ));

        //dinghy
        //motor opties
        lists.get(3).add(new Optie("standaard motor","standaart 15pk motor",1000,"motor" ));
        lists.get(3).add(new Optie("sportieve motor","sportuitvoering 30pk motor",1000,"motor" ));
        lists.get(3).add(new Optie("zuinige motor","milieu vriendelijke 15pk motor",1000,"motor" ));
        //verf opties
        lists.get(3).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"verf" ));
        lists.get(3).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"verf" ));
        //schipmateriaal opties
        lists.get(3).add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"materiaal" ));
        lists.get(3).add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"materiaal" ));
        lists.get(3).add(new Optie("rubber","beschikbaar rubber",300,"materiaal" ));
        //cockpit
        lists.get(3).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(3).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"cockpit" ));
        lists.get(3).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"cockpit" ));
    }
    public static ArrayList<ArrayList<Optie>> getLijst(){
        return lists;
    }


    public static void printLijst(ArrayList<ArrayList<Optie>> arrayLijst, int index) {
        // prints every optie in lijst and their information

        for (Optie optie : arrayLijst.get(index)){
            System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
        }
    }
}
