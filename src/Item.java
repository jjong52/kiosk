public class Item extends Menu {
    public String name;
    public String desc;
    public double price;

    public Item() {
    }

    public Item(String name, String desc, double price) {
        super(name, desc);
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return "  " + this.name + "   W" + this.price + "    " + this.desc;
    }
}