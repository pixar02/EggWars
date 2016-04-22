package com.pixar02.eggwars.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Difficulty;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

public class WorldController {
	
	public World createEmpetyWorld(String name){
		WorldCreator wc = new WorldCreator(name);
		wc.environment(World.Environment.NORMAL);
		wc.generateStructures(false);
		wc.generator(new ChunkGenerator(){
            @Override
        	public List<BlockPopulator> getDefaultPopulators(World world) {
                return Arrays.asList(new BlockPopulator[0]);
            }
            
            @Override
            public boolean canSpawn(World world, int x, int z) {
                return true;
            }
            
            @Override
            public byte[] generate(World world, Random random, int x, int z) {
                return new byte[32768];
            }
    
            @Override
            public Location getFixedSpawnLocation(World world, Random random) {
                return new Location(world, 0.0D, 64.0D, 0.0D);
            }
        });
		World world = wc.createWorld();
        world.setDifficulty(Difficulty.NORMAL);
        world.setSpawnFlags(true, true);
        world.setPVP(true);
        world.setStorm(false);
        world.setThundering(false);
        world.setWeatherDuration(Integer.MAX_VALUE);
        world.setAutoSave(false);
        world.setKeepSpawnInMemory(false);
        world.setTicksPerAnimalSpawns(1);
        world.setTicksPerMonsterSpawns(1);

        world.setGameRuleValue("doMobSpawning", "false");
        world.setGameRuleValue("mobGriefing", "false");
        world.setGameRuleValue("doFireTick", "false");
        world.setGameRuleValue("showDeathMessages", "false");

        Block b = world.getBlockAt(0, 20, 0);
        b.setType(Material.STONE);
		
		return world;
	}
	
	
	
	
}


