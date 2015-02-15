package wehavecookies56.kk.item.keyblades;

import java.util.List;

import mods.battlegear2.api.weapons.IBattlegearWeapon;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.ConfigBooleans;

public class ItemKingdomKey extends ItemSword implements IBattlegearWeapon{
	public static boolean keyPressed = false;
	public static boolean keyHasBeenPressed = false;
	public ItemKingdomKey(ToolMaterial kingdomkey36) {
		super(kingdomkey36);
		this.setCreativeTab(KingdomKeys.KHTAB);
	}
	
	@Override
	public boolean hasEffect(ItemStack par1ItemStack){
		if(ConfigBooleans.enableShine == true){
			return true;
		}
		return false;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.EPIC;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("Kingdom Hearts");
	}

	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		if(itemstack.isItemEnchanted() == false)
		{
			itemstack.addEnchantment(KingdomKeys.HarvestHearts, 1);
		}
    	EntityPlayer player = (EntityPlayer)par3Entity;
    	if (this.keyPressed)
    	{
    		Minecraft.getMinecraft().theWorld.playSoundAtEntity(player, "kk:summon", 1, 0);
    		this.keyPressed = false;
    	}
	}

	/*public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) 
	{
		// TODO Auto-generated method stub
		if(par3World.getBlock(par4, par5, par6) == Blocks.iron_door)
		{

		int id = par3World.getBlockMetadata(par4, par5, par6);

		     int j1 = 10 & 7;
		     j1 ^= 4;
		         switch(id){
		         case 0:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 2, 2);
		         break;
		         case 1:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 1, 2);
		         break;
		         case 2:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1, 2);
		         break;
		         case 3:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 1, 2);
		         break;
		         case 4:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 10, 2);
		         break;
		         case 5:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 11, 2);
		         break;
		         case 6:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 4, 2);
		         break;
		         case 7:
		         par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 3, 2);
		         break;
		         }
		         par3World.markBlockRangeForRenderUpdate(par4, par5, par6, par4, par5, par6);
			}
			return true;
		}*/

	@Override
	public boolean sheatheOnBack(ItemStack item) {
		return true;
	}
	@Override
	public boolean isOffhandHandDual(ItemStack off) {
		return true;
	}
	@Override
	public boolean offhandClickAir(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public boolean offhandClickBlock(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public void performPassiveEffects(Side effectiveSide,
			ItemStack mainhandItem, ItemStack offhandItem) {
	}
	@Override
	public boolean allowOffhand(ItemStack mainhand, ItemStack offhand) {
		return true;
	}
	@Override
	public boolean offhandAttackEntity(
			mods.battlegear2.api.PlayerEventChild.OffhandAttackEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return false;
	}

	
}
