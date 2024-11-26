package net.cinchtail.cinchsbetterdeepslate.util;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> DEEPSLATE_REPAIR = createTag("deepslate_repair");
        public static final TagKey<Item> BLACKSTONE_REPAIR = createTag("blackstone_repair");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, name));
        }
    }
}