package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class BlockThatchSlab extends BlockHalfSlab
{
	public BlockThatchSlab(int i, boolean j)
	{
		super(i, j, Material.wood);
		this.setCreativeTab(CreativeTabs.tabBlock);
		setLightOpacity(0);
	}

	public int getBlockTextureFromSideAndMetadata(int i, int j)
	{
		if (i == 0)return mod_LostEarth.ThatchEnd;
		if (i == 1)return mod_LostEarth.ThatchEnd;
		if (i == 2)return mod_LostEarth.ThatchSide;
		if (i == 3)return mod_LostEarth.ThatchSide;
		if (i == 4)return mod_LostEarth.ThatchSide;
		if (i == 5)return mod_LostEarth.ThatchSide;
		if (j == 1)return 166;
		return j != 2 ? 20 : 177;
	}

	public int getBlockTextureFromSide(int i)
	{
		return blockIndexInTexture;
	}

	public int idDropped(int i, Random random, int j)
	{
		return mod_LostEarth.blockthatchslabA.blockID;
	}

	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
	{
		if(world.getBlockId(i, j - 1, k) == mod_LostEarth.blockthatchslabA.blockID)
		{
			world.setBlockWithNotify(i, j, k, 0);
			world.setBlockWithNotify(i, j - 1, k, mod_LostEarth.blockthatchslabB.blockID);
		}
	}

	protected ItemStack createStackedBlock(int i)
	{
		return new ItemStack(mod_LostEarth.blockthatchslabA.blockID, 2, i & 7);
	}

	public String getFullSlabName(int var1)
	{
		return null;
	}
}