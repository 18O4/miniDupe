package me.minioof.minidupe_v2.commands;

import org.apache.commons.lang.WordUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class dupeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (!p.hasPermission("minidupe.dupe")) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6[miniDupe]&c Insufficient permission. &7(minidupe.dupe)"));
                return true; }
            if (p.getInventory().getItemInMainHand().getType() == Material.AIR) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6[miniDupe] &cYou can't dupe air!"));
                return true; }
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6[miniDupe] &aSuccessfully duped &2" + WordUtils.capitalizeFully(p.getInventory().getItemInMainHand().getType().toString().replaceAll("_", " ")) + " &ax" + p.getInventory().getItemInMainHand().getAmount() + "&a!"));
            p.getInventory().addItem(p.getInventory().getItemInMainHand());
        }
        return true;
    }
}
