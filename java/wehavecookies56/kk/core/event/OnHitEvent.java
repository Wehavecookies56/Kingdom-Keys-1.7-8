package wehavecookies56.kk.core.event;

import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Arrays;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class OnHitEvent
{
	public static int currDrive;
	@SubscribeEvent
	public void LivingAttackEvent (LivingEvent EntityEvent)
	{
		//System.out.println("Event Triggered");
		if(EntityEvent.entityLiving instanceof EntityPlayer)
		{
			//System.out.println("It's a player");
			EntityPlayer player = (EntityPlayer) EntityEvent.entityLiving;
			for(int i = 0; i < 113; i++)
			{
				/*if(player.getHeldItem() != null && player.getHeldItem().getItem() == Arrays.keyblades[i])
				{
					System.out.println(Arrays.keyblades.length);

					System.out.println("Holding keyblade");
					currDrive +=1;
					player.addChatMessage(new ChatComponentText("You have "+currDrive+" Drive points"));

				}*/
			}
		}
	}
}
