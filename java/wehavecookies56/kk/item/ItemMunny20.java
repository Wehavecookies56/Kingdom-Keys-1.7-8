package wehavecookies56.kk.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.packet.IPacket;
import wehavecookies56.kk.core.packet.MunnyPacket;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemMunny20 extends ItemKingdomKeys{

    public ItemMunny20() {
        super();       
        this.setUnlocalizedName(Strings.Munny20); 
    }
    
    @Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity) {
			IPacket packet = new MunnyPacket(new ItemStack(AddedItems.Munny20), 20);
			KingdomKeys.network.sendToServer(packet);
			entity.playSound("random.orb", 1, 1);
			return super.onItemRightClick(item, world, entity);
	}
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":misc/" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}