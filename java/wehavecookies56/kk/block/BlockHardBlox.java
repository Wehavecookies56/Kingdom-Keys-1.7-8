package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import wehavecookies56.kk.lib.Strings;

public class BlockHardBlox extends Block {

    public BlockHardBlox() {
        super(Material.rock);
        this.setUnlocalizedName(Strings.HBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
    }
    
    @Override
    protected boolean canSilkHarvest()
    {
            return true;
    }
}
