package me.minioof.minidupe;

import me.minioof.minidupe.commands.dupeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class miniDupe extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("dupe").setExecutor(new dupeCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
