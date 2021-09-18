package com.github.clientcrash.opwatch;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.List;

public class PreprocessHandler implements Listener {
    @EventHandler
    public void PlayerCommand(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("$eLogged Command.");
        boolean shouldBlock = false;
        if(shouldBlock){
            e.setCancelled(true);
            p.sendMessage("§cExecution Blocked.");
        }
        
        Opwatch.cmsStore.addCommand(p.getUniqueId().toString(),p.getName(),e.getMessage());




    }
}

