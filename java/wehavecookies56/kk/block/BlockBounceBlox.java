package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBounceBlox extends Block {

    public BlockBounceBlox() {
        super(Material.rock);
        this.setBlockName(Strings.BBlox);
        this.setStepSound(soundTypeMetal);
        this.setHardness(2.0F);
        this.setResistance(2.0F);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float f = 0.0625F;
        return AxisAlignedBB.getBoundingBox((double)((float)par2 + f), (double)par3, (double)((float)par4 + f), (double)((float)(par2 + 1) - f), (double)((float)(par3 + 1) - f), (double)((float)(par4 + 1) - f));
    }
        
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity)
  //public void onUpdate(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    	if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;
			double x = player.posX-1;
			double y = player.posY;
			double z = player.posZ-1;
			
			System.out.println(par1World.getBlock((int)x, (int)y, (int)z));
			//par1World.setBlockToAir((int)x, (int)y, (int)z);
			if (par1World.getBlock((int)x, (int)y, (int)z) == AddedBlocks.BounceBlox)
			{
				player.motionY += 1.0D;
				player.addChatMessage(new ChatComponentText("Jump?"));
				//Why doesen't this one work?
				System.out.println("Hop");
			}
        }
    	else
    	{
    		double x = entity.posX-1;
			double y = entity.posY;
			double z = entity.posZ-1;
			
			System.out.println(par1World.getBlock((int)x, (int)y, (int)z));
			if (par1World.getBlock((int)x, (int)y, (int)z) == AddedBlocks.BounceBlox)
			{
				entity.motionY+=1.0D;
			}
    	}
    }

   /*@Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity){
        entity.motionY += 1.0;
    }*/
    

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
    public void onFallenUpon(World par1World,int par2,int par3,int par4,Entity par5Entity,float par6)
    {
    	par5Entity.fallDistance = 0.0F;
    }
}