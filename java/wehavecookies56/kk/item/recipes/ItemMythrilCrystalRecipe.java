package wehavecookies56.kk.item.recipes;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.lib.LocalStrings;

public class ItemMythrilCrystalRecipe extends ItemKingdomKeys {

	public ItemMythrilCrystalRecipe() {
		super();
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add(StatCollector.translateToLocal(LocalStrings.MythrilCrystal));
	}
}
