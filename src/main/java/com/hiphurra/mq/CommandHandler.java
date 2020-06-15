package com.hiphurra.mq;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(cmd.getName().equalsIgnoreCase("ma")) {
                player.sendMessage("You used a command!");
            }
        }
        else {
          sender.sendMessage("Only players can use this command!");
        }
        return true;
    }
}
