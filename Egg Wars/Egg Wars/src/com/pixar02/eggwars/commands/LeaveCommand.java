package com.pixar02.eggwars.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class LeaveCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("ew.quit")){
			
		}else {
			player.sendMessage(ChatColor.RED + "You do not have permission to use that command!");
			return true;
		}
		
		
		
		
		
		return false;
	}
		
}

