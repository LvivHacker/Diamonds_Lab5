package stones;
import java.util.Scanner;

public class SemiPreciousStone extends Stone {
    static Scanner scanner = new Scanner(System.in);
    public SemiPreciousStone(String name, double price, double weight, double transparency) {
        super(name, price, weight, transparency);
    }

    public static SemiPreciousStone getSemiPrcStone(){
        System.out.println("Введіть назву каменю-: ");
        String name = scanner.nextLine();
        System.out.println("Введіть вартість каменю-: ");
        double price = scanner.nextDouble();
        System.out.println("Введіть вагу каменю(в каратах)-: ");
        double weight = scanner.nextDouble();
        System.out.println("Введіть прозорість каменю-: ");
        double transparency = scanner.nextDouble();
        return new SemiPreciousStone(name, price, weight, transparency);
    }
}