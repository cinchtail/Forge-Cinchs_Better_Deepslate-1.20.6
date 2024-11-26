package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(CinchsBetterDeepslate.MOD_ID);

    public static final DeferredItem<SwordItem> DEEPSLATE_SWORD = ITEMS.register("deepslate_sword",
            () -> new SwordItem(ModToolTiers.DEEPSLATE, 3, -2.4F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_sword")))));
    public static final DeferredItem<PickaxeItem> DEEPSLATE_PICKAXE = ITEMS.register("deepslate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEEPSLATE, 1.0F, -2.8f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_pickaxe")))));
    public static final DeferredItem<AxeItem> DEEPSLATE_AXE = ITEMS.register("deepslate_axe",
            () -> new AxeItem(ModToolTiers.DEEPSLATE, 7.0F, -3.2F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_axe")))));
    public static final DeferredItem<ShovelItem> DEEPSLATE_SHOVEL = ITEMS.register("deepslate_shovel",
            () -> new ShovelItem(ModToolTiers.DEEPSLATE, 1.5F, -3.0f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_shovel")))));
    public static final DeferredItem<HoeItem> DEEPSLATE_HOE = ITEMS.register("deepslate_hoe",
            () -> new HoeItem(ModToolTiers.DEEPSLATE, 1.0F, -2.0f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_hoe")))));
    public static final DeferredItem<SwordItem> BLACKSTONE_SWORD = ITEMS.register("blackstone_sword",
            () -> new SwordItem(ModToolTiers.BLACKSTONE, 3, -2.4F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_sword")))));
    public static final DeferredItem<PickaxeItem> BLACKSTONE_PICKAXE = ITEMS.register("blackstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLACKSTONE, 1.0F, -2.8f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_pickaxe")))));
    public static final DeferredItem<AxeItem> BLACKSTONE_AXE = ITEMS.register("blackstone_axe",
            () -> new AxeItem(ModToolTiers.BLACKSTONE, 7.0F, -3.2F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_axe")))));
    public static final DeferredItem<ShovelItem> BLACKSTONE_SHOVEL = ITEMS.register("blackstone_shovel",
            () -> new ShovelItem(ModToolTiers.BLACKSTONE, 1.5F, -3.0f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_shovel")))));
    public static final DeferredItem<HoeItem> BLACKSTONE_HOE = ITEMS.register("blackstone_hoe",
            () -> new HoeItem(ModToolTiers.BLACKSTONE, 1.0F, -2.0f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_hoe")))));
}
