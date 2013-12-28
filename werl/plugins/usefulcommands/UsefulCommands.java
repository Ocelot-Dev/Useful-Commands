package werl.plugins.usefulcommands;

import org.bukkit.plugin.java.JavaPlugin;

public class UsefulCommands extends JavaPlugin
{

	@Override
	public void onEnable()
	{
		getLogger().info("Useful Commands has been enabled!");
		getCommand("clearhand").setExecutor(new UsefulCommandExecutor(this));
	}

	@Override
	public void onDisable()
	{
		getLogger().info("Useful Commands has been disabled!");
	}

}
