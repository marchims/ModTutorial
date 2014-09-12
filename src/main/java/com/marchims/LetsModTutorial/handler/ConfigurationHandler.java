package com.marchims.LetsModTutorial.handler;

import com.marchims.LetsModTutorial.reference.Reference;
import com.marchims.LetsModTutorial.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile){
        // Create the configuration object from the given configuration file
        if (configuration == null){
            configuration = new Configuration(configFile);
            testValue = configuration.getBoolean("configValue",Configuration.CATEGORY_GENERAL,false,"This is an example configuration value");
            configuration.save();
        }



    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        LogHelper.info("Config FIle Changed");
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            // Resync the configs from file

            loadConfiguration();
        }
    }

    public void loadConfiguration(){
        testValue = configuration.getBoolean("configValue",Configuration.CATEGORY_GENERAL,false,"This is an example configuration value");

        if (configuration.hasChanged()){
            configuration.save();
        }
    }
}
