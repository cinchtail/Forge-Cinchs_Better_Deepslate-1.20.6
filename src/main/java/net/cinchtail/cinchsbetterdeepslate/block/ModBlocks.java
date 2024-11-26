package net.cinchtail.cinchsbetterdeepslate.block;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.item.ModItems;
import net.cinchtail.cinchsbetterdeepslate.util.ModBlockSetType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.DEEPSLATE;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CinchsBetterDeepslate.MOD_ID);

    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));

    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(DEEPSLATE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(3.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            () -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button", ModBlocks::polishedDeepslateButton);


    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;
    }

    private static Block polishedDeepslateButton() {
        return new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
    }
}
