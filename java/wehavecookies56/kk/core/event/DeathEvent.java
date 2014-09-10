package wehavecookies56.kk.core.event;

import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.core.proxies.CommonProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DeathEvent {

	@SubscribeEvent
	public void onLivingDeath(LivingDeathEvent event){
		EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer) event.entity);
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer)
		{
			props.saveProxyData((EntityPlayer) event.entity);
		}
	}

	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event){
		EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer) event.entity);
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer){
			props.loadProxyData((EntityPlayer) event.entity);
		}
	}
}
