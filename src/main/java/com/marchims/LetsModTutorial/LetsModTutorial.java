package com.marchims.LetsModTutorial;

import com.marchims.LetsModTutorial.handler.ConfigurationHandler;
import com.marchims.LetsModTutorial.proxy.IProxy;
import com.marchims.LetsModTutorial.reference.Reference;
import com.marchims.LetsModTutorial.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModTutorial {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModTutorial instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        // Initialize configs, network handlers, items and blocks
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre-Initialization Complete!");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        // Register GUIs, recipes, tile entities
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        // Anything else after other mods have initialized
        LogHelper.info("Post-Initialization Complete!");
    }
}
