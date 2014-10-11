package wehavecookies56.kk.core.packet;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.network.ByteBufUtils;

public class MunnyPacket implements IPacket {
		
		ItemStack itemToRemove;
		int munnyToGive;

		public MunnyPacket() { }
	    
	    public MunnyPacket(ItemStack itemToRemove, int munnyToGive){
	    	this.itemToRemove = itemToRemove;
	    	this.munnyToGive = munnyToGive;
	    }
	    
		@Override
		public void readBytes(ByteBuf bytes) {
			this.itemToRemove = ByteBufUtils.readItemStack(bytes);
			this.munnyToGive = bytes.readInt();
			
			ArrayList list = (ArrayList) MinecraftServer.getServer().getConfigurationManager().playerEntityList;
			Iterator iterator = list.iterator();

			EntityPlayerMP player = (EntityPlayerMP) iterator.next();
			
			
		}
		
		@Override
		public void writeBytes(ByteBuf bytes) {
			ByteBufUtils.writeItemStack(bytes, this.itemToRemove);
			bytes.writeInt(this.munnyToGive);

		}

		@Override
		public void handleClientSide(NetHandlerPlayClient nhClient) {
			
		}

		@Override
		public void handleServerSide(NetHandlerPlayServer nhServer) {
			EntityPlayer player = nhServer.playerEntity;
			if(player.getHeldItem() != null){
				if (player.getHeldItem().getItem() == AddedItems.DriveOrb)
				{
					EntityPropertyDrivePoints props = EntityPropertyDrivePoints.get((EntityPlayer)player);
					if (!(props.getCurrDrivePoints() >= 1000))
					{
						player.playSound("random.orb", 1, 1);
						props.addDrivePoints(10);
						player.inventory.consumeInventoryItem(AddedItems.DriveOrb);
						System.out.println(props.getCurrDrivePoints());
					}
				}
				else if(player.getHeldItem().getItem() == itemToRemove.getItem()){
					EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer)player);
					props.addMunny(munnyToGive * player.getHeldItem().stackSize);
					player.inventory.setInventorySlotContents(player.inventory.currentItem, null);

				}
			}
		}

	}