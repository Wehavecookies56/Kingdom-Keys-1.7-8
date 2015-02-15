package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import wehavecookies56.kk.lib.Strings;

public class BlockBounceBlox extends Block {

    public BlockBounceBlox() {
        super(Material.rock);
        this.setUnlocalizedName(Strings.BBlox);
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
        
   /* public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity)
    {
    	if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;
			double x = player.posX-1;
			double y = player.posY;
			double z = player.posZ-1;
			
			//System.out.println(par1World.getBlock((int)x, (int)y, (int)z));
			//par1World.setBlockToAir((int)x, (int)y, (int)z);
			if (par1World.getBlock((int)x, (int)y, (int)z) == AddedBlocks.BounceBlox)
			{
				player.motionY += 1.0D;
				//player.addChatMessage(new ChatComponentText("Jump?"));
				//Why doesen't this one work?
				System.out.println("Hop");
			}
        }
    	else
    	{
    		double x = entity.posX-1;
			double y = entity.posY;
			double z = entity.posZ-1;
			
			if (par1World.getBlock((int)x, (int)y, (int)z) == AddedBlocks.BounceBlox)
			{
				entity.motionY+=1.0D;
			}
    	}
    }*/
    
    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
    	entityIn.motionY += 1.0;
    	super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
    }
        
    @Override
    protected boolean canSilkHarvest()
    {
    	return true;
    }
    
    @Override
    public void onFallenUpon(World par1World, BlockPos pos, Entity par5Entity,float par6)
    {
    	par5Entity.fallDistance = 0.0F;
    }
}