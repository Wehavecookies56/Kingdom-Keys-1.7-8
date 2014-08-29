package wehavecookies56.kk.core.packet;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class SyncPlayerPropsPacketHandler implements IMessageHandler<SyncPlayerPropsPacket, IMessage> {

	@Override
	public IMessage onMessage(SyncPlayerPropsPacket message, MessageContext ctx) {
		System.out.println(String.format("Received %s from %s", ctx.getServerHandler().playerEntity.getDisplayName()));
		return null;
	}

}