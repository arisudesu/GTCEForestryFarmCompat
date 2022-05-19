package dev.arisu.gtceforestryfarmcompat.proxy;

import forestry.farming.FarmRegistry;
import forestry.farming.logic.ForestryFarmIdentifier;
import forestry.farming.logic.farmables.FarmableSapling;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Objects;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init() {
        Item rubberSapling = Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(new ResourceLocation("gregtech", "rubber_sapling")));

        FarmRegistry farmRegistry = FarmRegistry.getInstance();
        farmRegistry.registerFarmables(ForestryFarmIdentifier.ARBOREAL, new FarmableSapling(new ItemStack(rubberSapling, 1, 0), new ItemStack[0]));
    }

    public void postInit() {
    }

    private static void registerSaplingReplacement(final Block saplingBlock, final String speciesName) {
    }

}
