package com.gmail.matthewkeating007.Troll;


import java.util.logging.Logger;


import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Troll extends JavaPlugin 
	{
	
	Logger log = Logger.getLogger("Minecraft");
	
	boolean freezeOn = false;
	boolean freeze = false;
	boolean flyOn = false;
	boolean fly = false;
	int xyz = 1;
	int zzz = 1;
	
	boolean useTroll = false;
	boolean useSpank = false;
	boolean useSpam = false;
	boolean useMurder = false;
	boolean useFake = false;
	boolean useSmite = false;
	boolean useIgnite = false;
	boolean useBlowup = false;
	boolean useExile = false;
	boolean useLaunch = false;
	boolean useFreeze = false;
	boolean useMelt = false;
	boolean useWoody = false;

	public void onEnable() 
	{ 
		log.info("=============================");
		log.info(" Trolling has been enabled :)");
		log.info("TROLOLOLOLOLOLOLOLOLOLOLOLOLO");
		log.info("=============================");
	}
	 
	public void onDisable()
	{ 
		
		log.info("Trolling disabled - Come back soon!");
		
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player player = (Player)sender;
		
		if (player.hasPermission("Troll.troll")) {
			useTroll = true;
		}
		if (player.hasPermission("Troll.spank")) {
			useSpank = true;
		}
		if (player.hasPermission("Troll.spam")) {
			useSpam = true;
		}
		if(player.hasPermission("Troll.murder")) {
			useMurder = true;
		}
		if(player.hasPermission("Troll.fake")) {
			useFake = true;
		}
		if(player.hasPermission("Troll.ignite")) {
			useIgnite = true;
		}
		if(player.hasPermission("Troll.blowup")) {
			useBlowup = true;
		}
		if(player.hasPermission("Troll.exile")) {
			useExile = true;
		}
		if(player.hasPermission("Troll.launch")) {
			useLaunch = true;
		}
		if(player.hasPermission("Troll.freeze")) {
			useFreeze = true;
		}
		if(player.hasPermission("Troll.melt")) {
			useMelt = true;
		}
		if(player.hasPermission("Troll.woody")) {
			useWoody = true;
		}
		if(player.hasPermission("Troll.smite")) {
			useSmite = true;
		}
		
		if(cmd.getName().equalsIgnoreCase("troll") && useTroll == true) 
		{
			if (args.length==0 || args[0].equals("1")) {
				
			
			sender.sendMessage(ChatColor.RED + "=============================================");
			sender.sendMessage(ChatColor.AQUA + "                   Welcome to Troll!                     ");
			sender.sendMessage(ChatColor.GREEN + "/spank [player] Gives them a nice tap.");
			sender.sendMessage(ChatColor.GREEN + "/spam [player] [message] Spams player's screen.");
			sender.sendMessage(ChatColor.GREEN + "/murder [player] 'Kill em.");
			sender.sendMessage(ChatColor.GREEN + "/fake [player] [text] Fake a console message.");
			sender.sendMessage(ChatColor.GREEN + "/smite [player] Strike player with lightning.");
			sender.sendMessage(ChatColor.GREEN + "/blowup [player] Blow up player with TNT.");
			sender.sendMessage(ChatColor.GREEN + "/exile [player] Teleport player to random place.");
			sender.sendMessage(ChatColor.WHITE + "Type /troll 2 to view the next page.");
			

		}
		
		if (args.length>=1) {
			sender.sendMessage("");
				if (args[0].equals("2")) {
					
					sender.sendMessage(ChatColor.RED + "=====================================================");
					sender.sendMessage(ChatColor.AQUA +  "Page 2 of 2");
					sender.sendMessage(ChatColor.GREEN + "/launch [player] [height] Shoots player into air.");
					sender.sendMessage(ChatColor.GREEN + "/freeze [player] [blocknumber] Traps player in cage.");
					sender.sendMessage(ChatColor.GREEN + "/melt [player] Melts player into lava.");
					sender.sendMessage(ChatColor.GREEN + "/woody [player] Generates a tree at player's location.");
					sender.sendMessage(ChatColor.RED + "=====================================================");
					
				}
			}
		}
	
		if(cmd.getName().equalsIgnoreCase("spam") && useSpam == true) 
		{
			int x = 0;
			
			if (args.length >= 1) 
			{
			Player target =(Bukkit.getServer().getPlayer(args[0]));
			if (args.length>=2) {
				String message = args[1];
			if (args.length>=3) {
				message = message + " " + args[2];
			}
			if (args.length>=4) {
				message = message + " " + args[3];
			}
			if (args.length>=5) {
				message = message + " " + args[4];
			}
			if (args.length>=6) {
				message = message + " " + args[5];
			}
			if (args.length>=7) {
				message = message + " " + args[6];
			}
			if (args.length>=8) {
				message = message + " " + args[7];
			}
			if (args.length>=9) {
				message = message + " " + args[8];
			}
			if (args.length>=10) {
				message = message + " " + args[9];
			}
			if (args.length==11) {
				message = message + " " + args[10];
			}
	
			else if (args.length>11) {
				sender.sendMessage(ChatColor.RED + "[Spam] Messsage is too long.");
				return true;
				
			}
	
				while (x < 1000) 
				{
					target.sendMessage(ChatColor.RED + "" + message);
					x++;
				}
			}
			}
			else {
				sender.sendMessage(ChatColor.RED + "Insufficent parameters.");
			}
			
		}
		if (cmd.getName().equalsIgnoreCase("murder") && useMurder == true) {
			if (args.length >= 1) {
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) 
				{
				target.setHealth(0);
				sender.sendMessage((ChatColor.RED + args[0] + " has been killed!" ));
				}
				else 
				{
					sender.sendMessage(ChatColor.WHITE + "User is not online.");
				}
			}
			else 
			{
				sender.sendMessage(ChatColor.RED + "Insufficent parameters.");
			}
		}
		if (cmd.getName().equalsIgnoreCase("ignite") && useIgnite == true) {
			if (args.length>=1) {
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) {
					target.setFireTicks(10000);
				}
				else {
					sender.sendMessage(ChatColor.WHITE + "User is not online");
				}
				
			}
			else {
				sender.sendMessage(ChatColor.RED + "Insufficent parameters.");
			}
		}
		
		if (cmd.getName().equalsIgnoreCase("fake") && useFake == true) {
			String message = "";
			Player target =(Bukkit.getServer().getPlayer(args[0]));
			if (args.length >=1) {
			if (target != null) {
			
			for (int i = 0; i <= args.length -1; i++){
				if (i == 0) {
					i += 1;
				}
				message += args[i] + " "; 
			}
			target.sendMessage(ChatColor.GRAY + message);
		}
			else {
				sender.sendMessage("User is not online.");
			}
		}	
			else {
				sender.sendMessage(ChatColor.WHITE + "Insufficient Parameters.");
			}
		}
		
		
		if (cmd.getName().equalsIgnoreCase("smite") && useSmite == true) {
			Player target =(Bukkit.getServer().getPlayer(args[0]));
			if (args.length>=1) {
			if (target != null) {
				
				World world = target.getWorld();
				Location location = target.getLocation();
				world.strikeLightning(location);
				target.sendMessage((ChatColor.RED + "Thou hast been smited!"));
			}
			else {
				sender.sendMessage("User is not online.");
			}
			}
			else {
				sender.sendMessage((ChatColor.RED + "Insufficient parameters."));
			}
		}
		
		if (cmd.getName().equalsIgnoreCase("spank") && useSpank == true) {
			
			if (args.length>=1) {
				int newHealth = 10;
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				int oldHealth = target.getHealth();
				if (oldHealth<=6) {
					newHealth = 0;
				}
				else { 
					newHealth = oldHealth - 6;
				}
				
				target.setHealth(newHealth);
				target.sendMessage((ChatColor.RED + "You have been spanked, you naughty miner."));
			}
			else {
				sender.sendMessage((ChatColor.RED + "Insufficient Parameters."));
			}
			
		}
	
		if(cmd.getName().equalsIgnoreCase("blowup") && useBlowup == true) {
			if (args.length>=1) {
				float explosionPower = 3F; 
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) {
				World world = target.getWorld();
				target.getWorld().createExplosion(target.getLocation(), explosionPower);
				world.createExplosion(target.getLocation(), explosionPower);
			}
				else {
					sender.sendMessage("User is not online.");
				}
			}
			else {
				sender.sendMessage((ChatColor.RED + "Insufficient Parameters."));
			}
		}
		
		if (cmd.getName().equalsIgnoreCase("exile") && useExile == true) {
			if (args.length>=1) {
				Random rand = new Random();
				int randx = rand.nextInt(1000);
				int randz = rand.nextInt(1000);
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) {
				Location newloc = target.getLocation().add(randx, 1, randz);
				target.teleport(newloc);
				target.sendMessage(ChatColor.GRAY + "You have been teleported to a mysterious new land.");
			}
				else {
					sender.sendMessage("User is not online.");
				}
			}
			else {
				sender.sendMessage(ChatColor.RED + "Insufficent parameters.");
			}
		}
		if(cmd.getName().equalsIgnoreCase("freeze") && useFreeze == true) {
			
			if (args.length>=1) {
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) {
				        try{
				        	int mat = Integer.parseInt(args[1]);
				            Location location;
				            Material material = Material.getMaterial(mat);
				            Miscellaneous M = new Miscellaneous();
				            location = target.getLocation();
				            M.changeBlock(location, -1, 0, 0, material);
				            M.changeBlock(location, 1, 0, 0, material);
				            M.changeBlock(location, 0, 0, -1, material);
				            M.changeBlock(location, 0, 0, 1, material);
				            M.changeBlock(location, -1, 1, 0, material);
				            M.changeBlock(location, 1, 1, 0, material);
				            M.changeBlock(location, 0, 1, -1, material);
				            M.changeBlock(location, 0, 1, 1, material);
				            M.changeBlock(location, 0, 2, 0, material);
				            M.changeBlock(location, 0, -1, 0, material);
				        }
				            catch(Exception e){
				            sender.sendMessage(ChatColor.RED + "Incorrect Block Value");
				   
				        }
			}
				else {
					sender.sendMessage("User is not online.");
				}
			}
		}
		
		if (cmd.getName().equalsIgnoreCase("launch") && useLaunch == true) {
			if (args.length==1) {
					Player target =(Bukkit.getServer().getPlayer(args[0]));
					if (target != null) {				
					Location newloc = target.getLocation().add(0,300,0);
					target.sendMessage("To infinity and beyond!");
					target.teleport(newloc);		
			}
			else {
				sender.sendMessage("User is not online.");
			}
			}
			if (args.length>=2) {
				double height = Double.parseDouble(args[1]);
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) {
				Location newloc = target.getLocation().add(0,height,0);
				target.sendMessage("To infinity and beyond!");
				target.teleport(newloc);
				
			}
				else {
					sender.sendMessage("User is not online.");
				}
			}
			else {
				sender.sendMessage("Insufficient Parameters.");
				
			}
		}
		if (cmd.getName().equalsIgnoreCase("melt") && useMelt == true) {
			if (args.length==1) {
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) {
		            Location location;
		            Material material = Material.getMaterial(11);
		            Miscellaneous M = new Miscellaneous();
		            location = target.getLocation();
		            M.changeBlock(location, 0, 1, 0, material);
		            M.changeBlock(location, 0, 0, 0, material);
				}
			}
			else {
				sender.sendMessage("Insufficient Parameters");
			}
		}
		if(cmd.getName().equalsIgnoreCase("woody") && useMelt == true) {
			if (args.length==1) {
				Player target =(Bukkit.getServer().getPlayer(args[0]));
				if (target != null) {
					
		            Location location;
		            Material wood = Material.getMaterial(17);
		            Material leave = Material.getMaterial(18);
		            
		            Miscellaneous M = new Miscellaneous();
		            location = target.getLocation();
		            M.changeBlock(location, 0, 0, 0, wood);
		            M.changeBlock(location, 0, 1, 0, wood);
		            M.changeBlock(location, 0, 2, 0, wood);
		            M.changeBlock(location, 0, 3, 0, leave);
		            
		            M.changeBlock(location, 0, 4, 0, leave);
		            
		            M.changeBlock(location, 1, 3, 0, leave);
		            M.changeBlock(location, -1, 3, 0, leave);
		            M.changeBlock(location, 1, 3, 0, leave);
		            M.changeBlock(location, 0, 3, 1, leave);
		            M.changeBlock(location, 0, 3, -1, leave);
		            
		            
				}
			}
			else {
				sender.sendMessage("Insufficient Parameters.");
			}
		}
		
		return true;	
}
}