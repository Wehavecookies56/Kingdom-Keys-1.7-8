package wehavecookies56.kk.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLucidOre extends Block {

    public BlockLucidOre() {
        super(Material.rock);
        this.setBlockName(Strings.LucidOre);
        this.setStepSound(soundTypeStone);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
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
    
    @Override
    public Item getItemDropped(int i, Random r, int j) {
    Item d = null;
	int randomDrop;
    randomDrop = r.nextInt(99);

    if(randomDrop<=25 && randomDrop>=0){
    d=AddedItems.LucidShard;
    }else if(randomDrop<=50 && randomDrop>=26){
    d=AddedItems.LucidStone;
    }else if(randomDrop<=75 && randomDrop>=51){
    d=AddedItems.LucidGem;
    }else if(randomDrop<=100 && randomDrop>=76){
    d=AddedItems.LucidCrystal;
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