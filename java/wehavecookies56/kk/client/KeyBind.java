package wehavecookies56.kk.client;

import java.util.Random;

import net.java.games.input.Mouse;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.util.ChatComponentText;

import org.lwjgl.input.Keyboard;

import scala.swing.event.MouseButtonEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.achievements.AddedAchievments;
import wehavecookies56.kk.client.gui.GuiMenu;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.core.packet.AchievementPacket;
import wehavecookies56.kk.core.packet.IPacket;
import wehavecookies56.kk.core.packet.SummonPacket;
import wehavecookies56.kk.driveforms.AddedDrives;
import wehavecookies56.kk.driveforms.DriveAnti;
import wehavecookies56.kk.driveforms.DriveValor;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.magic.Cure;
import wehavecookies56.kk.magic.Fire;
import wehavecookies56.kk.magic.MagicAttack;
import wehavecookies56.kk.magic.Thunder;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KeyBind{

	private static final String[] desc = {"key.summon.desc", "key.menu.desc", "key.command.desc", "key.enter.desc", "key.back.desc"};
	Minecraft mc = Minecraft.getMinecraft();
	public static final int SUMMON = 0;
	public static final int MENU = 1;
	public static final int COMMAND = 2;
	public static final int ENTER = 3;
	public static final int BACK = 4;
	
	public static int selected = 0;
	public static int submenu;
	public static int magicselected = -1;
	public static int itemselected = -1;
	public static int driveselected = -1;

	//public static boolean shootFire = false;
	
	private static final int[] keyValues = {Keyboard.KEY_G, Keyboard.KEY_M, Keyboard.KEY_C, Keyboard.KEY_F, Keyboard.KEY_B};
	private final KeyBinding[] keys;
	StatFileWriter sfw;
	@SideOnly(Side.CLIENT)
	public KeyBind() {
		keys = new KeyBinding[desc.length];
		for (int i = 0; i < desc.length; ++i) {
			keys[i] = new KeyBinding(desc[i], keyValues[i], "key.KingdomKeys.category");
			ClientRegistry.registerKeyBinding(keys[i]);
		}
	}
	/**
	 * KeyInputEvent is in the FML package, so we must register to the FML event bus
	 */
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event) {	
		EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
		//System.out.print(magicselected);
		if (keys[BACK].isPressed())
		{
			if (submenu == 0)
			{
				submenu = 0;
			}
			else if (submenu == 1)
			{
				submenu -= 1;
			}
			else if (submenu == 2)
			{
				submenu -= 2;
			}
			else if (submenu == 3)
			{
				submenu -= 3;
			}
			magicselected = -1;
			driveselected = -1;
		}
		
		if (keys[COMMAND].isPressed())
	//	if(mc.gameSettings.keyBindPickBlock.getIsKeyPressed())
		{
//Main command menu	
//Attack
			if(submenu == 0)
			{//	0 = attack, 1 = magic, 2 = Items, 3 = Drive
				if (player.isSneaking())
				{
					if (selected > 0 && selected <= 3)
					{
						selected -= 1;
						submenu = 0;
	
					}
					else if (selected == 0)
					{
						selected = 3;
					}
				}
				else
				{
					if (selected >= 0 && selected < 3)
					{
						selected += 1;
						submenu = 0;
	
					}
					else if (selected == 3)
					{
						selected = 0;
					}
				}
			}
//Magic
			else if (submenu == 1)
			{
				if (player.isSneaking())
				{
					if (magicselected > -1 && magicselected <= 6)
					{
						magicselected -= 1;
						submenu = 1;
	
					}
					else if (magicselected == -1)
					{
						magicselected = 6;
					}
				}
				else
				{
					if (magicselected >= -1 && magicselected < 6)
					{
						magicselected += 1;
						submenu = 1;
	
					}
					else if (magicselected == 6)
					{
						magicselected = -1;
					}
				}
			}
//Items
			else if (submenu == 2)
			{
			/*	if (player.isSneaking())
				{
					if (driveselected > 0 && magicselected <= 6)
					{
						magicselected = magicselected-1;
						submenu = 1;
					}
					else if (magicselected == 0)
					{
						magicselected = 6;
					}
				}
				else
				{
					if (magicselected >= 0 && magicselected < 6)
					{
						magicselected = magicselected+1;
						submenu = 1;
					}
					else if (magicselected == 6)
					{
						magicselected = 0;
					}
				}*/
			}
//DRIVE
			else if (submenu == 3)
			{
				if (player.isSneaking())
				{
					if (driveselected > -1 && driveselected <= 4)
					{
						driveselected -= 1;
						submenu = 3;
	
					}
					else if (driveselected == -1)
					{
						driveselected = 4;
					}
				}
				else
				{
					if (driveselected >= -1 && driveselected < 4)
					{
						driveselected += 1;
						submenu = 3;
					}
					else if (driveselected == 4)
					{
						driveselected = -1;
					}
				}
			}
		}
		if (keys[ENTER].isPressed())
	//	if (mc.gameSettings.keyBindAttack.isPressed())
		{
			switch(selected) //Case 0 not necessary as it is attack
			{
		/*	case 0: 
				//Attack
				submenu = 0;
				break;*/
			case 1:
				//Magic
				submenu = 1;
				break;
			case 2:
				//Items
				submenu = 2;
				break;
			case 3:
				//Drive
				EntityPropertyDriveForm df = EntityPropertyDriveForm.get(mc.thePlayer);	
				if (df.getCurrentState() == 0 || df.getCurrentState() == 1 || df.getCurrentState() == 2 || df.getCurrentState() == 3 || df.getCurrentState() == 4)
				{
					df.changeState(-1);
				}
				
				else if (df.getCurrentState() == 5)
				{
					if(player.isBurning())
					{
						player.addChatMessage(new ChatComponentText("You can't revert right now."));
					}
					else
					{
						df.changeState(-1);
					}
				}
				
				else
				{
					submenu = 3;
				}
				break;
			}
//Fire			
			//MagicAttack.currMagic=100;
			if(KeyBind.magicselected == 0 && submenu == 1)
			{
				Fire.shoot(player, Minecraft.getMinecraft().theWorld);
			}
			else if (KeyBind.magicselected == 1 && submenu == 1)
			{
				//Blizzard.ice();
			}
			else if (KeyBind.magicselected == 2 && submenu == 1)
			{
				Thunder.ray(player, Minecraft.getMinecraft().theWorld);
			}
			else if (KeyBind.magicselected == 3 && submenu == 1)
			{
				Cure.cure(player);
			}
			
//Drive Forms
			EntityPropertyDriveForm df = EntityPropertyDriveForm.get(mc.thePlayer);	
			if(driveselected == 0 && submenu == 3)
			{
				df.changeState(0);
				AddedDrives.valor.activate(player);
				System.out.println("Active");
				DriveAnti.antipoints +=1;
			}
			else if(driveselected == 1 && submenu == 3)
			{
				df.changeState(1);
				AddedDrives.wisdom.activate(player);
				DriveAnti.antipoints +=1;
			}
			else if(driveselected == 2 && submenu == 3)
			{
				df.changeState(2);
				AddedDrives.limit.activate(player);
				DriveAnti.antipoints +=1;
			}
			else if(driveselected == 3 && submenu == 3)
			{
				df.changeState(3);
				AddedDrives.master.activate(player);
				DriveAnti.antipoints +=1;
			}
			else if(driveselected == 4 && submenu == 3)
			{
				df.changeState(4);
				AddedDrives.Final.activate(player);
				if (DriveAnti.antipoints < 10)
				{
					DriveAnti.antipoints = 0;
				}
				else
				{
					DriveAnti.antipoints -=10;
				}
			}
			
			if(driveselected == 0 || driveselected == 1 || driveselected == 2 || driveselected == 3)
			{
				if(DriveAnti.antipoints > 0 && DriveAnti.antipoints <=4)
				{
					DriveAnti.prob = 10;
				}
				
				else if(DriveAnti.antipoints > 4 && DriveAnti.antipoints <=9)
				{
					DriveAnti.prob = 25;
				}
					
				else if(DriveAnti.antipoints >= 10)
				{
					DriveAnti.prob = 40;
				}
				Random rand = new Random();

				if (Math.random() < DriveAnti.prob/100)
				{
					df.changeState(5);
					if (DriveAnti.antipoints < 4)
					{
						DriveAnti.antipoints = 0;
					}
					else
					{
						DriveAnti.antipoints -=4;
					}
				}
			}
			
			System.out.println("Points "+DriveAnti.antipoints);
			System.out.println("Prob "+DriveAnti.prob);

			if (EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 0 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 1 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 2 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 3 || EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer).getCurrentState() == 4)
			{
				submenu -= 3;
				magicselected = -1;
				selected = 0;
				driveselected = -1;
			}
		}
		
		if (keys[MENU].isPressed()) {
			boolean hasMenuAchv = false;
			if(!hasMenuAchv){
				hasMenuAchv = true;
				IPacket packet = new AchievementPacket(1);
				KingdomKeys.network.sendToServer(packet);
			}
			if(Minecraft.getMinecraft().currentScreen == new GuiMenu()){
				Minecraft.getMinecraft().displayGuiScreen(null);
			}else if(Minecraft.getMinecraft().currentScreen == null){
				Minecraft.getMinecraft().displayGuiScreen(new GuiMenu());
			}
		}
		if (Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().theWorld.isRemote){
			if (keys[SUMMON].isPressed()) {
				if(Minecraft.getMinecraft().thePlayer.getHeldItem() != null){
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Vulpeus){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.VulpeusChain), new ItemStack(AddedItems.Vulpeus));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VulpeusChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Vulpeus), new ItemStack(AddedItems.VulpeusChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Ursus){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.UrsusChain), new ItemStack(AddedItems.Ursus));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UrsusChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Ursus), new ItemStack(AddedItems.UrsusChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Unicornis){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.UnicornisChain), new ItemStack(AddedItems.Unicornis));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UnicornisChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Unicornis), new ItemStack(AddedItems.UnicornisChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Leopardos){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LeopardosChain), new ItemStack(AddedItems.Leopardos));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeopardosChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Leopardos), new ItemStack(AddedItems.LeopardosChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Anguis){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AnguisChain), new ItemStack(AddedItems.Anguis));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AnguisChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Anguis), new ItemStack(AddedItems.AnguisChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeasKeyblade){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LeasKeybladeChain), new ItemStack(AddedItems.LeasKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeasKeybladeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LeasKeyblade), new ItemStack(AddedItems.LeasKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.YoungXehanortsKeyblade){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.YoungXehanortsKeybladeChain), new ItemStack(AddedItems.YoungXehanortsKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.YoungXehanortsKeybladeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.YoungXehanortsKeyblade), new ItemStack(AddedItems.YoungXehanortsKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Oceanrage){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OceanRageChain), new ItemStack(AddedItems.Oceanrage));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OceanRageChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Oceanrage), new ItemStack(AddedItems.OceanRageChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndOfPain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.EndOfPainChain), new ItemStack(AddedItems.EndOfPain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndOfPainChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.EndOfPain), new ItemStack(AddedItems.EndOfPainChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Unbound){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.UnboundChain), new ItemStack(AddedItems.Unbound));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UnboundChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Unbound), new ItemStack(AddedItems.UnboundChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetDreams){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SweetDreamsChain), new ItemStack(AddedItems.SweetDreams));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetDreamsChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SweetDreams), new ItemStack(AddedItems.SweetDreamsChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiveWing){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DiveWingChain), new ItemStack(AddedItems.DiveWing));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiveWingChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DiveWing), new ItemStack(AddedItems.DiveWingChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Counterpoint){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CounterpointChain), new ItemStack(AddedItems.Counterpoint));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CounterpointChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Counterpoint), new ItemStack(AddedItems.CounterpointChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AllForOne){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AllForOneChain), new ItemStack(AddedItems.AllForOne));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AllForOneChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AllForOne), new ItemStack(AddedItems.AllForOneChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KnockoutPunch){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KnockoutPunchChain), new ItemStack(AddedItems.KnockoutPunch));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KnockoutPunchChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KnockoutPunch), new ItemStack(AddedItems.KnockoutPunchChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FerrisGear){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FerrisGearChain), new ItemStack(AddedItems.FerrisGear));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FerrisGearChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FerrisGear), new ItemStack(AddedItems.FerrisGearChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DualDisc){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DualDiscChain), new ItemStack(AddedItems.DualDisc));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DualDiscChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DualDisc), new ItemStack(AddedItems.DualDiscChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianBell){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.GuardianBellChain), new ItemStack(AddedItems.GuardianBell));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianBellChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.GuardianBell), new ItemStack(AddedItems.GuardianBellChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SkullNoise){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SkullNoiseChain), new ItemStack(AddedItems.SkullNoise));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SkullNoiseChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SkullNoise), new ItemStack(AddedItems.SkullNoiseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WoodenKeyblade){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WoodenKeybladeChain), new ItemStack(AddedItems.WoodenKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WoodenKeybladeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WoodenKeyblade), new ItemStack(AddedItems.WoodenKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KyebladeBroken){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KyebladeBrokenChain), new ItemStack(AddedItems.KyebladeBroken));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KyebladeBrokenChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KyebladeBroken), new ItemStack(AddedItems.KyebladeBrokenChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Kyeblade){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KyebladeChain), new ItemStack(AddedItems.Kyeblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KyebladeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Kyeblade), new ItemStack(AddedItems.KyebladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Lightseeker){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LightSeekerChain), new ItemStack(AddedItems.Lightseeker));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LightSeekerChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Lightseeker), new ItemStack(AddedItems.LightSeekerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LostMemory){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LostMemoryChain), new ItemStack(AddedItems.LostMemory));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LostMemoryChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LostMemory), new ItemStack(AddedItems.LostMemoryChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FrolicFlame){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FrolicFlameChain), new ItemStack(AddedItems.FrolicFlame));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FrolicFlameChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FrolicFlame), new ItemStack(AddedItems.FrolicFlameChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MasterKeeper){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MasterKeeperChain), new ItemStack(AddedItems.MasterKeeper));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MasterKeeperChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MasterKeeper), new ItemStack(AddedItems.MasterKeeperChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BrightCrest){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.BrightCrestChain), new ItemStack(AddedItems.BrightCrest));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BrightCrestChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.BrightCrest), new ItemStack(AddedItems.BrightCrestChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownUnlimit){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CrownUnlimitChain), new ItemStack(AddedItems.CrownUnlimit));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownUnlimitChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CrownUnlimit), new ItemStack(AddedItems.CrownUnlimitChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.NoName){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.NoNameChain), new ItemStack(AddedItems.NoName));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.NoNameChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.NoName), new ItemStack(AddedItems.NoNameChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VoidGear){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.VoidGearChain), new ItemStack(AddedItems.VoidGear));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VoidGearChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.VoidGear), new ItemStack(AddedItems.VoidGearChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetStack){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SweetStackChain), new ItemStack(AddedItems.SweetStack));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetStackChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SweetStack), new ItemStack(AddedItems.SweetStackChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PixiePetal){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PixiePetalChain), new ItemStack(AddedItems.PixiePetal));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PixiePetalChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PixiePetal), new ItemStack(AddedItems.PixiePetalChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Hyperdrive){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.HyperdriveChain), new ItemStack(AddedItems.Hyperdrive));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HyperdriveChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Hyperdrive), new ItemStack(AddedItems.HyperdriveChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MarkOfAHero){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MarkOfAHeroChain), new ItemStack(AddedItems.MarkOfAHero));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MarkOfAHeroChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MarkOfAHero), new ItemStack(AddedItems.MarkOfAHeroChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VictoryLine){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.VictoryLineChain), new ItemStack(AddedItems.VictoryLine));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VictoryLineChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.VictoryLine), new ItemStack(AddedItems.VictoryLineChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyStars){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FairyStarsChain), new ItemStack(AddedItems.FairyStars));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyStarsChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FairyStars), new ItemStack(AddedItems.FairyStarsChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StrokeOfMidnight){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.StrokeOfMidnightChain), new ItemStack(AddedItems.StrokeOfMidnight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StrokeOfMidnightChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.StrokeOfMidnight), new ItemStack(AddedItems.StrokeOfMidnightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ChaosRipper){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.ChaosRipperChain), new ItemStack(AddedItems.ChaosRipper));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ChaosRipperChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.ChaosRipper), new ItemStack(AddedItems.ChaosRipperChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.XehanortsKeyblade){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.XehanortsKeybladeChain), new ItemStack(AddedItems.XehanortsKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.XehanortsKeybladeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.XehanortsKeyblade), new ItemStack(AddedItems.XehanortsKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Darkgnaw){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DarkgnawChain), new ItemStack(AddedItems.Darkgnaw));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DarkgnawChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Darkgnaw), new ItemStack(AddedItems.DarkgnawChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ZeroOne){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.ZeroOneChain), new ItemStack(AddedItems.ZeroOne));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ZeroOneChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.ZeroOne), new ItemStack(AddedItems.ZeroOneChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DreamSword){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DreamSwordChain), new ItemStack(AddedItems.DreamSword));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DreamSwordChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DreamSword), new ItemStack(AddedItems.DreamSwordChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Aubade){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AubadeChain), new ItemStack(AddedItems.Aubade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AubadeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Aubade), new ItemStack(AddedItems.AubadeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Umbrella){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.UmbrellaChain), new ItemStack(AddedItems.Umbrella));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UmbrellaChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Umbrella), new ItemStack(AddedItems.UmbrellaChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OmegaWeapon){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OmegaWeaponChain), new ItemStack(AddedItems.OmegaWeapon));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OmegaWeaponChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OmegaWeapon), new ItemStack(AddedItems.OmegaWeaponChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwilightBlaze){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TwilightBlazeChain), new ItemStack(AddedItems.TwilightBlaze));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwilightBlazeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TwilightBlaze), new ItemStack(AddedItems.TwilightBlazeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MaverickFlare){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MaverickFlareChain), new ItemStack(AddedItems.MaverickFlare));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MaverickFlareChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MaverickFlare), new ItemStack(AddedItems.MaverickFlareChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AstralBlast){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AstralBlastChain), new ItemStack(AddedItems.AstralBlast));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AstralBlastChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AstralBlast), new ItemStack(AddedItems.AstralBlastChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DarkerThanDark){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DarkerThanDarkChain), new ItemStack(AddedItems.DarkerThanDark));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DarkerThanDarkChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DarkerThanDark), new ItemStack(AddedItems.DarkerThanDarkChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LunarEclipse){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LunarEclipseChain), new ItemStack(AddedItems.LunarEclipse));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LunarEclipseChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LunarEclipse), new ItemStack(AddedItems.LunarEclipseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SilentDirge){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SilentDirgeChain), new ItemStack(AddedItems.SilentDirge));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SilentDirgeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SilentDirge), new ItemStack(AddedItems.SilentDirgeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TotalEclipse){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TotalEclipseChain), new ItemStack(AddedItems.TotalEclipse));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TotalEclipseChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TotalEclipse), new ItemStack(AddedItems.TotalEclipseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GlimpseOfDarkness){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.GlimpseOfDarknessChain), new ItemStack(AddedItems.GlimpseOfDarkness));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GlimpseOfDarknessChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.GlimpseOfDarkness), new ItemStack(AddedItems.GlimpseOfDarknessChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MidnightRoar){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MidnightRoarChain), new ItemStack(AddedItems.MidnightRoar));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MidnightRoarChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MidnightRoar), new ItemStack(AddedItems.MidnightRoarChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RejectionOfFate){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.RejectionOfFateChain), new ItemStack(AddedItems.RejectionOfFate));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RejectionOfFateChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.RejectionOfFate), new ItemStack(AddedItems.RejectionOfFateChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TrueLightsFlight){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TrueLightsFlightChain), new ItemStack(AddedItems.TrueLightsFlight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TrueLightsFlightChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TrueLightsFlight), new ItemStack(AddedItems.TrueLightsFlightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Leviathan){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LeviathanChain), new ItemStack(AddedItems.Leviathan));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeviathanChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Leviathan), new ItemStack(AddedItems.LeviathanChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbyssalTide){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AbyssalTideChain), new ItemStack(AddedItems.AbyssalTide));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbyssalTideChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AbyssalTide), new ItemStack(AddedItems.AbyssalTideChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownOfGuilt){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CrownOfGuiltChain), new ItemStack(AddedItems.CrownOfGuilt));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownOfGuiltChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CrownOfGuilt), new ItemStack(AddedItems.CrownOfGuiltChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SignOfInnocence){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SignOfInnocenceChain), new ItemStack(AddedItems.SignOfInnocence));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SignOfInnocenceChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SignOfInnocence), new ItemStack(AddedItems.SignOfInnocenceChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PainOfSolitude){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PainOfSolitudeChain), new ItemStack(AddedItems.PainOfSolitude));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PainOfSolitudeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PainOfSolitude), new ItemStack(AddedItems.PainOfSolitudeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbaddonPlasma){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AbaddonPlasmaChain), new ItemStack(AddedItems.AbaddonPlasma));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbaddonPlasmaChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.AbaddonPlasma), new ItemStack(AddedItems.AbaddonPlasmaChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OminousBlight){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OminousBlightChain), new ItemStack(AddedItems.OminousBlight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OminousBlightChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OminousBlight), new ItemStack(AddedItems.OminousBlightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MissingAche){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MissingAcheChain), new ItemStack(AddedItems.MissingAche));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MissingAcheChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MissingAche), new ItemStack(AddedItems.MissingAcheChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WinnersProof){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WinnersProofChain), new ItemStack(AddedItems.WinnersProof));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WinnersProofChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WinnersProof), new ItemStack(AddedItems.WinnersProofChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FatalCrest){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FatalCrestChain), new ItemStack(AddedItems.FatalCrest));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FatalCrestChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FatalCrest), new ItemStack(AddedItems.FatalCrestChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwoBecomesOne){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TwoBecomesOneChain), new ItemStack(AddedItems.TwoBecomesOne));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwoBecomesOneChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TwoBecomesOne), new ItemStack(AddedItems.TwoBecomesOneChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BondOfFlames){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.BondOfFlamesChain), new ItemStack(AddedItems.BondOfFlames));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BondOfFlamesChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.BondOfFlames), new ItemStack(AddedItems.BondOfFlamesChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Fenrir){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FenrirChain), new ItemStack(AddedItems.Fenrir));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FenrirChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Fenrir), new ItemStack(AddedItems.FenrirChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SleepingLion){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SleepingLionChain), new ItemStack(AddedItems.SleepingLion));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SleepingLionChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SleepingLion), new ItemStack(AddedItems.SleepingLionChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianSoul){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.GuardianSoulChain), new ItemStack(AddedItems.GuardianSoul));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianSoulChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.GuardianSoul), new ItemStack(AddedItems.GuardianSoulChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Gullwing){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.GullWingChain), new ItemStack(AddedItems.Gullwing));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GullWingChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Gullwing), new ItemStack(AddedItems.GullWingChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PhotonDebugger){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PhotonDebuggerChain), new ItemStack(AddedItems.PhotonDebugger));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PhotonDebuggerChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PhotonDebugger), new ItemStack(AddedItems.PhotonDebuggerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetMemories){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SweetMemoriesChain), new ItemStack(AddedItems.SweetMemories));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetMemoriesChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SweetMemories), new ItemStack(AddedItems.SweetMemoriesChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CircleOfLife){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CircleOfLifeChain), new ItemStack(AddedItems.CircleOfLife));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CircleOfLifeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CircleOfLife), new ItemStack(AddedItems.CircleOfLifeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DecisivePumpkin){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DecisivePumpkinChain), new ItemStack(AddedItems.DecisivePumpkin));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DecisivePumpkinChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DecisivePumpkin), new ItemStack(AddedItems.DecisivePumpkinChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingLamp){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WishingLampChain), new ItemStack(AddedItems.WishingLamp));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingLampChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WishingLamp), new ItemStack(AddedItems.WishingLampChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FollowTheWind){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FollowTheWindChain), new ItemStack(AddedItems.FollowTheWind));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FollowTheWindChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FollowTheWind), new ItemStack(AddedItems.FollowTheWindChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MysteriousAbyss){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MysteriousAbyssChain), new ItemStack(AddedItems.MysteriousAbyss));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MysteriousAbyssChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MysteriousAbyss), new ItemStack(AddedItems.MysteriousAbyssChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Monochrome){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MonochromeChain), new ItemStack(AddedItems.Monochrome));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MonochromeChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Monochrome), new ItemStack(AddedItems.MonochromeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HerosCrest){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.HerosCrestChain), new ItemStack(AddedItems.HerosCrest));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HerosCrestChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.HerosCrest), new ItemStack(AddedItems.HerosCrestChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RumblingRose){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.RumblingRoseChain), new ItemStack(AddedItems.RumblingRose));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RumblingRoseChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.RumblingRose), new ItemStack(AddedItems.RumblingRoseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HiddenDragon){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.HiddenDragonChain), new ItemStack(AddedItems.HiddenDragon));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HiddenDragonChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.HiddenDragon), new ItemStack(AddedItems.HiddenDragonChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndsOfEarth){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.EndsOfEarthChain), new ItemStack(AddedItems.EndsOfEarth));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndsOfEarthChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.EndsOfEarth), new ItemStack(AddedItems.EndsOfEarthChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Stormfall){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.StormfallChain), new ItemStack(AddedItems.Stormfall));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StormfallChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Stormfall), new ItemStack(AddedItems.StormfallChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DestinysEmbrace){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DestinysEmbraceChain), new ItemStack(AddedItems.DestinysEmbrace));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DestinysEmbraceChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DestinysEmbrace), new ItemStack(AddedItems.DestinysEmbraceChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WayToDawn){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WayToDawnChain), new ItemStack(AddedItems.WayToDawn));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WayToDawnChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WayToDawn), new ItemStack(AddedItems.WayToDawnChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OneWingedAngel){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OneWingedAngelChain), new ItemStack(AddedItems.OneWingedAngel));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OneWingedAngelChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OneWingedAngel), new ItemStack(AddedItems.OneWingedAngelChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiamondDust){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DiamondDustChain), new ItemStack(AddedItems.DiamondDust));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiamondDustChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DiamondDust), new ItemStack(AddedItems.DiamondDustChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LionHeart){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LionHeartChain), new ItemStack(AddedItems.LionHeart));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LionHeartChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LionHeart), new ItemStack(AddedItems.LionHeartChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MetalChocobo){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MetalChocoboChain), new ItemStack(AddedItems.MetalChocobo));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MetalChocoboChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.MetalChocobo), new ItemStack(AddedItems.MetalChocoboChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SpellBinder){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SpellBinderChain), new ItemStack(AddedItems.SpellBinder));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SpellBinderChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SpellBinder), new ItemStack(AddedItems.SpellBinderChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DivineRose){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DivineRoseChain), new ItemStack(AddedItems.DivineRose));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DivineRoseChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.DivineRose), new ItemStack(AddedItems.DivineRoseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyHarp){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FairyHarpChain), new ItemStack(AddedItems.FairyHarp));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyHarpChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.FairyHarp), new ItemStack(AddedItems.FairyHarpChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrabClaw){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CrabClawChain), new ItemStack(AddedItems.CrabClaw));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrabClawChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.CrabClaw), new ItemStack(AddedItems.CrabClawChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingStar){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WishingStarChain), new ItemStack(AddedItems.WishingStar));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingStarChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WishingStar), new ItemStack(AddedItems.WishingStarChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PumpkinHead){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PumpkinHeadChain), new ItemStack(AddedItems.PumpkinHead));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PumpkinHeadChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PumpkinHead), new ItemStack(AddedItems.PumpkinHeadChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ThreeWishes){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.ThreeWishesChain), new ItemStack(AddedItems.ThreeWishes));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ThreeWishesChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.ThreeWishes), new ItemStack(AddedItems.ThreeWishesChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.JungleKing){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.JungleKingChain), new ItemStack(AddedItems.JungleKing));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.JungleKingChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.JungleKing), new ItemStack(AddedItems.JungleKingChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Olympia){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OlympiaChain), new ItemStack(AddedItems.Olympia));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OlympiaChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Olympia), new ItemStack(AddedItems.OlympiaChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LadyLuck){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LadyLuckChain), new ItemStack(AddedItems.LadyLuck));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LadyLuckChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.LadyLuck), new ItemStack(AddedItems.LadyLuckChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PeoplesHearts){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PeoplesHeartsChain), new ItemStack(AddedItems.PeoplesHearts));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PeoplesHeartsChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.PeoplesHearts), new ItemStack(AddedItems.PeoplesHeartsChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UltimaWeaopon){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.UltimaWeaponChain), new ItemStack(AddedItems.UltimaWeaopon));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UltimaWeaponChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.UltimaWeaopon), new ItemStack(AddedItems.UltimaWeaponChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TreasureTrove){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TreasureTroveChain), new ItemStack(AddedItems.TreasureTrove));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TreasureTroveChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.TreasureTrove), new ItemStack(AddedItems.TreasureTroveChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarSeeker){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.StarseekerChain), new ItemStack(AddedItems.StarSeeker));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarseekerChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.StarSeeker), new ItemStack(AddedItems.StarseekerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SoulEater){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SoulEaterChain), new ItemStack(AddedItems.SoulEater));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SoulEaterChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.SoulEater), new ItemStack(AddedItems.SoulEaterChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarLight){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.StarlightChain), new ItemStack(AddedItems.StarLight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarlightChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.StarLight), new ItemStack(AddedItems.StarlightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Rainfell){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.RainfellChain), new ItemStack(AddedItems.Rainfell));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RainfellChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Rainfell), new ItemStack(AddedItems.RainfellChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EarthShaker){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.EarthShakerChain), new ItemStack(AddedItems.EarthShaker));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EarthShakerChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.EarthShaker), new ItemStack(AddedItems.EarthShakerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WaywardWind){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WaywardWindChain), new ItemStack(AddedItems.WaywardWind));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WaywardWindChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.WaywardWind), new ItemStack(AddedItems.WaywardWindChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKey){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KingdomKeyChain), new ItemStack(AddedItems.KingdomKey));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKeyChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KingdomKey), new ItemStack(AddedItems.KingdomKeyChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Oathkeeper){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OathkeeperChain), new ItemStack(AddedItems.Oathkeeper));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OathkeeperChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Oathkeeper), new ItemStack(AddedItems.OathkeeperChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKeyD){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KingdomKeyDChain), new ItemStack(AddedItems.KingdomKeyD));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKeyDChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.KingdomKeyD), new ItemStack(AddedItems.KingdomKeyDChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Oblivion){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.OblivionChain), new ItemStack(AddedItems.Oblivion));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OblivionChain){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Oblivion), new ItemStack(AddedItems.OblivionChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
				}
			}
		}
		
	}

}





