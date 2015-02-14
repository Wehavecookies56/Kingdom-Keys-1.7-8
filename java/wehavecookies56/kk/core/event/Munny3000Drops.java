package wehavecookies56.kk.core.event;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;

public class Munny3000Drops {
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
					event.entityLiving.dropItem(AddedItems.Munny3000, 1);
				}
			}
			else if (event.entityLiving instanceof EntityWither) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 1.00d && ConfigBooleans.munnyDrops){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Munny3000, 1);
				}
			}
		}
	}
}

