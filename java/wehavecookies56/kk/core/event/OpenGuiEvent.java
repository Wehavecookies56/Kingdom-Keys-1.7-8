package wehavecookies56.kk.core.event;

import com.jcraft.jorbis.Block;

import net.minecraft.block.BlockChest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class OpenGuiEvent {

	@SubscribeEvent
	public void onGuiOpen(GuiOpenEvent event){
		//if(event.gui instanceof GuiChest){
		//	Minecraft.getMinecraft().thePlayer.playSound("kk:kupo", 1.0F, 1.0F);
		//}
		//if(event.equals(new GuiChest(null, null))){
			//Minecraft.getMinecraft().thePlayer.playSound("kk:kupo", 1.0F, 1.0F);
		//}
	}
}
