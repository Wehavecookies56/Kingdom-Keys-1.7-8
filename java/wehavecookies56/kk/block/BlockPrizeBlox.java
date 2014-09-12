package wehavecookies56.kk.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPrizeBlox extends Block {

    public BlockPrizeBlox() {
        super(Material.rock);
        this.setBlockName(Strings.PBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(0.5F);
        this.setResistance(0.0F);
    }

    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 5;
            return j1;
        }
        return 0;
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
    
    public Item d = null;
    
    @Override
    public Item getItemDropped(int i, Random r, int j) {
	int randomDrop;
    randomDrop = r.nextInt(99);

    if(randomDrop<=10 && randomDrop>=0){
    d=AddedItems.Munny1;
    }else if(randomDrop<=20 && randomDrop>=11){
    d=AddedItems.Munny5;
    }else if(randomDrop<=31 && randomDrop>=21){
    d=AddedItems.Munny10;
    }else if(randomDrop<=42 && randomDrop>=32){
    d=AddedItems.Munny20;
    }else if(randomDrop<=85 && randomDrop>=43){
    d=AddedItems.HP;
    }else if(randomDrop<=88 && randomDrop>=86){
    d=AddedItems.DarkShard;
    }else if(randomDrop<=91 && randomDrop>=89){
    d=AddedItems.FrostShard;
    }else if(randomDrop<=94 && randomDrop>=92){
    d=AddedItems.LightningShard;
    }else if(randomDrop<=97 && randomDrop>=95){
    d=AddedItems.LucidShard;
    }else if(randomDrop<=100 && randomDrop>=98){
    d=AddedItems.BlazingShard;
    }
    return d;
    }

	@Override
    public int quantityDropped(Random par1Random)
    {
		if(d==AddedItems.HP || d==AddedItems.Munny1 || d==AddedItems.Munny5 || d==AddedItems.Munny10 || d==AddedItems.Munny20){
		return 4 + par1Random.nextInt(2);
		}else{
		return 1;
		}
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