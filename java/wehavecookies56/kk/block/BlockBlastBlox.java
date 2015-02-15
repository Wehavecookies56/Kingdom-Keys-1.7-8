package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class BlockBlastBlox extends Block
{

    public BlockBlastBlox()
    {
        super(Material.tnt);
        this.setCreativeTab(KingdomKeys.KKTAB);
        this.setUnlocalizedName(Strings.BLBlox);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(World par1World, BlockPos pos, IBlockState state)
    {
        float f = 0.0625F;
        return AxisAlignedBB.fromBounds(pos.getX() + f, pos.getY(), pos.getZ() + f, (pos.getX() + 1) - f, (pos.getY() + 1) - f, (pos.getZ() + 1) - f);
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(World world, BlockPos pos)
    {
        float f = 0.0625F;
        return AxisAlignedBB.fromBounds(pos.getX() + f, pos.getY() + f, pos.getZ() + f, (pos.getX() + 1) - f, pos.getY() + 1, (pos.getZ() + 1) - f);
    }
    
    @Override
    public void onEntityCollidedWithBlock(World world, BlockPos pos, Entity ent)
    {
        if (ent instanceof EntityArrow && !world.isRemote)
        {
            EntityArrow entityarrow = (EntityArrow)ent;

            if (entityarrow.isBurning())
            {
                this.func_150114_a(world, pos.getX(), pos.getY(), pos.getZ(), 1, entityarrow.shootingEntity instanceof EntityLivingBase ? (EntityLivingBase)entityarrow.shootingEntity : null);
                world.setBlockToAir(pos);
            }
        }
    }
    
    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */

    @Override
    public void onBlockAdded(World par1World, BlockPos pos, IBlockState state)
    {
        super.onBlockAdded(par1World, pos, state);

        if (par1World.isBlockIndirectlyGettingPowered(pos) != 1)
        {
            this.onBlockDestroyedByPlayer(par1World, pos, state);
            par1World.setBlockToAir(pos);
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    
    @Override
    public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state,Block neighbourBlock)
    {
        if (world.isBlockIndirectlyGettingPowered(pos) != 1)
        {
            this.onBlockDestroyedByPlayer(world, pos, state);
            world.setBlockToAir(pos);
        }
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    /**
     * Called upon the block being destroyed by an explosion
     */
    @Override
    public void onBlockDestroyedByExplosion(World par1World, BlockPos pos, Explosion par5Explosion)
    {
        if (!par1World.isRemote)
        {
            EntityBlastBlox entitytntprimed = new EntityBlastBlox(par1World, (double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), par5Explosion.getExplosivePlacedBy());
            entitytntprimed.fuse = par1World.rand.nextInt(entitytntprimed.fuse / 4) + entitytntprimed.fuse / 8;
            par1World.spawnEntityInWorld(entitytntprimed);
        }
    }

    /**
     * Called right before the block is destroyed by a player.  Args: world, x, y, z, metaData
     */

    @Override
    public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state)
    {
        this.func_150114_a(world, pos.getX(), pos.getY(), pos.getZ(), state.getBlock().getMetaFromState(state), (EntityLivingBase)null);
    }

    public void func_150114_a(World p_150114_1_, int p_150114_2_, int p_150114_3_, int p_150114_4_, int p_150114_5_, EntityLivingBase p_150114_6_)
    {
        if (!p_150114_1_.isRemote)
        {
            if ((p_150114_5_ & 1) == 1)
            {
                EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(p_150114_1_, (double)((float)p_150114_2_ + 0.5F), (double)((float)p_150114_3_ + 0.5F), (double)((float)p_150114_4_ + 0.5F), p_150114_6_);
                p_150114_1_.spawnEntityInWorld(entitytntprimed);
                p_150114_1_.playSoundAtEntity(entitytntprimed, "game.tnt.primed", 1.0F, 1.0F);
            }
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem() == new ItemStack(Items.flint_and_steel))
        {
            this.func_150114_a(world, pos.getX(), pos.getY(), pos.getZ(), 1, player);
            world.setBlockToAir(pos);
            player.getCurrentEquippedItem().damageItem(1, player);
            return true;
        }
        else
        {
            return super.onBlockActivated(world, pos, state, player, side, hitX, hitY, hitZ);
        }
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    @Override
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {

    	if(player.getCurrentEquippedItem() == null){
    		this.func_150114_a(world, pos.getX(), pos.getY(), pos.getZ(), 1, player);
            world.setBlockToAir(pos);
    	}
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem() != new ItemStack(Items.feather))
        {
        	this.func_150114_a(world, pos.getX(), pos.getY(), pos.getZ(), 1, player);
            world.setBlockToAir(pos);
        }
    }
    

    /**
     * Return whether this block can drop from an explosion.
     */
    @Override
    public boolean canDropFromExplosion(Explosion par1Explosion)
    {
        return false;
    }

}