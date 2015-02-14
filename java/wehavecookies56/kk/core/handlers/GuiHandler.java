package wehavecookies56.kk.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.client.gui.GuiKKChest;
import wehavecookies56.kk.client.gui.GuiSynthesis;
import wehavecookies56.kk.container.ContainerKKChest;
import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;

public class GuiHandler implements IGuiHandler {
		
	public GuiHandler(){
		NetworkRegistry.INSTANCE.registerGuiHandler(KingdomKeys.instance, this);
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		switch (ID){
		case 0:
			if(te != null && te instanceof TileEntitySynthesis){
				return new ContainerSynthesis(player.inventory, (TileEntitySynthesis)te);
			}
		case 1:
			if(te != null && te instanceof TileEntityKKChest){
				return new ContainerKKChest(player.inventory, (TileEntityKKChest)te);
			}
			break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		switch(ID){
		case 0:
			if (te != null && te instanceof TileEntitySynthesis){
				return new GuiSynthesis(player.inventory, (TileEntitySynthesis)te);
			}
		case 1:
			if (te != null && te instanceof TileEntityKKChest){
				return new GuiKKChest(player.inventory, (TileEntityKKChest)te);
			}
			break;
		}
		return null;
	}

}
