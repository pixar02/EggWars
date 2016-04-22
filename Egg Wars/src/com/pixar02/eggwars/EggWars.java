package com.pixar02.eggwars;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.pixar02.eggwars.controllers.MapController;
import com.pixar02.eggwars.controllers.ChestController;
//import com.pixar02.eggwars.controllers.GameController;
//import com.pixar02.eggwars.controllers.GlassController;
//import com.pixar02.eggwars.controllers.InventoryController;
//import com.pixar02.eggwars.controllers.KitController;
//import com.pixar02.eggwars.controllers.ParticleController;
//import com.pixar02.eggwars.controllers.PlayerController;
//import com.pixar02.eggwars.controllers.ProjectileController;
//import com.pixar02.eggwars.controllers.ScoreboardController;
//import com.pixar02.eggwars.controllers.ShopController;
import com.pixar02.eggwars.controllers.WorldController;
//import com.pixar02.eggwars.controllers.DataStorage;
//import com.walrusone.skywars.dataStorage.Database;
//import com.walrusone.skywars.listeners.IconMenuController;
//import com.walrusone.skywars.utilities.Messaging;

import net.milkbowl.vault.economy.Economy;

public class EggWars extends JavaPlugin {
    
	private static EggWars instance;
    private MapController mc;
	
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
	
    public boolean loadingEnded() {
    	return finishedStartup;
    }
    
    public static EggWars get() {
        return instance;
    }
    
    public static GameController getGC() {
        return instance.gc;
    }
    
    public static WorldController getWC() {
        return instance.wc;
    }
    
    public static Messaging getMessaging() {
        return instance.messaging;
    }
    
    public static MapController getMC() {
        return instance.mc;
    }
    
    public static DataStorage getDS() {
        return instance.ds;
    }
    
    public static Database getDB() {
        return instance.db;
    }
    
    public static PlayerController getPC() {
        return instance.pc;
    }
    
    public static ChestController getCC() {
        return instance.cc;
    }
    
    public static ProjectileController getProjC() {
        return instance.projc;
    }
    
    public static KitController getKC() {
        return instance.kc;
    }
    
    public static IconMenuController getIC() {
        return instance.ic;
    }
    
    public static ShopController getSC() {
        return instance.sc;
    }
 
    public static InventoryController getInvC() {
        return instance.invc;
    }
    
    public static GlassController getGLC() {
        return instance.glc;
    }
    
    public static ParticleController getPEC() {
        return instance.pec;
    }
    
    public static ScoreboardController getScore() {
    	return instance.score;
    }
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
}
