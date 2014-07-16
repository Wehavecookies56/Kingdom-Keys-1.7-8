package wehavecookies56.kk.updater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;


public class Update
{
	public static String modName;
	public static String currentVersion;
	public static String url;
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) throws MalformedURLException, IOException {
		if(isUpdateAvailable()){
		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Version.txt").openStream()));
		String curVersion = versionFile.readLine();
		event.player.addChatMessage(new ChatComponentText("["+EnumChatFormatting.RED +"Kingdom Keys"+EnumChatFormatting.RESET+"] An Update is available for this mod. Version " + curVersion + " Check http://goo.gl/40N4TP for more info."));
		}else{
			event.player.addChatMessage(new ChatComponentText("["+EnumChatFormatting.RED +"Kingdom Keys"+EnumChatFormatting.RESET+"] This mod is up to date"));
		}
	}
	
	public static boolean isUpdateAvailable() throws IOException, MalformedURLException {
		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Version.txt").openStream()));
		String curVersion = versionFile.readLine();
		
		versionFile.close(); // YOU DONT NEED THE READER ANYMORE

		currentVersion = Reference.MOD_VER;
		if (!curVersion.contains(currentVersion)) {
		return true;
		}

		return false;
		}
	
	public static String getNewVersion(String address)
    {
		String newVersion = null;
    	try 
    	{
	    	URL url = new URL(address);
			Scanner scanner = new Scanner(url.openStream());
			while (scanner.hasNextLine())
			{
                newVersion = scanner.nextLine(); 
            }
			scanner.close();
		} 
    	catch (IOException ex)
    	{
			ex.printStackTrace();
		}
    	return newVersion;
    }
}