package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import wehavecookies56.kk.lib.Strings;

public class BlockMetalBlox extends Block {

    public BlockMetalBlox() {
        super(Material.iron);
        this.setUnlocalizedName(Strings.MBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
    }

    @Override
    protected boolean canSilkHarvest()
    {
            return true;
    }
}