public class Item {

    private String type;

    private String name;

    private double price;

    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
         double adjustPrice = 0;
         switch (size) {
            case "SMALL": adjustPrice = -0.5; break;
            case "LARGE": adjustPrice = 1; break;
            default: adjustPrice = 0;
        };
        return (getBasePrice() + adjustPrice);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
}
