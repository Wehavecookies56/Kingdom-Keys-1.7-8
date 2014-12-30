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
}
