package wehavecookies56.kk.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.AddedItems;

public class HeartDrops {
	
	/*
	 * Fired when an EntityLiving is about to be marked as "dead"
	 */
	
	@SubscribeEvent
	public void onDeath(LivingDeathEvent ev) { 
		if (!(ev.source instanceof EntityDamageSource)){
			return;
		}
		EntityDamageSource eds = (EntityDamageSource)ev.source;

		Entity ent = eds.getEntity();
		if (!(ent instanceof EntityPlayer)) {
			return;
		}

		EntityPlayer epl = (EntityPlayer)ent;

		ItemStack wpn = epl.getHeldItem();
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 0)
		{
			return;
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 1){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 2){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 3){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 1, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 4){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 5){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 6){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 2, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 7){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 8){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 9){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 3, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 10){
			if(ev.entityLiving instanceof EntityBat){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityChicken){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCow){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityHorse){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityOcelot){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPig){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySheep){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySnowman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySquid){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWolf){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart, 4, 0), 0.5F);
		}
	}
}
}