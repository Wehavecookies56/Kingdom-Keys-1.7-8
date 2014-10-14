package wehavecookies56.kk.core.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class EntityPropertyDriveForm implements IExtendedEntityProperties {

	public static final String ACTIVE_NAME = "DriveActive";
	private final EntityPlayer player;
	private boolean isActive;
	
	public EntityPropertyDriveForm(EntityPlayer player) {
		this.player = player;
		this.isActive = false;
	}
	
	public static final void register(EntityPlayer player){
		player.registerExtendedProperties(EntityPropertyDriveForm.ACTIVE_NAME, new EntityPropertyDriveForm(player));
	}
	
	public static final EntityPropertyDriveForm get(EntityPlayer player){
		return (EntityPropertyDriveForm) player.getExtendedProperties(ACTIVE_NAME);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound){
		NBTTagCompound properties = new NBTTagCompound();
		
		properties.setBoolean("IsActive", this.isActive);

		compound.setTag(ACTIVE_NAME, properties);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound){
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(ACTIVE_NAME);
		this.isActive = properties.getBoolean(ACTIVE_NAME);
	}

	@Override
	public void init(Entity entity, World world) {
		
	}

}
