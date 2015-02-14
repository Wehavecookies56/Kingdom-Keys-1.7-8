package wehavecookies56.kk.core.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;

public class OnJoinWorld
{
	/*
	public OnJoinWorld(Entity entity, World world) {
		super(entity, world);
		if(entity instanceof EntityPlayer)
		{
			LivingUpdateEevent.onDrive = true;
			KeyBind.active = -1;
		}
		// TODO Auto-generated constructor stub
	}*/

	@SubscribeEvent
	public void OnEntityJoinWorld(EntityJoinWorldEvent event) 
	{
		if(event.entity instanceof EntityPlayer)
		{
			EntityPropertyDriveForm df = EntityPropertyDriveForm.get((EntityPlayer) event.entity);
			LivingUpdateEevent.onDrive = true;
			//KeyBind.active = -1;
			df.changeState(-1);
			
		}
	}
}
