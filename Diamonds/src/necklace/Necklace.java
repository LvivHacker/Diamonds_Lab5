package necklace;

import filework.WorkFile;
import stones.*;
import menu.JewelryActions;

import java.util.ArrayList;
import java.util.Scanner;

public class Necklace implements JewelryActions{
    static Scanner scanner = new Scanner(System.in);

    //----------- DATA -----------
    public String neckName;
    public double totalCost, totalWeight;
    ArrayList<Stone> list = new ArrayList<>();

    public Necklace(){}
    public Necklace(String Name, double totalCost, double totalWeight){}

    //----------- CLASS METHODS -----------
    public static void StoneSorting(ArrayList<Stone> list, int N, int choice){
        if(choice == 1) {
            list.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        }
        else if(choice == 2){
            list.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
        }
        while (N-- != 0) {
            System.out.print(list.get(N));
        }
    }

    @Override
    public String toString(){
        return "\n\tНазва-:  "+ neckName
                + "\tЦіна-: " + totalCost
                + "\tВага-: " + totalWeight
                + "\n";}

    //----------- INTERFACE COMMAND_METHODS -----------
    @Override
    public void AddStone() {
        boolean retry;
        while(true){
            System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            System.out.println("  |                    ВИБЕРІТЬ ТИП КАМЕНЯ                      |");
            System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            System.out.println("  |  ДОРОГОЦІННИЙ  |                         |  НАПІВКОШТОВНИЙ  |   ");
            System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                list.add(PreciousStone.getPrecStone());
            } else if (choice == 2) {
                list.add(SemiPreciousStone.getSemiPrcStone());
            } else {
                System.out.println(" НЕВІРНО ВВЕДЕНІ ДАННІ! \nСПРОБУЙТЕ ЩЕ РАЗ ");
            }
            System.out.println("Додати новий камінь до списку? \n1 - Так \n2 - Ні");
            int num = scanner.nextInt();
            if (num == 2) { break; }
        }
    }

    @Override
    public void DeleteStone() {
        while(true) {
            System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            System.out.println("  |            ВВЕДІТЬ ІНДЕКС КАМЕНЯ ДЛЯ ВИДАЛЕННЯ              |");
            System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            int choice = scanner.nextInt();
            if (choice > list.size() - 1 || choice < 0) {
                System.out.println(" НЕВІРНО ВВЕДЕНІ ДАННІ! \nСПРОБУЙТЕ ЩЕ РАЗ ");
            }else{
                list.remove(choice);
            }
            System.out.println("Видалити ще один камінь? \n1 - Так \n2 - Ні");
            int num = scanner.nextInt();
            if (num == 2) { break; }
        }
    }

    @Override
    public void Create() {
        System.out.print("Дайте назву намисту-: ");
        neckName = scanner.nextLine();
        Necklace newNeck = new Necklace(neckName, totalCost, totalWeight);
        WorkFile.Output(newNeck.toString());
    }

    @Override
    public void Total() {
        double tCost = 0, tWeight = 0;
        for(Stone stones : list){
            tCost += stones.getPrice();
            tWeight += stones.getWeight();
        }
        totalCost = tCost;
        totalWeight = tWeight;

        System.out.println("\nЗагальна ціна каменів-: " + totalCost);
        System.out.println("Загальна вага каменів(в каратрах)-: " + totalWeight);
        System.out.println();
    }

    @Override
    public void Sort() {
        while(true) {
            System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            System.out.println("  |                   ВИБЕРІТЬ ТИП СОРТУВАННЯ                   |");
            System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            System.out.println("  |  ЗА ЗРОСТАННЯМ  |                          |  ЗА СПАДАННЯМ  |   ");
            System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                StoneSorting(list, list.size(), choice);
            } else if (choice == 2) {
                StoneSorting(list, list.size(), choice);
            } else {
                System.out.println(" НЕВІРНО ВВЕДЕНІ ДАННІ! \nСПРОБУЙТЕ ЩЕ РАЗ ");
            }
            System.out.println("Бажаєте провести сортування ще раз? \n1 - Так \n2 - Ні");
            int num = scanner.nextInt();
            if(num == 2){ break; };
        }
    }

    @Override
    public void Filtration() {

    }

    @Override
    public void StopExit() {
        System.out.println("До зустрічі! :)");
        System.exit(0);
    }
}

/*
boolean retry;
        do {
            try {
                System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
                System.out.println("  |                    ВИБЕРІТЬ ТИП КАМЕНЯ                      |");
                System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
                System.out.println("  |  ДОРОГОЦІННИЙ  |                         |  НАПІВКОШТОВНИЙ  |   ");
                System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    list.add(PreciousStone.getPrecStone());
                } else if (choice == 2) {
                    list.add(SemiPreciousStone.getSemiPrcStone());
                } else {
                    System.out.println(" НЕВІРНО ВВЕДЕНІ ДАННІ! \nСПРОБУЙТЕ ЩЕ РАЗ ");
                }
                System.out.println("Додати новий камінь до списку? \n1 - Так \n2 - Ні");
                int num = scanner.nextInt();
                if (num == 2) { break; }
                else{ retry = false; }
            }
            catch(Exception e){
                System.out.println("НЕВІРНО ВВЕДЕНІ ДАННІ! \nСПРОБУЙТЕ ЩЕ РАЗ ");
                retry = true;
            }
        }while(retry);
*/