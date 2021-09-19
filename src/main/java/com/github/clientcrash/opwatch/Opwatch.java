package com.github.clientcrash.opwatch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Opwatch extends JavaPlugin {
    public static CommandStorage cmsStore = new CommandStorage();
    @Override
    public void onEnable() {
        Bukkit.getServer().broadcastMessage("$2OPWATCH ENABLED");
        getServer().getPluginManager().registerEvents(new PreprocessHandler(),this);

    }

    @Override
    public void onDisable() {
        Bukkit.getServer().broadcastMessage("$cOPWATCH DISABLED");
    }
}
