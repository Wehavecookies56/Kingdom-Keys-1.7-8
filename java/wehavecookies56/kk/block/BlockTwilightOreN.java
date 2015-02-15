package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTwilightOreN extends Block {

    public BlockTwilightOreN() {
        super(Material.rock);
        this.setBlockName(Strings.TwilightOreN);
        this.setStepSound(soundTypeStone);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        if (this.getItemDropped(world.getBlockState(pos), rand, fortune) != Item.getItemFromBlock(this))
        {
            int j1;
                j1 = MathHelper.getRandomIntegerInRange(rand, 2, 4);
            return j1;
        }
        return 0;
    }
    
    @Override
    protected boolean canSilkHarvest()
    {
            return true;
    }
}