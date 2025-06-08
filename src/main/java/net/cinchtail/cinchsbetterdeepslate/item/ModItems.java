package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(CinchsBetterDeepslate.MOD_ID);

    public static final DeferredItem<Item> DEEPSLATE_SWORD = ITEMS.registerItem("deepslate_sword",
            (properties) -> new Item(properties.sword(ModToolTiers.DEEPSLATE,3, -2.4F)));
    public static final DeferredItem<Item> DEEPSLATE_PICKAXE = ITEMS.registerItem("deepslate_pickaxe",
            (properties) -> new Item(properties.pickaxe(ModToolTiers.DEEPSLATE, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> DEEPSLATE_AXE = ITEMS.registerItem("deepslate_axe",
            (properties) -> new AxeItem(ModToolTiers.DEEPSLATE, 7.0F, -3.2F, properties));
    public static final DeferredItem<ShovelItem> DEEPSLATE_SHOVEL = ITEMS.registerItem("deepslate_shovel",
            (properties) -> new ShovelItem(ModToolTiers.DEEPSLATE, 1.5F, -3.0f, properties));
    public static final DeferredItem<HoeItem> DEEPSLATE_HOE = ITEMS.registerItem("deepslate_hoe",
            (properties) -> new HoeItem(ModToolTiers.DEEPSLATE, 1.0F, -2.0f, properties));

    public static final DeferredItem<Item> BLACKSTONE_SWORD = ITEMS.registerItem("blackstone_sword",
            (properties) -> new Item(properties.sword(ModToolTiers.BLACKSTONE,3, -2.4F)));
    public static final DeferredItem<Item> BLACKSTONE_PICKAXE = ITEMS.registerItem("blackstone_pickaxe",
            (properties) -> new Item(properties.pickaxe(ModToolTiers.BLACKSTONE, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> BLACKSTONE_AXE = ITEMS.registerItem("blackstone_axe",
            (properties) -> new AxeItem(ModToolTiers.BLACKSTONE, 7.0F, -3.2F, properties));
    public static final DeferredItem<ShovelItem> BLACKSTONE_SHOVEL = ITEMS.registerItem("blackstone_shovel",
            (properties) -> new ShovelItem(ModToolTiers.BLACKSTONE, 1.5F, -3.0f, properties));
    public static final DeferredItem<HoeItem> BLACKSTONE_HOE = ITEMS.registerItem("blackstone_hoe",
            (properties) -> new HoeItem(ModToolTiers.BLACKSTONE, 1.0F, -2.0f, properties));
}
