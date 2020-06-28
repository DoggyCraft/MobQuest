package com.hiphurra.mq;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        String base = (args.length > 0 ? args[0] : "").toLowerCase();
        String last = (args.length > 0 ? args[args.length - 1] : "").toLowerCase();

        if (base.isEmpty())
        {
            // Return help to player
            return true;
        }

        // The help command is a little special
        if (base.equals("?") || base.equals("help")) {
            // Return help to player
            return true;
        }


        // TODO - Get a list of all commands


        return true;
    }
}
