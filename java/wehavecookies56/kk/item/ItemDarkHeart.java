package wehavecookies56.kk.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemDarkHeart extends ItemKingdomKeys{
    public ItemDarkHeart() {
        super();       
        this.setUnlocalizedName(Strings.DHeart);
        
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":misc/" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}