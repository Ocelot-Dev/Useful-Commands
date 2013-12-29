package werl.plugins.usefulcommands;

import org.bukkit.plugin.java.JavaPlugin;

import werl.plugins.usefulcommands.commands.ClearHandCommandExecutor;
import werl.plugins.usefulcommands.utils.PermissionNodeName;

public class UsefulCommands extends JavaPlugin
{
	public static PermissionNodeName nodes = new PermissionNodeName();
	
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
