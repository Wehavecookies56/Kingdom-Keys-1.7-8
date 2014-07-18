package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSynthesis extends BlockContainer{

	public BlockSynthesis()
	{
		super(Material.iron);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.setBlockName(Strings.Synthesiser);
		this.setResistance(0.5F);
		this.setHardness(1.5F);
	}

	@SideOnly(Side.CLIENT)
    private IIcon synthIconTop;
    @SideOnly(Side.CLIENT)
    private IIcon synthIconFront;

    @Override
    public IIcon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.synthIconTop : (par1 == 0 ? this.synthIconTop : (par1 != par2 ? this.blockIcon : this.synthIconFront));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("kk:synth_side");
        this.synthIconFront = par1IconRegister.registerIcon("kk:synth_front");
        this.synthIconTop = par1IconRegister.registerIcon("kk:synth_top");
    }


	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
	{
		player.openGui(KingdomKeys.instance, 0, world, x, y, z);
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntitySynthesis();
	}
	
	@Override
    public int quantityDropped(Random par1Random)
    {
		return 1;
    }

	/*
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int meta){
				TileEntitySynthesis synthesis = new TileEntitySynthesis();
				Item item = synthesis.getStackInSlot(0).getItem();
				System.out.println(item);
				if(item != null){
					float spawnX = x + world.rand.nextFloat();
					float spawnY = y + world.rand.nextFloat();
					float spawnZ = z + world.rand.nextFloat();
					EntityItem droppedItem = new EntityItem(world, spawnX, spawnY, spawnZ, new ItemStack(item));
					float mult = 0.05F;
					droppedItem.motionX = -0.5F + world.rand.nextFloat() * mult;
					droppedItem.motionY = 4 + world.rand.nextFloat() * mult;
					droppedItem.motionZ = -0.5F + world.rand.nextFloat() * mult;
				}
		super.breakBlock(world, x, y, z, block, meta);
	}

	*/
}