package werl.plugins.usefulcommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import werl.plugins.usefulcommands.UsefulCommands;

public class ClearHandCommandExecutor extends UsefulExecutor
{
	public ClearHandCommandExecutor(UsefulCommands plugin)
	{
		super(plugin);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("clearhand"))
		{
			if(sender instanceof Player)
			{
				Player player = (Player)sender;
				if(!this.hasPerm(player, plugin.nodes.clearhand))
				{
					return true;
				}
				if(args == null || args[0] == null) return false;
				if(args[0].equalsIgnoreCase("y"))
				{
					player.getInventory().setItemInHand(null);
					return true;
				}
				return false;
				
			}
			else
			{
				sender.sendMessage("You must be a player to execute this command!");
				return true;
			}
		}
		return true;
	}

}
