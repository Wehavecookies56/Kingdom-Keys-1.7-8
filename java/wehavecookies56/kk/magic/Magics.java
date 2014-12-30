package wehavecookies56.kk.magic;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import wehavecookies56.kk.client.KeyBind;

public class Magics extends MagicAttack{

	public Magics(String name, int magiccost, Item unlockItem) {
		super(name, magiccost, unlockItem);
		// TODO Auto-generated constructor stub
	}

	public static void Fire(EntityPlayer par1EntityPlayer, World par2World){
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
	
	public static EntityPlayer Thunder(EntityPlayer par1EntityPlayer, World par2World){
		EntityPlayer player = (EntityPlayer) par1EntityPlayer;
		//Magic execution
		
		if(MagicAttack.currMagic >= thunderCost && KeyBind.submenu == 1)
		{
			EntityLightningBolt entitylightningbolt = new EntityLightningBolt(MinecraftServer.getServer().getEntityWorld(),0,0,0);
			//entitylightningbolt.setPosition(player.getLookVec().xCoord, player.getLookVec().yCoord, player.getLookVec().zCoord);
			//entitylightningbolt.setPosition(player.posX, player.posY-1, player.posZ);
			par2World.spawnEntityInWorld(entitylightningbolt);
	        player.addChatMessage(new ChatComponentText("Light!"));
			MagicAttack.currMagic = MagicAttack.currMagic - MagicAttack.thunderCost;
		}
		return player;
	}
}
