package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item DEEPSLATE_SWORD = registerItem("deepslate_sword",
            setting -> new Item(setting.sword(ModToolMaterials.DEEPSLATE, 3, -2.4f)));
    public static final Item DEEPSLATE_PICKAXE = registerItem("deepslate_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterials.DEEPSLATE,  1.0F, -2.8F)));
    public static final Item DEEPSLATE_AXE = registerItem("deepslate_axe",
            setting -> new AxeItem(ModToolMaterials.DEEPSLATE, 7.0F, -3.2F, setting));
    public static final Item DEEPSLATE_SHOVEL = registerItem("deepslate_shovel",
            setting -> new ShovelItem(ModToolMaterials.DEEPSLATE, 1.5F, -3.0F, setting));
    public static final Item DEEPSLATE_HOE = registerItem("deepslate_hoe",
            setting -> new HoeItem(ModToolMaterials.DEEPSLATE, -1.0F, -2.0F, setting));

    public static final Item BLACKSTONE_SWORD = registerItem("blackstone_sword",
            setting -> new Item(setting.sword(ModToolMaterials.BLACKSTONE, 3, -2.4f)));
    public static final Item BLACKSTONE_PICKAXE = registerItem("blackstone_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterials.BLACKSTONE,  1.0F, -2.8F)));
    public static final Item BLACKSTONE_AXE = registerItem("blackstone_axe",
            setting -> new AxeItem(ModToolMaterials.BLACKSTONE, 7.0F, -3.2F, setting));
    public static final Item BLACKSTONE_SHOVEL = registerItem("blackstone_shovel",
            setting -> new ShovelItem(ModToolMaterials.BLACKSTONE, 1.5F, -3.0F, setting));
    public static final Item BLACKSTONE_HOE = registerItem("blackstone_hoe",
            setting -> new HoeItem(ModToolMaterials.BLACKSTONE, -1.0F, -2.0F, setting));


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, name)))));
    }
    public static void registerModItems() {
        CinchsBetterDeepslate.LOGGER.info("Registering Mod Items for " + CinchsBetterDeepslate.MOD_ID);

    }
}