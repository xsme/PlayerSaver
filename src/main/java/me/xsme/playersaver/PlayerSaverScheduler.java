package me.xsme.playersaver;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerSaverScheduler extends BukkitRunnable implements Runnable {

    public static PlayerSaver plugin;

    public PlayerSaverScheduler(PlayerSaver playerSaver) {
        plugin = playerSaver;
    }

    @Override
    public void run() {
        for(Player p : plugin.getServer().getOnlinePlayers()){
            if (plugin.getConfig().getBoolean("permissions")) {
                if (p.hasPermission("playersaver.save") || p.isOp()) {
                    p.saveData();
                }
            } else {
                p.saveData();
            }
        }
    }
}