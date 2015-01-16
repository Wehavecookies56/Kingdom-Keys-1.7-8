package wehavecookies56.kk.core.event;

import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.item.AddedItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class LivingUpdateEevent {
	double vJump = 1.2D;
	double wSprint = 1.5D;
	double lDodge;
	int mDoubleJumps = 2; //Limit of doubleJumps
	double fGlide = 0.6D;
	double fSpeed = 1.5D;
	
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
			
			//Level multiplier
		/*	switch(valorLevel){
			
			case 1:
				sd
				break;
			
			case 2:
				break;
				
			case3:
				break;
			}
			
			*/
			
			//Valor
			if(df.getCurrentState() == 0)
			{
				if(player.onGround && !player.isInWater())
				{
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}	
				
				if(player.motionY > 0)
				{
					player.motionY *= 1.2D;
				}
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(),2,2));

			}
			
			//Wisdom
			else if(df.getCurrentState() == 1)
			{
				if(player.onGround && !player.isInWater()){
					player.motionX *= wSprint;
					player.motionZ *= wSprint;
				}
				
			}
			
			//Limit
			else if(df.getCurrentState() == 2)
			{
				if(player.onGround && !player.isInWater()){
					player.motionX *= 1.0;
					player.motionZ *= 1.0;
				}
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(),2,1));
			}
			
			//Can't use Minecraft.getMinecraft() here
			
			
			//Master
			else if(df.getCurrentState() == 3)
			{
				if(player.onGround && !player.isInWater()){
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}
				else if(!player.onGround)
				{
					if(player.motionY > 0)
					{
						player.motionY *= 1.18D;
					}
				}
//W.I.P.
				/*				
				int jumps=0;
				if(!player.onGround)
				{				
					System.out.println("On air");
					if(Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed())							
					{
						System.out.println("Jumps: "+jumps);
						if(jumps<mDoubleJumps)
						{
							jumps++;
							player.jump();
						}
					}
				}
				*/
			}
			//Final
			else if(df.getCurrentState() == 4)
			{				
				if(player.motionY > 0)
				{
					player.motionY *= 1.17D;
				}
				
				if(player.onGround && !player.isInWater()){
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				}
				
			/*	else
				{				
					if(player.motionY < 0 && ())		
					{
						player.motionY *= fGlide;
					}
				}*/
			}
			
			//Antiform?
			else if(df.getCurrentState() == 5)
			{
				if(player.motionY > 0)
				{
					player.motionY *= 1.05D;
				}
				
				if(player.onGround && !player.isInWater()){
					player.motionX *= 1.6D;
					player.motionZ *= 1.6D;
				}	
			}
			
			//Normal
			else
			{
				 
			}
		}
	}
}
