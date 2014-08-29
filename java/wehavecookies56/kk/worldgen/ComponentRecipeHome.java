package wehavecookies56.kk.worldgen;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraftforge.common.ChestGenHooks;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.item.AddedItems;

public class ComponentRecipeHome extends StructureVillagePieces.House1 {

	public static final String SYNTHESIS_CHEST = "synthesisChest";
	ChestGenHooks chest = ChestGenHooks.getInfo(SYNTHESIS_CHEST);
	
	public static final WeightedRandomChestContent[] synthesisChestContents = new WeightedRandomChestContent[]{
    	new WeightedRandomChestContent(new ItemStack(AddedItems.Orichalcum), 1, 2, 20),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.OrichalcumPlus), 1, 1, 10),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.BlazingShard), 1, 3, 100),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.FrostShard), 1, 3, 100),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.LightningShard), 1, 3, 100),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.DarkShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.BrightShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.TwilightShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.DenseShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.LucidShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.PowerShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.EnergyShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.RemembranceShard), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.SerenityShard), 1, 3, 75),

    	new WeightedRandomChestContent(new ItemStack(AddedItems.BlazingStone), 1, 3, 80),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.FrostStone), 1, 3, 100),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.LightningStone), 1, 3, 100),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.DarkStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.BrightStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.TwilightStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.DenseStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.LucidStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.PowerStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.EnergyStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.RemembranceStone), 1, 3, 75),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.SerenityStone), 1, 3, 75),

    	new WeightedRandomChestContent(new ItemStack(AddedItems.K7r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K8r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K9r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K10r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K11r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K12r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K13r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K14r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K15r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K16r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K17r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K18r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K19r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K20r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K23r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K24r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K25r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K26r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K27r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K28r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K29r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K30r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K31r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K32r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K33r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K34r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K35r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K36r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K37r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K38r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K40r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K41r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K42r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K43r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K44r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K45r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K46r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K47r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K48r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K49r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K50r), 1, 1, 5),
    	new WeightedRandomChestContent(new ItemStack(AddedItems.K51r), 1, 1, 5)
	};
	
	private int averageGroundLevel = -1;
	private final int SOUTH = 3;
	private final int WEST  = 0;
	private final int NORTH = 2;
	private final int EAST  = 1;

	public ComponentRecipeHome(Start villagePiece, int par2, Random par3Random, StructureBoundingBox par4StructureBoundingBox, int par5) {
		super();
		this.coordBaseMode = par5;
		this.boundingBox = par4StructureBoundingBox;
	}

	public static ComponentRecipeHome buildComponent(Start villagePiece, List pieces, Random random, int p1, int p2, int p3, int p4, int p5) {
		StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p1, p2, p3, 0, 0, 0, 7, 6, 7, p4);
        return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(pieces, structureboundingbox) == null ? new ComponentRecipeHome(villagePiece, p5, random, structureboundingbox, p4) : null;
	
	}

	public static void registerChest(){
		ChestGenHooks.getInfo(SYNTHESIS_CHEST);
   		for(int i = 0; i < synthesisChestContents.length; i++){
			ChestGenHooks.addItem(SYNTHESIS_CHEST, synthesisChestContents[i]);
		}
   		
	}
	
	private StructureBoundingBox sbb;
	private World w;

	@Override
	public boolean addComponentParts(World world, Random random, StructureBoundingBox sbb) {
		if (this.averageGroundLevel < 0)
        {
            this.averageGroundLevel = this.getAverageGroundLevel(world, sbb);

            if (this.averageGroundLevel < 0)
            {
                return true;
            }

            this.boundingBox.offset(0, this.averageGroundLevel - this.boundingBox.maxY + 4, 0);
        }
		
		//Floor
		
		//Cobble
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 0, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 1, 0, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 2, 0, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 3, 0, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 4, 0, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 5, 0, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 0, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 0, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 0, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 0, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 0, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 0, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 1, 0, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 2, 0, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 3, 0, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 4, 0, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 5, 0, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 0, 6, sbb);
		
		//Hard Blox
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 1, 0, 1, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 2, 0, 1, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 3, 0, 1, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 4, 0, 1, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 5, 0, 1, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 1, 0, 2, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 1, 0, 3, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 1, 0, 4, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 1, 0, 5, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 5, 0, 2, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 5, 0, 3, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 5, 0, 4, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 5, 0, 5, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 2, 0, 5, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 3, 0, 5, sbb);
		this.placeBlockAtCurrentPosition(world, AddedBlocks.HardBlox, 0, 4, 0, 5, sbb);
		
		//Black Wool
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 2, 0, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 2, 0, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 2, 0, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 3, 0, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 3, 0, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 3, 0, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 4, 0, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 4, 0, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.wool, getMetadataWithOffset(Blocks.wool, 15), 4, 0, 4, sbb);

		//Synthesiser
		this.placeBlockAtCurrentPosition(world, AddedBlocks.Synthesiser, 0, 1, 1, 5, sbb);
		
		//Crafting Table
		this.placeBlockAtCurrentPosition(world, Blocks.crafting_table, 0, 1, 1, 4, sbb);

		//Bookshelves
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 1, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 1, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 1, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 4, 1, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 5, 1, 1, sbb);

		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 4, 2, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 5, 2, 1, sbb);

		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 3, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 3, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 3, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 3, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.bookshelf, 0, 1, 3, 1, sbb);

		//Door
		this.placeDoorAtCurrentPosition(world, sbb, random, 3, 1, 0, getMetadataWithOffset(Blocks.wooden_door, NORTH));
		
		//Villager
		this.spawnVillagers(world, sbb, 2, 1, 2, 1);
		
		//Cobble
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 1, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 1, 1, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 2, 1, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 4, 1, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 5, 1, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 1, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 1, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 1, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 1, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 1, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 1, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 1, 1, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 2, 1, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 3, 1, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 4, 1, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 5, 1, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 1, 6, sbb);

		//Wood
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 2, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 0, 2, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 0, 2, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 2, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 1, 2, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 2, 2, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 4, 2, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 5, 2, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 2, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 6, 2, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 1, 2, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 2, 2, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 3, 2, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 4, 2, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 5, 2, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 6, 2, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 2, 6, sbb);
		
		//Glass
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 0, 2, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 0, 2, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 0, 2, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 6, 2, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 6, 2, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 6, 2, 4, sbb);
		
		//Wood
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 3, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 0, 3, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 0, 3, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 0, 3, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 0, 3, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 0, 3, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 0, 3, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 1, 3, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 2, 3, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 3, 3, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 4, 3, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 5, 3, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 3, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 6, 3, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 6, 3, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 6, 3, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 6, 3, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 6, 3, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 1, 3, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.planks, getMetadataWithOffset(Blocks.planks, 5), 5, 3, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.cobblestone, 0, 6, 3, 6, sbb);
		
		//Glass
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 2, 3, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 3, 3, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass_pane, 0, 4, 3, 6, sbb);
		
		//Logs
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 0, 4, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 0, 4, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 0, 4, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 0, 4, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 0, 4, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 0, 4, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 0, 4, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 4, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 2, 4, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 3, 4, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 4, 4, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 5, 4, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 6, 4, 0, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 6, 4, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 6, 4, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 6, 4, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 6, 4, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 6, 4, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 4, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 4, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 2, 4, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 3, 4, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 4, 4, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 5, 4, 6, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 6, 4, 6, sbb);
		
		//Logs
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 5, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 2, 5, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 3, 5, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 4, 5, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 5, 5, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 5, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 5, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 5, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 1, 5, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 5, 5, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 5, 5, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 5, 5, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 5, 5, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 2, 5, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 3, 5, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.log, getMetadataWithOffset(Blocks.log, 1), 4, 5, 5, sbb);
		
		//Torch
		this.placeBlockAtCurrentPosition(world, Blocks.torch, getMetadataWithOffset(Blocks.torch, EAST), 1, 4, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.torch, getMetadataWithOffset(Blocks.torch, EAST), 1, 4, 5, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.torch, getMetadataWithOffset(Blocks.torch, WEST), 5, 4, 1, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.torch, getMetadataWithOffset(Blocks.torch, WEST), 5, 4, 5, sbb);
		
		//Glass
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 2, 5, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 2, 5, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 2, 5, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 3, 5, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 3, 5, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 3, 5, 4, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 4, 5, 2, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 4, 5, 3, sbb);
		this.placeBlockAtCurrentPosition(world, Blocks.glass, 0, 4, 5, 4, sbb);
		
		this.fillWithAir(world, sbb, 2, 1, 2, 5, 3, 5);
		this.fillWithAir(world, sbb, 2, 2, 1, 3, 2, 1);
		this.fillWithAir(world, sbb, 2, 3, 1, 4, 4, 1);
		this.fillWithAir(world, sbb, 5, 3, 1, 5, 3, 1);
		this.fillWithAir(world, sbb, 1, 4, 2, 5, 4, 4);
		this.fillWithAir(world, sbb, 2, 4, 5, 4, 4, 5);
		
		ChestGenHooks info = new ChestGenHooks(SYNTHESIS_CHEST, synthesisChestContents, 3, 9);
		this.generateStructureChestContents(world, sbb, random, 5,1,5, info.getItems(random), info.getCount(random));
		
		return true;
	}

	private void fill(int x, int y, int z, int x1, int y1, int z1, Block b){
		this.fillWithBlocks(w, sbb, x, y, z, x1, y1, z1, b, b, false);
	}
	
	@Override
	protected int getVillagerType(int p_74888_1_) {
		return 20;
	}
}
