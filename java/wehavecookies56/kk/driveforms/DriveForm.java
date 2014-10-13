package wehavecookies56.kk.driveforms;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyDrivePoints;

public class DriveForm {
	
	String name;
	int cost;
	Item unlockItem;
	
	public DriveForm(String name, int cost, Item unlockItem) {
		this.name = name;
		this.cost = cost;
		this.unlockItem = unlockItem;
	}
	
	public boolean consumePoints(int cost, EntityPlayer player){
		EntityPropertyDrivePoints dp = EntityPropertyDrivePoints.get(player);
		if(dp.getCurrDrivePoints() < cost){return false;}
		double cons = 0.1D;
		double toCons = dp.getCurrDrivePoints() - cost;
		if(dp.getCurrDrivePoints() - cost <= 0){
			dp.setCurrDrivePoints(0);
		}else if(dp.getCurrDrivePoints() > toCons){
			dp.setCurrDrivePoints((int) cons--);
		}
		return true;
		
	}

	public void setArmourRender(){
		//TODO Make armour rendering
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
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
