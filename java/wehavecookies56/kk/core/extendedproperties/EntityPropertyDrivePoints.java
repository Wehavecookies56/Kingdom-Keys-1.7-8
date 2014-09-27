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
	public int maxDrivePoints;

	public EntityPropertyDrivePoints(EntityPlayer player) {
		this.player = player;

		this.currDrivePoints = 0;
		this.maxDrivePoints = 900;
	}

	public static final void register(EntityPlayer player){
		player.registerExtendedProperties(EntityPropertyDrivePoints.EXT_PROP_NAME, new EntityPropertyDrivePoints(player));
	}

	public static final EntityPropertyDrivePoints get(EntityPlayer player){
		return (EntityPropertyDrivePoints) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("CurrentDrivePoints", this.currDrivePoints);
		properties.setInteger("MaxDrivePoints", this.maxDrivePoints);

		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

		this.currDrivePoints = properties.getInteger("CurrentDrivePoints");
		this.maxDrivePoints = properties.getInteger("MaxDrivePoints");

		System.out.println("Drive Points from NBT: " + this.currDrivePoints + "/" + this.maxDrivePoints);
	}

	@Override
	public void init(Entity entity, World world) {

	}
	
	public int getCurrDrivePoints(){
		return currDrivePoints;
		
	}
	
	public int getMaxDrivePoints(){
		return maxDrivePoints;
		
	}

	public boolean consumeMana(int amount){
		boolean sufficient = amount <= this.currDrivePoints;

		this.currDrivePoints -= (amount < this.currDrivePoints ? amount : this.currDrivePoints);
		
		return sufficient;
	}

}
