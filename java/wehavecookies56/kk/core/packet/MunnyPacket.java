package wehavecookies56.kk.core.packet;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class MunnyPacket implements IPacket {
		
		ItemStack itemToRemove;

		public MunnyPacket() { }

	    public MunnyPacket(ItemStack itemToRemove) {
	    	this.itemToRemove = itemToRemove;
	    	
	    }
	    
	    
		@Override
		public void readBytes(ByteBuf bytes) {
			this.itemToRemove = ByteBufUtils.readItemStack(bytes);
			
			ArrayList list = (ArrayList) MinecraftServer.getServer().getConfigurationManager().playerEntityList;
			Iterator iterator = list.iterator();

			EntityPlayerMP player = (EntityPlayerMP) iterator.next();
			
			Item i = AddedItems.KingdomKey;
			if(player.getHeldItem() != null){
				if(player.getHeldItem().getItem() == itemToRemove.getItem()){
					EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer)player);
					props.addMunny(1);
					player.inventory.consumeInventoryItem(AddedItems.Munny1);
					
					player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(i));
				}
			}
		}
		
		@Override
		public void writeBytes(ByteBuf bytes) {
			ByteBufUtils.writeItemStack(bytes, this.itemToRemove);

		}

		@Override
		public void handleClientSide(NetHandlerPlayClient nhClient) {
			
		}

		@Override
		public void handleServerSide(NetHandlerPlayServer nhServer) {
			
		}

	}