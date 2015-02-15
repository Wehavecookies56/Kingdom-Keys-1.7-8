package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import wehavecookies56.kk.lib.Strings;

public class BlockNormalBlox extends Block {

    public BlockNormalBlox() {
        super(Material.rock);
        this.setUnlocalizedName(Strings.NBlox);
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