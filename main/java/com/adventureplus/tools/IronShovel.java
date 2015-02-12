package com.adventureplus.tools;

import com.adventureplus.AdventurePlusMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IronShovel extends ItemSpade{

	public IronShovel(ToolMaterial material) {
		super(material);
		GameRegistry.registerItem(this, "IronShovel");
		this.setUnlocalizedName("IronShovel");
		this.setCreativeTab(AdventurePlusMod.tabAdventurePlusTools);
		
	}

}
