package menu.methods;

import menu.Command;
import menu.JewelryActions;

public class Add implements Command {
    JewelryActions Jewelry;
    public Add(JewelryActions newJewelry){
        Jewelry = newJewelry;
    }
    @Override
    public void execute() {
        Jewelry.AddStone();
    }
}
