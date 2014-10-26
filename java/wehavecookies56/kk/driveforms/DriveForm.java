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
	
	public boolean consumePoints(int cost, EntityPlayer player){
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);
		if(dp.getCurrDrivePoints() < cost){return false;}
		System.out.println(dp.getCurrDrivePoints());
		System.out.println(cost);
		dp.removeDrivePoints(cost);
		System.out.println(dp.getCurrDrivePoints());
		//double cons = 0.1D;
		//double toCons = dp.getCurrDrivePoints() - cost;
		//if(dp.getCurrDrivePoints() - cost < 0){
		//	return false;
		//}else if(dp.getCurrDrivePoints() > toCons){
		//	dp.removeDrivePoints((int) cons--);
		//}
		return true;
		
	}
	
	public boolean isDriveFormActive(){
		
		return active;		
	}
	
	public boolean activate(EntityPlayer player){
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);

		if(dp.getCurrDrivePoints() >= cost){
			System.out.println("Got da points");
			active = true;
			consumePoints(getCost(), player);
			onActivateForm(player);
			return true;
		}else{
			active = false;
			return false;
		}
	}
	
	public void onActivateForm(EntityPlayer player){
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
