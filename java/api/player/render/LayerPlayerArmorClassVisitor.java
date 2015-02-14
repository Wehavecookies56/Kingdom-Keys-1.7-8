package api.player.render;

import java.io.*;
import java.util.*;

import org.objectweb.asm.*;

public final class LayerPlayerArmorClassVisitor extends ClassVisitor
{
	public static final String targetClassName = "api.player.render.LayerPlayerArmor";
	public static final String obfuscatedClassReference = "api/player/render/LayerPlayerArmor";
	public static final String obfuscatedSuperClassReference = "csm";
	public static final String deobfuscatedClassReference = "api/player/render/LayerPlayerArmor";
	public static final String deobfuscateSuperClassReference = "net/minecraft/client/renderer/entity/layers/LayerBipedArmor";


	public static byte[] transform(byte[] bytes, boolean isObfuscated, Map<String, Stack<String>> constructorReplacements)
	{
		try
		{
			ByteArrayInputStream in = new ByteArrayInputStream(bytes);
			ClassReader cr = new ClassReader(in);
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
			LayerPlayerArmorClassVisitor p = new LayerPlayerArmorClassVisitor(cw, isObfuscated, constructorReplacements);

			cr.accept(p, 0);

			byte[] result = cw.toByteArray();
			in.close();
			return result;
		}
		catch(IOException ioe)
		{
			throw new RuntimeException(ioe);
		}
	}

	private final boolean isObfuscated;
	private final Map<String, Stack<String>> constructorReplacements;

	public LayerPlayerArmorClassVisitor(ClassVisitor classVisitor, boolean isObfuscated, Map<String, Stack<String>> constructorReplacements)
	{
		super(262144, classVisitor);
		this.isObfuscated = isObfuscated;
		this.constructorReplacements = constructorReplacements;
	}

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
	{
		if(isObfuscated && superName.equals("net/minecraft/client/renderer/entity/layers/LayerBipedArmor"))
			superName = "csm";
		super.visit(version, access, name, signature, superName, interfaces);
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
	{
		if(name.equals("<init>"))
			return new LayerPlayerArmorConstructorVisitor(super.visitMethod(access, name, desc, signature, exceptions), isObfuscated, constructorReplacements);

		return new LayerPlayerArmorConstructorVisitor(super.visitMethod(access, name, desc, signature, exceptions), isObfuscated, constructorReplacements);
	}
}
