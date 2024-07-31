package net.cinchtail.cinchsbetterdeepslate.block;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.DEEPSLATE;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CinchsBetterDeepslate.MOD_ID);
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(3.5F, 6.0F)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);

    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(3.5F, 6.0F)
                    .sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(3.5F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);

    public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(DEEPSLATE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE).strength(3.0F, 6.0F).requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().sound(SoundType.POLISHED_DEEPSLATE)
                    .strength(0.5F)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.STONE,
                    MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().noCollission().strength(0.5F)
                    .sound(SoundType.POLISHED_DEEPSLATE)), CinchsBetterDeepslate.CINCHSBETTERDEEPSLATE_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
