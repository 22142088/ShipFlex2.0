import java.util.ArrayList;

public class Lijst {
    private static final ArrayList<Optie> lijst = new ArrayList<>();

    public static void initialiseList() {
        lijst.add(new Optie("Brandblusser", "Een apparaat om branden te blussen.", 50, "Essentieel"));
        lijst.add(new Optie("Zwemvesten", "Drijfhulpmiddelen om te dragen bij het varen.", 100, "Essentieel"));
        lijst.add(new Optie("Noodsignalen", "Flares, rooksignalen en andere apparatuur om in geval van nood opgemerkt te worden.", 75, "Essentieel"));
        lijst.add(new Optie("Anker", "Een anker om het vaartuig te verankeren op een gewenste locatie.", 200, "Essentieel"));
        lijst.add(new Optie("Touwen en lijnen", "Om het vaartuig vast te maken aan kades, boeien, ankers of andere boten.", 50, "Essentieel"));
        lijst.add(new Optie("Kompas", "Om de richting te bepalen.", 150, "Essentieel"));
        lijst.add(new Optie("Reddingsboei", "Een hulpmiddel om drenkelingen te redden.", 75, "Essentieel"));
        lijst.add(new Optie("GPS-systeem", "Om de positie en route van het vaartuig te bepalen.", 500, "Essentieel"));
        lijst.add(new Optie("Radiocommunicatieapparatuur", "Om te communiceren met andere boten en hulpdiensten.", 250, "Essentieel"));
        lijst.add(new Optie("Satelliettelefoon", "Om te communiceren op afgelegen plaatsen waar geen mobiele telefoon ontvangst is.", 1000, "Extra"));
        lijst.add(new Optie("Zonnepanelen", "Om stroom op te wekken aan boord.", 500, "Extra"));
        lijst.add(new Optie("Zwemplatform", "Een verlenging van het achterdek om te zwemmen en duiken.", 500, "Extra"));
        lijst.add(new Optie("Airconditioning", "Om de temperatuur aan boord te regelen.", 1000, "Extra"));
        lijst.add(new Optie("Koelkast", "Om voedsel en dranken koel te houden aan boord.", 500, "Extra"));
        lijst.add(new Optie("Oven en kookplaat", "Om te koken en te bakken aan boord.", 500, "Extra"));
        lijst.add(new Optie("Automatische piloot", "Om het vaartuig automatisch te laten varen.", 1500, "Extra"));
        lijst.add(new Optie("Luxe interieurafwerking", "Een hoogwaardige afwerking van het interieur voor extra comfort en uitstraling.", 3000, "Luxe"));
        lijst.add(new Optie("Massagesysteem", "Een ingebouwd massagesysteem in de stoelen voor extra comfort tijdens lange tochten op het water.", 1500, "Luxe"));
        lijst.add(new Optie("Barbecue", "Een luxe barbecue op het achterdek voor het bereiden van heerlijke maaltijden tijdens het varen.", 1000, "Luxe"));
        lijst.add(new Optie("Wijnkoeler", "Een ingebouwde wijnkoeler om de wijn op de juiste temperatuur te houden tijdens het varen.", 800, "Luxe"));
        lijst.add(new Optie("Smart Home-systeem", "Een slim thuissysteem om verlichting, temperatuur en beveiliging van de boot te regelen.", 2000, "Luxe"));
        lijst.add(new Optie("Lederen bekleding", "Lederen bekleding voor een extra luxe uitstraling en comfort aan boord.", 1000, "Luxe"));
        lijst.add(new Optie("Sfeerverlichting", "Een sfeervolle verlichting om een gezellige sfeer te creëren aan boord.", 500, "Luxe"));
        lijst.add(new Optie("Entertainmentsysteem", "Een ingebouwd entertainmentsysteem met TV en geluidssysteem voor extra comfort en vermaak aan boord.", 2500, "Luxe"));
    }

    public ArrayList<Optie> getLijst() {
        return lijst;
    }

    public static void printLijst() {
        // sorts list in alphabetical order of category
        lijst.sort((optie1, optie2) -> optie1.getCategory().compareTo(optie2.getCategory()));

        // prints every optie in lijst and their information
        for (Optie optie : lijst) {
            System.out.printf("%s : %s - €%d - %s\n", optie.getName(), optie.getDescription(), optie.getPrice(), optie.getCategory());
        }
    }
}
