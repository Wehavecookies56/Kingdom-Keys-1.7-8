package wehavecookies56.kk.core.event;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class RecipeDrop {

	public static double rand; 

	@SubscribeEvent
	public void onDeath(LivingDeathEvent ev) 
	{ 
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
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) > 0)
		{
			rand = Math.random();
			if(ev.entityLiving instanceof EntityCaveSpider || (ev.entityLiving instanceof EntitySpider) || 
			ev.entityLiving instanceof EntityIronGolem || ev.entityLiving instanceof EntitySkeleton ||
			ev.entityLiving instanceof EntityBlaze || ev.entityLiving instanceof EntityMagmaCube ||
			ev.entityLiving instanceof EntitySlime || ev.entityLiving instanceof EntityZombie ||
			ev.entityLiving instanceof EntityCreeper || ev.entityLiving instanceof EntityEnderman ||
			ev.entityLiving instanceof EntityGhast || ev.entityLiving instanceof EntityPigZombie ||
			ev.entityLiving instanceof EntityWitch || ev.entityLiving instanceof EntitySilverfish)
			{
				if (rand > 0.00d && rand < 0.01d)
				{
					ev.entityLiving.entityDropItem(new ItemStack(AddedItems.MythrilCrystalRecipe, 1, 0), 0.01F);
				}
				
				if (rand > 0.50d && rand < 0.51d)
				{
					ev.entityLiving.entityDropItem(new ItemStack(AddedItems.MythrilGemRecipe, 1, 0), 0.01F);
				}
				
				if (rand > 0.100d && rand < 0.101d)
				{
					ev.entityLiving.entityDropItem(new ItemStack(AddedItems.MythrilStoneRecipe, 1, 0), 0.01F);
				}
				
				if (rand > 0.150d && rand < 0.151d)
				{
					ev.entityLiving.entityDropItem(new ItemStack(AddedItems.MythrilShardRecipe, 1, 0), 0.01F);
				}
				
				if (rand > 0.200d && rand < 0.201d){
					ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkMatterRecipe, 1, 0), 0.01F);
				}
			}
					
		}
	}
}
