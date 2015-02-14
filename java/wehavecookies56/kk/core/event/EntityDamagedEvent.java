package wehavecookies56.kk.core.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityDamagedEvent {

	/*
	 * Fired when an EntityLiving is about to be damaged by any damage source
	 */
	
	@SubscribeEvent
	public void playerDamaged(LivingHurtEvent event){
		if(event.entityLiving instanceof EntityPlayer){
			//TODO Health override for health bar
		}
	}
}
