package dev.arisu.gtceforestryfarmcompat;

import dev.arisu.gtceforestryfarmcompat.proxy.CommonProxy;
import forestry.core.config.Constants;
import gregtech.api.GTValues;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = GTCEForestryFarmCompat.MODID,
        name = GTCEForestryFarmCompat.NAME,
        dependencies = GTCEForestryFarmCompat.DEPENDENCIES,
        updateJSON = GTCEForestryFarmCompat.UPDATE_URL
)
public class GTCEForestryFarmCompat {

    public static final String MODID = "@MOD_ID@";
    public static final String NAME = "@MOD_NAME@";
    public static final String DEPENDENCIES =
            "required-after:" + Constants.MOD_ID + "@[" + Constants.VERSION + ",);" +
                    GTValues.MOD_VERSION_DEP;
    public static final String UPDATE_URL = "@MOD_UPDATE_URL@";

    @Mod.Instance
    public static GTCEForestryFarmCompat instance;

    @SidedProxy(clientSide = "dev.arisu.gtceforestryfarmcompat.proxy.ClientProxy", serverSide = "dev.arisu.gtceforestryfarmcompat.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        proxy.postInit();
    }

}
