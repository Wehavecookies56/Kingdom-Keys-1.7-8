package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRarePrizeBlox extends Block {

    public BlockRarePrizeBlox() {
        super(Material.rock);
        this.setBlockName(Strings.RPBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(0.5F);
        this.setResistance(0.0F);
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

    if(randomDrop<=5 && randomDrop>=0){
    d=AddedItems.Munny100;
    }else if(randomDrop<=10 && randomDrop>=6){
    d=AddedItems.Munny500;
    }else if(randomDrop<=15 && randomDrop>=11){
    d=AddedItems.Munny1000;
    }else if(randomDrop<=20 && randomDrop>=16){
    d=AddedItems.Munny2000;
    }else if(randomDrop<=22 && randomDrop>=21){
    d=AddedItems.OrichalcumPlus;
    }else if(randomDrop<=24 && randomDrop>=23){
    d=AddedItems.Orichalcum;
    }else if(randomDrop<=26 && randomDrop>=25){
    d=AddedItems.FrostShard;
    }else if(randomDrop<=29 && randomDrop>=28){
    d=AddedItems.LightningShard;
    }else if(randomDrop<=32 && randomDrop>=31){
    d=AddedItems.LucidShard;
    }else if(randomDrop<=35 && randomDrop>=34){
    d=AddedItems.BlazingShard;
    }else if(randomDrop<=37 && randomDrop>=36){
    d=AddedItems.DenseStone;
    }else if(randomDrop<=39 && randomDrop>=38){
    d=AddedItems.DenseGem;
    }else if(randomDrop<=41 && randomDrop>=40){
    d=AddedItems.TwilightGem;
    }else if(randomDrop<=43 && randomDrop>=42){
    d=AddedItems.BrightGem;
    }else if(randomDrop<=45 && randomDrop>=44){
    d=AddedItems.RemembranceShard;
    }else if(randomDrop<=47 && randomDrop>=46){
    d=AddedItems.RemembranceGem;
    }else if(randomDrop<=49 && randomDrop>=48){
    d=AddedItems.RemembranceStone;
    }else if(randomDrop<=51 && randomDrop>=50){
    d=AddedItems.DenseShard;
    }else if(randomDrop<=53 && randomDrop>=52){
    d=AddedItems.BrightShard;
    }else if(randomDrop<=55 && randomDrop>=54){
    d=AddedItems.MythrilStone;
    }else if(randomDrop<=57 && randomDrop>=56){
    d=AddedItems.MythrilGem;
    }else if(randomDrop<=59 && randomDrop>=58){
    d=AddedItems.MythrilShard;
    }else if(randomDrop<=61 && randomDrop>=60){
    d=AddedItems.BlazingGem;
    }else if(randomDrop<=63 && randomDrop>=62){
    d=AddedItems.FrostGem;
    }else if(randomDrop<=65 && randomDrop>=64){
    d=AddedItems.LightningGem;
    }else if(randomDrop<=67 && randomDrop>=66){
    d=AddedItems.EnergyShard;
    }else if(randomDrop<=69 && randomDrop>=68){
    d=AddedItems.PowerShard;
    }else if(randomDrop<=71 && randomDrop>=70){
    d=AddedItems.SerenityShard;
    }else if(randomDrop<=73 && randomDrop>=72){
    d=AddedItems.TranquilShard;
    }else if(randomDrop<=75 && randomDrop>=74){
    d=AddedItems.FrostShard;
    }else if(randomDrop<=77 && randomDrop>=76){
    d=AddedItems.DarkMatter;
    }else if(randomDrop<=79 && randomDrop>=78){
    d=AddedItems.ShinyCrystal;
    }else if(randomDrop<=81 && randomDrop>=80){
    d=AddedItems.SerenityStone;
    }else if(randomDrop<=83 && randomDrop>=82){
    d=AddedItems.DarkShard;
    }else if(randomDrop<=85 && randomDrop>=84){
    d=AddedItems.DarkGem;
    }else if(randomDrop<=87 && randomDrop>=86){
    d=AddedItems.LucidGem;
    }else if(randomDrop<=89 && randomDrop>=88){
    d=AddedItems.LightningCrystal;
    }else if(randomDrop<=91 && randomDrop>=90){
    d=AddedItems.LightningStone;
    }else if(randomDrop<=93 && randomDrop>=92){
    d=AddedItems.BlazingCrystal;
    }else if(randomDrop<=95 && randomDrop>=94){
    d=AddedItems.BlazingStone;
    }else if(randomDrop<=97 && randomDrop>=96){
    d=AddedItems.FrostCrystal;
    }else if(randomDrop<=100 && randomDrop>=98){
    d=AddedItems.PowerGem;
    }
    return d;
    }

	@Override
    public int quantityDropped(Random par1Random)
    {
		return 1;
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