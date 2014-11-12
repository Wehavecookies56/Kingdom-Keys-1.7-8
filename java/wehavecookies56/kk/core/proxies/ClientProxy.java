package wehavecookies56.kk.core.proxies;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;

import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.client.gui.GuiCommands;
import wehavecookies56.kk.client.gui.GuiDriveBar;
import wehavecookies56.kk.client.gui.GuiHealthBar;
import wehavecookies56.kk.client.gui.GuiMagicBar;
import wehavecookies56.kk.client.model.PlayerModel;
import wehavecookies56.kk.client.render.BlockRenderBlastBlox;
import wehavecookies56.kk.client.render.EntityRenderEternalFlamesProjectile;
import wehavecookies56.kk.client.render.EntityRenderSharpShooterBullet;
import wehavecookies56.kk.client.render.ItemRenderBookOfRetribution;
import wehavecookies56.kk.client.render.ItemRenderEarthShaker;
import wehavecookies56.kk.client.render.ItemRenderEternalFlames;
import wehavecookies56.kk.client.render.ItemRenderFenrir;
import wehavecookies56.kk.client.render.ItemRenderFollowTheWind;
import wehavecookies56.kk.client.render.ItemRenderInterdiction;
import wehavecookies56.kk.client.render.ItemRenderKKChest;
import wehavecookies56.kk.client.render.ItemRenderKeybladeOfPeoplesHearts;
import wehavecookies56.kk.client.render.ItemRenderKingdomKey;
import wehavecookies56.kk.client.render.ItemRenderKingdomKeyD;
import wehavecookies56.kk.client.render.ItemRenderLionHeart;
import wehavecookies56.kk.client.render.ItemRenderLunarEclipse;
import wehavecookies56.kk.client.render.ItemRenderMasterKeeper;
import wehavecookies56.kk.client.render.ItemRenderMetalChocobo;
import wehavecookies56.kk.client.render.ItemRenderOathKeeper;
import wehavecookies56.kk.client.render.ItemRenderOblivion;
import wehavecookies56.kk.client.render.ItemRenderRainFell;
import wehavecookies56.kk.client.render.ItemRenderRumblingRose;
import wehavecookies56.kk.client.render.ItemRenderSkysplitter;
import wehavecookies56.kk.client.render.ItemRenderSoulEater;
import wehavecookies56.kk.client.render.ItemRenderStarLight;
import wehavecookies56.kk.client.render.ItemRenderTotalEclipse;
import wehavecookies56.kk.client.render.ItemRenderVoidedKnowledge;
import wehavecookies56.kk.client.render.ItemRenderWaywardWind;
import wehavecookies56.kk.client.render.ItemRenderWoodenKeyblade;
import wehavecookies56.kk.client.render.ItemRenderZeroOne;
import wehavecookies56.kk.client.render.PlayerRender;
import wehavecookies56.kk.client.render.TileEntityRendererKKChest;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.entities.EntityEternalFlamesProjectile;
import wehavecookies56.kk.entities.EntitySharpshooterBullet;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.item.AddedItems;
import api.player.model.ModelPlayerAPI;
import api.player.render.RenderPlayerAPI;

import com.jadarstudios.developercapes.DevCapes;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.VillagerRegistry;


public class ClientProxy extends CommonProxy {


	public static int sphereIdOutside;
	public static int sphereIdInside;
	
	@Override
	public void registerRenderers() {
		//3D Model renders
		MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKey, new ItemRenderKingdomKey());
		MinecraftForgeClient.registerItemRenderer(AddedItems.Oathkeeper, new ItemRenderOathKeeper());
		MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKeyD, new ItemRenderKingdomKeyD());
		MinecraftForgeClient.registerItemRenderer(AddedItems.Oblivion, new ItemRenderOblivion());
		MinecraftForgeClient.registerItemRenderer(AddedItems.WaywardWind, new ItemRenderWaywardWind());
		MinecraftForgeClient.registerItemRenderer(AddedItems.EarthShaker, new ItemRenderEarthShaker());
		MinecraftForgeClient.registerItemRenderer(AddedItems.Rainfell, new ItemRenderRainFell());
		MinecraftForgeClient.registerItemRenderer(AddedItems.StarLight, new ItemRenderStarLight());
		MinecraftForgeClient.registerItemRenderer(AddedItems.SoulEater, new ItemRenderSoulEater());
		MinecraftForgeClient.registerItemRenderer(AddedItems.LunarEclipse, new ItemRenderLunarEclipse());
		MinecraftForgeClient.registerItemRenderer(AddedItems.TotalEclipse, new ItemRenderTotalEclipse());
		MinecraftForgeClient.registerItemRenderer(AddedItems.Fenrir, new ItemRenderFenrir());
		MinecraftForgeClient.registerItemRenderer(AddedItems.ZeroOne, new ItemRenderZeroOne());
		MinecraftForgeClient.registerItemRenderer(AddedItems.RumblingRose, new ItemRenderRumblingRose());
		MinecraftForgeClient.registerItemRenderer(AddedItems.BookOfRetribution, new ItemRenderBookOfRetribution());
		MinecraftForgeClient.registerItemRenderer(AddedItems.Interdiction, new ItemRenderInterdiction());
		MinecraftForgeClient.registerItemRenderer(AddedItems.EternalFlames, new ItemRenderEternalFlames());
		MinecraftForgeClient.registerItemRenderer(AddedItems.SkySplitter, new ItemRenderSkysplitter());
		MinecraftForgeClient.registerItemRenderer(AddedItems.VoidedKnowledge, new ItemRenderVoidedKnowledge());
		MinecraftForgeClient.registerItemRenderer(AddedItems.MasterKeeper, new ItemRenderMasterKeeper());
		MinecraftForgeClient.registerItemRenderer(AddedItems.MetalChocobo, new ItemRenderMetalChocobo());
		MinecraftForgeClient.registerItemRenderer(AddedItems.WoodenKeyblade, new ItemRenderWoodenKeyblade());
		MinecraftForgeClient.registerItemRenderer(AddedItems.FollowTheWind, new ItemRenderFollowTheWind());
		MinecraftForgeClient.registerItemRenderer(AddedItems.LionHeart, new ItemRenderLionHeart());
		MinecraftForgeClient.registerItemRenderer(AddedItems.PeoplesHearts, new ItemRenderKeybladeOfPeoplesHearts());

		MinecraftForgeClient.registerItemRenderer(new ItemStack(AddedBlocks.KKChest).getItem(), new ItemRenderKKChest());
		

		//Events
		MinecraftForge.EVENT_BUS.register(new GuiHealthBar());
		MinecraftForge.EVENT_BUS.register(new GuiMagicBar());
		MinecraftForge.EVENT_BUS.register(new GuiDriveBar());
		MinecraftForge.EVENT_BUS.register(new GuiCommands());

		//Entities
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKKChest.class, new TileEntityRendererKKChest());
		RenderingRegistry.registerEntityRenderingHandler(EntityBlastBlox.class, new BlockRenderBlastBlox());
		RenderingRegistry.registerEntityRenderingHandler(EntityEternalFlamesProjectile.class, new EntityRenderEternalFlamesProjectile(AddedItems.EternalFlames));
		RenderingRegistry.registerEntityRenderingHandler(EntitySharpshooterBullet.class, new EntityRenderSharpShooterBullet());
		ResourceLocation villagerTexture = new ResourceLocation("kk", "textures/entities/mobs/knowledgeVillager.png");
		VillagerRegistry.instance().registerVillagerSkin(20, villagerTexture);
		VillagerRegistry.getVillagerSkin(10, villagerTexture);

		Sphere sphere = new Sphere();

		sphere.setDrawStyle(GLU.GLU_FILL);
		sphere.setNormals(GLU.GLU_SMOOTH);

		sphere.setOrientation(GLU.GLU_OUTSIDE);

		sphereIdOutside = GL11.glGenLists(1);
		GL11.glNewList(sphereIdOutside, GL11.GL_COMPILE);
		ResourceLocation rL = new ResourceLocation("kk", "textures/entities/sphere.png");
		Minecraft.getMinecraft().getTextureManager().bindTexture(rL);
		sphere.draw(1.5F, 32, 32);
		GL11.glEndList();
		sphere.setOrientation(GLU.GLU_INSIDE);
		sphereIdInside = GL11.glGenLists(1);
		GL11.glNewList(sphereIdInside, GL11.GL_COMPILE);
		Minecraft.getMinecraft().getTextureManager().bindTexture(rL);
		sphere.draw(1.5F, 32, 32);
		GL11.glEndList();
	}

	@Override
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	@Override
	public void initCapes() {
		DevCapes.getInstance().registerConfig("https://www.dropbox.com/s/hb0wg5ky5wblz9g/Capes.json?raw=1");
	}


	public static KeyBind KeyBind = new KeyBind();

	@Override
	public void registerKeybinds() {
		FMLCommonHandler.instance().bus().register(this.KeyBind);
	}

}