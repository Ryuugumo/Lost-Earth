package net.minecraft.src;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class TileEntityPungiRenderer extends TileEntitySpecialRenderer
{
	private ModelPungi model;

	public TileEntityPungiRenderer() 
	{
		model = new ModelPungi();
	}
	public void renderAModelAt(TileEntityPungi tile, double d, double d1, double d2, float f)
	{
		int i = 0;

		if (tile.worldObj != null)
		{
			i = (tile.worldObj.getBlockMetadata(tile.xCoord, tile.yCoord, tile.zCoord));
		}

		bindTextureByName("/LE/BlockPungi.png");
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		model.render(null, 0.0625F, 0.0625F, 0.0625F, 0.0625F, 0.0625F, 0.0625F);
		GL11.glPopMatrix();

	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((TileEntityPungi) tileentity, d, d1, d2, f);
	}
}