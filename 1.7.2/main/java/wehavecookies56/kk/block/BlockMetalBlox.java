package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMetalBlox extends Block {

    public BlockMetalBlox() {
        super(Material.iron);
        this.setBlockName(Strings.MBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
    @Override
    protected boolean canSilkHarvest()
    {
            return true;
    }
}