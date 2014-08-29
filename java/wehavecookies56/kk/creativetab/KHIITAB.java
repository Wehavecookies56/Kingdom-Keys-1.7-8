package wehavecookies56.kk.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KHIITAB extends CreativeTabs {

    public KHIITAB(int par1, String par2Str) {
        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return AddedItems.Oathkeeper;
    }
}