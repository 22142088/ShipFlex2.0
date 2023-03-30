class Klanten {

    protected String naam;
    protected String kortingNaam;
    protected int kortingPercentage;

    public Klanten(String naam, String kortingNaam, int kortingPercentage){
        this.naam = naam;
        this.kortingNaam = kortingNaam;
        this.kortingPercentage = kortingPercentage;

    }

}

class Particulier extends Klanten {
    public Particulier(String naam, String kortingNaam, int kortingPercentage) {
        super(naam, kortingNaam, kortingPercentage);

    }
}

class Bedrijf extends Klanten{
    public Bedrijf(String naam, String kortingNaam,int kortingPercentage){
        super(naam, kortingNaam, kortingPercentage);
}

}

class Overheid extends Klanten {


    public Overheid(String naam, String kortingNaam, int kortingPercentage) {
        super(naam, kortingNaam, kortingPercentage);
    }
}


