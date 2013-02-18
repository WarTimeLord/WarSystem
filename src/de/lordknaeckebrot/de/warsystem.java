package de.lordknaeckebrot.de;

import javax.swing.Spring;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class warsystem extends JavaPlugin{
	
	public void onEnable(){
		System.out.println("[]=======< WarSystem v1.0 >=======[]");
		System.out.println("Hi!");
	}
	
	public void onDisable(){
		System.out.println("[]=======< WarSystem v1.0 >=======[]");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
			//Player
			final Player p = (Player)sender;
		
			if (cmd.getName().equalsIgnoreCase("wartime"))
		    {
		      if (args.length == 0) {
		    	  
			        p.sendMessage(ChatColor.AQUA + "[]=========" + ChatColor.GOLD + ChatColor.BOLD + "< WarTime >" + ChatColor.AQUA + "========[]");
			        p.sendMessage(ChatColor.GOLD + "/warns [Spieler]: " + ChatColor.AQUA + "Zeigt Warns von einem Spieler.");
			        p.sendMessage(ChatColor.GOLD + "/marry: " + ChatColor.AQUA + "Spieler Heiraten.");
			        p.sendMessage(ChatColor.GOLD + "/skype: " + ChatColor.AQUA + "Nimmt marry an.");
			        p.sendMessage(ChatColor.GOLD + "/ts: " + ChatColor.AQUA + "Lehnt marry ab.");
			        p.sendMessage(ChatColor.GOLD + "/wartime clear: " + ChatColor.AQUA + "Leert für einen den Chat");
			        p.sendMessage(ChatColor.GOLD + "/wartime clan: " + ChatColor.AQUA + "Clan Infos.");
			        p.sendMessage(ChatColor.GOLD + "/wartime befehle: " + ChatColor.AQUA + "Infos über Befehle.");
			        p.sendMessage(ChatColor.GOLD + "Gecodet von: " + ChatColor.AQUA + "LordKnaeckebrot");
			        p.sendMessage(ChatColor.AQUA + "[]=============================[]");
		    	  return true;
		    	  
		      }
		      
		      if(args[0].equalsIgnoreCase("clear")){
		    	  
		    	  
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");
		    		  p.sendMessage(" ");

		    	  
		    	  
		    	  p.sendMessage(ChatColor.GREEN + "Privat Chat erfolgreich geleert!");
		    	  return true;
		      }
		      
		      if (args[0].equalsIgnoreCase("befehle")) {
		          p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "< WarTimeBefehle >" + ChatColor.AQUA + "=======[]");
		          p.sendMessage(ChatColor.GOLD + "/spawn " + ChatColor.AQUA + "Teleportiert dich zum Spawn.");
		          p.sendMessage(ChatColor.GOLD + "/kit start " + ChatColor.AQUA + "Gibt dir eine Starterausrüstung.");
		          p.sendMessage(ChatColor.GOLD + "/sethome & /home " + ChatColor.AQUA + "Setzt / Teleportiert dich zu deinem Zuhause.");
		          p.sendMessage(ChatColor.AQUA + "[]==========================================[]");
		          return true;
		        }
		        if (args[0].equalsIgnoreCase("clan")) {
		          p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "< WarTimeNeulinge >" + ChatColor.AQUA + "=======[]");
		          p.sendMessage(ChatColor.GOLD + "/f " + ChatColor.AQUA + "Basis Befehl.");
		          p.sendMessage(ChatColor.GOLD + "/f create <Name> <Kürzel> " + ChatColor.AQUA + "Clan erstellen.");
		          p.sendMessage(ChatColor.GOLD + "/f invite <Name> " + ChatColor.AQUA + "Einen Spieler einladen.");
		          p.sendMessage(ChatColor.GOLD + "/f leave " + ChatColor.AQUA + "Den Clan verlassen.");
		          p.sendMessage(ChatColor.GOLD + "/f help <Seite> " + ChatColor.AQUA + "Hilfe zu den Commands.");
		          p.sendMessage(ChatColor.AQUA + "[]==================================[]");
		          return true;
		        }
		      
		      
		      
		    }
			
			
			if(cmd.getName().equalsIgnoreCase("warns")){
				if(args.length == 0){
					String path = "warns." + p.getName();
					int i = this.getConfig().getInt(path);
					p.sendMessage(ChatColor.RED + "Deine Verwarnungen: " + ChatColor.GREEN + i);
					return true;
				}else{
					Player target = this.getServer().getPlayer(args[0]);
					String path = "warns." + target.getName();
					int i = this.getConfig().getInt(path);
					p.sendMessage(ChatColor.YELLOW + target.getName() + ChatColor.YELLOW + "'s " +  ChatColor.RED + "verwarnungen: " + ChatColor.GREEN + i);
					return true;
				}
			}
			
			if(cmd.getName().equalsIgnoreCase("cc")){
				if(p.hasPermission("wt.cc")){
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(" ");
					this.getServer().broadcastMessage(ChatColor.BLUE + "Der Chat wurde von " + ChatColor.YELLOW + p.getName() + ChatColor.BLUE + " geleert!");
				}else{
					p.sendMessage(ChatColor.RED + "Keine Rechte!");
				}
			}
			
			  if (cmd.getName().equalsIgnoreCase("vote")) {
			      p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "WarTimeVote " + ChatColor.AQUA + "=======[]");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "1" + ChatColor.RED + "] " + ChatColor.AQUA + "Gehe auf" + ChatColor.BOLD + "vote.wartime.eu");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "2" + ChatColor.RED + "] " + ChatColor.AQUA + "Gebe den Namen und den Code ein!");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "3" + ChatColor.RED + "] " + ChatColor.AQUA + "Die Belohnung kommt nach 1ner Minute!");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "4" + ChatColor.RED + "] " + ChatColor.AQUA + "Gehe auf vote.wartime.eu");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "5" + ChatColor.RED + "] " + ChatColor.AQUA + "Vielen Dank für das Voten!");
			    }

			    if (cmd.getName().equalsIgnoreCase("rang")) {
			      p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "WarTimeShop " + ChatColor.AQUA + "=======[]");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "1" + ChatColor.RED + "] " + ChatColor.AQUA + "Gehe auf: shop.wartime.eu");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "2" + ChatColor.RED + "] " + ChatColor.AQUA + "Suche dir ein Item / Rang aus und klicke auf 'Add to cart'");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "3" + ChatColor.RED + "] " + ChatColor.AQUA + "Gebe deine Paypal / Paysafe Daten ein und klicke auf Bezahlen");
			      p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "4" + ChatColor.RED + "] " + ChatColor.AQUA + "Nachdem die Spende bestätigt wurde, erhälst du den Rang Automatisch!");
			    }
			    if (cmd.getName().equalsIgnoreCase("hilfe")) {
			        p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "WarNeulingschutz " + ChatColor.AQUA + "=======[]");
			        p.sendMessage(ChatColor.RED + "I  " + ChatColor.AQUA + " /warp neu <--- INFO");
			        p.sendMessage(ChatColor.RED + "II " + ChatColor.AQUA + " /clan <--- Clan Info");
			        p.sendMessage(ChatColor.RED + "III" + ChatColor.AQUA + " /warp shop <--- Shop");
			        p.sendMessage(ChatColor.RED + "IV " + ChatColor.AQUA + " Wenn du dich Bewerben willst schreibe es ins Forum! wartimeoffical.de");
			        p.sendMessage(ChatColor.RED + "V  " + ChatColor.AQUA + " Fragen an den Admin? /helpop <FRAGE>");
			        p.sendMessage(ChatColor.RED + "VI " + ChatColor.AQUA + " /befehle <--- Liste der Commands");
			      }
			    
				if (cmd.getName().equalsIgnoreCase("umfrage"))
			    {
			      if (args.length == 0) {
			    	    String frage = this.getConfig().getString("umfrage.frage");
				        p.sendMessage(ChatColor.AQUA + "[]=========" + ChatColor.GOLD + ChatColor.BOLD + "< WarTime >" + ChatColor.AQUA + "========[]");
				        p.sendMessage(ChatColor.GOLD + "Frage: " + ChatColor.AQUA + frage);
				        p.sendMessage(ChatColor.AQUA + "[]=============================[]");
			    	  return true;
			    	  
			      }
			      
			      if(args[0].equalsIgnoreCase("erstellen")){
			    	  if(p.hasPermission("wt.umfrage")){
			    		  p.sendMessage(ChatColor.GREEN + "Umfrage erstellt!");
			    		  
			    		  StringBuilder sb = new StringBuilder();
			    		  for (int i = 1; i < args.length; i++){
			    		  sb.append(args[i]).append(" ");
			    		  }
			    		   
			    		  String allArgs = sb.toString().trim();
			    		  
			    		  this.getConfig().set("umfrage.frage", allArgs);
			    		  this.getConfig().set("umfrage.aktiv", true);
			    		  this.saveConfig();
			    		  
			    		  this.getServer().broadcastMessage(ChatColor.AQUA + "[]=========" + ChatColor.GOLD + ChatColor.BOLD + "< Umfrage >" + ChatColor.AQUA + "========[]");
			    		  this.getServer().broadcastMessage(ChatColor.GOLD + "Frage: " + ChatColor.AQUA + allArgs);
			    		  this.getServer().broadcastMessage(ChatColor.GOLD + "Stimme ab mit: " + ChatColor.GREEN + "/umfrage ja " + ChatColor.RED + "/umfrage nein");
					      this.getServer().broadcastMessage(ChatColor.AQUA + "[]=============================[]");
					      return true;
			    	  }else{
			    		  p.sendMessage(ChatColor.RED + "Keine Rechte!");
			    		  return true;
			    	  }
			      }
			      
			      if(args[0].equalsIgnoreCase("stop")){
			    	  if(p.hasPermission("wt.umfrage")){
			    		  p.sendMessage(ChatColor.GREEN + "Umfrage gestoppt!");
			    		  
			    		 
			    		  
			    		  this.getConfig().set("umfrage.frage", "-KEINE UMFRAGE-");
			    		  this.getConfig().set("umfrage.aktiv", false);
			    		  this.saveConfig();
			    		  
			    		  String name = this.getConfig().getString("umfrage.frage");
			    		  
			    		  this.getServer().broadcastMessage(ChatColor.AQUA + "[]=========" + ChatColor.GOLD + ChatColor.BOLD + "< Umfrage >" + ChatColor.AQUA + "========[]");
			    		  this.getServer().broadcastMessage(ChatColor.GOLD + "Frage: " + ChatColor.AQUA + name);
			    		  this.getServer().broadcastMessage(ChatColor.GOLD + "Ergebniss: " + ChatColor.GREEN + "/umfrage ja " + ChatColor.RED + "/umfrage nein");
					      this.getServer().broadcastMessage(ChatColor.AQUA + "[]=============================[]");
					      return true;
			    	  }else{
			    		  p.sendMessage(ChatColor.RED + "Keine Rechte!");
			    		  return true;
			    	  }
			      }
			      
			      if(args[0].equalsIgnoreCase("ja")){
			    	  
			    	  
			    	  boolean check = this.getConfig().getBoolean("umfrage.aktiv");
			    	  
			    	  if(check == false){
			    		  p.sendMessage(ChatColor.RED + "Es ist keine Umfrage Aktiv!");
			    		  return true;
			    	  }
			    	  
			    	  int zahl = this.getConfig().getInt("umfrage.ja");
			    	  
			    	  p.sendMessage(ChatColor.GREEN + "Erfolgreich abgestimmt!");
			    	  if(zahl == 0){
			    		  this.getConfig().set("umfrage.ja", 1);
			    		  this.saveConfig();
			    		  return true;
			    	  }else{
			    		  zahl++;
			    		  this.getConfig().set("umfrage.ja", zahl);
			    		  this.saveConfig();
			    		  return true;
			    	  }
			      }
			      if(args[0].equalsIgnoreCase("nein")){
			    	  
			    	  boolean check = this.getConfig().getBoolean("umfrage.aktiv");
			    	  
			    	  if(check == false){
			    		  p.sendMessage(ChatColor.RED + "Es ist keine Umfrage Aktiv!");
			    		  return true;
			    	  }
			    	  
			    	  int zahl = this.getConfig().getInt("umfrage.nein");

			    	  p.sendMessage(ChatColor.GREEN + "Erfolgreich abgestimmt!");
			    	  if(zahl == 0){
			    		  this.getConfig().set("umfrage.nein", 1);
			    		  this.saveConfig();
			    		  return true;
			    	  }else{
			    		  zahl++;
			    		  this.getConfig().set("umfrage.nein", zahl);
			    		  this.saveConfig();
			    		  return true;
			    	  }
			      }
			    }
				
			    if (cmd.getName().equalsIgnoreCase("skype")) {
			        p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "< WarTimeSkype >" + ChatColor.AQUA + "=======[]");
			        p.sendMessage(ChatColor.GOLD + "Zeta20104: " + ChatColor.AQUA + "zetazeta10");
			        p.sendMessage(ChatColor.GOLD + "LordKnaeckebrot " + ChatColor.AQUA + "lordknaeckebrot");
			        p.sendMessage(ChatColor.GOLD + "Googler_98 " + ChatColor.AQUA + "ichmagnutella1");
			        p.sendMessage(ChatColor.GOLD + "ottotoni " + ChatColor.AQUA + "lorenz.hey");
			        p.sendMessage(ChatColor.GOLD + "mortz98 " + ChatColor.AQUA + "mortz981");
			        p.sendMessage(ChatColor.GOLD + "NexXx0n " + ChatColor.AQUA + "nexxx0n");
			        p.sendMessage(ChatColor.AQUA + "[]================================[]");
			      }
			    
			    if(cmd.getName().equalsIgnoreCase("ts")){
			        p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "< WarTimeTs3 >" + ChatColor.AQUA + "=======[]");
			    	p.sendMessage(ChatColor.GOLD + "Unsere TS3 Adresse : " + ChatColor.AQUA + "wartime.nitrado.net:18750");
			        p.sendMessage(ChatColor.AQUA + "[]================================[]");

			    }
			    if(cmd.getName().equalsIgnoreCase("ts3")){
			        p.sendMessage(ChatColor.AQUA + "[]======= " + ChatColor.GOLD + ChatColor.BOLD + "< WarTimeTs3 >" + ChatColor.AQUA + "=======[]");
			    	p.sendMessage(ChatColor.GOLD + "Unsere TS3 Adresse : " + ChatColor.AQUA + "wartime.nitrado.net:18750");
			        p.sendMessage(ChatColor.AQUA + "[]================================[]");

			    }
			
			return false;
		}
}
