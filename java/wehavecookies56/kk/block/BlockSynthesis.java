package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.lib.Strings;

public class BlockSynthesis extends BlockContainer{

	protected Random rand = new Random();

	public BlockSynthesis()
	{
		super(Material.iron);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.setUnlocalizedName(Strings.Synthesiser);
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
		if(!world.isRemote){
			player.openGui(KingdomKeys.instance, 0, world, x, y, z);
		}
		if(world.isRemote){
			Minecraft.getMinecraft().thePlayer.playSound("kk:kupo", 0.3F, 1.1F);
		}
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

	@Override
	public void breakBlock(World world, int x, int y, int z, Block p_149749_5_, int p_149749_6_)
	{
		TileEntitySynthesis te = (TileEntitySynthesis)world.getTileEntity(x, y, z);

		if (te != null)
		{
			for (int i1 = 0; i1 < te.getSizeInventory(); ++i1)
			{
				ItemStack itemstack = te.getStackInSlot(i1);

				if (itemstack != null)
				{
					float f = this.rand.nextFloat() * 0.8F + 0.1F;
					float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
					float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

					while (itemstack.stackSize > 0)
					{
						int j1 = this.rand.nextInt(21) + 10;

						if (j1 > itemstack.stackSize)
						{
							j1 = itemstack.stackSize;
						}

						itemstack.stackSize -= j1;
						EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

						if (itemstack.hasTagCompound())
						{
							entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
						}

						float f3 = 0.05F;
						entityitem.motionX = (double)((float)this.rand.nextGaussian() * f3);
						entityitem.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
						entityitem.motionZ = (double)((float)this.rand.nextGaussian() * f3);
						world.spawnEntityInWorld(entityitem);
					}
				}
			}

			world.func_147453_f(x, y, z, p_149749_5_);
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