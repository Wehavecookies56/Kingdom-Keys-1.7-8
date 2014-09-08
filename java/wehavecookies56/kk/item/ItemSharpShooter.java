package wehavecookies56.kk.item;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

import mods.battlegear2.api.weapons.IBattlegearWeapon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.EntityEternalFlamesProjectile;
import wehavecookies56.kk.entities.EntitySharpshooterBullet;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSharpShooter extends ItemSword implements IBattlegearWeapon{
	protected final ToolMaterial material;
	public ItemSharpShooter(ToolMaterial abaddonPlasmaMaterial) {
		super(abaddonPlasmaMaterial);
		this.setCreativeTab(KingdomKeys.KHDAYSTAB);
		this.material = abaddonPlasmaMaterial;
	}
	private int timer = 0;
	
    @SideOnly(Side.CLIENT)
    @Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}

	public ToolMaterial getMaterial() {
		return this.material;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.epic;
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!player.isSneaking()){
    		Minecraft.getMinecraft().theWorld.playSoundAtEntity(player, "kk:sharpshooterbullet", 1, 1);

			if (!world.isRemote) {
				 for (int i = 0; i > 10; i+=1.0)
				 {
					 timer = i;
				 } 
				 if(timer > 9)
				 { 
					 timer = 0; 
					 world.spawnEntityInWorld(new EntitySharpshooterBullet(world, player));			
				 }
			}
		}
		else
		{
			player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
	        return stack;
		}
		
		
	return stack;
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("II Xigbar");
	}

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
