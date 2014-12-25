package wehavecookies56.kk.driveforms;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;
import wehavecookies56.kk.core.packet.DriveActivatePacket;
import wehavecookies56.kk.core.packet.IPacket;

public class DriveForm {
	
	String name;
	int cost;
	Item unlockItem;
	boolean active = false;
	static int actualForm;
	public DriveForm(String name, int cost, Item unlockItem) {
		this.name = name;
		this.cost = cost;
		this.unlockItem = unlockItem;
	}
	
	public boolean activate(EntityPlayer player, int state){
		System.out.println("Trying to activate");
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);

		System.out.println("Drive Points: "+dp.getCurrDrivePoints());
		
		if(dp.getCurrDrivePoints() >= cost){
			System.out.println("Got da points");
			active = true;
			System.out.println("Cost: "+getCost());
			consumePoints(getCost(), player, state);
			actualForm = state;
			System.out.println("ActualForm: "+actualForm);

			onActivateForm(player);
			return true;
		}
		
		else
		{
			System.out.println("Not activating");
			active = false;
			return false;
		}
		

	}
	
	public boolean consumePoints(int cost, EntityPlayer player, int state){
		IPacket packet = new DriveActivatePacket(cost, state);
		KingdomKeys.network.sendToServer(packet);
		return true;
		
	}
	
	public boolean isDriveFormActive()
	{	
		return active;		
	}
	
	public void onActivateForm(EntityPlayer player)
	{
		onDeactivateForm();	
	}
	
	public void onDeactivateForm(){
		active = false;
	}

	public void setArmourRender(){
		//TODO Make armour rendering
	}
	
	public String getUnlocalizedName() {
		return "drive." + name;
	}

	public void setUnlocalizedName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Item getUnlockItem() {
		return unlockItem;
	}

	public void setUnlockItem(Item unlockItem) {
		this.unlockItem = unlockItem;
	}
	
/*	public static int getActiveForm()
	{
		return actualForm;
	}*/
}
