package wehavecookies56.kk.item.recipes;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import wehavecookies56.kk.api.synthesis.IRecipe;
import wehavecookies56.kk.api.synthesis.RecipeType;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.lib.LocalStrings;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAbaddonPlasmaRecipe extends ItemKingdomKeys implements IRecipe{

	public ItemAbaddonPlasmaRecipe() {
		super();
	}

	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add(StatCollector.translateToLocal(LocalStrings.Abbadonplasma));
	}
	
	public static final ResourceLocation texture = new ResourceLocation("kk", "textures/items/" + Strings.Abbadonplasma + ".png");

	@Override
	public void setType(RecipeType type) {
		type = RecipeType.ATTACK;
	}

	@Override
	public void setMaterials(ItemStack[] materials) {
		materials = new ItemStack[]{new ItemStack(AddedItems.Orichalcum, 2)};
	}

	@Override
	public void setResult(Item result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRecipe(Item recipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCost(int cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RecipeType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack[] getMaterials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getRecipe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
