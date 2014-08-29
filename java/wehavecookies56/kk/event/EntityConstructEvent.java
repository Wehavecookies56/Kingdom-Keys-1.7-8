package wehavecookies56.kk.event;

import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EntityConstructEvent {
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{

		if (event.entity instanceof EntityPlayer && EntityPropertyMunny.get((EntityPlayer) event.entity) == null)
			EntityPropertyMunny.register((EntityPlayer) event.entity);

		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(EntityPropertyMunny.EXT_PROP_NAME) == null)
			event.entity.registerExtendedProperties(EntityPropertyMunny.EXT_PROP_NAME, new EntityPropertyMunny((EntityPlayer) event.entity));
	}
}
