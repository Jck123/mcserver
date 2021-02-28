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
			if ((sender instanceof Player)) {
				Player ply = Bukkit.getPlayer(sender.getName());
				ply.saveData();
				sender.sendMessage(sender.getName() + "'s information is saved!");
				return true;
			}
			sender.sendMessage("A player needs to send this command!");
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
