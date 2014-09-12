package wehavecookies56.kk.core.event;

import net.minecraft.block.Block;
import wehavecookies56.kk.achievements.AddedAchievments;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OnCraftedEvent {
	
    /*
	 * Fired when a player is about to craft an item
	 */
	
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event){
		if(Block.getBlockFromItem(event.crafting.getItem()).equals(AddedBlocks.NormalBlox) || Block.getBlockFromItem(event.crafting.getItem()).equals(AddedBlocks.HardBlox) || Block.getBlockFromItem(event.crafting.getItem()).equals(AddedBlocks.MetalBlox) || Block.getBlockFromItem(event.crafting.getItem()).equals(AddedBlocks.DangerBlox)){
			event.player.addStat(AddedAchievments.bugBlox, 1);
		}

		else if(Block.getBlockFromItem(event.crafting.getItem()).equals(AddedBlocks.Synthesiser))
		{
			event.player.addStat(AddedAchievments.synthesizer, 1);
		}
		
		else if(Block.getBlockFromItem(event.crafting.getItem()).equals(AddedItems.Potion))
		{
			event.player.addStat(AddedAchievments.kkpotion, 1);
		}
	}
	
}
