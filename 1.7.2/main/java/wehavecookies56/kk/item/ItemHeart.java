package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemHeart extends ItemKingdomKeys{

    public ItemHeart() {
        super();       
        this.setUnlocalizedName(Strings.Heart);
    }
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}