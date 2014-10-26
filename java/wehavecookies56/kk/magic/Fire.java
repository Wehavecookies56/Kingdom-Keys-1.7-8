package wehavecookies56.kk.magic;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Vec3;
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
		//MagicAttack.currMagic = 100;
		if(MagicAttack.currMagic >= fireCost && KeyBind.submenu == 1)
		{
			Vec3 look = player.getLookVec();
			EntitySmallFireball fireball = new EntitySmallFireball(MinecraftServer.getServer().getEntityWorld(), player, 0, 0, 0);
			fireball.setPosition(player.posX + look.xCoord * 2, player.posY + look.yCoord, player.posZ + look.zCoord * 2);
			fireball.accelerationX = look.xCoord * 0.1;
			fireball.accelerationY = look.yCoord * 0.1;
			fireball.accelerationZ = look.zCoord * 0.1;
			MinecraftServer.getServer().getEntityWorld().spawnEntityInWorld(fireball);
			MagicAttack.currMagic = MagicAttack.currMagic - MagicAttack.fireCost;			
		}
	}
}