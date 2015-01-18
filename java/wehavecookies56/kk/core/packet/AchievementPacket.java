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
import net.minecraft.stats.Achievement;
import net.minecraft.util.ChatComponentText;
import wehavecookies56.kk.achievements.AddedAchievments;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.gameevent.PlayerEvent;


public class AchievementPacket implements IMessage {

	private Achievement achv;
	int achvid;

	public AchievementPacket() { }

	public AchievementPacket(int AchievementID){
		this.achvid = AchievementID;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		achvid = buf.readInt();

	}

	@Override
	public void toBytes(ByteBuf buf) {			
	}

	public static class Handler implements IMessageHandler<AchievementPacket, IMessage> {

		@Override
		public IMessage onMessage(AchievementPacket message, MessageContext ctx) {
			if(message.achvid == 1){
				ctx.getServerHandler().playerEntity.addStat(AddedAchievments.menu, 1);
			}
			return null;
		}
	}
}