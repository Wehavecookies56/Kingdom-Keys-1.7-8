package wehavecookies56.kk.core.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.item.AddedItems;

public class HurtEvent
{
	@SubscribeEvent
	public void onHurt(LivingHurtEvent event)
	{
		if(event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			if(player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FrozenPride)
			{
				if(player.isBlocking())
				{	
					event.ammount = 0;
				}
			}
		}
	}	
}
