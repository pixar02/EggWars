package com.pixar02.eggwars.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public abstract class BaseCmd {

	public BaseCmd(){
		
	}
	public CommandSender sender;
	public String[] args;
	public String cmdName;
	public int argLength = 0;
	public boolean forcePlayer = true;
	public String usage = "";
	public Player player;
	public String desc = "";
	
	public boolean proccesCmd(CommandSender s, String[] arg) {
		
		if(forcePlayer){
			if (!(sender instanceof Player)) {
				s.sendMessage(ChatColor.RED + "Only players can execute this command!");
				return false;
			}
			return false;
		
		}
		return false;
	
	}
}
