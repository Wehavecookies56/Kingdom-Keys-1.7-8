package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
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
    
    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity){
        entity.motionY += 1.0;
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
    public void onFallenUpon(World par1World,int par2,int par3,int par4,Entity par5Entity,float par6)
    {
    par5Entity.fallDistance = 0.0F;
    }
}