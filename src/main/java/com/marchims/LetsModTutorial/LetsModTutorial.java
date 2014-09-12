package com.marchims.LetsModTutorial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsModTutorial", name="Lets Mod Tutorial", version="1.7.10-1.0")
public class LetsModTutorial {

    @Mod.Instance("LetsModTutorial")
    public static LetsModTutorial instance;

    public void preInit(FMLPreInitializationEvent event){
        // Initialize configs, network handlers, items and blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        // Register GUIs, recipes, tile entities
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        // Anything else after other mods have initialized
    }
}
