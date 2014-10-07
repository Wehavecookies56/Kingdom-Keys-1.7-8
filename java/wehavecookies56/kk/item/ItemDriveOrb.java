package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.core.packet.IPacket;
import wehavecookies56.kk.core.packet.MunnyPacket;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemDriveOrb extends Item{

    public ItemDriveOrb() {
        super();       
        this.setUnlocalizedName(Strings.DriveOrb);
        this.setCreativeTab(KingdomKeys.KKTAB);
    }

    @Override
    public void registerIcons(IIconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
        
    @Override
  	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity)
	{
		return item;
	}
}
