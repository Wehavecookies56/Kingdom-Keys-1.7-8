package wehavecookies56.kk.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import wehavecookies56.kk.KingdomKeys;

public class ConfigGui extends GuiConfig{
	public ConfigGui(GuiScreen parent){
		super(parent, new ConfigElement(KingdomKeys.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                "KingdomKeys", false, false, GuiConfig.getAbridgedConfigPath(KingdomKeys.config.toString()));
	}
}
