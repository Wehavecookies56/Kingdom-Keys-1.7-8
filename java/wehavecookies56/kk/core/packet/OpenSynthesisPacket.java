package wehavecookies56.kk.core.packet;

import java.util.ArrayList;
import java.util.Iterator;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import wehavecookies56.kk.KingdomKeys;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

public class OpenSynthesisPacket implements IMessage {

	private int guiId;
	
	public OpenSynthesisPacket() {}
	
	public OpenSynthesisPacket(int guiId){
		this.guiId = guiId;
	}
	
	@Override
	public void fromBytes(ByteBuf bytes) {
		guiId = bytes.readInt();
		ArrayList list = (ArrayList) MinecraftServer.getServer().getConfigurationManager().playerEntityList;
		Iterator iterator = list.iterator();

		EntityPlayerMP player = (EntityPlayerMP) iterator.next();
		player.openGui(KingdomKeys.instance, guiId, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
	}

	@Override
	public void toBytes(ByteBuf bytes) {
		bytes.writeInt(guiId);
	}

}
