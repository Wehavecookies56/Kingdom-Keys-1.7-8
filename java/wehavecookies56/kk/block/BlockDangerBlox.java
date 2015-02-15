package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class BlockDangerBlox extends Block {

    public BlockDangerBlox() {
        super(Material.rock);
        this.setUnlocalizedName(Strings.DBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(2.0F);
        this.setResistance(2.0F);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(World par1World, BlockPos pos, IBlockState state)
    {
        float f = 0.0625F;
        return AxisAlignedBB.fromBounds((double)((float)pos.getX() + f), (double)pos.getY(), (double)((float)pos.getZ() + f), (double)((float)(pos.getX() + 1) - f), (double)((float)(pos.getY() + 1) - f), (double)((float)(pos.getZ() + 1) - f));
    }
    
    @Override
    public void onBlockClicked(World par1World, BlockPos pos, EntityPlayer par5EntityPlayer) {
        par5EntityPlayer.attackEntityFrom(DamageSource.magic, 3);
    }

    
    @Override
    public void onEntityCollidedWithBlock(World par1World, BlockPos pos, Entity par5Entity)
    {
    	if(par5Entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) par5Entity;
			if (player.inventory.armorItemInSlot(0) != null)
			{
				ItemStack itemstack = player.inventory.armorItemInSlot(0);
			}
			else
			{
				par5Entity.attackEntityFrom(DamageSource.magic, 3);
			}
        }
    	else
    	{
    		par5Entity.attackEntityFrom(DamageSource.magic, 3);
    	}
    }
    
    @Override
    protected boolean canSilkHarvest()
    {
            return true;
    }
}