package menu.methods;

import menu.Command;
import menu.JewelryActions;

public class Stop implements Command {
    JewelryActions Jewelry;
    public Stop(JewelryActions newJewelry){
        Jewelry = newJewelry;
    }
    @Override
    public void execute() {
        Jewelry.StopExit();
    }
}
