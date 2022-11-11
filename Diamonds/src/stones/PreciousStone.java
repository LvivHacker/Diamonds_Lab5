package stones;
import java.util.Scanner;

public class PreciousStone extends Stone {
    static Scanner scanner = new Scanner(System.in);
    public PreciousStone(String name, double price, double weight, double transparency) {
        super(name, price, weight, transparency);
    }

    public static PreciousStone getPrecStone(){
        System.out.println("Введіть назву каменю-: ");
        String name = scanner.nextLine();
        System.out.println("Введіть вартість каменю-: ");
        double price = scanner.nextDouble();
        System.out.println("Введіть вагу каменю(в каратах)-: ");
        double weight = scanner.nextDouble();
        System.out.println("Введіть прозорість каменю-: ");
        double transparency = scanner.nextDouble();
        return new PreciousStone(name, price, weight, transparency);
    }
}