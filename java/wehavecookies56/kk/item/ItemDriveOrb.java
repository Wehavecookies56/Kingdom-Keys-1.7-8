package wehavecookies56.kk.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.packet.MunnyPacket;
import wehavecookies56.kk.lib.Strings;

public class ItemDriveOrb extends Item{

	public ItemDriveOrb() {
		super();       
		this.setUnlocalizedName(Strings.DriveOrb);
		this.setCreativeTab(KingdomKeys.KKTAB);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity)
	{
		if(world.isRemote){
			IMessage packet = new MunnyPacket(new ItemStack(AddedItems.DriveOrb), 1);
			KingdomKeys.network.sendToServer(packet);
		}
		return super.onItemRightClick(item, world, entity);
	}
}
