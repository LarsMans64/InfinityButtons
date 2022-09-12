package net.larsmans.infinitybuttons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.larsmans.infinitybuttons.InfinityButtons;
import net.larsmans.infinitybuttons.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup INFINITYBUTTONS = FabricItemGroupBuilder.build(new Identifier(InfinityButtons.MOD_ID, "infinitybuttons"), () -> new ItemStack(ModBlocks.OAK_LARGE_BUTTON));
}