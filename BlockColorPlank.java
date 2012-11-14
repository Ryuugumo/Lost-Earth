package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.List;

public class BlockColorPlank extends Block
{
	public BlockColorPlank(int id, int texture)
	{
		super(id, texture, Material.wood);
		this.setRequiresSelfNotify();
	}

	public int getBlockTextureFromSideAndMetadata(int side, int subtype)
	{
		switch (subtype)
		{
		case 0:
			return 16;
		case 1:
			return 1;//ModLoader.addOverride("/terrain.png", "/LE/PlankLGrey.png");
		case 2:
			return 2;//ModLoader.addOverride("/terrain.png", "/LE/PlankGrey.png");
		case 3:
			return 3;//ModLoader.addOverride("/terrain.png", "/LE/PlankBlack.png");
		case 4:
			return 4;//ModLoader.addOverride("/terrain.png", "/LE/PlankLBlue.png");
		case 5:
			return 5;//ModLoader.addOverride("/terrain.png", "/LE/PlankBlue.png");
		case 6:
			return 6;//ModLoader.addOverride("/terrain.png", "/LE/PlankCyan.png");
		case 7:
			return 7;//ModLoader.addOverride("/terrain.png", "/LE/PlankLime.png");
		case 8:
			return 8;//ModLoader.addOverride("/terrain.png", "/LE/PlankGreen.png");
		case 9:
			return 9;//ModLoader.addOverride("/terrain.png", "/LE/PlankBrown.png");
		case 10:
			return 10;//ModLoader.addOverride("/terrain.png", "/LE/PlankPurple.png");
		case 11:
			return 11;//ModLoader.addOverride("/terrain.png", "/LE/PlankMagenta.png");
		case 12:
			return 12;//ModLoader.addOverride("/terrain.png", "/LE/PlankOrange.png");
		case 13:
			return 13;//ModLoader.addOverride("/terrain.png", "/LE/PlankYellow.png");
		case 14:
			return 14;//ModLoader.addOverride("/terrain.png", "/LE/PlankPink.png");
		case 15:
			return 15;//ModLoader.addOverride("/terrain.png", "/LE/PlankRed.png");
		default:
			return 16;//ModLoader.addOverride("/terrain.png", "/LE/PlankWhite.png");
		}
	}

	public int damageDropped(int par1)
	{
		return par1;
	}

	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		par3List.add(new ItemStack(par1, 1, 0));
		par3List.add(new ItemStack(par1, 1, 1));
		par3List.add(new ItemStack(par1, 1, 2));
		par3List.add(new ItemStack(par1, 1, 3));
		par3List.add(new ItemStack(par1, 1, 4));
		par3List.add(new ItemStack(par1, 1, 5));
		par3List.add(new ItemStack(par1, 1, 6));
		par3List.add(new ItemStack(par1, 1, 7));
		par3List.add(new ItemStack(par1, 1, 8));
		par3List.add(new ItemStack(par1, 1, 9));
		par3List.add(new ItemStack(par1, 1, 10));
		par3List.add(new ItemStack(par1, 1, 11));
		par3List.add(new ItemStack(par1, 1, 12));
		par3List.add(new ItemStack(par1, 1, 13));
		par3List.add(new ItemStack(par1, 1, 14));
		par3List.add(new ItemStack(par1, 1, 15));
	}
}
