package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
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
		Minecraft.getMinecraft().thePlayer.playSound("kk:kupo", 0.3F, 2.0F);
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