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
	public static final int VALOR_WATCHER = 23;
	public static final int WISDOM_WATCHER = 24;
	public static final int LIMIT_WATCHER = 25;
	public static final int FINAL_WATCHER = 26;
	public static final int MASTER_WATCHER = 27;
	private final EntityPlayer player;
	private int currentState;
	public static int valorUnlocked;
	public static int wisdomUnlocked;
	public static int limitUnlocked;
	public static int masterUnlocked;
	public static int finalUnlocked;

	public EntityPropertyDriveForm(EntityPlayer player) {
		this.player = player;
		this.currentState = -1;
		this.player.getDataWatcher().addObject(DRIVE_WATCHER, 0);
		this.player.getDataWatcher().addObject(VALOR_WATCHER, 0);
		this.player.getDataWatcher().addObject(WISDOM_WATCHER, 0);
		this.player.getDataWatcher().addObject(LIMIT_WATCHER, 0);
		this.player.getDataWatcher().addObject(MASTER_WATCHER, 0);
		this.player.getDataWatcher().addObject(FINAL_WATCHER, 0);
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, -1);
		this.valorUnlocked = 0;
		this.wisdomUnlocked = 0;
		this.limitUnlocked = 0;
		this.masterUnlocked = 0;
		this.finalUnlocked = 0;
	}
	
	public int getCurrentState(){
		return this.player.getDataWatcher().getWatchableObjectInt(DRIVE_WATCHER);
	}
	
	public void setValorUnlocked(int unlocked){
		this.player.getDataWatcher().updateObject(VALOR_WATCHER, unlocked);
	}
	
	public int getValorUnlocked(){
		return this.player.getDataWatcher().getWatchableObjectInt(VALOR_WATCHER);
	}
	
	public void setWisdomUnlocked(int unlocked){
		this.player.getDataWatcher().updateObject(WISDOM_WATCHER, unlocked);
	}
	
	public int getWisdomUnlocked(){
		return this.player.getDataWatcher().getWatchableObjectInt(WISDOM_WATCHER);
	}
	
	public void setLimitUnlocked(int unlocked){
		this.player.getDataWatcher().updateObject(LIMIT_WATCHER, unlocked);
	}
	
	public int getLimitUnlocked(){
		return this.player.getDataWatcher().getWatchableObjectInt(LIMIT_WATCHER);
	}
	
	public void setMasterUnlocked(int unlocked){
		this.player.getDataWatcher().updateObject(MASTER_WATCHER, unlocked);
	}
	
	public int getMasterUnlocked(){
		return this.player.getDataWatcher().getWatchableObjectInt(MASTER_WATCHER);

	}
	
	public void setFinalUnlocked(int unlocked){
		this.player.getDataWatcher().updateObject(FINAL_WATCHER, unlocked);
	}
	
	public int getFinalUnlocked(){
		return this.player.getDataWatcher().getWatchableObjectInt(FINAL_WATCHER);
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
		properties.setInteger("ValorUnlocked", this.player.getDataWatcher().getWatchableObjectInt(VALOR_WATCHER));
		properties.setInteger("WisdomUnlocked", this.player.getDataWatcher().getWatchableObjectInt(WISDOM_WATCHER));
		properties.setInteger("LimitUnlocked", this.player.getDataWatcher().getWatchableObjectInt(LIMIT_WATCHER));
		properties.setInteger("MasterUnlocked", this.player.getDataWatcher().getWatchableObjectInt(MASTER_WATCHER));
		properties.setInteger("FinalUnlocked", this.player.getDataWatcher().getWatchableObjectInt(FINAL_WATCHER));
		compound.setTag(EXT_PROP_NAME, properties);		
		System.out.println("Data saved");
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, properties.getInteger("CurrentState"));
		this.player.getDataWatcher().updateObject(VALOR_WATCHER, properties.getInteger("ValorUnlocked"));
		this.player.getDataWatcher().updateObject(WISDOM_WATCHER, properties.getInteger("WisdomUnlocked"));
		this.player.getDataWatcher().updateObject(LIMIT_WATCHER, properties.getInteger("LimitUnlocked"));
		this.player.getDataWatcher().updateObject(MASTER_WATCHER, properties.getInteger("MasterUnlocked"));
		this.player.getDataWatcher().updateObject(FINAL_WATCHER, properties.getInteger("FinalUnlocked"));

		System.out.println("Valor is " +getValorUnlocked());
		
	}

	@Override
	public void init(Entity entity, World world) {
		this.player.getDataWatcher().updateObject(DRIVE_WATCHER, -1);
	}
}