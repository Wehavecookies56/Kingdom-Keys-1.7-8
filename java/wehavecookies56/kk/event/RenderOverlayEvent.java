package wehavecookies56.kk.event;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Type;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class RenderOverlayEvent{

	@SubscribeEvent
	public void onRenderOverlay(RenderGameOverlayEvent.Pre event){
		if(event.type.equals(RenderGameOverlayEvent.ElementType.HEALTH)){
			event.setCanceled(true);

		}	
	}
	
}
