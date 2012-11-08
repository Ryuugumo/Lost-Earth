package net.minecraft.src;

public class ModelLantern extends ModelBase
{
	//fields
	ModelRenderer MainSupport;
	ModelRenderer HandHold;
	ModelRenderer Bottom;
	ModelRenderer Candle;
	ModelRenderer Top1;
	ModelRenderer Top2;
	ModelRenderer Top3;
	ModelRenderer Top4;
	ModelRenderer SubSupport1;
	ModelRenderer SubSupport2;
	ModelRenderer SubSupport3;
	ModelRenderer SubSupport4;
	ModelRenderer SubSupport5;
	ModelRenderer SubSupport6;
	ModelRenderer SubSupport7;
	ModelRenderer SubSupport8;

	public ModelLantern()
	{
		textureWidth = 64;
		textureHeight = 64;

		MainSupport = new ModelRenderer(this, 0, 0);
		MainSupport.addBox(0F, 0F, 0F, 4, 6, 4);
		MainSupport.setRotationPoint(-2F, 18F, -2F);
		MainSupport.setTextureSize(64, 64);
		MainSupport.mirror = true;
		setRotation(MainSupport, 0F, 0F, 0F);
		HandHold = new ModelRenderer(this, 0, 12);
		HandHold.addBox(0F, 0F, 0F, 16, 2, 2);
		HandHold.setRotationPoint(-8F, 20F, -1F);
		HandHold.setTextureSize(64, 64);
		HandHold.mirror = true;
		setRotation(HandHold, 0F, 0F, 0F);
		Bottom = new ModelRenderer(this, 0, 44);
		Bottom.addBox(0F, 0F, 0F, 8, 1, 8);
		Bottom.setRotationPoint(-4F, 17F, -4F);
		Bottom.setTextureSize(64, 64);
		Bottom.mirror = true;
		setRotation(Bottom, 0F, 0F, 0F);
		Candle = new ModelRenderer(this, 21, 0);
		Candle.addBox(0F, 0F, 0F, 2, 4, 2);
		Candle.setRotationPoint(-1F, 13F, -1F);
		Candle.setTextureSize(64, 64);
		Candle.mirror = true;
		setRotation(Candle, 0F, 0F, 0F);
		Top1 = new ModelRenderer(this, 0, 53);
		Top1.addBox(0F, 0F, 0F, 10, 1, 10);
		Top1.setRotationPoint(-5F, 8F, -5F);
		Top1.setTextureSize(64, 64);
		Top1.mirror = true;
		setRotation(Top1, 0F, 0F, 0F);
		Top2 = new ModelRenderer(this, 0, 44);
		Top2.addBox(0F, 0F, 0F, 8, 1, 8);
		Top2.setRotationPoint(-4F, 7F, -4F);
		Top2.setTextureSize(64, 64);
		Top2.mirror = true;
		setRotation(Top2, 0F, 0F, 0F);
		Top3 = new ModelRenderer(this, 0, 37);
		Top3.addBox(0F, 0F, 0F, 6, 1, 6);
		Top3.setRotationPoint(-3F, 6F, -3F);
		Top3.setTextureSize(64, 64);
		Top3.mirror = true;
		setRotation(Top3, 0F, 0F, 0F);
		Top4 = new ModelRenderer(this, 0, 32);
		Top4.addBox(0F, 0F, 0F, 4, 1, 4);
		Top4.setRotationPoint(-2F, 5F, -2F);
		Top4.setTextureSize(64, 64);
		Top4.mirror = true;
		setRotation(Top4, 0F, 0F, 0F);
		SubSupport1 = new ModelRenderer(this, 16, 0);
		SubSupport1.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport1.setRotationPoint(3F, 13F, -4F);
		SubSupport1.setTextureSize(64, 64);
		SubSupport1.mirror = true;
		setRotation(SubSupport1, 0F, 0F, 0F);
		SubSupport2 = new ModelRenderer(this, 16, 0);
		SubSupport2.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport2.setRotationPoint(4F, 9F, -5F);
		SubSupport2.setTextureSize(64, 64);
		SubSupport2.mirror = true;
		setRotation(SubSupport2, 0F, 0F, 0F);
		SubSupport3 = new ModelRenderer(this, 16, 0);
		SubSupport3.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport3.setRotationPoint(3F, 13F, 3F);
		SubSupport3.setTextureSize(64, 64);
		SubSupport3.mirror = true;
		setRotation(SubSupport3, 0F, 0F, 0F);
		SubSupport4 = new ModelRenderer(this, 16, 0);
		SubSupport4.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport4.setRotationPoint(4F, 9F, 4F);
		SubSupport4.setTextureSize(64, 64);
		SubSupport4.mirror = true;
		setRotation(SubSupport4, 0F, 0F, 0F);
		SubSupport5 = new ModelRenderer(this, 16, 0);
		SubSupport5.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport5.setRotationPoint(-4F, 13F, -4F);
		SubSupport5.setTextureSize(64, 64);
		SubSupport5.mirror = true;
		setRotation(SubSupport5, 0F, 0F, 0F);
		SubSupport6 = new ModelRenderer(this, 16, 0);
		SubSupport6.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport6.setRotationPoint(-5F, 9F, -5F);
		SubSupport6.setTextureSize(64, 64);
		SubSupport6.mirror = true;
		setRotation(SubSupport6, 0F, 0F, 0F);
		SubSupport7 = new ModelRenderer(this, 16, 0);
		SubSupport7.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport7.setRotationPoint(-5F, 9F, 4F);
		SubSupport7.setTextureSize(64, 64);
		SubSupport7.mirror = true;
		setRotation(SubSupport7, 0F, 0F, 0F);
		SubSupport8 = new ModelRenderer(this, 16, 0);
		SubSupport8.addBox(0F, 0F, 0F, 1, 4, 1);
		SubSupport8.setRotationPoint(-4F, 13F, 3F);
		SubSupport8.setTextureSize(64, 64);
		SubSupport8.mirror = true;
		setRotation(SubSupport8, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		MainSupport.render(f5);
		HandHold.render(f5);
		Bottom.render(f5);
		Candle.render(f5);
		Top1.render(f5);
		Top2.render(f5);
		Top3.render(f5);
		Top4.render(f5);
		SubSupport1.render(f5);
		SubSupport2.render(f5);
		SubSupport3.render(f5);
		SubSupport4.render(f5);
		SubSupport5.render(f5);
		SubSupport6.render(f5);
		SubSupport7.render(f5);
		SubSupport8.render(f5);
	}

	public void renderModel(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		MainSupport.render(f5);
		HandHold.render(f5);
		Bottom.render(f5);
		Candle.render(f5);
		Top1.render(f5);
		Top2.render(f5);
		Top3.render(f5);
		Top4.render(f5);
		SubSupport1.render(f5);
		SubSupport2.render(f5);
		SubSupport3.render(f5);
		SubSupport4.render(f5);
		SubSupport5.render(f5);
		SubSupport6.render(f5);
		SubSupport7.render(f5);
		SubSupport8.render(f5);
	}


	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
