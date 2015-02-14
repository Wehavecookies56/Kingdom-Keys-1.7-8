package wehavecookies56.kk.core.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class EntityPropertyDrivePoints implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "PlayerDrivePointsKK";
	private final EntityPlayer player;

	public int currDrivePoints;
	public static int currBar;

	public static final int DRIVE_WATCHER = 21;

	public EntityPropertyDrivePoints(EntityPlayer player) {
		this.player = player;

		this.currDrivePoints = 0;
		this.currBar = 0;
		this.player.getDataWatcher().addObject(DRIVE_WATCHER, 0);
	}


	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(EntityPropertyDrivePoints.EXT_PROP_NAME, new EntityPropertyDrivePoints(player));
	}

	public static final EntityPropertyDrivePoints get(EntityPlayer player)
	{
		return (EntityPropertyDrivePoints) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {

		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("CurrentDrivePoints", this.player.getDataWatcher().getWatchableObjectInt(DRIVE_WATCHER));
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {

		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, properties.getInteger("CurrentDrivePoints"));

	}

	@Override
	public void init(Entity entity, World world) {

	}

	public boolean consumeDrivePoints(int amount){
		int drivePoints = this.player.getDataWatcher().getWatchableObjectInt(DRIVE_WATCHER);

		boolean sufficient = amount <= drivePoints;

		drivePoints -= (amount < drivePoints ? amount : drivePoints);

		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, drivePoints);

		return sufficient;

	}

	public int getCurrDrivePoints(){
		return this.player.getDataWatcher().getWatchableObjectInt(DRIVE_WATCHER);
	}

	public void addDrivePoints(int amount){
		setCurrDrivePoints(amount += getCurrDrivePoints());
	}
	
	public void removeDrivePoints(int amount){
		setCurrDrivePoints(amount -= getCurrDrivePoints());
		if(getCurrDrivePoints() < 0){setCurrDrivePoints(0);}
	}

	public void setCurrDrivePoints(double amount)
	{
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, amount);
	}
	
	public void setCurrDrivePoints(int amount)
	{
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, amount);
	}

	private static final String getSaveKey(EntityPlayer player) {
		return player.getCommandSenderEntity() + ":" + EXT_PROP_NAME;
	}

}
