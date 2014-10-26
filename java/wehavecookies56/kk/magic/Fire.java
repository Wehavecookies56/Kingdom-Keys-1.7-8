package wehavecookies56.kk.magic;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import wehavecookies56.kk.client.KeyBind;

public class Fire extends MagicAttack{
	
	public Fire(String name, int magiccost, Item unlockItem) 
	{
		super(name, magiccost, unlockItem);
	}
	
	public static void shoot(EntityPlayer par1EntityPlayer, World par2World){
		EntityPlayer player = (EntityPlayer) par1EntityPlayer;
		//Magic execution
		System.out.println(currMagic);
		MagicAttack.currMagic = 100;
		if(MagicAttack.currMagic >= fireCost && KeyBind.submenu == 1)
		{
			EntitySmallFireball entitysmallfireball = new EntitySmallFireball(par2World, player.posX, player.posY, player.posZ, player.getLookVec().xCoord, player.getLookVec().yCoord, player.getLookVec().zCoord);
	        par2World.spawnEntityInWorld(entitysmallfireball);
			//EntityLargeFireball entitylargefireball = new EntityLargeFireball(par2World, player, d5, d6, d7);
	       // KeyBind.shootFire = false;
			MagicAttack.currMagic = MagicAttack.currMagic - MagicAttack.fireCost;			
		}
	}
}