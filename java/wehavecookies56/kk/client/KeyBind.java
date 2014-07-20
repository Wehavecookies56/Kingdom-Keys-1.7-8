package wehavecookies56.kk.client;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;

import org.lwjgl.input.Keyboard;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.packet.IPacket;
import wehavecookies56.kk.core.packet.SummonPacket;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KeyBind{

	private static final String[] desc = {"key.summon.desc"};

	public static final int SUMMON = 0;
	private static final int[] keyValues = {Keyboard.KEY_G};
	private final KeyBinding[] keys;
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
		
		if (Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().theWorld.isRemote){
			if (keys[SUMMON].isPressed()) {
				if(Minecraft.getMinecraft().thePlayer.getHeldItem() != null){
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Vulpeus){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K1c), new ItemStack(AddedItems.Vulpeus));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K1c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Vulpeus), new ItemStack(AddedItems.K1c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Ursus){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K2c), new ItemStack(AddedItems.Ursus));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K2c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Ursus), new ItemStack(AddedItems.K2c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Unicornis){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K3c), new ItemStack(AddedItems.Unicornis));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K3c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.Unicornis), new ItemStack(AddedItems.K3c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K4){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K4c), new ItemStack(AddedItems.K4));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K4c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K4), new ItemStack(AddedItems.K4c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K5){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K5c), new ItemStack(AddedItems.K5));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K5c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K5), new ItemStack(AddedItems.K5c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K6){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K6c), new ItemStack(AddedItems.K6));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K6c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K6), new ItemStack(AddedItems.K6c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K7){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K7c), new ItemStack(AddedItems.K7));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K7c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K7), new ItemStack(AddedItems.K7c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K8){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K8c), new ItemStack(AddedItems.K8));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K8c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K8), new ItemStack(AddedItems.K8c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K9){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K9c), new ItemStack(AddedItems.K9));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K9c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K9), new ItemStack(AddedItems.K9c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K10){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K10c), new ItemStack(AddedItems.K10));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K10){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K10), new ItemStack(AddedItems.K10c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K11){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K11c), new ItemStack(AddedItems.K11));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K11c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K11), new ItemStack(AddedItems.K11c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K12){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K12c), new ItemStack(AddedItems.K12));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K12c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K12), new ItemStack(AddedItems.K12c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K13){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K13c), new ItemStack(AddedItems.K13));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K13c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K13), new ItemStack(AddedItems.K13c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K14){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K14c), new ItemStack(AddedItems.K14));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K14c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K14), new ItemStack(AddedItems.K14c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K15){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K15c), new ItemStack(AddedItems.K15));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K15c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K15), new ItemStack(AddedItems.K15c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K16){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K16c), new ItemStack(AddedItems.K16));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K16c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K16), new ItemStack(AddedItems.K16c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K17){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K17c), new ItemStack(AddedItems.K17));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K17c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K17), new ItemStack(AddedItems.K17c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K18){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K18c), new ItemStack(AddedItems.K18));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K18c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K18), new ItemStack(AddedItems.K18c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K19){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K19c), new ItemStack(AddedItems.K19));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K19c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K19), new ItemStack(AddedItems.K19c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K20){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K20c), new ItemStack(AddedItems.K20));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K20){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K20), new ItemStack(AddedItems.K20c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K21){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K21c), new ItemStack(AddedItems.K21));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K21c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K21), new ItemStack(AddedItems.K21c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K22){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K22c), new ItemStack(AddedItems.K22));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K22c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K22), new ItemStack(AddedItems.K22c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K23){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K23c), new ItemStack(AddedItems.K23));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K23c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K23), new ItemStack(AddedItems.K23c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K24){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K24c), new ItemStack(AddedItems.K24));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K24c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K24), new ItemStack(AddedItems.K24c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K25){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K25c), new ItemStack(AddedItems.K25));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K25c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K25), new ItemStack(AddedItems.K25c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K26){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K26c), new ItemStack(AddedItems.K26));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K26c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K26), new ItemStack(AddedItems.K26c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K27){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K27c), new ItemStack(AddedItems.K27));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K27c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K27), new ItemStack(AddedItems.K27c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K28){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K28c), new ItemStack(AddedItems.K28));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K28c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K28), new ItemStack(AddedItems.K28c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K29){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K29c), new ItemStack(AddedItems.K29));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K29c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K29), new ItemStack(AddedItems.K29c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K30){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K30c), new ItemStack(AddedItems.K30));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K30){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K30), new ItemStack(AddedItems.K30c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K31){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K31c), new ItemStack(AddedItems.K31));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K31c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K31), new ItemStack(AddedItems.K31c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K32){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K32c), new ItemStack(AddedItems.K32));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K32c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K32), new ItemStack(AddedItems.K32c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K33){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K33c), new ItemStack(AddedItems.K33));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K33c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K33), new ItemStack(AddedItems.K33c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K34){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K34c), new ItemStack(AddedItems.K34));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K34c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K34), new ItemStack(AddedItems.K34c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K35){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K35c), new ItemStack(AddedItems.K35));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K35c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K35), new ItemStack(AddedItems.K35c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K36){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K36c), new ItemStack(AddedItems.K36));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K36c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K36), new ItemStack(AddedItems.K36c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K37){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K37c), new ItemStack(AddedItems.K37));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K37c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K37), new ItemStack(AddedItems.K37c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K38){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K38c), new ItemStack(AddedItems.K38));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K38c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K38), new ItemStack(AddedItems.K38c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K39){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K39c), new ItemStack(AddedItems.K39));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K39c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K39), new ItemStack(AddedItems.K39c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K40){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K40c), new ItemStack(AddedItems.K40));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K40){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K40), new ItemStack(AddedItems.K40c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K41){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K41c), new ItemStack(AddedItems.K41));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K41c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K41), new ItemStack(AddedItems.K41c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K42){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K42c), new ItemStack(AddedItems.K42));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K42c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K42), new ItemStack(AddedItems.K42c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K43){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K43c), new ItemStack(AddedItems.K43));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K43c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K43), new ItemStack(AddedItems.K43c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K44){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K44c), new ItemStack(AddedItems.K44));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K44c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K44), new ItemStack(AddedItems.K44c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K45){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K45c), new ItemStack(AddedItems.K45));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K45c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K45), new ItemStack(AddedItems.K45c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K46){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K46c), new ItemStack(AddedItems.K46));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K46c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K46), new ItemStack(AddedItems.K46c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K47){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K47c), new ItemStack(AddedItems.K47));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K47c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K47), new ItemStack(AddedItems.K47c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K48){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K48c), new ItemStack(AddedItems.K48));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K48c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K48), new ItemStack(AddedItems.K48c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K49){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K49c), new ItemStack(AddedItems.K49));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K49c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K49), new ItemStack(AddedItems.K49c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K50){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K50c), new ItemStack(AddedItems.K50));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K50){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K50), new ItemStack(AddedItems.K50c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K51){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K51c), new ItemStack(AddedItems.K51));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K51c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K51), new ItemStack(AddedItems.K51c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K52){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K52c), new ItemStack(AddedItems.K52));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K52c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K52), new ItemStack(AddedItems.K52c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K53){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K53c), new ItemStack(AddedItems.K53));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K53c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K53), new ItemStack(AddedItems.K53c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K54){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K54c), new ItemStack(AddedItems.K54));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K54c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K54), new ItemStack(AddedItems.K54c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K55){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K55c), new ItemStack(AddedItems.K55));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K55c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K55), new ItemStack(AddedItems.K55c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K56){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K56c), new ItemStack(AddedItems.K56));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K56c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K56), new ItemStack(AddedItems.K56c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K57){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K57c), new ItemStack(AddedItems.K57));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K57c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K57), new ItemStack(AddedItems.K57c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K58){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K58c), new ItemStack(AddedItems.K58));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K58c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K58), new ItemStack(AddedItems.K58c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K59){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K59c), new ItemStack(AddedItems.K59));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K59c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K59), new ItemStack(AddedItems.K59c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K60){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K60c), new ItemStack(AddedItems.K60));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K60){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K60), new ItemStack(AddedItems.K60c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K61){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K61c), new ItemStack(AddedItems.K61));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K61c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K61), new ItemStack(AddedItems.K61c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K62){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K62c), new ItemStack(AddedItems.K62));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K62c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K62), new ItemStack(AddedItems.K62c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K63){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K63c), new ItemStack(AddedItems.K63));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K63c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K63), new ItemStack(AddedItems.K63c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K64){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K64c), new ItemStack(AddedItems.K64));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K64c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K64), new ItemStack(AddedItems.K64c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K65){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K65c), new ItemStack(AddedItems.K65));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K65c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K65), new ItemStack(AddedItems.K65c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K66){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K66c), new ItemStack(AddedItems.K66));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K66c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K66), new ItemStack(AddedItems.K66c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K67){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K67c), new ItemStack(AddedItems.K67));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K67c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K67), new ItemStack(AddedItems.K67c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K68){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K68c), new ItemStack(AddedItems.K68));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K68c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K68), new ItemStack(AddedItems.K68c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K69){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K69c), new ItemStack(AddedItems.K69));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K69c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K69), new ItemStack(AddedItems.K69c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K70){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K70c), new ItemStack(AddedItems.K70));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K70){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K70), new ItemStack(AddedItems.K70c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K71){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K71c), new ItemStack(AddedItems.K71));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K71c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K71), new ItemStack(AddedItems.K71c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K72){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K72c), new ItemStack(AddedItems.K72));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K72c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K72), new ItemStack(AddedItems.K72c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K73){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K73c), new ItemStack(AddedItems.K73));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K73c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K73), new ItemStack(AddedItems.K73c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K74){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K74c), new ItemStack(AddedItems.K74));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K74c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K74), new ItemStack(AddedItems.K74c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K75){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K75c), new ItemStack(AddedItems.K75));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K75c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K75), new ItemStack(AddedItems.K75c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K76){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K76c), new ItemStack(AddedItems.K76));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K76c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K76), new ItemStack(AddedItems.K76c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K77){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K77c), new ItemStack(AddedItems.K77));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K77c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K77), new ItemStack(AddedItems.K77c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K78){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K78c), new ItemStack(AddedItems.K78));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K78c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K78), new ItemStack(AddedItems.K78c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K79){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K79c), new ItemStack(AddedItems.K79));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K79c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K79), new ItemStack(AddedItems.K79c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K80){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K80c), new ItemStack(AddedItems.K80));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K80){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K80), new ItemStack(AddedItems.K80c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K81){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K81c), new ItemStack(AddedItems.K81));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K81c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K81), new ItemStack(AddedItems.K81c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K82){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K82c), new ItemStack(AddedItems.K82));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K82c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K82), new ItemStack(AddedItems.K82c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K83){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K83c), new ItemStack(AddedItems.K83));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K83c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K83), new ItemStack(AddedItems.K83c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K84){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K84c), new ItemStack(AddedItems.K84));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K84c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K84), new ItemStack(AddedItems.K84c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K85){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K85c), new ItemStack(AddedItems.K85));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K85c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K85), new ItemStack(AddedItems.K85c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K86){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K86c), new ItemStack(AddedItems.K86));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K86c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K86), new ItemStack(AddedItems.K86c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K87){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K87c), new ItemStack(AddedItems.K87));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K87c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K87), new ItemStack(AddedItems.K87c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K88){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K88c), new ItemStack(AddedItems.K88));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K88c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K88), new ItemStack(AddedItems.K88c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K89){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K89c), new ItemStack(AddedItems.K89));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K89c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K89), new ItemStack(AddedItems.K89c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K90){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K90c), new ItemStack(AddedItems.K90));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K90c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K90), new ItemStack(AddedItems.K90c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K91){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K91c), new ItemStack(AddedItems.K91));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K91c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K91), new ItemStack(AddedItems.K91c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K92){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K92c), new ItemStack(AddedItems.K92));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K92c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K92), new ItemStack(AddedItems.K92c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K93){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K93c), new ItemStack(AddedItems.K93));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K93c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K93), new ItemStack(AddedItems.K93c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K94){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K94c), new ItemStack(AddedItems.K94));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K94c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K94), new ItemStack(AddedItems.K94c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K95){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K95c), new ItemStack(AddedItems.K95));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K95c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K95), new ItemStack(AddedItems.K95c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K96){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K96c), new ItemStack(AddedItems.K96));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K96c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K96), new ItemStack(AddedItems.K96c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K97){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K97c), new ItemStack(AddedItems.K97));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K97c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K97), new ItemStack(AddedItems.K97c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K98){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K98c), new ItemStack(AddedItems.K98));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K98c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K98), new ItemStack(AddedItems.K98c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K99){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K99c), new ItemStack(AddedItems.K99));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K99c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K99), new ItemStack(AddedItems.K99c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K100){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K100c), new ItemStack(AddedItems.K100));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K100c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K100), new ItemStack(AddedItems.K100c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K101){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K101c), new ItemStack(AddedItems.K101));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K101c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K101), new ItemStack(AddedItems.K101c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K102){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K102c), new ItemStack(AddedItems.K102));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K102c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K102), new ItemStack(AddedItems.K102c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K103){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K103c), new ItemStack(AddedItems.K103));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K103c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K103), new ItemStack(AddedItems.K103c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K104){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K104c), new ItemStack(AddedItems.K104));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K104c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K104), new ItemStack(AddedItems.K104c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K105){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K105c), new ItemStack(AddedItems.K105));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K105c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K105), new ItemStack(AddedItems.K105c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K106){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K106c), new ItemStack(AddedItems.K106));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K106c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K106), new ItemStack(AddedItems.K106c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K107){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K107c), new ItemStack(AddedItems.K107));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K107c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K107), new ItemStack(AddedItems.K107c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K108){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K108c), new ItemStack(AddedItems.K108));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K108c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K108), new ItemStack(AddedItems.K108c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K109){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K109c), new ItemStack(AddedItems.K109));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K109c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K109), new ItemStack(AddedItems.K109c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K110){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K110c), new ItemStack(AddedItems.K110));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K110){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K110), new ItemStack(AddedItems.K110c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K111){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K111c), new ItemStack(AddedItems.K111));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K111c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K111), new ItemStack(AddedItems.K111c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K112){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K112c), new ItemStack(AddedItems.K112));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K112c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K112), new ItemStack(AddedItems.K112c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K113){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K113c), new ItemStack(AddedItems.K113));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K113c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K113), new ItemStack(AddedItems.K113c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K114){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K114c), new ItemStack(AddedItems.K114));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.K114c){
						IPacket packet = new SummonPacket(new ItemStack(AddedItems.K114), new ItemStack(AddedItems.K114c));
						KingdomKeys.channelHandler.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
				}
			}
		}
		
	}

}





