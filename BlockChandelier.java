package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class BlockChandelier extends BlockContainer
{
	public BlockChandelier (int i, int j, Class class1)
	{
		super (i, j, Material.iron);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setRequiresSelfNotify();
	}
	public int getRenderType()
	{
		return mod_LostEarth.modelID3;
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	public boolean isOpaqueCube()
	{
		return false;
	}
	//self note v
	public boolean blockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer){

		int p = MathHelper.floor_double((double)((par5EntityPlayer.rotationYaw * 4F) / 360F) + 0.5D) & 3; //i don't know what this is for, so we better keep that there

		byte byte0 = 3;


		if (p == 0)
		{
			byte0 = 4;
		}
		if (p == 1)
		{
			byte0 = 3;
		}
		if (p == 2)
		{
			byte0 = 2;
		}
		if (p == 3)
		{
			byte0 = 1;
		}

		par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0);

		return true;
	}
	//self note ^
	public TileEntity getBlockEntity()
	{
		return new TileEntityChandelier();
	}
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityChandelier();
	}
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int j, int k, int m)
	{
		float var5 = 0.0625F;
		return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)j + var5), (double)k, (double)((float)m + var5), (double)((float)(j + 1) - var5), (double)((float)(k + 1) - var5), (double)((float)(m + 1) - var5));
	}
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int j, int k, int m)
	{
		float var5 = 1F;
		return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)j + var5), (double)k, (double)((float)m + var5), (double)((float)(j + 1) - var5), (double)(k + 1), (double)((float)(m + 1) - var5));
	}

	public void updateTick(World world, int i, int j, int k, Random rand)
	{
		super.updateTick(world, i, j, k, rand);

		if (world.getBlockMetadata(i, j, k) == 0)
		{
			this.onBlockAdded(world, i, j, k);
		}
	}

	public void randomDisplayTick(World world, int i, int j, int k, Random rand)
	{
		int var6 = world.getBlockMetadata(i, j, k);
		double var7 = (double)((float)i + 1.92F);
		double var9 = (double)((float)j + 0.55F);
		double var11 = (double)((float)k + 0.5F);
		double var7a = (double)((float)i - 0.92F);
		double var9a = (double)((float)j + 0.55F);
		double var11a = (double)((float)k + 0.5F);
		double var7b = (double)((float)i + 0.5F);
		double var9b = (double)((float)j + 0.55F);
		double var11b = (double)((float)k + 1.92F);
		double var7c = (double)((float)i + 0.5F);
		double var9c = (double)((float)j + 0.55F);
		double var11c = (double)((float)k - 0.92F);
		double var7d = (double)((float)i + 1.5F);
		double var9d = (double)((float)j + 0.55F);
		double var11d = (double)((float)k - 0.5F);
		double var7e = (double)((float)i - 0.5F);
		double var9e = (double)((float)j + 0.55F);
		double var11e = (double)((float)k - 0.5F);
		double var7f = (double)((float)i + 1.5F);
		double var9f = (double)((float)j + 0.55F);
		double var11f = (double)((float)k + 1.5F);
		double var7g = (double)((float)i - 0.5F);
		double var9g = (double)((float)j + 0.55F);
		double var11g = (double)((float)k + 1.5F);
		double var13 = 0.2199999988079071D;
		double var15 = 0.27000001072883606D;

		if (var6 == 1)
		{
			world.spawnParticle("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
		}
		else
		{
			world.spawnParticle("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("smoke", var7a, var9a, var11a, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7a, var9a, var11a, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("smoke", var7b, var9b, var11b, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7b, var9b, var11b, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("smoke", var7c, var9c, var11c, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7c, var9c, var11c, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("smoke", var7d, var9d, var11d, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7d, var9d, var11d, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("smoke", var7e, var9e, var11e, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7e, var9e, var11e, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("smoke", var7f, var9f, var11f, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7f, var9f, var11f, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("smoke", var7g, var9g, var11g, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", var7g, var9g, var11g, 0.0D, 0.0D, 0.0D);
		}
	}
}