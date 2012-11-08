package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class BlockPungi extends BlockContainer
{
	public BlockPungi (int i, int j, Class class1)
	{
		super (i, j, Material.wood);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setRequiresSelfNotify();
	}
	public int getRenderType()
	{
		return mod_LostEarth.modelID;
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
		return new TileEntityPungi();
	}
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityPungi();
	}
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int j, int k, int m)
	{
		float var5 = 0.0625F;
		return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)j + var5), (double)k, (double)((float)m + var5), (double)((float)(j + 1) - var5), (double)((float)(k + 1) - var5), (double)((float)(m + 1) - var5));
	}
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int j, int k, int m)
	{
		float var5 = 0.0625F;
		return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)j + var5), (double)k, (double)((float)m + var5), (double)((float)(j + 1) - var5), (double)(k + 1), (double)((float)(m + 1) - var5));
	}
	public void onEntityCollidedWithBlock(World world, int j, int k, int m, Entity entity)
	{
		entity.attackEntityFrom(DamageSource.cactus, 1);
	}
	public void onEntityWalking(World world, int j, int k, int m, Entity entity) {
		if (entity instanceof EntityLiving){
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.harm.getId(), 10, 0));
		}
	}
}