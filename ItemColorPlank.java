package net.minecraft.src;

public class ItemColorPlank extends ItemBlock {

	public ItemColorPlank(int id, Block block)
	{
		super(id);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	public int getPlacedBlockMetadata(int id)
	{
		return id;
	}

	public String [] blockNames = 
	{
	"Plank", "Plank1", "Plank2", "Plank3", "Plank4", "Plank5", "Plank6", "Plank7", "Plank8", "Plank9", "Plank10", "Plank11", "Plank12", "Plank13", "Plank14", "Plank15"
	};
	public String getItemNameIS(ItemStack itemstack)
	{
		return(new StringBuilder()).append(super.getItemName()).append(".").append(blockNames[itemstack.getItemDamage()]).toString();
	}
}