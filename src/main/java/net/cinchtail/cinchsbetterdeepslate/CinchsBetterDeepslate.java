package net.cinchtail.cinchsbetterdeepslate;

import com.mojang.logging.LogUtils;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.cinchtail.cinchsbetterdeepslate.item.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(CinchsBetterDeepslate.MOD_ID)
public class CinchsBetterDeepslate {
    public static final String MOD_ID = "cinchsbetterdeepslate";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CinchsBetterDeepslate() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
    public static int index = 0;
    public static final CreativeModeTab CINCHSBETTERDEEPSLATE_TAB = new CreativeModeTab("cinchsbetterdeepslate_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get());
        }

        @Override
        public void fillItemList(@NotNull NonNullList<ItemStack> items) {
            super.fillItemList(items);
            index = 0;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILES.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.DEEPSLATE_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.DEEPSLATE_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.DEEPSLATE_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.POLISHED_DEEPSLATE_BUTTON.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_SWORD.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_PICKAXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_AXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_SHOVEL.get()));
            index++;
            items.set(index, new ItemStack(ModItems.DEEPSLATE_HOE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_SWORD.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_PICKAXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_AXE.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_SHOVEL.get()));
            index++;
            items.set(index, new ItemStack(ModItems.BLACKSTONE_HOE.get()));
            index++;
        }
    };
}