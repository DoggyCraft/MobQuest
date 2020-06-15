package com.hiphurra.mq.Commands;

import org.bukkit.command.CommandSender;

@CommandInfo(
        name = "make",
        pattern = "",
        usage = "/ma make <ArenaName>",
        desc = "",
        permission = ""
)
public class MakeArenaCommand implements Command {

    @Override
    public boolean execute(CommandSender sender, String... args) {
        
        return true;
    }
}

