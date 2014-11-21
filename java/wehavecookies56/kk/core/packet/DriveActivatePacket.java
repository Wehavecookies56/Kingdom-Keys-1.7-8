package wehavecookies56.kk.core.packet;

import io.netty.buffer.ByteBuf;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.NetHandlerPlayServer;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDriveForm;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;

public class DriveActivatePacket implements IPacket {

	private int amount;
	private int state;
	
	public DriveActivatePacket() {}
	
	public DriveActivatePacket(int amount, int state) {
		this.amount = amount;
		this.state = state;
	}
	
	@Override
	public void readBytes(ByteBuf bytes) {
		amount = bytes.readInt();
		state = bytes.readInt();
		
	}

	@Override
	public void writeBytes(ByteBuf bytes) {
		bytes.writeInt(amount);
		bytes.writeInt(state);
	}

	@Override
	public void handleClientSide(NetHandlerPlayClient nhClient) {
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(Minecraft.getMinecraft().thePlayer);
		EntityPropertyDriveForm df = EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer);
		if(dp.getCurrDrivePoints() >= amount){
			df.changeState(state);
		}
	}

	@Override
	public void handleServerSide(NetHandlerPlayServer nhServer) {
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(nhServer.playerEntity);
		EntityPropertyDriveForm df = EntityPropertyDriveForm.get(Minecraft.getMinecraft().thePlayer);
		if(dp.getCurrDrivePoints() >= amount){
			df.changeState(state);
			consumePoints(amount, nhServer.playerEntity);
		}
	}
	
	public boolean consumePoints(int cost, final EntityPlayer player){
		
		final int THREAD_POOL_SIZE = 1;
		final ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(THREAD_POOL_SIZE);
		final long INITIAL_DELAY_MILLIS = 0;
		final long RECURRENCE_MILLIS = 50;

		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);
		EntityPropertyDriveForm df = EntityPropertyDriveForm.get(player);
		if(EntityPropertyDrivePoints.get(player).getCurrDrivePoints() < cost)
		{
			return false;
		}
		
		final ScheduledFuture t = executor.scheduleAtFixedRate(new Runnable() {
		  @Override
		  public void run() {
			EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);
			EntityPropertyDriveForm df = EntityPropertyDriveForm.get(player);
			if(dp.getCurrDrivePoints() >= 0){dp.setCurrDrivePoints((int)(EntityPropertyDrivePoints.get(player).getCurrDrivePoints() - 0.1));}
			if(dp.getCurrDrivePoints() <= 0){df.changeState(-1); executor.shutdown();}
			if(df.getCurrentState() == -1){executor.shutdown();}
		  }
		}, INITIAL_DELAY_MILLIS, RECURRENCE_MILLIS, TimeUnit.MILLISECONDS);
		return true;
		
	}

}
