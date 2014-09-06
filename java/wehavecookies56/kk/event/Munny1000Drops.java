package wehavecookies56.kk.event;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Munny1000Drops {
	public static double rand; 
	
	/*
	 * Fired when an EntityLiving is about to drop its drops
	 */
	
	@SubscribeEvent
	public void onBossEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntityDragon) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 1.00d && ConfigBooleans.munnyDrops){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Munny1000, 1);
				}
			}
		}
	}
}
