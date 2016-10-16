package me.xsme.playersaver;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerSaver extends JavaPlugin implements Listener {

    private int task;

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);

        getConfig().options().copyDefaults(true);
        Integer interval = getConfig().getInt("interval", 60);
        Boolean perms = getConfig().getBoolean("permissions", false);
        saveConfig();

        getLogger().info("Save online players to file every " + interval + " seconds");
        task = getServer().getScheduler().scheduleSyncRepeatingTask(this, new PlayerSaverScheduler(this), interval * 60, interval * 20);
    }

    @Override
    public void onDisable() {
        getServer().getScheduler().cancelTask(task);
    }
}