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
			if (args.length != 0 && Bukkit.getPlayer(args[0]) != null) {
				Player ply = Bukkit.getPlayer(args[0]);
				ply.saveData();
				sender.sendMessage(ply.getName() + "'s information is saved!");
				return true;
			}
			sender.sendMessage("Please add a player");
			return true;
		} else if (command.getName().equalsIgnoreCase("LoadPlLoc")) {
			if (args.length != 0 && Bukkit.getPlayer(args[0]) != null) {
				Player ply = Bukkit.getPlayer(args[0]);
				ply.loadData();
				sender.sendMessage(ply.getName() + "'s information is loaded!");
				return true;
			}
			sender.sendMessage("Please add a player");
			return true;
		}
		return false;
	} 
}
