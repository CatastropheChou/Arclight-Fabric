package net.verox.arclight.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.verox.arclight.block.ModBlocks;

public class ModLootTableModifier {

    private static final Identifier OAK_LEAVES_ID
            = new Identifier("minecraft", "blocks/oak_leaves");
    private static final Identifier BIRCH_LEAVES_ID
            = new Identifier("minecraft", "blocks/birch_leaves");
    private static final Identifier SPRUCE_LEAVES_ID
            = new Identifier("minecraft", "blocks/spruce_leaves");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (OAK_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.0015f)) // Drops 35% of the time
                        .with(ItemEntry.builder(ModBlocks.MOON_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if (BIRCH_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.0015f)) // Drops 35% of the time
                        .with(ItemEntry.builder(ModBlocks.JADE_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if (SPRUCE_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.0015f)) // Drops 35% of the time
                        .with(ItemEntry.builder(ModBlocks.SHADOW_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }





        });
    }

}