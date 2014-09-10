package wehavecookies56.kk.core.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EntityConstructEvent {
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event){
		if (event.entity instanceof EntityPlayer && EntityPropertyMunny.get((EntityPlayer) event.entity) == null)
		EntityPropertyMunny.register((EntityPlayer)event.entity);
		
	}
}
