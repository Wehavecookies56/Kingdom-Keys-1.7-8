package wehavecookies56.kk.magic;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import wehavecookies56.kk.client.KeyBind;

public class Cure extends MagicAttack{
	
	public Cure(String name, int magiccost, Item unlockItem) 
	{
		super(name, magiccost, unlockItem);
	}
	
	public static void cure(EntityPlayer par1EntityPlayer){
		EntityPlayer player = (EntityPlayer) par1EntityPlayer;
		//Magic execution
		System.out.println(currMagic);
		MagicAttack.currMagic = 100;
		if(MagicAttack.currMagic >= cureCost && KeyBind.submenu == 1)
		{
			System.out.println("Cure");
			player.heal(20);
			MagicAttack.currMagic = MagicAttack.currMagic - MagicAttack.cureCost;
		}
	}
}