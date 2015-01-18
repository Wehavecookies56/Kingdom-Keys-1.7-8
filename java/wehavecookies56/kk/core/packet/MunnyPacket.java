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
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class MunnyPacket implements IMessage {
		
		ItemStack itemToRemove;
		int munnyToGive;

		public MunnyPacket() { }
	    
	    public MunnyPacket(ItemStack itemToRemove, int munnyToGive){
	    	this.itemToRemove = itemToRemove;
	    	this.munnyToGive = munnyToGive;
	    }
	    
		@Override
		public void fromBytes(ByteBuf bytes) {
			this.itemToRemove = ByteBufUtils.readItemStack(bytes);
			this.munnyToGive = bytes.readInt();
			
			ArrayList list = (ArrayList) MinecraftServer.getServer().getConfigurationManager().playerEntityList;
			Iterator iterator = list.iterator();

			EntityPlayerMP player = (EntityPlayerMP) iterator.next();
			
			
		}
		
		@Override
		public void toBytes(ByteBuf bytes) {
			ByteBufUtils.writeItemStack(bytes, this.itemToRemove);
			bytes.writeInt(this.munnyToGive);

		}
		
		public static class Handler implements IMessageHandler<MunnyPacket, IMessage>{

			@Override
			public IMessage onMessage(MunnyPacket message, MessageContext ctx) {
				EntityPlayer player = ctx.getServerHandler().playerEntity;
				if(player.getHeldItem() != null){
					if (player.getHeldItem().getItem() == AddedItems.DriveOrb)
					{
						EntityPropertyDrivePoints props = EntityPropertyDrivePoints.get((EntityPlayer)player);
						if (!(props.getCurrDrivePoints() >= 1000))
						{
							player.playSound("random.orb", 1, 1);
							EntityPropertyDrivePoints.get(player).addDrivePoints(10);
							player.inventory.consumeInventoryItem(AddedItems.DriveOrb);
							System.out.println(props.getCurrDrivePoints());
						}
					}
					else if(player.getHeldItem().getItem() == message.itemToRemove.getItem()){
						EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer)player);
						props.addMunny(message.munnyToGive * player.getHeldItem().stackSize);
						player.inventory.setInventorySlotContents(player.inventory.currentItem, null);

					}
				}
				return null;
			}
			
		}

	}