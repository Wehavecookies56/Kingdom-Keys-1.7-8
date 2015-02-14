package wehavecookies56.kk.entities.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.common.util.Constants;
import wehavecookies56.kk.item.AddedItems;

public class TileEntitySynthesis extends TileEntity implements IInventory {

	private ItemStack[] items;
	
	public TileEntitySynthesis(){
		items = new ItemStack[1];
	}
	
	@Override
	public int getSizeInventory() {
		return items.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return items[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int count) {
		ItemStack itemstack = getStackInSlot(i);
		if(itemstack != null){
			if(itemstack.stackSize <= count){
				setInventorySlotContents(i, null);
			}else{
				itemstack = itemstack.splitStack(count);
				markDirty();
			}
		}
		ItemStack type = itemstack;
		return itemstack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		ItemStack item = getStackInSlot(i);
		setInventorySlotContents(i, item);
		return item;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		items[i] = itemstack;
		if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()){
			itemstack.stackSize = getInventoryStackLimit();
		}
		markDirty();
	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return entityplayer.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack stack) {

		if(stack.getItem() == AddedItems.K1r){
			return stack.getItem() == AddedItems.K1r;
		}else if(stack.getItem() == AddedItems.K111r){
			return stack.getItem() == AddedItems.K111r;
		}else if(stack.getItem() == AddedItems.K2r){
			return stack.getItem() == AddedItems.K2r;
		}else if(stack.getItem() == AddedItems.K3r){
			return stack.getItem() == AddedItems.K3r;
		}else if(stack.getItem() == AddedItems.K4r){
			return stack.getItem() == AddedItems.K4r;
		}else if(stack.getItem() == AddedItems.K5r){
			return stack.getItem() == AddedItems.K5r;
		}else if(stack.getItem() == AddedItems.K6r){
			return stack.getItem() == AddedItems.K6r;
		}else if(stack.getItem() == AddedItems.K7r){
			return stack.getItem() == AddedItems.K7r;
		}else if(stack.getItem() == AddedItems.K8r){
			return stack.getItem() == AddedItems.K8r;
		}else if(stack.getItem() == AddedItems.K9r){
			return stack.getItem() == AddedItems.K9r;
		}else if(stack.getItem() == AddedItems.K10r){
			return stack.getItem() == AddedItems.K10r;
		}else if(stack.getItem() == AddedItems.K11r){
			return stack.getItem() == AddedItems.K11r;
		}else if(stack.getItem() == AddedItems.K12r){
			return stack.getItem() == AddedItems.K12r;
		}else if(stack.getItem() == AddedItems.K13r){
			return stack.getItem() == AddedItems.K13r;
		}else if(stack.getItem() == AddedItems.K14r){
			return stack.getItem() == AddedItems.K14r;
		}else if(stack.getItem() == AddedItems.K15r){
			return stack.getItem() == AddedItems.K15r;
		}else if(stack.getItem() == AddedItems.K16r){
			return stack.getItem() == AddedItems.K16r;
		}else if(stack.getItem() == AddedItems.K17r){
			return stack.getItem() == AddedItems.K17r;
		}else if(stack.getItem() == AddedItems.K18r){
			return stack.getItem() == AddedItems.K18r;
		}else if(stack.getItem() == AddedItems.K19r){
			return stack.getItem() == AddedItems.K19r;
		}else if(stack.getItem() == AddedItems.K20r){
			return stack.getItem() == AddedItems.K20r;
		}else if(stack.getItem() == AddedItems.K21r){
			return stack.getItem() == AddedItems.K21r;
		}else if(stack.getItem() == AddedItems.K22r){
			return stack.getItem() == AddedItems.K22r;
		}else if(stack.getItem() == AddedItems.K23r){
			return stack.getItem() == AddedItems.K23r;
		}else if(stack.getItem() == AddedItems.K24r){
			return stack.getItem() == AddedItems.K24r;
		}else if(stack.getItem() == AddedItems.K25r){
			return stack.getItem() == AddedItems.K25r;
		}else if(stack.getItem() == AddedItems.K26r){
			return stack.getItem() == AddedItems.K26r;
		}else if(stack.getItem() == AddedItems.K27r){
			return stack.getItem() == AddedItems.K27r;
		}else if(stack.getItem() == AddedItems.K28r){
			return stack.getItem() == AddedItems.K28r;
		}else if(stack.getItem() == AddedItems.K29r){
			return stack.getItem() == AddedItems.K29r;
		}else if(stack.getItem() == AddedItems.K30r){
			return stack.getItem() == AddedItems.K30r;
		}else if(stack.getItem() == AddedItems.K31r){
			return stack.getItem() == AddedItems.K31r;
		}else if(stack.getItem() == AddedItems.K32r){
			return stack.getItem() == AddedItems.K32r;
		}else if(stack.getItem() == AddedItems.K33r){
			return stack.getItem() == AddedItems.K33r;
		}else if(stack.getItem() == AddedItems.K34r){
			return stack.getItem() == AddedItems.K34r;
		}else if(stack.getItem() == AddedItems.K35r){
			return stack.getItem() == AddedItems.K35r;
		}else if(stack.getItem() == AddedItems.K36r){
			return stack.getItem() == AddedItems.K36r;
		}else if(stack.getItem() == AddedItems.K37r){
			return stack.getItem() == AddedItems.K37r;
		}else if(stack.getItem() == AddedItems.K38r){
			return stack.getItem() == AddedItems.K38r;
		}else if(stack.getItem() == AddedItems.K39r){
			return stack.getItem() == AddedItems.K39r;
		}else if(stack.getItem() == AddedItems.K40r){
			return stack.getItem() == AddedItems.K40r;
		}else if(stack.getItem() == AddedItems.K41r){
			return stack.getItem() == AddedItems.K41r;
		}else if(stack.getItem() == AddedItems.K42r){
			return stack.getItem() == AddedItems.K42r;
		}else if(stack.getItem() == AddedItems.K43r){
			return stack.getItem() == AddedItems.K43r;
		}else if(stack.getItem() == AddedItems.K44r){
			return stack.getItem() == AddedItems.K44r;
		}else if(stack.getItem() == AddedItems.K45r){
			return stack.getItem() == AddedItems.K45r;
		}else if(stack.getItem() == AddedItems.K46r){
			return stack.getItem() == AddedItems.K46r;
		}else if(stack.getItem() == AddedItems.K47r){
			return stack.getItem() == AddedItems.K47r;
		}else if(stack.getItem() == AddedItems.K48r){
			return stack.getItem() == AddedItems.K48r;
		}else if(stack.getItem() == AddedItems.K49r){
			return stack.getItem() == AddedItems.K49r;
		}else if(stack.getItem() == AddedItems.K50r){
			return stack.getItem() == AddedItems.K50r;
		}else if(stack.getItem() == AddedItems.K51r){
			return stack.getItem() == AddedItems.K51r;
		}else if(stack.getItem() == AddedItems.K52r){
			return stack.getItem() == AddedItems.K52r;
		}else if(stack.getItem() == AddedItems.K53r){
			return stack.getItem() == AddedItems.K53r;
		}else if(stack.getItem() == AddedItems.K54r){
			return stack.getItem() == AddedItems.K54r;
		}else if(stack.getItem() == AddedItems.K55r){
			return stack.getItem() == AddedItems.K55r;
		}else if(stack.getItem() == AddedItems.K56r){
			return stack.getItem() == AddedItems.K56r;
		}else if(stack.getItem() == AddedItems.K57r){
			return stack.getItem() == AddedItems.K57r;
		}else if(stack.getItem() == AddedItems.K58r){
			return stack.getItem() == AddedItems.K58r;
		}else if(stack.getItem() == AddedItems.K59r){
			return stack.getItem() == AddedItems.K59r;
		}else if(stack.getItem() == AddedItems.K60r){
			return stack.getItem() == AddedItems.K60r;
		}else if(stack.getItem() == AddedItems.K61r){
			return stack.getItem() == AddedItems.K61r;
		}else if(stack.getItem() == AddedItems.K62r){
			return stack.getItem() == AddedItems.K62r;
		}else if(stack.getItem() == AddedItems.K63r){
			return stack.getItem() == AddedItems.K63r;
		}else if(stack.getItem() == AddedItems.K64r){
			return stack.getItem() == AddedItems.K64r;
		}else if(stack.getItem() == AddedItems.K65r){
			return stack.getItem() == AddedItems.K65r;
		}else if(stack.getItem() == AddedItems.K66r){
			return stack.getItem() == AddedItems.K66r;
		}else if(stack.getItem() == AddedItems.K67r){
			return stack.getItem() == AddedItems.K67r;
		}else if(stack.getItem() == AddedItems.K68r){
			return stack.getItem() == AddedItems.K68r;
		}else if(stack.getItem() == AddedItems.K69r){
			return stack.getItem() == AddedItems.K69r;
		}else if(stack.getItem() == AddedItems.K70r){
			return stack.getItem() == AddedItems.K70r;
		}else if(stack.getItem() == AddedItems.K71r){
			return stack.getItem() == AddedItems.K71r;
		}else if(stack.getItem() == AddedItems.K72r){
			return stack.getItem() == AddedItems.K72r;
		}else if(stack.getItem() == AddedItems.K73r){
			return stack.getItem() == AddedItems.K73r;
		}else if(stack.getItem() == AddedItems.K74r){
			return stack.getItem() == AddedItems.K74r;
		}else if(stack.getItem() == AddedItems.K75r){
			return stack.getItem() == AddedItems.K75r;
		}else if(stack.getItem() == AddedItems.K76r){
			return stack.getItem() == AddedItems.K76r;
		}else if(stack.getItem() == AddedItems.K77r){
			return stack.getItem() == AddedItems.K77r;
		}else if(stack.getItem() == AddedItems.K78r){
			return stack.getItem() == AddedItems.K78r;
		}else if(stack.getItem() == AddedItems.K79r){
			return stack.getItem() == AddedItems.K79r;
		}else if(stack.getItem() == AddedItems.K80r){
			return stack.getItem() == AddedItems.K80r;
		}else if(stack.getItem() == AddedItems.K81r){
			return stack.getItem() == AddedItems.K81r;
		}else if(stack.getItem() == AddedItems.K82r){
			return stack.getItem() == AddedItems.K82r;
		}else if(stack.getItem() == AddedItems.K83r){
			return stack.getItem() == AddedItems.K83r;
		}else if(stack.getItem() == AddedItems.K84r){
			return stack.getItem() == AddedItems.K84r;
		}else if(stack.getItem() == AddedItems.K85r){
			return stack.getItem() == AddedItems.K85r;
		}else if(stack.getItem() == AddedItems.K86r){
			return stack.getItem() == AddedItems.K86r;
		}else if(stack.getItem() == AddedItems.K87r){
			return stack.getItem() == AddedItems.K87r;
		}else if(stack.getItem() == AddedItems.K88r){
			return stack.getItem() == AddedItems.K88r;
		}else if(stack.getItem() == AddedItems.K89r){
			return stack.getItem() == AddedItems.K89r;
		}else if(stack.getItem() == AddedItems.K90r){
			return stack.getItem() == AddedItems.K90r;
		}else if(stack.getItem() == AddedItems.K91r){
			return stack.getItem() == AddedItems.K91r;
		}else if(stack.getItem() == AddedItems.K92r){
			return stack.getItem() == AddedItems.K92r;
		}else if(stack.getItem() == AddedItems.K93r){
			return stack.getItem() == AddedItems.K93r;
		}else if(stack.getItem() == AddedItems.K94r){
			return stack.getItem() == AddedItems.K94r;
		}else if(stack.getItem() == AddedItems.K95r){
			return stack.getItem() == AddedItems.K95r;
		}else if(stack.getItem() == AddedItems.K96r){
			return stack.getItem() == AddedItems.K96r;
		}else if(stack.getItem() == AddedItems.K97r){
			return stack.getItem() == AddedItems.K97r;
		}else if(stack.getItem() == AddedItems.K98r){
			return stack.getItem() == AddedItems.K98r;
		}else if(stack.getItem() == AddedItems.K99r){
			return stack.getItem() == AddedItems.K99r;
		}else if(stack.getItem() == AddedItems.K100r){
			return stack.getItem() == AddedItems.K100r;
		}else if(stack.getItem() == AddedItems.K101r){
			return stack.getItem() == AddedItems.K101r;
		}else if(stack.getItem() == AddedItems.K102r){
			return stack.getItem() == AddedItems.K102r;
		}else if(stack.getItem() == AddedItems.K103r){
			return stack.getItem() == AddedItems.K103r;
		}else if(stack.getItem() == AddedItems.K104r){
			return stack.getItem() == AddedItems.K104r;
		}else if(stack.getItem() == AddedItems.K105r){
			return stack.getItem() == AddedItems.K105r;
		}else if(stack.getItem() == AddedItems.K106r){
			return stack.getItem() == AddedItems.K106r;
		}else if(stack.getItem() == AddedItems.K107r){
			return stack.getItem() == AddedItems.K107r;
		}else if(stack.getItem() == AddedItems.K108r){
			return stack.getItem() == AddedItems.K108r;
		}else if(stack.getItem() == AddedItems.K109r){
			return stack.getItem() == AddedItems.K109r;
		}else if(stack.getItem() == AddedItems.K110r){
			return stack.getItem() == AddedItems.K110r;
		}else if(stack.getItem() == AddedItems.K111r){
			return stack.getItem() == AddedItems.K111r;
		}else if(stack.getItem() == AddedItems.K112r){
			return stack.getItem() == AddedItems.K112r;
		}else if(stack.getItem() == AddedItems.K113r){
			return stack.getItem() == AddedItems.K113r;
		}else if(stack.getItem() == AddedItems.K114r){
			return stack.getItem() == AddedItems.K114r;
		}else{
			return false;
		}

	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		
		NBTTagList items = new NBTTagList();
		
		for(int i = 0; i< getSizeInventory(); i++){
			ItemStack stack = getStackInSlot(i);
			if(stack != null){
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", (byte)i);
				stack.writeToNBT(item);
				items.appendTag(item);
			}
		}
		compound.setTag("Items", items);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
		NBTTagList items = compound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		for(int i = 0; i < items.tagCount(); i++){
			NBTTagCompound item = (NBTTagCompound)items.getCompoundTagAt(i);
			int slot = item.getByte("Slot");
			if(slot >= 0 && slot < getSizeInventory()){
				setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(item));
			}
		}
	}
	
	public Packet getDescriptionPacket() {
        NBTTagCompound nbtTag = new NBTTagCompound();
        this.writeToNBT(nbtTag);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 7, nbtTag);
}

	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
        readFromNBT(packet.func_148857_g());
}
	
	
	
	private Item item;

	public Item getItem() {
		if (item == null) {
			getItemInTE();
		}
		
		return item;
	}
	
	private void getItemInTE() {
		Item item;
		for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack stack = getStackInSlot(i);
			if (stack != null && isItemValidForSlot(i, stack)) {
				item = stack.getItem();
			}
		}	
	}
	
	@Override
	public void markDirty() {
		super.markDirty();
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		
	}

	@Override
	public String getName() {
		return "Synthesis";
	}

	@Override
	public boolean hasCustomName() {
		return true;
	}

	@Override
	public void openInventory(EntityPlayer player) {
		
	}

	@Override
	public IChatComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getField(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFieldCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
