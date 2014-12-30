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
}