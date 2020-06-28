package com.hiphurra.mq.Commands;

import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

public interface Command {
    boolean execute(CommandSender sender, String... args);

    default List<String> tab() {
        return Collections.emptyList();
    }
}
