package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class BlockLantern extends BlockContainer
{
	public BlockLantern (int i, int j, Class class1)
	{
		super (i, j, Material.iron);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setRequiresSelfNotify();
	}
	public int getRenderType()
	{
		return mod_LostEarth.modelID4;
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
		return new TileEntityLantern();
	}
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityLantern();
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
		double var7 = (double)((float)i + 0.5F);
		double var9 = (double)((float)j + 0.8F);
		double var11 = (double)((float)k + 0.5F);
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
		}
	}
}