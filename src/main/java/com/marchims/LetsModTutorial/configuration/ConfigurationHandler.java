package com.marchims.LetsModTutorial.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        // Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try{
            // Load the configuration file
            configuration.load();

            // Read properties from config file
            // Example
            configValue = configuration.get(Configuration.CATEGORY_GENERAL,"configValue",true,"This is an example config value.").getBoolean(true);
        }
        catch(Exception e){
            // log the exception
        }
        finally{
            // Save the configuration file
            configuration.save();
        }

    }
}
