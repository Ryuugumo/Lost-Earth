package net.minecraft.src;

public class BlockThatch extends Block
{
	public BlockThatch (int i, int j)
	{
		super (i, j, Material.wood);	
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
	public boolean isOpaqueCube()
	{
		return false;
	}
}
