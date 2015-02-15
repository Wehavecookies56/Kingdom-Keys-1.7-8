package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Strings;

public class BlockBlazingOre extends Block {

    public BlockBlazingOre() {
        super(Material.rock);
        this.setUnlocalizedName(Strings.BlazingOre);
        this.setStepSound(soundTypeStone);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 1);
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
    
    @Override
    public Item getItemDropped(IBlockState state, Random r, int fortune) {
    Item d = null;
	int randomDrop;
    randomDrop = r.nextInt(99);

    if(randomDrop<=25 && randomDrop>=0){
    d=AddedItems.BlazingShard;
    }else if(randomDrop<=50 && randomDrop>=26){
    d=AddedItems.BlazingStone;
    }else if(randomDrop<=75 && randomDrop>=51){
    d=AddedItems.BlazingGem;
    }else if(randomDrop<=100 && randomDrop>=76){
    d=AddedItems.BlazingCrystal;
    }
    return d;
    }

	@Override
    public int quantityDropped(Random par1Random)
    {
		return 1 + par1Random.nextInt(2);
    }
	
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0)
        {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return quantityDropped(random) * (j + 1);
        }
        else
        {
            return quantityDropped(random);
        }
    }

}