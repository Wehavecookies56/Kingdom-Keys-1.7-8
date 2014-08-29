package wehavecookies56.kk.event;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import wehavecookies56.kk.achievements.AddedAchievments;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OnPickUpEvent {
	
	/*
	 * Fired when the player is about to collide with an EntityItem
	 */
	
	@SubscribeEvent
	public void onPickUp(PlayerEvent.ItemPickupEvent event){
		EntityPropertyMunny munny = EntityPropertyMunny.get((EntityPlayer) event.player);
		if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.NormalBlox)){
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1)){
			munny.addMunny(1);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny5)){
			munny.addMunny(5);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny5);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny10)){
			munny.addMunny(10);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny10);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny20)){
			munny.addMunny(20);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny20);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny50)){
			munny.addMunny(50);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny50);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny100)){
			munny.addMunny(100);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny100);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1000)){
			munny.addMunny(1000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1000);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny200)){
			munny.addMunny(200);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny200);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny500)){
			munny.addMunny(500);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny500);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1500)){
			munny.addMunny(1500);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1500);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1800)){
			munny.addMunny(1800);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1800);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny2000)){
			munny.addMunny(2000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny2000);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny3000)){
			munny.addMunny(3000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny3000);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny4000)){
			munny.addMunny(4000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny4000);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny5000)){
			munny.addMunny(5000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny5000);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny6000)){
			munny.addMunny(6000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny6000);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny800)){
			munny.addMunny(800);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny800);
		}else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1200)){
			munny.addMunny(1200);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1200);
		}
	}
}
