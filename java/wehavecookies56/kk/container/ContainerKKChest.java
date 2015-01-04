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

	public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (p_82846_2_ < 3 * 9)
			{
				if (!this.mergeItemStack(itemstack1, 3 * 9, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(itemstack1, 0, 3 * 9, false))
			{
				return null;
			}

			if (itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack)null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}


	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
	}

}
