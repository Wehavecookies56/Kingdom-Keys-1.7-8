package wehavecookies56.kk.client.render;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelKeybladeOfPeoplesHearts;
import wehavecookies56.kk.client.model.ModelWoodenKeyblade;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class ItemRenderKeybladeOfPeoplesHearts implements IItemRenderer {

    protected ModelKeybladeOfPeoplesHearts model;

    public ItemRenderKeybladeOfPeoplesHearts() {

    	model = new ModelKeybladeOfPeoplesHearts();
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
         
            case EQUIPPED: 
            case EQUIPPED_FIRST_PERSON: {
                GL11.glPushMatrix();
                
                GL11.glTranslatef(0.6F, 0.4F, 0F);
                GL11.glRotatef(0F, 1, 0, 0);
                GL11.glRotatef(180F, 0, 1, 0);
                GL11.glRotatef(60F, 0, 0, 1);
                
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/KeybladeOfPeoplesHearts.png"));
                
                model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }

            default:
                break;
        }
    }

}
