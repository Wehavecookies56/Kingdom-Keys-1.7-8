package wehavecookies56.kk.core.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyExtraHealth;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;

public class EntityConstructEvent {
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event){
		if (event.entity instanceof EntityPlayer && EntityPropertyMunny.get((EntityPlayer) event.entity) == null)
		EntityPropertyMunny.register((EntityPlayer)event.entity);
		
		if (event.entity instanceof EntityPlayer && EntityPropertyDrivePoints.get((EntityPlayer) event.entity) == null)
		EntityPropertyDrivePoints.register((EntityPlayer)event.entity);
		
		if (event.entity instanceof EntityPlayer && EntityPropertyExtraHealth.get((EntityPlayer) event.entity) == null)
		EntityPropertyExtraHealth.register((EntityPlayer)event.entity);
		
		if (event.entity instanceof EntityPlayer && EntityPropertyDriveForm.get((EntityPlayer) event.entity) == null)
			EntityPropertyDriveForm.register((EntityPlayer)event.entity);
	}
}
