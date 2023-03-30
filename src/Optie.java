public class Optie {
    private String name;
    private String description;
    private int price;

    private String typeBoot;
    private String category;
    Optie(String name, String description, int price,String typeBoot ,String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.typeBoot = typeBoot;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
}

