package wehavecookies56.kk.item;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFinalFormOrb extends Item {

	public ItemFinalFormOrb() {
		super();
		this.setUnlocalizedName(Strings.FinalFormOrb);
		this.setCreativeTab(KingdomKeys.KKTAB);
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity)
	{
		EntityPropertyDriveForm df = EntityPropertyDriveForm.get(entity);
		df.setFinalUnlocked(1);
		return item;
	}
	
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":misc/" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
