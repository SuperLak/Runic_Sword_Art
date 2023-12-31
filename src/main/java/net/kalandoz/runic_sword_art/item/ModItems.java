package net.kalandoz.runic_sword_art.item;

import net.kalandoz.runic_sword_art.RunicSwordArt;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RunicSwordArt.MOD_ID);

    public static final RegistryObject<Item> RUNIC_FRAGMENT =
            ITEMS.register("runic_fragment", () -> new Item(new Item.Properties().group(ModItemGroup.RUNIC_GROUP)));

    public static final RegistryObject<Item> FLAME_SWORD = ITEMS.register("flame_sword",
            () -> new SwordItem(ModRunicTier.RUNIC, 3, -2.4f,
                    new Item.Properties().isImmuneToFire().group(ModItemGroup.RUNIC_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
