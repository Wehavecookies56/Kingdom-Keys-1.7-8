package wehavecookies56.kk.core.proxies;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.nbt.NBTTagCompound;


public class CommonProxy {
	
	private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap<String, NBTTagCompound>();

	public void registerRenderers() {}

	public int addArmor(String armor) {
		return 0;
	}

	public void initCapes() {}

	public void registerKeybinds(){}
	
	public static void storeEntityData(String name, NBTTagCompound compound) {
		extendedEntityData.put(name, compound);
	}

	public static NBTTagCompound getEntityData(String name) {
		return extendedEntityData.remove(name);
	}

}