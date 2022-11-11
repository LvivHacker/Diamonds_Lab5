package stones;

public class Stone {
    private final String name;
    private final double price, weight, transparency;
    public Stone(String name, double price, double weight, double transparency){
        this.name = name;
        this.transparency = transparency;
        this.price = price;
        this.weight = weight;
    }
    public double getPrice() { return price; }
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        return "\nКамінь-:\n"+"\tНазва-:  "+ name
                + "\n\tЦіна-: " + price
                + "\n\tВага-: " + weight
                + "\n\tПрозорість-: " + transparency
                + "\n";}
}
