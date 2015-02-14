package wehavecookies56.kk.updater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Reference;


public class Update
{
	public static String modName;
	public static String currentVersion;
	public static String url;
	public static boolean ableToCheck;

	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) throws MalformedURLException, IOException
	{
		if(ConfigBooleans.enableUpdateCheck && isUpdateAvailable() && ableToCheck == true){
			BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://raw.github.com/Wehavecookies56/Kingdom-Keys-1.7-/master/Version.txt").openStream()));
			String curVersion = versionFile.readLine();
			event.player.addChatMessage(new ChatComponentText("["+EnumChatFormatting.RED +"Kingdom Keys"+EnumChatFormatting.RESET+"] An Update is available for this mod. Version " + curVersion + " Check http://goo.gl/40N4TP for more info."));
		}

		else if(ConfigBooleans.enableUpdateCheck)
		{
			event.player.addChatMessage(new ChatComponentText("["+EnumChatFormatting.RED +"Kingdom Keys"+EnumChatFormatting.RESET+"] This mod is up to date"));
		}

		else if(!ConfigBooleans.enableUpdateCheck)
		{
			event.player.addChatMessage(new ChatComponentText("["+EnumChatFormatting.RED +"Kingdom Keys"+EnumChatFormatting.RESET+"] The update checker is not enabled"));
		}
		else if(!ableToCheck){
			event.player.addChatMessage(new ChatComponentText("["+EnumChatFormatting.RED +"Kingdom Keys"+EnumChatFormatting.RESET+"] The update checker was unable to check for an update"));
		}
	}

	public static boolean isUpdateAvailable() throws IOException, MalformedURLException {
		try{
			BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://raw.github.com/Wehavecookies56/Kingdom-Keys-1.7-/master/Version.txt").openStream()));
			String curVersion = versionFile.readLine();

			ableToCheck = true;
			versionFile.close();
			currentVersion = Reference.MOD_VER;
			if (!curVersion.contains(currentVersion)) {
				return true;
			}else{
				return false;
			}
			
		}catch(IOException e){
			ableToCheck = false;
			return false;
		}
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