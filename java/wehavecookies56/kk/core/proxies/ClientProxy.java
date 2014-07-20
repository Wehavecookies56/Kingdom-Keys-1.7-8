package wehavecookies56.kk.core.proxies;

import net.minecraftforge.client.MinecraftForgeClient;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.client.render.BlockRenderBlastBlox;
import wehavecookies56.kk.client.render.EntityRenderEternalFlames;
import wehavecookies56.kk.client.render.EntityRenderEternalFlamesProjectile;
import wehavecookies56.kk.client.render.ItemRenderBookOfRetribution;
import wehavecookies56.kk.client.render.ItemRenderEarthShaker;
import wehavecookies56.kk.client.render.ItemRenderEternalFlames;
import wehavecookies56.kk.client.render.ItemRenderFenrir;
import wehavecookies56.kk.client.render.ItemRenderInterdiction;
import wehavecookies56.kk.client.render.ItemRenderKingdomKey;
import wehavecookies56.kk.client.render.ItemRenderKingdomKeyD;
import wehavecookies56.kk.client.render.ItemRenderLunarEclipse;
import wehavecookies56.kk.client.render.ItemRenderOathKeeper;
import wehavecookies56.kk.client.render.ItemRenderOblivion;
import wehavecookies56.kk.client.render.ItemRenderRainFell;
import wehavecookies56.kk.client.render.ItemRenderRumblingRose;
import wehavecookies56.kk.client.render.ItemRenderSkysplitter;
import wehavecookies56.kk.client.render.ItemRenderSoulEater;
import wehavecookies56.kk.client.render.ItemRenderStarLight;
import wehavecookies56.kk.client.render.ItemRenderTotalEclipse;
import wehavecookies56.kk.client.render.ItemRenderWaywardWind;
import wehavecookies56.kk.client.render.ItemRenderZeroOne;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.entities.EntityEternalFlames;
import wehavecookies56.kk.entities.EntityEternalFlamesProjectile;
import wehavecookies56.kk.item.AddedItems;

import com.jadarstudios.developercapes.DevCapes;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
//import com.jadarstudios.developercapes.DevCapesUtil;


public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		//3D Model renders
		MinecraftForgeClient.registerItemRenderer(AddedItems.K111, new ItemRenderKingdomKey());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K112, new ItemRenderOathKeeper());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K113, new ItemRenderKingdomKeyD());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K114, new ItemRenderOblivion());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K110, new ItemRenderWaywardWind());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K109, new ItemRenderEarthShaker());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K108, new ItemRenderRainFell());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K107, new ItemRenderStarLight());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K106, new ItemRenderSoulEater());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K50, new ItemRenderLunarEclipse());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K52, new ItemRenderTotalEclipse());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K69, new ItemRenderFenrir());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K41, new ItemRenderZeroOne());
		MinecraftForgeClient.registerItemRenderer(AddedItems.K82, new ItemRenderRumblingRose());
		MinecraftForgeClient.registerItemRenderer(AddedItems.BookOfRetribution, new ItemRenderBookOfRetribution());
		MinecraftForgeClient.registerItemRenderer(AddedItems.Interdiction, new ItemRenderInterdiction());
		MinecraftForgeClient.registerItemRenderer(AddedItems.EternalFlames, new ItemRenderEternalFlames());
		MinecraftForgeClient.registerItemRenderer(AddedItems.SkySplitter, new ItemRenderSkysplitter());

		//Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityEternalFlames.class, new EntityRenderEternalFlames());

		RenderingRegistry.registerEntityRenderingHandler(EntityBlastBlox.class, new BlockRenderBlastBlox());
		RenderingRegistry.registerEntityRenderingHandler(EntityEternalFlamesProjectile.class, new EntityRenderEternalFlamesProjectile(AddedItems.EternalFlames));
		// EntityRegistry.registerGlobalEntityID(EntityRedNocturne.class, "Red Nocturne", EntityRegistry.findGlobalUniqueEntityId(), 3515848, 12102);
				
	}

	@Override
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	@Override
	public void initCapes() {
		DevCapes.getInstance().registerConfig("https://raw.githubusercontent.com/Wehavecookies56/Kingdom-Keys-1.7-/master/Capes.json", "kk");
	}
	

	public static KeyBind KeyBind = new KeyBind();
	
	@Override
	public void registerKeybinds() {
    	FMLCommonHandler.instance().bus().register(this.KeyBind);
	}
	
	
}