package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import wehavecookies56.kk.lib.Strings;

public class BlockDarkOreN extends Block {

	public BlockDarkOreN() {
        super(Material.rock);
        this.setUnlocalizedName(Strings.DarkOreN);
        this.setStepSound(soundTypeStone);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
    }
    
    @Override
    protected boolean canSilkHarvest()
    {
            return true;
    }

}