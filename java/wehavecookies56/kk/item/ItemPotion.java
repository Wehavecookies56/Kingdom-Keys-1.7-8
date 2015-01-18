package wehavecookies56.kk.item;

import java.util.Iterator;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
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
        return EnumAction.drink;
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
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":misc/" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}