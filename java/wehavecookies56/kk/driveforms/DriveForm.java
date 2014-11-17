package wehavecookies56.kk.driveforms;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;

public class DriveForm {
	
	String name;
	int cost;
	Item unlockItem;
	boolean active = false;
	
	public DriveForm(String name, int cost, Item unlockItem) {
		this.name = name;
		this.cost = cost;
		this.unlockItem = unlockItem;
	}
	
	public boolean activate(EntityPlayer player){
		System.out.println("Trying to activate");
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);

		System.out.println("Drive Points: "+dp.getCurrDrivePoints());
		
		if(dp.getCurrDrivePoints() >= cost){
			System.out.println("Got da points");
			active = true;
			System.out.println("Cost: "+getCost());
			consumePoints(getCost(), player);
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
	
	public boolean consumePoints(int cost, EntityPlayer player){
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);
		if(EntityPropertyDrivePoints.get(player).getCurrDrivePoints() < cost)
		{
			return false;
		}
		System.out.println(EntityPropertyDrivePoints.get(player).getCurrDrivePoints());
		System.out.println(cost);
		dp.setCurrDrivePoints(EntityPropertyDrivePoints.get(player).getCurrDrivePoints() - cost);
		System.out.println(EntityPropertyDrivePoints.get(player).getCurrDrivePoints());
		//double cons = 0.1D;
		//double toCons = dp.getCurrDrivePoints() - cost;
		//if(dp.getCurrDrivePoints() - cost < 0){
		//	return false;
		//}else if(dp.getCurrDrivePoints() > toCons){
		//	dp.removeDrivePoints((int) cons--);
		//}
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
	
}
