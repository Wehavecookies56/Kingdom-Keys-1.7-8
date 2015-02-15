package wehavecookies56.kk.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Strings;

public class ItemHP extends Item{

    public ItemHP() {
        super();       
        this.setUnlocalizedName(Strings.HP);
        this.setCreativeTab(KingdomKeys.KKTAB);
    }
        
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity)
	{
		if(!(entity.getHealth() == 20))
		{
			entity.heal(2);
			entity.inventory.consumeInventoryItem(AddedItems.HP);
		}
		return item;	
	}
}