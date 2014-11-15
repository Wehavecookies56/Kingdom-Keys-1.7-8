package wehavecookies56.kk.core.event;

import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.item.AddedItems;
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
		if(event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			if(player.getHealth() <= 4)
			{
				//Minecraft.getMinecraft().thePlayer.playSound("kk:alarm", 1F, 1F);
			}
			//TODO Drive forms
			EntityPropertyDriveForm df = EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer);
			if (player.isBurning() && df.getCurrentState()==5)
			{
				KeyBind.canRevert = false;
			}
			else
			{
				KeyBind.canRevert = true;
			}
		}
	}
}
