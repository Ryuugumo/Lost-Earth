package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class BlockThatchStairs extends BlockStairs
{
	private static final int[][] field_72159_a = new int[][] {{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
	private boolean field_72156_cr = false;
	private int field_72160_cs = 0;

	protected BlockThatchStairs(int i, Block block, int j)
	{
		super(i, block, j);
		this.setLightOpacity(0);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess Iblockaccess, int i, int j, int k)
	{
		if (this.field_72156_cr)
		{
			this.setBlockBounds(0.5F * (float)(this.field_72160_cs % 2), 0.5F * (float)(this.field_72160_cs / 2 % 2), 0.5F * (float)(this.field_72160_cs / 4 % 2), 0.5F + 0.5F * (float)(this.field_72160_cs % 2), 0.5F + 0.5F * (float)(this.field_72160_cs / 2 % 2), 0.5F + 0.5F * (float)(this.field_72160_cs / 4 % 2));
		}
		else
		{
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public int getRenderType()
	{
		return 10;
	}

	public void addCollidingBlockToList(World world, int i, int j, int k, AxisAlignedBB axisalignedBB, List list, Entity entity)
	{
		int var8 = world.getBlockMetadata(i, j, k);
		int var9 = var8 & 3;
		float var10 = 0.0F;
		float var11 = 0.5F;
		float var12 = 0.5F;
		float var13 = 1.0F;
		if ((var8 & 4) != 0)
		{
			var10 = 0.5F;
			var11 = 1.0F;
			var12 = 0.0F;
			var13 = 0.5F;
		}
		this.setBlockBounds(0.0F, var10, 0.0F, 1.0F, var11, 1.0F);
		super.addCollidingBlockToList(world, i, j, k, axisalignedBB, list, entity);
		if (var9 == 0)
		{
			this.setBlockBounds(0.5F, var12, 0.0F, 1.0F, var13, 1.0F);
			super.addCollidingBlockToList(world, i, j, k, axisalignedBB, list, entity);
		}
		else if (var9 == 1)
		{
			this.setBlockBounds(0.0F, var12, 0.0F, 0.5F, var13, 1.0F);
			super.addCollidingBlockToList(world, i, j, k, axisalignedBB, list, entity);
		}
		else if (var9 == 2)
		{
			this.setBlockBounds(0.0F, var12, 0.5F, 1.0F, var13, 1.0F);
			super.addCollidingBlockToList(world, i, j, k, axisalignedBB, list, entity);
		}
		else if (var9 == 3)
		{
			this.setBlockBounds(0.0F, var12, 0.0F, 1.0F, var13, 0.5F);
			super.addCollidingBlockToList(world, i, j, k, axisalignedBB, list, entity);
		}
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
	{
		int var6 = MathHelper.floor_double((double)(entityliving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int var7 = world.getBlockMetadata(i, j, k) & 4;
		if (var6 == 0)
		{
			world.setBlockMetadataWithNotify(i, j, k, 2 | var7);
		}
		if (var6 == 1)
		{
			world.setBlockMetadataWithNotify(i, j, k, 1 | var7);
		}
		if (var6 == 2)
		{
			world.setBlockMetadataWithNotify(i, j, k, 3 | var7);
		}
		if (var6 == 3)
		{
			world.setBlockMetadataWithNotify(i, j, k, 0 | var7);
		}
	}

	public void updateBlockMetadata(World world, int par2, int par3, int par4, int par5, float par6, float par7, float par8)
	{
		if (par5 == 0 || par5 != 1 && (double)par7 > 0.5D)
		{
			int var9 = world.getBlockMetadata(par2, par3, par4);
			world.setBlockMetadataWithNotify(par2, par3, par4, var9 | 4);
		}
	}

	public MovingObjectPosition collisionRayTrace(World world, int i, int j, int k, Vec3 par5Vec3, Vec3 par6Vec3)
	{
		MovingObjectPosition[] var7 = new MovingObjectPosition[8];
		int var8 = world.getBlockMetadata(i, j, k);
		int var9 = var8 & 3;
		boolean var10 = (var8 & 4) == 4;
		int[] var11 = field_72159_a[var9 + (var10 ? 4 : 0)];
		this.field_72156_cr = true;
		int var14;
		int var15;
		int var16;
		for (int var12 = 0; var12 < 8; ++var12)
		{
			this.field_72160_cs = var12;
			int[] var13 = var11;
			var14 = var11.length;
			for (var15 = 0; var15 < var14; ++var15)
			{
				var16 = var13[var15];
				if (var16 == var12)
				{
					;
				}
			}
			var7[var12] = super.collisionRayTrace(world, i, j, k, par5Vec3, par6Vec3);
		}
		int[] var21 = var11;
		int var24 = var11.length;
		for (var14 = 0; var14 < var24; ++var14)
		{
			var15 = var21[var14];
			var7[var15] = null;
		}
		MovingObjectPosition var23 = null;
		double var22 = 0.0D;
		MovingObjectPosition[] var25 = var7;
		var16 = var7.length;
		for (int var17 = 0; var17 < var16; ++var17)
		{
			MovingObjectPosition var18 = var25[var17];
			if (var18 != null)
			{
				double var19 = var18.hitVec.squareDistanceTo(par6Vec3);
				if (var19 > var22)
				{
					var23 = var18;
					var22 = var19;
				}
			}
		}
		return var23;
	}
}