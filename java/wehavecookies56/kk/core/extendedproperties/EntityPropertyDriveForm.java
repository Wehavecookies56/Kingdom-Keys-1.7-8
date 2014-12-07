package wehavecookies56.kk.core.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class EntityPropertyDriveForm implements IExtendedEntityProperties {

	//-1 = None, 0 Valor, 1 Wisdom, 2 Limit, 3 Master, 4 Final, 5 Anti
	
	public final static String EXT_PROP_NAME = "DriveForm";
	public static final int DRIVE_WATCHER = 22;
	private final EntityPlayer player;
	private int currentState;
	public static boolean valorUnlocked;
	public static boolean wisdomUnlocked;
	public static boolean limitUnlocked;
	public static boolean masterUnlocked;
	public static boolean finalUnlocked;

	public EntityPropertyDriveForm(EntityPlayer player) {
		this.player = player;
		this.currentState = -1;
		this.player.getDataWatcher().addObject(DRIVE_WATCHER, 0);
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, -1);
		this.valorUnlocked = false;
		this.wisdomUnlocked = false;
		this.limitUnlocked = false;
		this.masterUnlocked = false;
		this.finalUnlocked = false;
	}
	
	public int getCurrentState(){
		return this.player.getDataWatcher().getWatchableObjectInt(DRIVE_WATCHER);
	}
	
	public void setValorUnlocked(boolean unlocked){
		this.valorUnlocked = unlocked;
	}
	
	public boolean getValorUnlocked(){
		return this.valorUnlocked;
	}
	
	public void changeState(int state){
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, state);
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
		properties.setInteger("CurrentState", this.player.getDataWatcher().getWatchableObjectInt(DRIVE_WATCHER));
		compound.setTag(EXT_PROP_NAME, properties);		
		properties.setBoolean("ValorUnlocked", valorUnlocked);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, properties.getInteger("CurrentState"));	
		valorUnlocked = properties.getBoolean("ValorUnlocked");
	}

	@Override
	public void init(Entity entity, World world) {
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, -1);
	}
}