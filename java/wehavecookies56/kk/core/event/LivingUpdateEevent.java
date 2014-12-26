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
	
	public static boolean onDrive;
	
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
			EntityPropertyDriveForm df = EntityPropertyDriveForm.get(player);
			if (player.isBurning() && df.getCurrentState()==5)
			{
				onDrive = false;
			}
			else
			{
				onDrive = true;
			}
			
			if(df.getCurrentState() == 0)
			{
				if(player.onGround)
				{
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}				
				player.motionY *= 1.2D;
			}
			
			else if(df.getCurrentState() == 1)
			{
				if(player.onGround){
					player.motionX *= 1.6D;
					player.motionZ *= 1.6D;
				}
			}
			
			else if(df.getCurrentState() == 3)
			{
				if(player.onGround && !player.isWet()){
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}
				else
				{
					player.motionY *= 1.18D;
				}
				boolean jumped = false;
				if(player.isAirBorne && jumped == false && Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed())
				{
					jumped = true;
					player.jump();
				}
				else
				{
					jumped = false;
				}
			}
			
			else if(df.getCurrentState() == 4)
			{
				
			}
		}
	}
}
