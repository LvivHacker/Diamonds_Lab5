package main;

import menu.*;
import menu.methods.Jewelry;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        JewelryActions jewelery = Jewelry.getJewelry();
        Menu mainMenu = new Menu(jewelery);
        while (true) {
            System.out.print(" Введіть команду-: ");
            String command = scanner.next();
            mainMenu.execute(command);
        }
    }
}

/*try {
       String doCon = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=Necklace;encrypt=true;trustServerCertificate=true;";
}catch(Exception e){
     System.err.println("Error! Find exception!");
     System.err.println(e.getMessage());
}*/