package net.cinchtail.cinchsbetterdeepslate.util;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class ModTags {
    public static class Items {

        public static final TagKey<Item> DEEPSLATE_REPAIR = createTag("deepslate_repair");
        public static final TagKey<Item> BLACKSTONE_REPAIR = createTag("blackstone_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, name));
        }
    }
}