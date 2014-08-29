package wehavecookies56.kk.core.packet;


import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

public class SummonPacket implements IMessage {
	
	ItemStack itemToSummon;
	ItemStack itemToRemove;

	public SummonPacket() { }

    public SummonPacket(ItemStack itemToSummon, ItemStack itemToRemove) {
    	this.itemToSummon = itemToSummon;
    	this.itemToRemove = itemToRemove;
    	
    }
	
	@Override
	public void fromBytes(ByteBuf bytes) {
		this.itemToSummon = ByteBufUtils.readItemStack(bytes);
		this.itemToRemove = ByteBufUtils.readItemStack(bytes);
		
		ArrayList list = (ArrayList) MinecraftServer.getServer().getConfigurationManager().playerEntityList;
		Iterator iterator = list.iterator();

		EntityPlayerMP player = (EntityPlayerMP) iterator.next();
		
	
		if(player.getHeldItem() != null){
			if(player.getHeldItem().getItem() == itemToRemove.getItem()){
				player.inventory.setInventorySlotContents(player.inventory.currentItem, itemToSummon);
			}
		}
	}
	
	@Override
	public void toBytes(ByteBuf bytes) {
		ByteBufUtils.writeItemStack(bytes, this.itemToSummon);
		ByteBufUtils.writeItemStack(bytes, this.itemToRemove);

	}

}