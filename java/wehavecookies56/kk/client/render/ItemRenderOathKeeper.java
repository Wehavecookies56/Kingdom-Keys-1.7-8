package wehavecookies56.kk.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelOathKeeper;


@SideOnly(Side.CLIENT)
public class ItemRenderOathKeeper implements IItemRenderer {

    protected ModelOathKeeper model;

    public ItemRenderOathKeeper() {

        model = new ModelOathKeeper();
    }

    
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {

        switch(type){
            case EQUIPPED_FIRST_PERSON: return true;
            case EQUIPPED: return true; 
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
                
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/OathKeeper.png"));
                
                GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
                
                GL11.glTranslatef(0.0F, -0.4F, 0.0F);
                
                model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }

            default:
                break;
        }
    }
}
