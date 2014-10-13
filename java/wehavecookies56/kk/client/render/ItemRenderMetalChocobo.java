package wehavecookies56.kk.client.render;

import org.lwjgl.opengl.GL11;
import wehavecookies56.kk.client.model.ModelMasterKeeper;
import wehavecookies56.kk.client.model.ModelMetalChocobo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
	
public class ItemRenderMetalChocobo implements IItemRenderer {

    protected ModelMetalChocobo modelMetalChocobo;

    public ItemRenderMetalChocobo() {

    	modelMetalChocobo = new ModelMetalChocobo();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {

        switch(type){
            case EQUIPPED: return true;
            case EQUIPPED_FIRST_PERSON: return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch (type) {
         
            case EQUIPPED: {
                GL11.glPushMatrix();
                
                GL11.glTranslatef(0.6F, 0.4F, -0.05F);
                GL11.glRotatef(180F, 1, 0, 0);
                GL11.glRotatef(180F, 0, 1, 0);
                GL11.glRotatef(45F, 0, 0, 1);
                
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/MetalChocobo.png"));
                
                modelMetalChocobo.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }
            
            case EQUIPPED_FIRST_PERSON: {
                GL11.glPushMatrix();
                
                GL11.glTranslatef(0.6F, 0.4F, -0.05F);
                GL11.glRotatef(180F, 1, 0, 0);
                GL11.glRotatef(180F, 0, 1, 0);
                GL11.glRotatef(45F, 0, 0, 1);

                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/MetalChocobo.png"));
                
                modelMetalChocobo.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }
            default:
                break;
        }
    }
}