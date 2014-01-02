package werl.plugins.usefulcommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import werl.plugins.usefulcommands.UsefulCommands;
import werl.plugins.usefulcommands.utils.Message;

public class KitsCommandExecutor implements CommandExecutor{
	
	private UsefulCommands plugin;

	public KitsCommandExecutor(UsefulCommands template) {
		plugin = template;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String command, String[] args) {
		if (args.length > 0){
			if (args[0].startsWith("r")){
				if (sender.hasPermission("kits.admin")){
					try {
						plugin.reload();
						sender.sendMessage(Message.info("Reloaded."));
					} catch (Exception e) {
						sender.sendMessage(Message.warning("Could not reload."));
					}
				}else{
					sender.sendMessage(Message.warning("Incorrect Permissions."));
				}
			}
		}else{
		    String kits = "";
		    for (String string : plugin.getKitsConfig().getKeys(false)){
		        kits += string + ", ";
		    }
            if (kits != "" || !kits.isEmpty()){
                sender.sendMessage(Message.info("Version " +  plugin.getPluginVersion() + ":"));
                
                kits = kits.substring(0, kits.length()-2);
                sender.sendMessage(Message.info(kits));
            }else{
                sender.sendMessage(Message.info("Version " +  plugin.getPluginVersion() + "."));
            }
		}
		return false;
	}
}
