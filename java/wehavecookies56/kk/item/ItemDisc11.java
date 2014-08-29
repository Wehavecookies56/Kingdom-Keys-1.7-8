package wehavecookies56.kk.item;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemDisc11 extends ItemRecord {

	protected ItemDisc11(String p_i45350_1_) {
		super(p_i45350_1_);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	@Override
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation("kk:" + name);
	}

}
