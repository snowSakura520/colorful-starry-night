package ColorfulStarryNight;

import arc.graphics.Color;
import mindustry.type.Item;

public class testItem {
    public static Item 星燃;
    public static void load() {
        星燃 = new Item("星燃", Color.valueOf("ff0000ff")){{
            explosiveness = 0;
            flammability = 0;
            radioactivity = 2.75f;
            charge = 0;
            cost = 1;
            hardness = 100000;
            alwaysUnlocked = false;
            inlineDescription = true;
        }};
    }
}
