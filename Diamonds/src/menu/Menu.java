package menu;

import menu.methods.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    private final Map<String, Command> menuItems;
    public Menu(JewelryActions newJewlery) {
        menuItems = new LinkedHashMap<>();
        menuItems.put("ADD", new Add(newJewlery));
        menuItems.put("DEL", new Delete(newJewlery));
        menuItems.put("TOT", new TotalData(newJewlery));
        menuItems.put("NEW", new Create(newJewlery));
        menuItems.put("FLTR", new Filtration(newJewlery));
        menuItems.put("SORT", new Sort(newJewlery));
        menuItems.put("EXIT", new Stop(newJewlery));
    }
    public void execute(String command){
        Command menuItem = menuItems.get(command);
        if(menuItem != null){
            menuItem.execute();
        }else{
            System.out.println("НЕВІРНІ ДАННІ!");
        }
    }
}
