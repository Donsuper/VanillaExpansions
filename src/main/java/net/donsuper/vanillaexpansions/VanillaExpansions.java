package net.donsuper.vanillaexpansions;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaExpansions implements ModInitializer {
	public static final String MOD_ID = "vanillaexpansions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		VanillaExpansionItems.initialize();
    }
}