package wehavecookies56.kk.core.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.packet.SyncPlayerPropsPacket;
import wehavecookies56.kk.core.proxies.CommonProxy;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

public class EntityPropertyMunny implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "PlayerMunnyKK";
	private final EntityPlayer player;
	
	private int currentMunny, maxMunny;
	
	public static final int MUNNY_WATCHER = 20;
	
	public EntityPropertyMunny(EntityPlayer player) {
		this.player = player;
		
		this.currentMunny = 1;
		this.maxMunny = 1000000;
		this.player.getDataWatcher().addObject(MUNNY_WATCHER, 0);
	}
	
	public static final void register(EntityPlayer player)
	{
	player.registerExtendedProperties(EntityPropertyMunny.EXT_PROP_NAME, new EntityPropertyMunny(player));
	}
	
	public static final EntityPropertyMunny get(EntityPlayer player)
	{
	return (EntityPropertyMunny) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		
		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("CurrentMunny", this.player.getDataWatcher().getWatchableObjectInt(MUNNY_WATCHER));
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

		this.player.getDataWatcher().updateObject(MUNNY_WATCHER, properties.getInteger("CurrentMunny"));
		
	}
	
	@Override
	public void init(Entity entity, World world) {
			
	}
	
	public boolean consumeMunny(int amount){
		int munny = this.player.getDataWatcher().getWatchableObjectInt(MUNNY_WATCHER);
		
		boolean sufficient = amount <= munny;

		munny -= (amount < munny ? amount : munny);
		
		this.player.getDataWatcher().updateObject(MUNNY_WATCHER, munny);
		
		return sufficient;

	}

	public int getMunny(){
		return this.player.getDataWatcher().getWatchableObjectInt(MUNNY_WATCHER);
	}
	
	public void addMunny(int amount){
		setCurrentMunny(amount += getMunny());
	}
	
	public void setCurrentMunny(int amount)
	{
	this.player.getDataWatcher().updateObject(MUNNY_WATCHER, (amount < this.maxMunny ? amount : this.maxMunny));
	}

	
	public static final void saveProxyData(EntityPlayer player) {
		NBTTagCompound savedData = new NBTTagCompound();
		EntityPropertyMunny.get(player).saveNBTData(savedData);
		CommonProxy.storeEntityData(getSaveKey(player), savedData);
	}

	public static final void loadProxyData(EntityPlayer player) {
		EntityPropertyMunny playerData = EntityPropertyMunny.get(player);
		NBTTagCompound savedData = CommonProxy.getEntityData(getSaveKey(player));
		if (savedData != null) { playerData.loadNBTData(savedData); }
		IMessage packet = new SyncPlayerPropsPacket(player);
		KingdomKeys.network.sendToServer(packet);
	}
	
	private static final String getSaveKey(EntityPlayer player) {
		return player.getCommandSenderName() + ":" + EXT_PROP_NAME;
	}
}
