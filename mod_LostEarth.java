//TODO fix scaffold to act like a ladder
//TODO fix tamper to have a config file for gravel(0), cobblestone(1), stonebrick(2)
//TODO fix MithralArmor to be called through EnumArmorMaterialLE.MITHRAL and not EnumArmorMaterial.DIAMOND
package net.minecraft.src;

import java.util.Random;

public class mod_LostEarth extends BaseMod
{
	//ModelIDs
	public static int BlockPungi = 700;
	public static int modelID;
	public static int BlockScaffold = 701;
	public static int modelID2;
	public static int BlockChandelier = 702;
	public static int modelID3;
	public static int modelID4;
	public static int BlockLantern = 712;
	//TileEntity
	public mod_LostEarth()
	{
		ModLoader.registerTileEntity(TileEntityPungi.class, "Pungi", new TileEntityPungiRenderer());
		ModLoader.registerTileEntity(TileEntityScaffold.class, "Scaffold", new TileEntityScaffoldRenderer());
		ModLoader.registerTileEntity(TileEntityChandelier.class, "Chandelier", new TileEntityChandelierRenderer());
		ModLoader.registerTileEntity(TileEntityLantern.class, "Lantern", new TileEntityLanternRenderer());	
	}
	//Blocks
	public static final Block blockpungi = (new BlockPungi(BlockPungi, 0, TileEntityPungi.class)).setHardness(5F).setResistance(1F).setBlockName("blockpungi").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockscaffold = (new BlockScaffold(BlockScaffold, 0, TileEntityScaffold.class)).setHardness(0.1F).setResistance(1F).setBlockName("blockscaffold").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockchandelier = (new BlockChandelier(BlockChandelier, 0, TileEntityChandelier.class)).setHardness(5f).setResistance(5F).setLightValue(1F).setBlockName("blockchandelier").setCreativeTab(CreativeTabs.tabDecorations);
	public static final Block blocklantern = (new BlockLantern(BlockLantern, 0, TileEntityLantern.class)).setHardness(5f).setResistance(5F).setLightValue(1F).setBlockName("blocklantern").setCreativeTab(CreativeTabs.tabDecorations);	
	public static final Block blockoremithral = (new BlockOreMithral(703, 0)).setHardness(5F).setResistance(2000F).setLightValue(0.66F).setBlockName("blockoremithral").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockthatch = (new BlockThatch(704, 0)).setHardness(0.5F).setResistance(1F).setBlockName("blockthatch").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockthatchstairs = (new BlockThatchStairs(705, blockthatch, 0)).setHardness(0.5F).setResistance(1F).setBlockName("blockthatchstairs").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockthatchslabA = (new BlockThatchSlab(706, false)).setHardness(0.5F).setResistance(1F).setBlockName("blockthatchslabA").setCreativeTab(CreativeTabs.tabBlock);	
	public static final Block blockthatchslabB = (new BlockThatchSlab(707, true)).setHardness(0.5F).setResistance(1F).setBlockName("blockthatchslabB").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockwaddlendab = (new BlockWaddleNDab(708, 0)).setHardness(1F).setResistance(2F).setBlockName("blockwaddlendab").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockshoji = (new BlockShoji(709, 0, 0, Material.glass, false)).setHardness(0.1F).setResistance(1F).setBlockName("blockshoji").setCreativeTab(CreativeTabs.tabDecorations);
	//Items
	public static final Item PungiItem = (new ItemPungi(BlockPungi -256, blockpungi)).setItemName("ItemPungi");
	public static final Item ScaffoldItem = (new ItemScaffold(BlockScaffold -256, blockscaffold)).setItemName("ItemScaffold");
	public static final Item ChandelierItem = (new ItemChandelier(BlockChandelier -256, blockchandelier)).setItemName("ItemChandelier");
	public static final Item LanternItem = (new ItemLantern(BlockLantern -256, blocklantern)).setItemName("ItemLantern");	
	public static final Item Tamper = (new ItemTamper(710)).setItemName("Tamper");
	public static final Item ingotmithral = (new ItemIngotMithral(711)).setItemName("ingotmithral").setCreativeTab(CreativeTabs.tabMaterials);
	//Tools, Weapons, Armor
	public static final Item MSpade = new ItemSpadeLE(730, EnumToolMaterialLE.MITHRAL).setItemName("MSpade");
	public static final Item MHoe = new ItemHoeLE(731, EnumToolMaterialLE.MITHRAL).setItemName("MHoe");
	public static final Item MAxe = new ItemAxeLE(732, EnumToolMaterialLE.MITHRAL).setItemName("MAxe");
	public static final Item MPickaxe = new ItemPickaxeLE(733, EnumToolMaterialLE.MITHRAL).setItemName("MPickaxe");
	public static final Item MSword = new ItemSwordLE(734, EnumToolMaterialLE.MITHRAL).setItemName("MSword");
	public static final Item MHead = new ItemArmor(735, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("mithral"), 0).setItemName("MHead");
	public static final Item MChest = new ItemArmor(736, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("mithral"), 1).setItemName("MChest");
	public static final Item MLegs = new ItemArmor(737, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("mithral"), 2).setItemName("MLegs");
	public static final Item MFeet = new ItemArmor(738, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("mithral"), 3).setItemName("MFeet");
	//MultiSidedBlocks
	public static int ThatchSide;
	public static int ThatchEnd;

	public void load()
	{
		//Textures
		modelID = ModLoader.getUniqueBlockModelID(this, true);
		modelID2 = ModLoader.getUniqueBlockModelID(this, true);
		modelID3 = ModLoader.getUniqueBlockModelID(this, true);
		modelID4 = ModLoader.getUniqueBlockModelID(this, true);
		blockoremithral.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/LE/BlockOreMithral.png");
		ThatchSide = ModLoader.addOverride("/terrain.png", "/LE/BlockThatchTop.png");
		ThatchEnd = ModLoader.addOverride("/terrain.png", "/LE/BlockThatchSide2.png");
		blockwaddlendab.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/LE/BlockWaddleNDab.png");
		blockshoji.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/LE/BlockShoji.png");
		Tamper.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/ItemTamper.png");
		ingotmithral.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/ItemIngotMithral.png");
		MSpade.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MSpade.png");
		MHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MHoe.png");
		MAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MAxe.png");
		MPickaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MPickaxe.png");
		MSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MSword.png");
		MHead.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MHead.png");
		MChest.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MChest.png");
		MLegs.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MLegs.png");
		MFeet.iconIndex = ModLoader.addOverride("/gui/items.png", "/LE/MFeet.png");
		//ModLoader.registerBlock()
		ModLoader.registerBlock(blockoremithral);
		ModLoader.registerBlock(blockthatch);
		ModLoader.registerBlock(blockthatchstairs);
		ModLoader.registerBlock(blockthatchslabA);
		ModLoader.registerBlock(blockthatchslabB);
		ModLoader.registerBlock(blockwaddlendab);
		ModLoader.registerBlock(blockshoji);
		//ModLoader.addName(,)
		ModLoader.addName(blockpungi, "Pungi");
		ModLoader.addName(blockscaffold, "Scaffold");
		ModLoader.addName(blockchandelier, "Chandelier");
		ModLoader.addName(blocklantern, "Lantern");
		ModLoader.addName(blockoremithral, "Mithral Ore");
		ModLoader.addName(blockthatch, "Thatch");
		ModLoader.addName(blockthatchstairs, "Thatch Stairs");
		ModLoader.addName(blockthatchslabA, "Thatch Slab");
		ModLoader.addName(blockthatchslabB, "Thatch");
		ModLoader.addName(blockwaddlendab, "Waddle N Dab");
		ModLoader.addName(blockshoji, "Shoji");
		ModLoader.addName(Tamper, "Tamper");
		ModLoader.addName(ingotmithral, "Mithral Ingot");
		ModLoader.addName(MSpade, "Mithral Shovel");
		ModLoader.addName(MHoe, "Mithral Hoe");
		ModLoader.addName(MAxe, "Mithral Axe");
		ModLoader.addName(MPickaxe, "Mithral Pickaxe");
		ModLoader.addName(MSword, "Mithral Sword");
		ModLoader.addName(MHead, "Mithral Helmet");
		ModLoader.addName(MChest, "Mithral Breastplate");
		ModLoader.addName(MLegs, "Mithral Leggings");
		ModLoader.addName(MFeet, "Mithral Boots");
		//ModLoader.addRecipe(,)
		ModLoader.addRecipe(new ItemStack(blockpungi, 1), new Object[]
				{"XYX","XXX","ZZZ",'X', Item.stick, 'Y', Item.spiderEye, 'Z', Block.planks});
		ModLoader.addRecipe(new ItemStack(blockscaffold, 6), new Object[]
				{"XXX","YYY","YYY",'X', Block.planks, 'Y', Item.stick});
		ModLoader.addRecipe(new ItemStack(blockchandelier, 1), new Object[]
				{"XXX","XYX","XXX", 'X', blockchandelier.torchWood, 'Y', Block.blockSteel});
		ModLoader.addRecipe(new ItemStack(blocklantern, 1), new Object[]
				{" X ","XYX"," X ", 'X', Item.ingotIron, 'Y', Block.torchWood});
		ModLoader.addRecipe(new ItemStack(blockthatch, 6), new Object[]
				{"XXX","XXX","XXX",'X', Item.stick});
		ModLoader.addRecipe(new ItemStack(blockthatch, 6), new Object[]
				{"XXX","XXX","XXX",'X', Item.wheat});
		ModLoader.addRecipe(new ItemStack(blockthatch, 6), new Object[]
				{"XXX","XXX","XXX",'X', Item.reed});
		ModLoader.addRecipe(new ItemStack(blockthatchstairs, 6), new Object[]
				{"X  ","XX ","XXX", 'X', blockthatch});
		ModLoader.addRecipe(new ItemStack(blockthatchslabA, 6), new Object[]
				{"XXX", 'X', blockthatch});
		ModLoader.addRecipe(new ItemStack(blockwaddlendab, 4), new Object[]
				{"XXX","YYY","XXX",'X', Item.clay, 'Y', blockthatch});
		ModLoader.addRecipe(new ItemStack(blockshoji, 4), new Object[]
				{"YXY","XXX","YXY", 'X', Item.paper, 'Y', Item.stick});
		ModLoader.addRecipe(new ItemStack(Tamper, 1),new Object[]
				{" X "," X ","YYY",'X', Item.stick, 'Y', Block.stone});
		ModLoader.addRecipe(new ItemStack(MSpade, 1), new Object[]
				{" X "," Y "," Y ", 'X', ingotmithral, 'Y', Item.stick});
		ModLoader.addRecipe(new ItemStack(MHoe, 1), new Object[]
				{"XX "," Y "," Y ", 'X', ingotmithral, 'Y', Item.stick});
		ModLoader.addRecipe(new ItemStack(MAxe, 1), new Object[]
				{"XX ","XY "," Y ", 'X', ingotmithral, 'Y', Item.stick});
		ModLoader.addRecipe(new ItemStack(MPickaxe, 1), new Object[]
				{"XXX"," Y "," Y ", 'X', ingotmithral, 'Y', Item.stick});
		ModLoader.addRecipe(new ItemStack(MSword, 1), new Object[]
				{" X "," X "," Y ", 'X', ingotmithral, 'Y', Item.stick});
		ModLoader.addRecipe(new ItemStack(MHead, 1), new Object[]
				{"XXX","X X", 'X', ingotmithral});
		ModLoader.addRecipe(new ItemStack(MChest, 1), new Object[]
				{"X X","XXX","XXX", 'X', ingotmithral});
		ModLoader.addRecipe(new ItemStack(MLegs, 1), new Object[]
				{"XXX","X X","X X", 'X', ingotmithral});
		ModLoader.addRecipe(new ItemStack(MFeet, 1), new Object[]
				{"X X","X X", 'X', ingotmithral});
		//recipe.crafting.shapeless

		//recipe.smelting
		ModLoader.addSmelting(blockoremithral.blockID, new ItemStack(ingotmithral, 1), 1F);
	}
	//render model renderers for inventory items
	public void renderInvBlock(RenderBlocks i, Block j, int k, int m){
		super.renderInvBlock(i, j, k, m);

		if (j == blockpungi)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new TileEntityPungi(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (j == blockscaffold)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new TileEntityScaffold(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (j == blockchandelier)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new TileEntityChandelier(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (j == blocklantern)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new TileEntityLantern(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
	}
	//generate custom blocks
	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		for (int i=0; i < 5; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(90); 
			int randPosZ = chunkZ + rand.nextInt(16);
			(new WorldGenMinable(blockoremithral.blockID, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}

	public String getVersion()
	{
		return "1.4.2";
	}

}