package de.noah.server.main;
import org.bukkit.plugin.java.JavaPlugin;

import de.noah.server.commands.BetterCommands;
import de.noah.server.commands.ConfigHealth;
import de.noah.server.commands.HealCommand;
import de.noah.server.commands.Timer;
import de.noah.server.commands.WaterChallenge;
import de.noah.server.commands.WorldReset;

public class Main extends JavaPlugin {
	public static Main plugin;
	@Override
	public void onEnable() {
		plugin = this;
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("timer").setExecutor(new Timer());
		getCommand("health").setExecutor(new ConfigHealth());
		getCommand("water").setExecutor(new WaterChallenge());
		getCommand("world").setExecutor(new WorldReset());
		getCommand("gm").setExecutor(new BetterCommands());
		this.saveDefaultConfig();


		
	}
	public static Main getPlugin() {
		return plugin;
	}
}
