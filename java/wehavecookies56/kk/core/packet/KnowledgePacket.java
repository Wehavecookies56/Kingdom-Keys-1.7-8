package wehavecookies56.kk.core.packet;


import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import wehavecookies56.kk.item.AddedItems;

public class KnowledgePacket implements IMessage {

	ItemStack itemToRemove;

	public KnowledgePacket() { }

	public KnowledgePacket(ItemStack itemToRemove) {
		this.itemToRemove = itemToRemove;

	}


	@Override
	public void fromBytes(ByteBuf bytes) {
		this.itemToRemove = ByteBufUtils.readItemStack(bytes);
	}

	@Override
	public void toBytes(ByteBuf bytes) {
		ByteBufUtils.writeItemStack(bytes, this.itemToRemove);

	}

	public static class Handler implements IMessageHandler<KnowledgePacket, IMessage>{

		@Override
		public IMessage onMessage(KnowledgePacket message, MessageContext ctx) {
			EntityPlayer player = ctx.getServerHandler().playerEntity;
			Item i = AddedItems.KingdomKey;
			String s = "The voided knowledge forms substance in the form of the ";
			if(player.getHeldItem() != null){
				if(player.getHeldItem().getItem() == message.itemToRemove.getItem()){
					double rand;
					rand = Math.random();
					if (0>=rand&&rand<=0.04){
						i = AddedItems.Interdiction;
					}else if(0.05>=rand&&rand<=0.09){
						i = AddedItems.SharpShooter;
					}else if(0.1>=rand&&rand<=0.14){
						i = AddedItems.LindWorm;
					}else if(0.15>=rand&&rand<=0.19){
						i = AddedItems.FrozenPride;
					}else if(0.2>=rand&&rand<=0.24){
						i = AddedItems.SkySplitter;
					}else if(0.25>=rand&&rand<=0.29){
						i = AddedItems.BookOfRetribution;
					}else if(0.3>=rand&&rand<=0.34){
						i = AddedItems.Lunatic;
					}else if(0.35>=rand&&rand<=0.39){
						i = AddedItems.EternalFlames;
					}else if(0.4>=rand&&rand<=0.44){
						i = AddedItems.Arpeggio;
					}else if(0.45>=rand&&rand<=0.49){
						i = AddedItems.FairGame;
					}else if(0.5>=rand&&rand<=0.54){
						i = AddedItems.GracefulDahlia;
					}else if(0.55>=rand&&rand<=0.59){
						i = AddedItems.Foudre;
					}else if(0.6>=rand&&rand<=0.64){
						i = AddedItems.KingdomKey;
					}else if(0.65>=rand&&rand<=0.69){
						i = AddedItems.Interdiction;
					}else if(0.7>=rand&&rand<=0.74){
						i = AddedItems.SharpShooter;
					}else if(0.75>=rand&&rand<=0.79){
						i = AddedItems.LindWorm;
					}else if(0.8>=rand&&rand<=0.84){
						i = AddedItems.FrozenPride;
					}else if(0.85>=rand&&rand<=0.89){
						i = AddedItems.SkySplitter;
					}else if(0.9>=rand&&rand<=0.94){
						i = AddedItems.BookOfRetribution;
					}else if(0.95>=rand&&rand<=1){
						i = AddedItems.Lunatic;
					}
					player.addChatMessage(new ChatComponentText(s + i.getItemStackDisplayName(new ItemStack(i))));
					player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(i));
				}
				
			}
			
			return null;

		}

	}
}