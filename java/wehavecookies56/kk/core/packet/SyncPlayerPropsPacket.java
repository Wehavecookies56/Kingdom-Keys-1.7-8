package wehavecookies56.kk.core.packet;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class SyncPlayerPropsPacket implements IPacket{
		
	public SyncPlayerPropsPacket() {}
	
	int max, cur;
	
	public SyncPlayerPropsPacket(int max, int cur){
		this.max = max;
		this.cur = cur;
	}
	
	@Override
	public void readBytes(ByteBuf bytes) {
		max = bytes.readInt();
		cur = bytes.readInt();
	}

	@Override
	public void writeBytes(ByteBuf bytes) {
		bytes.writeInt(max);
		bytes.writeInt(cur);
	}

	@Override
	public void handleClientSide(NetHandlerPlayClient nhClient) {
		
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		
		EntityPropertyMunny props = EntityPropertyMunny.get(player);
		props.addMunny(cur);

	}

	@Override
	public void handleServerSide(NetHandlerPlayServer nhServer) {
		
	}

	
	
}
