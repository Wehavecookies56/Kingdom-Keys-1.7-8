package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDangerBlox extends Block {

    public BlockDangerBlox() {
        super(Material.rock);
        this.setBlockName(Strings.DBlox);
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
    
    @Override
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
        par5EntityPlayer.attackEntityFrom(DamageSource.magic, 3);
    }
    
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    	if(par5Entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) par5Entity;
			if (player.inventory.armorItemInSlot(0) != null)
			{
				ItemStack itemstack = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(0);
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
}