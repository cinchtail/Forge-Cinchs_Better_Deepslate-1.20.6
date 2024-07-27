package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CinchsBetterDeepslate.MOD_ID);

    public static final RegistryObject<Item> BLACKSTONE_SWORD = ITEMS.register("blackstone_sword",
            () -> new SwordItem(ModToolTiers.BLACKSTONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BLACKSTONE,3, -2.4F))));
    public static final RegistryObject<Item> BLACKSTONE_PICKAXE = ITEMS.register("blackstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLACKSTONE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BLACKSTONE,1F, -2.8F))));
    public static final RegistryObject<Item> BLACKSTONE_AXE = ITEMS.register("blackstone_axe",
            () -> new AxeItem(ModToolTiers.BLACKSTONE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BLACKSTONE,7F, -3.2F))));
    public static final RegistryObject<Item> BLACKSTONE_SHOVEL = ITEMS.register("blackstone_shovel",
            () -> new ShovelItem(ModToolTiers.BLACKSTONE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BLACKSTONE,1.5F, -3F))));
    public static final RegistryObject<Item> BLACKSTONE_HOE = ITEMS.register("blackstone_hoe",
            () -> new HoeItem(ModToolTiers.BLACKSTONE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BLACKSTONE,-1F, -2F))));
    public static final RegistryObject<Item> DEEPSLATE_SWORD = ITEMS.register("deepslate_sword",
            () -> new SwordItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.DEEPSLATE,3, -2.4F))));
    public static final RegistryObject<Item> DEEPSLATE_PICKAXE = ITEMS.register("deepslate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.DEEPSLATE,1F, -2.8F))));
    public static final RegistryObject<Item> DEEPSLATE_AXE = ITEMS.register("deepslate_axe",
            () -> new AxeItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.DEEPSLATE,7F, -3.2F))));
    public static final RegistryObject<Item> DEEPSLATE_SHOVEL = ITEMS.register("deepslate_shovel",
            () -> new ShovelItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.DEEPSLATE,1.5F, -3F))));
    public static final RegistryObject<Item> DEEPSLATE_HOE = ITEMS.register("deepslate_hoe",
            () -> new HoeItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.DEEPSLATE,-1F, -2F))));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
