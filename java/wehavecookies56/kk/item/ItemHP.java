package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemHP extends Item{

    public ItemHP() {
        super();       
        this.setUnlocalizedName(Strings.HP);
        this.setCreativeTab(KingdomKeys.KKTAB);
    }
    
    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
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