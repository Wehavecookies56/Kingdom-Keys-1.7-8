package wehavecookies56.kk.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.lib.Strings;

public class ItemValorFormOrb extends Item {

	public ItemValorFormOrb() {
		super();
		this.setUnlocalizedName(Strings.ValorFormOrb);
		this.setCreativeTab(KingdomKeys.KKTAB);
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity)
	{
		EntityPropertyDriveForm df = EntityPropertyDriveForm.get(entity);
		df.setValorUnlocked(1);
		return item;
		
	//	if(!world.isRemote){
	//		EntityPropertyDriveForm props = EntityPropertyDriveForm.get(entity);
	//		props.setValorUnlocked(true);
	//	}
	//	return item;
	}
	
}
