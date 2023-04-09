public class Optie {
    private String name;
    private String description;
    private int price;
    private String bootType;
    private String category;
    private boolean selected;
    Optie(String name, String description, int price, String bootType , String category, boolean selected) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.bootType = bootType;
        this.category = category;
        this.selected = selected;
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
    public boolean getSelected(){return selected;}

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}


