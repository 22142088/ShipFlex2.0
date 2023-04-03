public class Optie {
    private String name;
    private String description;
    private int price;
    private String bootType;
    private String category;



    Optie(String name, String description, int price, String bootType , String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.bootType = bootType;
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
    public String getBootType() { return bootType; }
}

