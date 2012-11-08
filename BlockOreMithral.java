package net.minecraft.src;

import java.util.Random;

public class BlockOreMithral extends Block 
{
	public BlockOreMithral(int par1, int par2)
	{
		super(par1, par2, Material.rock);
	}

	public int quantityDropped()
	{
		return 1;
	}
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	{
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

		if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
		{
			int var8 = 0;

			if (this.blockID == mod_LostEarth.blockoremithral.blockID)
			{
				var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
			}
			this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
		}
	}
}
