package wehavecookies56.kk.core.event;

import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.item.AddedItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
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
				if(player.onGround && !player.isInWater())
				{
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}				
				player.motionY *= 1.2D;
			}
			
			else if(df.getCurrentState() == 1)
			{
				if(player.onGround && !player.isInWater()){
					player.motionX *= 1.6D;
					player.motionZ *= 1.6D;
				}
			}
			
			else if(df.getCurrentState() == 3)
			{
				if(player.onGround && !player.isInWater()){
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}
				else
				{
					player.motionY *= 1.18D;
				}
//W.I.P.
				int jumps=0;
				if(!player.onGround)
				{				
					System.out.println("On air");
					if(Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed())							
					{
						System.out.println("Jumps: "+jumps);
						if(jumps<2)
						{
							player.addChatMessage(new ChatComponentText("Hola"));
							jumps++;
							player.jump();
						}
					}
				}
			}
			
			else if(df.getCurrentState() == 4)
			{
				player.motionY *= 1.15D;
				if(player.onGround && !player.isInWater()){
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}
				else
				{
					//If there isnt a way to detect if player is falling then use this method xD
				
					if(Minecraft.getMinecraft().gameSettings.keyBindJump.getIsKeyPressed() && Minecraft.getMinecraft().gameSettings.keyBindSprint.getIsKeyPressed())		
					{
						player.motionY *= 0.6D;
					}
				}
			}
			
			else if(df.getCurrentState() == 5)
			{
				
			}
		}
	}
}
