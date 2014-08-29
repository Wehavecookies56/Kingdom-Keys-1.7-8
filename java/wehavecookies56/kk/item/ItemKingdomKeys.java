package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemKingdomKeys extends Item {
	public ItemKingdomKeys() {
		super();
		this.setCreativeTab(KingdomKeys.KKTAB);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}