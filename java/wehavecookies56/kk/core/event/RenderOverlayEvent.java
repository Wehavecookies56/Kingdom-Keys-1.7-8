package wehavecookies56.kk.core.event;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderOverlayEvent{

	@SubscribeEvent
	public void onRenderOverlay(RenderGameOverlayEvent.Pre event){
		if(event.type.equals(RenderGameOverlayEvent.ElementType.HEALTH)){
			event.setCanceled(true);

		}	
	}
	
}
