package com.github.clientcrash.opwatch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Opwatch extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().broadcastMessage("$2OPWATCH ENABLED");

    }

    @Override
    public void onDisable() {
        Bukkit.getServer().broadcastMessage("$cOPWATCH DISABLED");
    }
}