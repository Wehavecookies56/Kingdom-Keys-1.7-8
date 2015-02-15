package wehavecookies56.kk.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Strings;

public class ItemPotion extends ItemFood{

    public ItemPotion(int food, float set, boolean wolf) {
        super(food, wolf);       
        this.setUnlocalizedName(Strings.Potion);
        this.setCreativeTab(KingdomKeys.KKTAB);
        this.setAlwaysEdible();
        //this.setPotionEffect(Potion.heal.id, 1, 1, 1.0F);
    }
    
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.DRINK;
    }
    
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player)
    {
		player.heal(16);
    	
        if (!player.capabilities.isCreativeMode)
        {
            --item.stackSize;
        }

        if (!player.capabilities.isCreativeMode)
        {
            if (item.stackSize <= 0)
            {
                return new ItemStack(AddedItems.EmptyBottle);
            }

            player.inventory.addItemStackToInventory(new ItemStack(AddedItems.EmptyBottle));
        }

        return item;
    }

}