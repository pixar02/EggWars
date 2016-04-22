package com.pixar02.eggwars.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

import com.pixar02.eggwars.EggWars;

public class CreateMapCmd extends BaseCmd {

	public CreateMapCmd() {
		forcePlayer = false;
		cmdName = "create";
		argLength = 2; //counting cmdName
		usage = "<mapname>";
		desc = "::  Creates a map named <mapname>";

	}

	@Override
	public boolean run() {
		Location spawn = EggWars.getCfg().getSpawn();
		if (spawn == null) {
			sender.sendMessage(ChatColor.RED + "YOU MUST SET SPAWN BEFORE YOU CAN CREATE A MAP");
			return true;
		}
		String worldName = args[1].toLowerCase();
		if (!EggWars.getMC().mapExists(worldName.toLowerCase())) {
			World newWorld = EggWars.getWC().createEmptyWorld(worldName);
			if (newWorld == null) {
				sender.sendMessage(new Messaging.MessageFormatter().format("error.map.world.exists"));
				return true;
			}
			EggWars.getMC().addEditMap(worldName);
			sender.sendMessage(worldName + "maps.created");
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.teleport(new Location(newWorld, 0, 21, 0), TeleportCause.PLUGIN);
			}
			return true;
		} else {
			sender.sendMessage(new Messaging.MessageFormatter().format("error.map-exists"));
			return true;
		}
	}
}
