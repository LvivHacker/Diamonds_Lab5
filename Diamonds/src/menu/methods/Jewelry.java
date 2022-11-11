package menu.methods;

import menu.JewelryActions;
import necklace.Necklace;
public class Jewelry{
    public static JewelryActions getJewelry(){
        return new Necklace();
    }
}
