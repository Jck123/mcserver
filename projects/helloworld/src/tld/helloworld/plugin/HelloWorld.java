package tld.helloworld.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {
	@Override
	public void onEnable() {
		
	}
	@Override
	public void onDisable() {
		
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("hello")) {
			sender.sendMessage("Hello, " + sender.getName());
			return true;
		}
		return false;
	}
}