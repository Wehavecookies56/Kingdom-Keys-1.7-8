package wehavecookies56.kk.block;

import java.util.Random;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockKKChest extends BlockContainer 
{
    public BlockKKChest() {

    super(Material.rock);
    this.setBlockName(Strings.KKChest);
    this.setStepSound(soundTypeStone);
    this.setHardness(25.0F);
    this.setResistance(5.0F);
    this.setHarvestLevel("pickaxe", 1);
    }
	
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
	{
		player.openGui(KingdomKeys.instance, 0, world, x, y, z);
		return true;
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
	public TileEntity createNewTileEntity(World world, int i) 
	{
		return new TileEntityKKChest();
	}

}