package wehavecookies56.kk.core.event;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import wehavecookies56.kk.achievements.AddedAchievments;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.client.gui.GuiDriveBar;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OnPickUpEvent {

	@SubscribeEvent
	public void onPickUp(PlayerEvent.ItemPickupEvent event){
		EntityPropertyMunny munny = EntityPropertyMunny.get((EntityPlayer) event.player);
		EntityPropertyDrivePoints drive = EntityPropertyDrivePoints.get((EntityPlayer) event.player);

		//Bug Blox Achievments
		if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.NormalBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.HardBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.MetalBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.HardBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.HardBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.DangerBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.BounceBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.PrizeBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.RarePrizeBlox))
		{
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.pickedUp.getEntityItem().getItem()).equals(AddedBlocks.Synthesiser))
		{
			event.player.addStat(AddedAchievments.synthesizer, 1);
		}


		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1))
		{
			munny.addMunny(1);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny5))
		{
			munny.addMunny(5);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny5);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny10))
		{
			munny.addMunny(10);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny10);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny20))
		{
			munny.addMunny(20);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny20);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny50))
		{
			munny.addMunny(50);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny50);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny100))
		{
			munny.addMunny(100);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny100);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1000))
		{
			munny.addMunny(1000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1000);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny200))
		{
			munny.addMunny(200);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny200);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny500))
		{
			munny.addMunny(500);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny500);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1500))
		{
			munny.addMunny(1500);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1500);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1800))
		{
			munny.addMunny(1800);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1800);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny2000))
		{
			munny.addMunny(2000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny2000);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny3000))
		{
			munny.addMunny(3000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny3000);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny4000))
		{
			munny.addMunny(4000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny4000);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny5000))
		{
			munny.addMunny(5000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny5000);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny6000))
		{
			munny.addMunny(6000);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny6000);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny800))
		{
			munny.addMunny(800);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny800);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Munny1200))
		{
			munny.addMunny(1200);
			event.player.inventory.consumeInventoryItem(AddedItems.Munny1200);
			event.player.addStat(AddedAchievments.munny, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.HP))
		{
			event.player.addStat(AddedAchievments.hp, 1);
			if (event.player.getHealth() <= 19)
			{
				event.player.inventory.consumeInventoryItem(AddedItems.HP);
				event.player.heal(2);
			}
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.DarkHeart))
		{
			event.player.addStat(AddedAchievments.dheart, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.Heart))
		{
			event.player.addStat(AddedAchievments.heart, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.PureHeart))
		{
			event.player.addStat(AddedAchievments.pheart, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.KingdomHearts))
		{
			event.player.addStat(AddedAchievments.khearts, 1);
		}

		else if(event.pickedUp.getEntityItem().getItem().equals(AddedItems.DriveOrb))
		{
			if (drive.getCurrDrivePoints() >= 1000)
			{
				event.player.inventory.consumeInventoryItem(AddedItems.DriveOrb);
				drive.addDrivePoints(10);
			}
		}	
	}
}
