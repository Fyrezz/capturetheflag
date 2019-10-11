package net.fyrezz.capturetheflag;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class P extends JavaPlugin {
	
	private FileConfiguration config;
	private FileConfiguration lang;

	@Override
	public void onEnable() {
		// Make sure all files are loaded
		saveResource("config.yml", false);
		saveResource("lang.yml", false);
		
		this.config = YamlConfiguration.loadConfiguration(new File(this.getDataFolder(), "config.yml"));
		this.lang = YamlConfiguration.loadConfiguration(new File(this.getDataFolder(), "lang.yml"));

	}

	@Override
	public void onDisable() {

	}
	
	public FileConfiguration getConfig() {
		return config;
	}
	
	public FileConfiguration getLang() {
		return lang;
	}
	
}
