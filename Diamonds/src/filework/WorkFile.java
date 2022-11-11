package filework;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkFile {
    private static final String file = "/Users/artem/Downloads/test.txt";
    private static final ArrayList<String> arr = new ArrayList<>();

    public static void Output(String sentence){
        arr.add("\n" + sentence);
        System.out.println(sentence);
    }

    public static void File_Writer(){
        try(FileWriter writer = new FileWriter(new File(file), false)){
            for(String sent : arr)
                writer.write(sent);
            arr.clear();
            writer.flush();
        }catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void File_Reader(){
        try(Scanner reader = new Scanner(new File(file))){
            while(reader.hasNext()){
                System.out.println(reader.nextLine());
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
