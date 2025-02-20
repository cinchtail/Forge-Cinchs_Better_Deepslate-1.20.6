package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item BLACKSTONE_SWORD = registerItem("blackstone_sword",
            properties -> new PickaxeItem(ModToolMaterials.BLACKSTONE, 3, -2.4F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "blackstone_sword")))));
    public static final Item BLACKSTONE_PICKAXE = registerItem("blackstone_pickaxe",
            properties -> new PickaxeItem(ModToolMaterials.BLACKSTONE, 1.0F, -2.8F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "blackstone_pickaxe")))));
    public static final Item BLACKSTONE_AXE = registerItem("blackstone_axe",
            properties -> new PickaxeItem(ModToolMaterials.BLACKSTONE, 7.0F, -3.2F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "blackstone_axe")))));
    public static final Item BLACKSTONE_SHOVEL = registerItem("blackstone_shovel",
            properties -> new PickaxeItem(ModToolMaterials.BLACKSTONE, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "blackstone_shovel")))));
    public static final Item BLACKSTONE_HOE = registerItem("blackstone_hoe",
            properties -> new PickaxeItem(ModToolMaterials.BLACKSTONE, -1.0F, -2.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "blackstone_hoe")))));
    public static final Item DEEPSLATE_SWORD = registerItem("deepslate_sword",
            properties -> new PickaxeItem(ModToolMaterials.DEEPSLATE, 3, -2.4F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_sword")))));
    public static final Item DEEPSLATE_PICKAXE = registerItem("deepslate_pickaxe",
            properties -> new PickaxeItem(ModToolMaterials.DEEPSLATE, 1.0F, -2.8F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_pickaxe")))));
    public static final Item DEEPSLATE_AXE = registerItem("deepslate_axe",
            properties -> new PickaxeItem(ModToolMaterials.DEEPSLATE, 7.0F, -3.2F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_axe")))));
    public static final Item DEEPSLATE_SHOVEL = registerItem("deepslate_shovel",
            properties -> new PickaxeItem(ModToolMaterials.DEEPSLATE, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_shovel")))));
    public static final Item DEEPSLATE_HOE = registerItem("deepslate_hoe",
            properties -> new PickaxeItem(ModToolMaterials.DEEPSLATE, -1.0F, -2.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_hoe")))));

    public static <T extends Item> T registerItem(String name, Function<Item.Settings, T> factory) {
        return register(name, factory, new Item.Settings());
    }

    public static <T extends Item> T register(String name, Function<Item.Settings, T> factory, Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, name));
        return Registry.register(Registries.ITEM, key, factory.apply(settings.registryKey(key)));
    }
    public static void registerModItems() {
        CinchsBetterDeepslate.LOGGER.info("Registering Mod Items for " + CinchsBetterDeepslate.MOD_ID);
    }
}