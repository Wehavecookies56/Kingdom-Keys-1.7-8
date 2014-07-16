package wehavecookies56.kk.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KeybladeTArmor extends ItemArmor{
    private String armorFile;
    private String name;
    
    public KeybladeTArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armorFile, String name) {
      super(par2EnumArmorMaterial, par3, par4);
      this.armorFile = armorFile;
      this.setCreativeTab(KingdomKeys.KKTAB);
      this.name = name;
      this.setUnlocalizedName(this.name);
    }
    
    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if(slot == 2)return "kk:textures/armor/KEYBLADET_2.png";
		else return "kk:textures/armor/KEYBLADET_1.png";
	}
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add("Terra");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconReg) {
      this.itemIcon = iconReg.registerIcon(Reference.MOD_ID + ":" + this.name);
    }
}