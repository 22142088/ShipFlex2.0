class Klant {

    protected String naam;
    protected String kortingNaam;
    protected int kortingPercentage;

    public Klant(String naam, String kortingNaam, int kortingPercentage){
        this.naam = naam;
        this.kortingNaam = kortingNaam;
        this.kortingPercentage = kortingPercentage;

    }

}

class Particulier extends Klant {
    public Particulier(String naam, String kortingNaam, int kortingPercentage) {
        super(naam, kortingNaam, kortingPercentage);

    }
}

class Bedrijf extends Klant{
    public Bedrijf(String naam, String kortingNaam,int kortingPercentage){
        super(naam, kortingNaam, kortingPercentage);
}

}

class Overheid extends Klant {


    public Overheid(String naam, String kortingNaam, int kortingPercentage) {
        super(naam, kortingNaam, kortingPercentage);
    }
}


