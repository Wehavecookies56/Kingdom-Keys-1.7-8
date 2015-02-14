package wehavecookies56.kk.core.event;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;

public class Munny50Drops {
	public static double rand; 
	
	/*
	 * Fired when an EntityLiving is about to drop its drops
	 */
	
	@SubscribeEvent
	public void onHostileEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntitySkeleton || event.entityLiving instanceof EntityCreeper || event.entityLiving instanceof EntitySpider || event.entityLiving instanceof EntityCaveSpider || event.entityLiving instanceof EntityEnderman || event.entityLiving instanceof EntityZombie || event.entityLiving instanceof EntityPigZombie || event.entityLiving instanceof EntityIronGolem || event.entityLiving instanceof EntityBlaze || event.entityLiving instanceof EntitySlime || event.entityLiving instanceof EntityMagmaCube || event.entityLiving instanceof EntityWitch || event.entityLiving instanceof EntitySilverfish || event.entityLiving instanceof EntityGhast) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 0.10d && ConfigBooleans.munnyDrops){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Munny50, 1);
				}
			}
		}
	}
	@SubscribeEvent
	public void onBossEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntityDragon) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 0.60d && ConfigBooleans.munnyDrops){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Munny50, 10);
				}
			}
		}
	}
}

