package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemRecord;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDisc3 extends ItemRecord {

	protected ItemDisc3(String par1Str) {
		super(par1Str);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}

	@SideOnly(Side.CLIENT)
    public String getRecordTitle()
    {
        return "Square Enix KH 358/2 Days - " + Strings.Disc3;
    }
	
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}
