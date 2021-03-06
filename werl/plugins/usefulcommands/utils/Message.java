package werl.plugins.usefulcommands.utils;

import org.bukkit.ChatColor;

import werl.plugins.usefulcommands.UsefulCommands;

public class Message {
    private static String pluginName;
    
    public static void setParent(UsefulCommands instance){
        pluginName = instance.getPluginName();
    }
    
    public static String message(String message){
        return ChatColor.DARK_GRAY + pluginName + ": " + ChatColor.GRAY + message;
    }
    
    public static String warning(String message){
        return ChatColor.DARK_GRAY + pluginName + ": " + ChatColor.RED + message;
    }
    
    public static String info(String message){
        return ChatColor.DARK_GRAY + pluginName + ": " + ChatColor.DARK_AQUA + message;
    }
}
