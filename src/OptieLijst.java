import java.util.ArrayList;

public class OptieLijst {

    private static ArrayList<ArrayList<Optie>> lists = new ArrayList<>();

    public static void addLists(){
        for (int i = 0; i<4; i++) {
            lists.add(new ArrayList<>());
        }
    }

    public static void initialiseList() {
        //speedboat
        //motor opties
        lists.get(0).add(new Optie("standaard motor","standaart 2000pk motor",1000,"speedboot","motor" ));
        lists.get(0).add(new Optie("sport motor","sport uitvoering 2500pk motor",1000,"speedboot","motor" ));
        lists.get(0).add(new Optie("electrische motor","standaart 200pk motor",1000,"speedboot","motor" ));
        lists.get(0).add(new Optie("zuinige motor","zuinige 1800pk motor",1000,"speedboot","motor" ));
        //verf opties
        lists.get(0).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"speedboot","verf" ));
        lists.get(0).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"speedboot","verf" ));
        //schipmateriaal opties
        lists.get(0).add(new Optie("gerecycled hout","gerecycled hout wat gehaald is van andere schepen",300,"speedboot","materiaal" ));
        lists.get(0).add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"speedboot","materiaal" ));
        lists.get(0).add(new Optie("aluminium","aluminium ",300,"speedboot","materiaal" ));
        lists.get(0).add(new Optie("glasvezel","glasvezel",300,"speedboot","materiaal" ));
        lists.get(0).add(new Optie("carbon fiber","voor de luxe afwerking van het schip",300,"speedboot","materiaal" ));
        //cockpit
        lists.get(0).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"speedboot","cockpit" ));
        lists.get(0).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"speedboot","cockpit" ));
        lists.get(0).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"speedboot","cockpit" ));

        //vrachtschip
        //motor opties
        lists.get(1).add(new Optie("standaard motor","50000 pk motor",10000,"vrachtschip","motor" ));
        lists.get(1).add(new Optie("zuinige millieu vriendelijke motor","45000 pk motor",12000,"vrachtschip","motor" ));
        //verf opties
        lists.get(1).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"vrachtschip","verf" ));
        lists.get(1).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"vrachtschip","verf" ));
        //schipmateriaal opties
        lists.get(1).add(new Optie("gerecycled aluminium","standaard verf die word aangebracht op de hul van uw boot",200,"vrachtschip","materiaal" ));
        lists.get(1).add(new Optie("aluminium","aluminium",300,"vrachtschip","materiaal" ));
        lists.get(1).add(new Optie("glasvezel","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"vrachtschip","materiaal" ));
        //cockpit
        lists.get(1).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"vrachtschip","cockpit" ));
        lists.get(1).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"vrachtschip","cockpit" ));
        lists.get(1).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"vrachtschip","cockpit" ));

        //zeilboot
        //motor opties
        lists.get(2).add(new Optie("standaard motor","standaart 100pk motor",1000,"zeilboot","motor" ));
        lists.get(2).add(new Optie("electrische motor","80pk motor",1200,"zeilboot","motor" ));
        //verf opties
        lists.get(2).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"zeilboot","verf" ));
        lists.get(2).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"zeilboot","verf" ));
        //schipmateriaal opties
        lists.get(2).add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"zeilboot","materiaal" ));
        lists.get(2).add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"zeilboot","materiaal" ));
        lists.get(2).add(new Optie("aluminium","aluminium",300,"zeilboot","materiaal" ));
        lists.get(2).add(new Optie("glasvezel","glasvezel",300,"zeilboot","materiaal" ));
        //cockpit
        lists.get(2).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"zeilboot","cockpit" ));
        lists.get(2).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"zeilboot","cockpit" ));
        lists.get(2).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"zeilboot","cockpit" ));
        //zeil
        lists.get(2).add(new Optie("standaard","standaard zeil",300,"zeilboot","zeil" ));
        lists.get(2).add(new Optie("gerecycled","millieu vriendelijke optie",300,"zeilboot","zeil" ));
        lists.get(2).add(new Optie("met print","een zeil met custom print erop die u levert",300,"zeilboot","zeil" ));

        //dinghy
        //motor opties
        lists.get(3).add(new Optie("standaard motor","standaart 15pk motor",1000,"dinghy","motor" ));
        lists.get(3).add(new Optie("sportieve motor","sportuitvoering 30pk motor",1000,"dinghy","motor" ));
        lists.get(3).add(new Optie("zuinige motor","milieu vriendelijke 15pk motor",1000,"dinghy","motor" ));
        //verf opties
        lists.get(3).add(new Optie("standaard verf","standaard verf die word aangebracht op de hul van uw boot",200,"dinghy","verf" ));
        lists.get(3).add(new Optie("millieu vriendelijke verf","millieu vriendelijke verf die geen gifstoffen afgeeft",300,"dinghy","verf" ));
        //schipmateriaal opties
        lists.get(3).add(new Optie("gerecycled hout","hout dat is gered van andere schepen",200,"dinghy","materiaal" ));
        lists.get(3).add(new Optie("hout","hout van de hout markt type ligt aan de soort die beschikbaar is",300,"dinghy","materiaal" ));
        lists.get(3).add(new Optie("rubber","beschikbaar rubber",300,"dinghy","materiaal" ));
        //cockpit
        lists.get(3).add(new Optie("basic","voor de basic cockpit van het schip daaronder valt...",300,"dinghy","cockpit" ));
        lists.get(3).add(new Optie("luxe","voor de luxe cockpit van het schip daaronder valt...",300,"dinghy","cockpit" ));
        lists.get(3).add(new Optie("advanced","voor de advanced afwerking van het schip hieronder valt...",300,"dinghy","cockpit" ));
    }
    public static ArrayList<ArrayList<Optie>> getLijst(){
        return lists;
    }


    public static void printLijst(ArrayList<ArrayList<Optie>> arrayLijst, int index) {
        // prints every optie in lijst and their information

        for (Optie optie : arrayLijst.get(index)){
            System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());

//            System.out.println("Category: " + optie.getCategory());
//
//
//            for (Optie optie : list) {
//                System.out.print("Option: " + optie.getName());
//                System.out.println("Description: " + optie.getDescription());
//                System.out.println("Price: " + optie.getPrice());
//            }
//            System.out.println();
        }

    }
    }

