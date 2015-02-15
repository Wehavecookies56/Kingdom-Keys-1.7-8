package wehavecookies56.kk.item.recipes;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.packet.KnowledgePacket;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.lib.LocalStrings;

public class ItemVoidedKnowledge extends ItemKingdomKeys {
	
	public ItemVoidedKnowledge() {
		super();
	}
		
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity) {
		
		IMessage packet = new KnowledgePacket(new ItemStack(AddedItems.VoidedKnowledge));
		KingdomKeys.network.sendToServer(packet);
		entity.playSound("mob.enderman.portal", 1, 1);
		return super.onItemRightClick(item, world, entity);
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add(StatCollector.translateToLocal(LocalStrings.VoidedKnowledge));
	}
}
