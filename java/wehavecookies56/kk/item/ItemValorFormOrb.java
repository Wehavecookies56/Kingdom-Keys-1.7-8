package wehavecookies56.kk.item;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemValorFormOrb extends Item {

	public ItemValorFormOrb() {
		super();
		this.setUnlocalizedName(Strings.ValorFormOrb);
		this.setCreativeTab(KingdomKeys.KKTAB);
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity)
	{
		if(!world.isRemote){
			EntityPropertyDriveForm props = EntityPropertyDriveForm.get(entity);
			System.out.println(props.getValorUnlocked());
			props.setValorUnlocked(true);
			System.out.println(props.getValorUnlocked());
		}
		return item;
	}
	
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
}
