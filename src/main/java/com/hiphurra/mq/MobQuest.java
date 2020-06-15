package com.hiphurra.mq;

import com.hiphurra.mq.Events.Events;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobQuest extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("ma").setExecutor(new CommandHandler());
        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().broadcastMessage("Hello world!");
    }

    @Override
    public void onDisable() {

    }
}
