package wehavecookies56.kk.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.item.AddedItems;

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