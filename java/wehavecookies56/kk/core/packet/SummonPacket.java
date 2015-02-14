package wehavecookies56.kk.core.packet;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SummonPacket implements IMessage {
	
	ItemStack itemToSummon;
	ItemStack itemToRemove;

	public SummonPacket() { }

    public SummonPacket(ItemStack itemToSummon, ItemStack itemToRemove) {
    	this.itemToSummon = itemToSummon;
    	this.itemToRemove = itemToRemove;
    	
    }
	
    @Override
	public void fromBytes(ByteBuf buf) {
		this.itemToSummon = ByteBufUtils.readItemStack(buf);
		this.itemToRemove = ByteBufUtils.readItemStack(buf);
		
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeItemStack(buf, this.itemToSummon);
		ByteBufUtils.writeItemStack(buf, this.itemToRemove);
		
	}
	
	public static class Handler implements IMessageHandler<SummonPacket, IMessage>{

		@Override
		public IMessage onMessage(SummonPacket message, MessageContext ctx) {
			EntityPlayer player = ctx.getServerHandler().playerEntity;
			if(player.getHeldItem() != null){
				if(player.getHeldItem().getItem() == message.itemToRemove.getItem()){
					player.inventory.setInventorySlotContents(player.inventory.currentItem, message.itemToSummon);
				}
			}
			return null;
		}
	
	}

	

}