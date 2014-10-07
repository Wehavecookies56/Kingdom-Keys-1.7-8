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
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementPacket implements IPacket {
		
		private Achievement achv;
		private int achvid;

		public AchievementPacket() { }
	    
	    public AchievementPacket(int AchievementID){
	    	this.achvid = AchievementID;
	    }
	    
		@Override
		public void readBytes(ByteBuf bytes) {
			this.achvid = bytes.readInt();
			
		}
		
		@Override
		public void writeBytes(ByteBuf bytes) {
			bytes.writeInt(achvid);

		}

		@Override
		public void handleClientSide(NetHandlerPlayClient nhClient) {
			
		}

		@Override
		public void handleServerSide(NetHandlerPlayServer nhServer) {
			EntityPlayer player = nhServer.playerEntity;
			if(achvid == 1){
				player.addStat(AddedAchievments.menu, 1);
			}
		}

	}