package api.player.forge;

import java.util.*;

import net.minecraftforge.fml.relauncher.*;

@IFMLLoadingPlugin.MCVersion("1.8")
@IFMLLoadingPlugin.TransformerExclusions("api.player.forge")
public class RenderPlayerAPIPlugin implements IFMLLoadingPlugin
{
	public static String Version = "1.2";

	public static boolean isObfuscated;

	public String[] getASMTransformerClass()
	{
		return new String[] { "api.player.forge.RenderPlayerAPITransformer" };
	}

	public String getModContainerClass()
	{
		return "api.player.forge.RenderPlayerAPIContainer";
	}

	public String getSetupClass()
	{
		return null;
	}

	public void injectData(Map<String, Object> data)
	{
		isObfuscated = (Boolean)data.get("runtimeDeobfuscationEnabled");
	}

	public String getAccessTransformerClass()
	{
		return null;
	}
}