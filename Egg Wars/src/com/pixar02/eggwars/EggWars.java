package com.pixar02.eggwars;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class EggWars extends JavaPlugin {

	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		registerConfig();
		
		logger.info(pdfFile.getName() + pdfFile.getVersion() + " has been enabled");
	}
	
	
	public void onDisable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + "Version:" + pdfFile.getVersion() + " has been disabled");
	}
	
	private void registerConfig(){
		getConfig().options().copyDefaults(true);
		saveConfig();
		
	}
}
