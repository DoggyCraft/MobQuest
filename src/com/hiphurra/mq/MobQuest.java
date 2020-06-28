package com.hiphurra.mq;

import com.hiphurra.mq.Events.Events;
import org.bukkit.plugin.java.JavaPlugin;

public class MobQuest extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("ma").setExecutor(new CommandHandler());
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {

    }

}
