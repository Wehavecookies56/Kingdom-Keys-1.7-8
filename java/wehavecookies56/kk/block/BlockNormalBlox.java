package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNormalBlox extends Block {

    public BlockNormalBlox() {
        super(Material.rock);
        this.setBlockName(Strings.NBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(2.5F);
        this.setResistance(2.0F);
    }
    
    @Override
    protected boolean canSilkHarvest()
    {
            return true;
    }
    
}