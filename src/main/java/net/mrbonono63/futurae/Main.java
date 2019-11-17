package net.mrbonono63.futurae;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	//declaring items
	public static final Item PLASMA_RIFLE = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item PLASMA_BLADE = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//registering items
		Registry.register(Registry.ITEM, new Identifier("futurae", "plasma_rifle"), PLASMA_RIFLE);
		Registry.register(Registry.ITEM, new Identifier("futurae", "plasma_blade"), PLASMA_BLADE);
		//sys out
		System.out.println("Main Java Class finished loading");
	}
}
