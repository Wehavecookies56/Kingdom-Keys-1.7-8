package wehavecookies56.kk.core.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class EntityPropertyExtraHealth implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "PlayerHealthKK";
	private final EntityPlayer player;

	public static int currExtraHealth;
	public static int maxExtraHealth;

	public EntityPropertyExtraHealth(EntityPlayer player) {
		this.player = player;

		this.currExtraHealth = 0;
		this.currExtraHealth = 100;
	}

	public static final void register(EntityPlayer player){
		player.registerExtendedProperties(EntityPropertyExtraHealth.EXT_PROP_NAME, new EntityPropertyExtraHealth(player));
	}

	public static final EntityPropertyExtraHealth get(EntityPlayer player){
		return (EntityPropertyExtraHealth) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("CurrentExtraHealth", this.currExtraHealth);
		properties.setInteger("MaxExtraHealth", this.currExtraHealth);

		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

		this.currExtraHealth = properties.getInteger("CurrentExtraHealth");
		this.currExtraHealth = properties.getInteger("MaxExtraHealth");
	}

	@Override
	public void init(Entity entity, World world) {

	}

	public boolean consumeHP(int amount){
		boolean sufficient = amount <= this.currExtraHealth;

		this.currExtraHealth -= (amount < this.currExtraHealth ? amount : this.currExtraHealth);
		
		return sufficient;
	}

}
