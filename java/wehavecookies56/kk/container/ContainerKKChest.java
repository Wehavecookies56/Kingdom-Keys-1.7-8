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
		
		  for (int x = 0; x < 3; x++) 
		  {
              for (int y = 0; y < 3; y++) 
              {
                      addSlotToContainer(new Slot(KKChest, y + x * 3, 62 + y * 18, 17 + x * 18));
              }
		  }
		  bindPlayerInventory(invPlayer);
	}
	

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return KKChest.isUseableByPlayer(entityplayer);
	}
	
	  protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
          for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 9; j++) {
                          addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                                          8 + j * 18, 84 + i * 18));
                  }
          }

          for (int i = 0; i < 9; i++) {
                  addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
          }
  }

	  @Override
      public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
              ItemStack stack = null;
              Slot slotObject = (Slot) inventorySlots.get(slot);

              //null checks and checks if the item can be stacked (maxStackSize > 1)
              if (slotObject != null && slotObject.getHasStack()) {
                      ItemStack stackInSlot = slotObject.getStack();
                      stack = stackInSlot.copy();

                      //merges the item into player inventory since its in the tileEntity
                      if (slot < 9) {
                              if (!this.mergeItemStack(stackInSlot, 0, 35, true)) {
                                      return null;
                              }
                      }
                      //places it into the tileEntity is possible since its in the player inventory
                      else if (!this.mergeItemStack(stackInSlot, 0, 9, false)) {
                              return null;
                      }

                      if (stackInSlot.stackSize == 0) {
                              slotObject.putStack(null);
                      } else {
                              slotObject.onSlotChanged();
                      }

                      if (stackInSlot.stackSize == stack.stackSize) {
                              return null;
                      }
                      slotObject.onPickupFromSlot(player, stackInSlot);
              }
              return stack;
	}
		
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
	}
	
}
