package wehavecookies56.kk.core.event;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.AddedItems;

public class PureHeartDrops {
	
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
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 1, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 2){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 1, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 3){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 1, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 4){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 2, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 5){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 2, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 6){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 2, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 7){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 3, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 8){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 3, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 9){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 3, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 10){
			if(ev.entityLiving instanceof EntityVillager){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.PureHeart, 4, 0), 0.8F);
			}
		}
	}
}