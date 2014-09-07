package wehavecookies56.kk.item.recipes;

import java.util.List;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.core.packet.IPacket;
import wehavecookies56.kk.core.packet.KnowledgePacket;
import wehavecookies56.kk.core.packet.SummonPacket;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.lib.LocalStrings;
import wehavecookies56.kk.lib.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemVoidedKnowledge extends ItemKingdomKeys {
	
	public ItemVoidedKnowledge() {
		super();
	}
	
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity) {
		
		IPacket packet = new KnowledgePacket(new ItemStack(AddedItems.VoidedKnowledge));
		KingdomKeys.network.sendToServer(packet);
		entity.playSound("mob.enderman.portal", 1, 1);
		return super.onItemRightClick(item, world, entity);
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add(StatCollector.translateToLocal(LocalStrings.VoidedKnowledge));
	}
}
