package wehavecookies56.kk.core.packet;


import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Iterator;

import wehavecookies56.kk.item.AddedItems;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.ByteBufUtils;

public class EternalFlamesPacket implements IPacket {
	
	boolean thrown;

	public EternalFlamesPacket() { }

    public EternalFlamesPacket(boolean thrown) {
    	
    	this.thrown = thrown;
    }
	
	@Override
	public void readBytes(ByteBuf bytes) {
		this.thrown = bytes.readBoolean();
		
		ArrayList list = (ArrayList) MinecraftServer.getServer().getConfigurationManager().playerEntityList;
		Iterator iterator = list.iterator();

		EntityPlayerMP player = (EntityPlayerMP) iterator.next();

		if(player.getHeldItem().equals(null) && thrown){
		player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(AddedItems.EternalFlames));
		}
		if(player.getHeldItem().equals(AddedItems.EternalFlames) && !thrown){
			player.inventory.decrStackSize(player.inventory.currentItem, 1);
		}
	}
	
	@Override
	public void writeBytes(ByteBuf bytes) {
		bytes.writeBoolean(this.thrown);

	}

	@Override
	public void handleClientSide(NetHandlerPlayClient nhClient) {
		
	}

	@Override
	public void handleServerSide(NetHandlerPlayServer nhServer) {
		
	}

}