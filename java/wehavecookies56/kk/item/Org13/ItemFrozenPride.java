package wehavecookies56.kk.item.org13;

import java.util.List;

import mods.battlegear2.api.weapons.IBattlegearWeapon;
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
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;

public class ItemFrozenPride extends ItemSword implements IBattlegearWeapon{
	protected final ToolMaterial material;
    public ItemFrozenPride(ToolMaterial abaddonPlasmaMaterial) {
        super(abaddonPlasmaMaterial);
        this.setCreativeTab(KingdomKeys.KHDAYSTAB);
        this.material = abaddonPlasmaMaterial;
    }
   
    @Override
    public boolean hasEffect(ItemStack par1ItemStack){
    	if(ConfigBooleans.enableShine == true){
        return true;
    	}
    	return false;
    }
    
	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) 
	{
		EntityPlayer player = (EntityPlayer) entity;

		if(player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FrozenPride)
		{
			if(player.isBlocking())
			{	
				player.setInWeb();
			}
			else
			{
				//player.capabilities.setPlayerWalkSpeed(0.1F);
			}
		}
    	super.onUpdate(item, world, entity, p_77663_4_, p_77663_5_);
    }
	
	public ToolMaterial getMaterial() {
		return this.material;
	}
    
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.UNCOMMON;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add("IV Vexen");
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
