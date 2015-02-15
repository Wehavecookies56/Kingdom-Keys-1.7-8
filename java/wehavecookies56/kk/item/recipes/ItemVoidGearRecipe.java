package wehavecookies56.kk.item.recipes;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.lib.LocalStrings;
import wehavecookies56.kk.lib.Strings;

public class ItemVoidGearRecipe extends ItemKingdomKeys{

	public ItemVoidGearRecipe() {
		super();
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add(StatCollector.translateToLocal(LocalStrings.Voidgear));
	}
	
	public static final ResourceLocation texture = new ResourceLocation("kk", "textures/items/" + Strings.Voidgear + ".png");

}
