package werl.plugins.usefulcommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import werl.plugins.usefulcommands.UsefulCommands;

public abstract class UsefulExecutor implements CommandExecutor
{
	protected final UsefulCommands plugin;

	public UsefulExecutor(UsefulCommands plugin)
	{
		this.plugin = plugin;
	}
	
	public boolean hasPerm(Player player, String perm)
	{
		if(player.hasPermission(perm))
			return true;
		else
		{
			sendNoPerm(player, perm);
			return false;
		}
	}
	
	public void sendNoPerm(Player player, String commandName)
	{
		player.sendMessage("Sorry you do not have permissions to run the command '" + commandName + "'.");
	}
}
