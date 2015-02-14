package api.player.forge;

import java.util.*;

import net.minecraft.launchwrapper.*;
import api.player.model.*;
import api.player.render.*;

public class RenderPlayerAPITransformer implements IClassTransformer
{
	public byte[] transform(String name, String transformedName, byte[] bytes)
	{
		if(transformedName.equals(RenderPlayerClassVisitor.targetClassName))
		{
			Stack<String> models = new Stack<String>();
			models.push(ModelPlayerClassVisitor.deobfuscatedClassReference + ":main");

			Stack<String> layers = new Stack<String>();
			layers.push(LayerPlayerArmorClassVisitor.deobfuscatedClassReference);

			Map<String, Stack<String>> constructorReplacements = new Hashtable<String, Stack<String>>();
			constructorReplacements.put(ModelPlayerClassVisitor.obfuscatedClassReference, models);
			constructorReplacements.put(ModelPlayerClassVisitor.deobfuscatedClassReference, models);
			constructorReplacements.put(LayerPlayerArmorClassVisitor.obfuscatedSuperClassReference, layers);
			constructorReplacements.put(LayerPlayerArmorClassVisitor.deobfuscateSuperClassReference, layers);

			return RenderPlayerClassVisitor.transform(bytes, RenderPlayerAPIPlugin.isObfuscated, constructorReplacements);
		}

		if(name.equals(LayerPlayerArmorClassVisitor.targetClassName))
		{
			Stack<String> models = new Stack<String>();
			models.push(ModelPlayerArmorClassVisitor.deobfuscatedClassReference + ":chestplate");
			models.push(ModelPlayerArmorClassVisitor.deobfuscatedClassReference + ":armor");

			Map<String, Stack<String>> constructorReplacements = new Hashtable<String, Stack<String>>();
			constructorReplacements.put(ModelPlayerArmorClassVisitor.deobfuscatedClassReference, models);

			return LayerPlayerArmorClassVisitor.transform(bytes, RenderPlayerAPIPlugin.isObfuscated, constructorReplacements);
		}

		if(transformedName.equals(ModelPlayerClassVisitor.targetClassName))
			return ModelPlayerClassVisitor.transform(bytes, RenderPlayerAPIPlugin.isObfuscated);

		if(transformedName.equals(ModelPlayerArmorClassVisitor.targetClassName))
			return ModelPlayerArmorClassVisitor.transform(bytes, RenderPlayerAPIPlugin.isObfuscated);

		return bytes;
	}
}