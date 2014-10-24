package wehavecookies56.kk.magic;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.client.KeyBind;

public class Fire extends MagicAttack{
	
	public Fire(String name, int magiccost, Item unlockItem) 
	{
		super(name, magiccost, unlockItem);
	}
	
	public static void doFireball(EntityPlayer par1EntityPlayer, World par2World){	
		//Magic execution
		System.out.println(currMagic);
		if(MagicAttack.currMagic >= fireCost)
		{
			EntitySmallFireball entitysmallfireball = new EntitySmallFireball(par2World);
	        par2World.spawnEntityInWorld(new EntitySmallFireball(par2World));
	        KeyBind.shootFire = false;
			System.out.println("Boom");
			MagicAttack.currMagic = MagicAttack.currMagic - MagicAttack.fireCost;

		}
	}
}