package com.pixar02.eggwars.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.pixar02.eggwars.commands.BaseCmd;


public class CmdManager implements CommandExecutor {

	private List<BaseCmd> cmds = new ArrayList<BaseCmd>();

	//Add New Commands Here
	public CmdManager() {
		cmds.add(new CreateMapCmd());
		cmds.add(new DeleteMapCmd());
		cmds.add(new EditMapCmd());
		cmds.add(new EndGameCmd());
		cmds.add(new GamesCmd());
		//cmds.add(new GlassShopCmd());		
		cmds.add(new JoinGameCmd());
		//cmds.add(new KitCmd());
		cmds.add(new ListMapsCmd());
		//cmds.add(new PermKitShopCmd());
		cmds.add(new QuitGameCmd());
		cmds.add(new RegisterMapCmd());
		cmds.add(new ReloadCmd());
		cmds.add(new SaveMapCmd());
		cmds.add(new SetSpawnCmd());
		//cmds.add(new ShopCmd());
		cmds.add(new SpectateCmd());
		cmds.add(new StartCmd());
		cmds.add(new StatsCmd());
		cmds.add(new UnregisterMapCmd());
		cmds.add(new MenuGuiCmd());
		//cmds.add(new ParticleShopCmd());
		//cmds.add(new TrailShopCmd());
		cmds.add(new AddPointsCmd());
		cmds.add(new RemovePointsCmd());
		//cmds.add(new SetGlassCmd());
		//cmds.add(new SetEffectCmd());
		//cmds.add(new SetProjEffectCmd());
		//cmds.add(new [mapname]());
		
		
		
		
	}
	@Override
	public boolean onCommand(CommandSender s, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		return false;
	}

}
