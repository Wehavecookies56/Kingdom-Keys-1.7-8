package wehavecookies56.kk.magic;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import wehavecookies56.kk.client.KeyBind;

public class Thunder extends MagicAttack{

	public Thunder(String name, int magiccost, Item unlockItem) 
	{
		super(name, magiccost, unlockItem);
	}
	
	public static EntityPlayer ray(EntityPlayer par1EntityPlayer, World par2World){
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
