package wehavecookies56.kk.core.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class EntityPropertyDriveForm implements IExtendedEntityProperties {

	//0 = None, 1 Valor, 2 Wisdom, 3 Limit, 4 Master, 5 Final, 6 Anti
	
	public final static String EXT_PROP_NAME = "DriveForm";
	private final EntityPlayer player;
	private int currentState;

	public EntityPropertyDriveForm(EntityPlayer player) {
		this.player = player;
		this.currentState = -1;
	}
	
	public int getCurrentState(){
		return this.currentState;
	}
	
	public void changeState(int state){
		this.currentState = state;
	}
	
	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(EntityPropertyDriveForm.EXT_PROP_NAME, new EntityPropertyDriveForm(player));
	}
	
	public static final EntityPropertyDriveForm get(EntityPlayer player) {
		return (EntityPropertyDriveForm) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		properties.setInteger("CurrentState", this.currentState);
		compound.setTag(EXT_PROP_NAME, properties);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		
		this.currentState = properties.getInteger("CurrentState");
		
	}

	@Override
	public void init(Entity entity, World world) {}
}