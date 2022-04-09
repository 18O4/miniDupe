package me.minioof.minidupe_v2;

import me.minioof.minidupe_v2.commands.dupeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class miniDupe extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("dupe").setExecutor(new dupeCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
