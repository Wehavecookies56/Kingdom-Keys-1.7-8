package api.player.render;

import java.util.*;

import org.objectweb.asm.*;

public final class LayerPlayerArmorConstructorVisitor extends MethodVisitor
{
	private final boolean isObfuscated;
	private final Map<String, Stack<String>> constructorReplacements;

	public LayerPlayerArmorConstructorVisitor(MethodVisitor paramMethodVisitor, boolean isObfuscated, Map<String, Stack<String>> constructorReplacements)
	{
		super(262144, paramMethodVisitor);
		this.isObfuscated = isObfuscated;
		this.constructorReplacements = constructorReplacements;
	}

	public void visitTypeInsn(int opcode, String type)
	{
		if(opcode == Opcodes.NEW && constructorReplacements != null && constructorReplacements.containsKey(type))
		{
			Stack<String> replacementOwnerList = constructorReplacements.get(type);
			if(!replacementOwnerList.isEmpty())
				type = replacementOwnerList.peek();
			int typeSeparatorIndex = type.indexOf(":");
			if(typeSeparatorIndex > 0)
				type = type.substring(0, typeSeparatorIndex);
		}
		super.visitTypeInsn(opcode, type);
	}

	@Override
	public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf)
	{
		if(name.equals("<init>") && constructorReplacements != null && constructorReplacements.containsKey(owner))
		{
			Stack<String> replacementOwnerList = constructorReplacements.get(owner);
			if(!replacementOwnerList.isEmpty())
				owner = replacementOwnerList.pop();
			int typeSeparatorIndex = owner.indexOf(":");
			if(typeSeparatorIndex > 0)
			{
				mv.visitLdcInsn(owner.substring(typeSeparatorIndex + 1));
				owner = owner.substring(0, typeSeparatorIndex);
				int resultSeparatorIndex = desc.indexOf(")");
				desc = desc.substring(0, resultSeparatorIndex) + "Ljava/lang/String;" + desc.substring(resultSeparatorIndex);
			}
		}
		if(isObfuscated && name.equals("<init>") && owner.equals("net/minecraft/client/renderer/entity/layers/LayerBipedArmor"))
			owner = "csm";
		super.visitMethodInsn(opcode, owner, name, desc, itf);
	}
}
