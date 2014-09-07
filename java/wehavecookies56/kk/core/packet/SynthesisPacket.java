package wehavecookies56.kk.core.packet;


import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Iterator;

import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

public class SynthesisPacket implements IPacket {

	ItemStack recipe;
	ItemStack result;
	ItemStack item1;
	ItemStack item2;
	ItemStack item3;
	ItemStack item4;
	ItemStack item5;
	ItemStack item6;
	ItemStack item7;
	ItemStack item8;
	ItemStack item9;
	ItemStack item10;
	ItemStack item11;
	int cost;

	public SynthesisPacket() {}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, ItemStack item8, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, ItemStack item8, ItemStack item9, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, ItemStack item8, ItemStack item9, ItemStack item10, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.item10 = item10;
		this.cost = cost;
	}

	public SynthesisPacket(ItemStack recipe, ItemStack result, ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, ItemStack item8, ItemStack item9, ItemStack item10, ItemStack item11, int cost) {
		this.recipe = recipe;
		this.result = result;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.item10 = item10;
		this.item11 = item11;
		this.cost = cost;
	}

	@Override
	public void readBytes(ByteBuf bytes) {
		this.recipe = ByteBufUtils.readItemStack(bytes);
		this.result = ByteBufUtils.readItemStack(bytes);
		this.item1 = ByteBufUtils.readItemStack(bytes);
		this.item2 = ByteBufUtils.readItemStack(bytes);
		this.item3 = ByteBufUtils.readItemStack(bytes);
		this.item4 = ByteBufUtils.readItemStack(bytes);
		this.item5 = ByteBufUtils.readItemStack(bytes);
		this.item6 = ByteBufUtils.readItemStack(bytes);
		this.item7 = ByteBufUtils.readItemStack(bytes);
		this.item8 = ByteBufUtils.readItemStack(bytes);
		this.item9 = ByteBufUtils.readItemStack(bytes);
		this.item10 = ByteBufUtils.readItemStack(bytes);
		this.item11 = ByteBufUtils.readItemStack(bytes);
		this.cost = bytes.readInt();
		
	}

	@Override
	public void writeBytes(ByteBuf bytes) {
		ByteBufUtils.writeItemStack(bytes, this.recipe);
		ByteBufUtils.writeItemStack(bytes, this.result);
		ByteBufUtils.writeItemStack(bytes, this.item1);
		ByteBufUtils.writeItemStack(bytes, this.item2);
		ByteBufUtils.writeItemStack(bytes, this.item3);
		ByteBufUtils.writeItemStack(bytes, this.item4);
		ByteBufUtils.writeItemStack(bytes, this.item5);
		ByteBufUtils.writeItemStack(bytes, this.item6);
		ByteBufUtils.writeItemStack(bytes, this.item7);
		ByteBufUtils.writeItemStack(bytes, this.item8);
		ByteBufUtils.writeItemStack(bytes, this.item9);
		ByteBufUtils.writeItemStack(bytes, this.item10);
		ByteBufUtils.writeItemStack(bytes, this.item11);
		bytes.writeInt(cost);
	}

	@Override
	public void handleClientSide(NetHandlerPlayClient nhClient) {
		
	}

	@Override
	public void handleServerSide(NetHandlerPlayServer nhServer) {
		EntityPlayer player = nhServer.playerEntity;
		player.inventory.addItemStackToInventory(result);

		EntityPropertyMunny props = EntityPropertyMunny.get(player);
		
		if(this.item1 != null){
			player.inventory.consumeInventoryItem(this.item1.getItem());
		}
		if(item2 != null){
			player.inventory.consumeInventoryItem(this.item2.getItem());
		}
		if(item3 != null){
			player.inventory.consumeInventoryItem(this.item3.getItem());
		}
		if(item4 != null){
			player.inventory.consumeInventoryItem(this.item4.getItem());
		}
		if(item5 != null){
			player.inventory.consumeInventoryItem(this.item5.getItem());
		}
		if(item6 != null){
			player.inventory.consumeInventoryItem(this.item6.getItem());
		}
		if(item7 != null){
			player.inventory.consumeInventoryItem(this.item7.getItem());
		}
		if(item8 != null){
			player.inventory.consumeInventoryItem(this.item8.getItem());
		}
		if(item9 != null){
			player.inventory.consumeInventoryItem(this.item9.getItem());
		}
		if(item10 != null){
			player.inventory.consumeInventoryItem(this.item10.getItem());
		}
		if(item11 != null){
			player.inventory.consumeInventoryItem(this.item11.getItem());
		}
		
		props.consumeMunny(cost);
	}

}