package jck.sethomes.plugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SetHomes extends JavaPlugin {
	@Override
	public void onEnable() {
		
	}
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("GetPlLoc")) {
			Player ply = Bukkit.getPlayer(args[0]);
			if (ply == null) {
				sender.sendMessage("Please add a player");
				return true;
			}
			sender.sendMessage(ply.getName() + " is at: " + ply.getLocation());
			return true;
		}
		return false;
	}
}
