package werl.plugins.usefulcommands;

import org.bukkit.plugin.java.JavaPlugin;

import werl.plugins.usefulcommands.commands.ClearHandCommandExecutor;

public class UsefulCommands extends JavaPlugin
{

	@Override
	public void onEnable()
	{
		getLogger().info("Useful Commands has been enabled!");
		getCommand("clearhand").setExecutor(new ClearHandCommandExecutor(this));
	}

	@Override
	public void onDisable()
	{
		getLogger().info("Useful Commands has been disabled!");
	}

}
