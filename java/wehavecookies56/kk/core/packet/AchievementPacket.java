package wehavecookies56.kk.core.packet;

import io.netty.buffer.ByteBuf;
import net.minecraft.stats.Achievement;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import wehavecookies56.kk.achievements.AddedAchievments;


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