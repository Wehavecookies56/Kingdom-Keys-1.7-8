package wehavecookies56.kk.item;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;

public class KeybladeAArmor extends ItemArmor{
    private String armorFile;
    private String name;
    
    public KeybladeAArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armorFile, String name) {
      super(par2EnumArmorMaterial, par3, par4);
      this.setCreativeTab(KingdomKeys.KKTAB);
      this.name = name;
      this.setUnlocalizedName(this.name);
    }
    
    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if(slot == 2)return "kk:textures/armor/KEYBLADEA_2.png";
		else return "kk:textures/armor/KEYBLADEA_1.png";
	}

    

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add("Aqua");
    }

}