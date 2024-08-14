package net.donsuper.vanillaexpansions;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class VanillaExpansionItems {
    public static void initialize() {
    }

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(VanillaExpansions.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }
    public static final Item test_item = register(
            new Item(new Item.Settings()),
            "test_item");


}
