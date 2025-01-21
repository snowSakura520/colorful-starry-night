package ColorfulStarryNight;

import arc.graphics.Color;
import mindustry.type.Item;

public class testItem {
    public static Item starburn;
    public static void load() {
        starburn = new Item("星燃", Color.valueOf("ff0000ff")){{
            explosiveness = 0;
            flammability = 5.5f;
            radioactivity = 2.75f;
            charge = 0;
            cost = 1;
            hardness = 100000;
            alwaysUnlocked = false;
            inlineDescription = true;
        }};
    }
}
