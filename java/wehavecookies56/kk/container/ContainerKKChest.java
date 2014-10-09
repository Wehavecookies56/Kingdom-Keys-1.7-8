package wehavecookies56.kk.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import wehavecookies56.kk.client.gui.GuiTabs;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.slot.SlotSynthesis;

public class ContainerKKChest extends Container {
	
	private TileEntityKKChest KKChest;

	public ContainerKKChest(InventoryPlayer invPlayer, TileEntityKKChest KKChest){
		this.KKChest = KKChest;
		
		for(int x = 0; x< 9; x++){
			addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 142));
		}
		
		for (int y = 0; y < 3; y++){
			for(int x = 0; x < 9; x++){
				addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 84 + y * 18));
			}
		}
		
		for (int x = 0; x < 9; x++){
			addSlotToContainer(new SlotSynthesis(KKChest, x, 7 + 14 * x, 7));
		}
	}
	

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return KKChest.isUseableByPlayer(entityplayer);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i){
		Slot slot = getSlot(i);
		
		if(slot != null && slot.getHasStack()){
			ItemStack stack = slot.getStack();
			ItemStack result = stack.copy();
			if(i == 36){
				if(!mergeItemStack(stack, 0, 36, false)){
					return null;
				}
			}
			
			if(stack.stackSize == 0){
				slot.putStack(null);
			}else{
				slot.onSlotChanged();
			}
			
			slot.onPickupFromSlot(player, stack);
			return result;
		}
		
		return null;
	}
		
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
	}
	
}
