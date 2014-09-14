package wehavecookies56.kk.core.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.item.AddedItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class HurtEvent
{
	@SubscribeEvent
	public void onHurt(LivingHurtEvent event)
	{
		if(event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			if(player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FrozenPride)
			{
				if(player.isBlocking())
				{	
					event.ammount = 0;
				}
			}
		}
	}	
}
