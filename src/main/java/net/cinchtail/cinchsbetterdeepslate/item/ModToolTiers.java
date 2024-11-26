package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;


public class ModToolTiers {
    public static final ToolMaterial BLACKSTONE = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
            131, 4.0f, 1.0f, 5, ModTags.Items.BLACKSTONE_REPAIR);
    public static final ToolMaterial DEEPSLATE = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
            231, 4.0f, 1.0f, 5, ModTags.Items.DEEPSLATE_REPAIR);
}
