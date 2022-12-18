package de.artemis.laboratoryblocks.common.data;

import de.artemis.laboratoryblocks.common.registration.ModBlocks;
import de.artemis.laboratoryblocks.common.registration.Registration;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class BlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
        dropSelf(ModBlocks.LABORATORY_BLOCK.get());
        dropSelf(ModBlocks.ENLIGHTED_LABORATORY_BLOCK.get());
        dropSelf(ModBlocks.OAK_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_OAK_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.SPRUCE_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_SPRUCE_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.BIRCH_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_BIRCH_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.DARK_OAK_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_DARK_OAK_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ACACIA_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_ACACIA_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.JUNGLE_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_JUNGLE_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.MANGROVE_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_MANGROVE_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.CRIMSON_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_CRIMSON_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.WARPED_LABORATORY_FLOOR.get());
        dropSelf(ModBlocks.ENLIGHTED_WARPED_LABORATORY_FLOOR.get());
        dropWhenSilkTouch(ModBlocks.LABORATORY_GLASS.get());
        add(ModBlocks.ENLIGHTED_LABORATORY_GLASS.get(), (p_124233_) -> {
            return createSingleItemTableWithSilkTouch(p_124233_, Items.GLOWSTONE_DUST, ConstantValue.exactly(1.0F));
        });
    }

    @Override
    @NotNull
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}