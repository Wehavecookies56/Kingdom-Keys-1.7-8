package wehavecookies56.kk.item.keychains;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.item.ItemKingdomKeys;

public class ItemDarkGnawChain extends ItemKingdomKeys{
	
    public ItemDarkGnawChain() {
        super();       
    }
   
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add("Kingdom Hearts Birth By Sleep");
    }
}