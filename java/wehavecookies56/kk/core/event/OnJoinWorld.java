package wehavecookies56.kk.core.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

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
