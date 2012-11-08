package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class ItemTamper extends Item 
{
	Random rand = new Random();
	protected ItemTamper (int i)
	{
		super (i);
		this.maxStackSize = 1;
		this.setMaxDamage(64);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldRotateAroundWhenRendering()
	{
		return true;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		MovingObjectPosition block = getMovingObjectPositionFromPlayer(world, entityplayer, true);

		int x = block.blockX;
		int y = block.blockY;
		int z = block.blockZ;

		int blockID1 = world.getBlockId(x-2, y, z-2);
		int blockID2 = world.getBlockId(x-2, y, z-1);
		int blockID3 = world.getBlockId(x-2, y, z);
		int blockID4 = world.getBlockId(x-2, y, z+1);
		int blockID5 = world.getBlockId(x-2, y, z+2);
		int blockID6 = world.getBlockId(x-1, y, z-2);
		int blockID7 = world.getBlockId(x-1, y, z-1);
		int blockID8 = world.getBlockId(x-1, y, z);
		int blockID9 = world.getBlockId(x-1, y, z+1);
		int blockID10 = world.getBlockId(x-1, y, z+2);
		int blockID11 = world.getBlockId(x, y, z-2);
		int blockID12 = world.getBlockId(x, y, z-1);
		int blockID13 = world.getBlockId(x, y, z);
		int blockID14 = world.getBlockId(x, y, z+1);
		int blockID15 = world.getBlockId(x, y, z+2);
		int blockID16 = world.getBlockId(x+1, y, z-2);
		int blockID17 = world.getBlockId(x+1, y, z-1);
		int blockID18 = world.getBlockId(x+1, y, z);
		int blockID19 = world.getBlockId(x+1, y, z+1);
		int blockID20 = world.getBlockId(x+1, y, z+2);
		int blockID21 = world.getBlockId(x+2, y, z-2);
		int blockID22 = world.getBlockId(x+2, y, z-1);
		int blockID23 = world.getBlockId(x+2, y, z);
		int blockID24 = world.getBlockId(x+2, y, z+1);
		int blockID25 = world.getBlockId(x+2, y, z+2);
		int qA = rand.nextInt(4);

		if (blockID1 == Block.grass.blockID)
		{
			if(qA==0)
			{
				world.setBlock(x-2, y, z-2, Block.gravel.blockID);
			}
		}
		int qB = rand.nextInt(4);
		if (blockID2 == Block.grass.blockID)
		{
			if(qB==0)
			{
				world.setBlock(x-2, y, z-1, Block.gravel.blockID);
			}
		}		
		int qC = rand.nextInt(4);
		if (blockID3 == Block.grass.blockID)
		{
			if(qC==0)
			{
				world.setBlock(x-2, y, z, Block.gravel.blockID);
			}
		}
		int qD = rand.nextInt(4);
		if (blockID4 == Block.grass.blockID)
		{
			if(qD==0)
			{
				world.setBlock(x-2, y, z+1, Block.gravel.blockID);
			}
		}		
		int qE = rand.nextInt(4);
		if (blockID5 == Block.grass.blockID)
		{
			if(qE==0)
			{
				world.setBlock(x-2, y, z+2, Block.gravel.blockID);
			}
		}	
		int qF = rand.nextInt(4);
		if (blockID6 == Block.grass.blockID)
		{
			if(qF==0)
			{
				world.setBlock(x-1, y, z-2, Block.gravel.blockID);
			}
		}	
		int qG = rand.nextInt(4);
		if (blockID7 == Block.grass.blockID)
		{
			if(qG==0)
			{
				world.setBlock(x-1, y, z-1, Block.gravel.blockID);
			}
		}	  
		int qH = rand.nextInt(4);
		if (blockID8 == Block.grass.blockID)
		{
			if(qH==0)
			{
				world.setBlock(x-1, y, z, Block.gravel.blockID);
			}
		}	
		int qI = rand.nextInt(4);
		if (blockID9 == Block.grass.blockID)
		{
			if(qI==0)
			{
				world.setBlock(x-1, y, z+1, Block.gravel.blockID);
			}
		}	
		int qJ = rand.nextInt(4);
		if (blockID10 == Block.grass.blockID)
		{
			if(qJ==0)
			{
				world.setBlock(x-1, y, z+2, Block.gravel.blockID);
			}
		}	
		int qK = rand.nextInt(4);
		if (blockID11 == Block.grass.blockID)
		{
			if(qK==0)
			{
				world.setBlock(x, y, z-2, Block.gravel.blockID);
			}
		}	
		int qL = rand.nextInt(4);
		if (blockID12 == Block.grass.blockID)
		{
			if(qL==0)
			{
				world.setBlock(x, y, z-1, Block.gravel.blockID);
			}
		}	
		int qM = rand.nextInt(4);
		if (blockID13 == Block.grass.blockID)
		{
			if(qM==0)
			{
				world.setBlock(x, y, z, Block.gravel.blockID);
			}
		}	
		int qN = rand.nextInt(4);
		if (blockID14 == Block.grass.blockID)
		{
			if(qN==0)
			{
				world.setBlock(x, y, z+1, Block.gravel.blockID);
			}
		}
		int qO = rand.nextInt(4);
		if (blockID15 == Block.grass.blockID)
		{
			if(qO==0)
			{
				world.setBlock(x, y, z+2, Block.gravel.blockID);
			}
		}	
		int qP = rand.nextInt(4);
		if (blockID16 == Block.grass.blockID)
		{
			if(qP==0)
			{
				world.setBlock(x+1, y, z-2, Block.gravel.blockID);
			}
		}	 
		int qQ = rand.nextInt(4);
		if (blockID17 == Block.grass.blockID)
		{
			if(qQ==0)
			{
				world.setBlock(x+1, y, z-1, Block.gravel.blockID);
			}
		}	
		int qR = rand.nextInt(4);
		if (blockID18 == Block.grass.blockID)
		{
			if(qR==0)
			{
				world.setBlock(x+1, y, z, Block.gravel.blockID);
			}
		}	
		int qS = rand.nextInt(4);
		if (blockID19 == Block.grass.blockID)
		{
			if(qS==0)
			{
				world.setBlock(x+1, y, z+1, Block.gravel.blockID);
			}
		}	
		int qT = rand.nextInt(4);
		if (blockID20 == Block.grass.blockID)
		{
			if(qT==0)
			{
				world.setBlock(x+1, y, z+2, Block.gravel.blockID);
			}
		}	
		int qU = rand.nextInt(4);
		if (blockID21 == Block.grass.blockID)
		{
			if(qU==0)
			{
				world.setBlock(x+2, y, z-2, Block.gravel.blockID);
			}
		}	
		int qV = rand.nextInt(4);
		if (blockID22 == Block.grass.blockID)
		{
			if(qV==0)
			{
				world.setBlock(x+2, y, z-1, Block.gravel.blockID);
			}
		}	
		int qW = rand.nextInt(4);
		if (blockID23 == Block.grass.blockID)
		{
			if(qW==0)
			{
				world.setBlock(x+2, y, z, Block.gravel.blockID);
			}
		}	
		int qX = rand.nextInt(4);
		if (blockID24 == Block.grass.blockID)
		{
			if(qX==0)
			{
				world.setBlock(x+2, y, z+1, Block.gravel.blockID);
			}
		}	
		int qY = rand.nextInt(4);
		if (blockID25 == Block.grass.blockID)
		{
			if(qY==0)
			{
				world.setBlock(x+2, y, z+2, Block.gravel.blockID);
			}
		}	
		itemstack.damageItem(1, entityplayer);
		return itemstack;
	}
}