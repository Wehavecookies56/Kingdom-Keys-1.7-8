package wehavecookies56.kk.core.event;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class LivingUpdateEevent {
	
	/*
	 * Fired when an EntityLiving is about to update
	 */
	
	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event)
	{
		if(event.entity instanceof EntityPlayer){
			if(Minecraft.getMinecraft().thePlayer.getHealth() <= 4)
			{
				//Minecraft.getMinecraft().thePlayer.playSound("kk:alarm", 1F, 1F);
			}
			//TODO Drive forms
		}
	}
}
