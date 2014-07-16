package wehavecookies56.kk.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemPotion extends ItemFood{

    public ItemPotion(int food, float set, boolean wolf) {
        super(food, wolf);       
        this.setUnlocalizedName(Strings.Potion);
        this.setCreativeTab(KingdomKeys.KKTAB);
        this.setAlwaysEdible();
        this.setPotionEffect(Potion.heal.id, 1, 1, 1.0F);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}