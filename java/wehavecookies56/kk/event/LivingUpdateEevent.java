package wehavecookies56.kk.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class LivingUpdateEevent {
	
	/*
	 * Fired when an EntityLiving is about to update
	 */
	
	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event){
		if(event.entity instanceof EntityPlayer){
			//TODO Drive forms
		}
	}
}
