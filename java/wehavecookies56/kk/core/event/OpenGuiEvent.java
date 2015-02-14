package wehavecookies56.kk.core.event;

import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
