package com.github.clientcrash.opwatch;

import com.github.clientcrash.opwatch.report.ReportCreator;
import com.github.clientcrash.opwatch.util.CommandExecutionListUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class ReportCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("opwatch.genreport")){
            if(sender instanceof Player){
                Player p = (Player) sender;
            }

            ArrayList<String> report = ReportCreator.createPlayerReport(Bukkit.getOfflinePlayer(args[0]).getUniqueId().toString());
            sender.sendMessage(args[0]);
            for(String line : report){
                sender.sendMessage(line);
            }
            sender.sendMessage("----------------REPORT DONE-----------------");

        }
        return false;
    }
}
