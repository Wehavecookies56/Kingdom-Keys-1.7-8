package api.player.model;

import org.objectweb.asm.*;

public final class ModelPlayerArmorConstructorVisitor extends MethodVisitor
{
	private final boolean isObfuscated;
	private final boolean createApi;
	private final int parameterOffset;

	public ModelPlayerArmorConstructorVisitor(MethodVisitor paramMethodVisitor, boolean isObfuscated, boolean createApi, int parameterOffset)
	{
		super(262144, paramMethodVisitor);
		this.isObfuscated = isObfuscated;
		this.createApi = createApi;
		this.parameterOffset = parameterOffset;
	}

	@Override
	public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf)
	{
		if(isObfuscated && name.equals("<init>") && owner.equals("net/minecraft/client/model/ModelBiped"))
			owner = "ccl";
		if(name.equals("<init>") && owner.equals(isObfuscated ? "obf_patterns/playerapi_1_7_2/ModelPlayerArmor" : "deobf_patterns/playerapi_1_7_2/ModelPlayerArmor"))
		{
			desc = desc.substring(0, desc.indexOf(")")) + "Ljava/lang/String;)V";
			mv.visitVarInsn(Opcodes.ALOAD, parameterOffset);
		}
		super.visitMethodInsn(opcode, owner, name, desc, itf);
		if(createApi && name.equals("<init>") && owner.equals(isObfuscated ? "ccl" : "net/minecraft/client/model/ModelBiped"))
		{
			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitVarInsn(Opcodes.FLOAD, 1);
			mv.visitVarInsn(Opcodes.FLOAD, 2);
			mv.visitVarInsn(Opcodes.ILOAD, 3);
			mv.visitVarInsn(Opcodes.ILOAD, 4);
			mv.visitLdcInsn(false);
			mv.visitVarInsn(Opcodes.ALOAD, 5);
			mv.visitMethodInsn(Opcodes.INVOKESTATIC, "api/player/model/ModelPlayerAPI", "create", "(Lapi/player/model/IModelPlayerAPI;FFIIZLjava/lang/String;)Lapi/player/model/ModelPlayerAPI;", false);
			mv.visitFieldInsn(Opcodes.PUTFIELD, "api/player/model/ModelPlayerArmor", "modelPlayerAPI", "Lapi/player/model/ModelPlayerAPI;");

			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitVarInsn(Opcodes.FLOAD, 1);
			mv.visitVarInsn(Opcodes.FLOAD, 2);
			mv.visitVarInsn(Opcodes.ILOAD, 3);
			mv.visitVarInsn(Opcodes.ILOAD, 4);
			mv.visitLdcInsn(false);
			mv.visitMethodInsn(Opcodes.INVOKESTATIC, "api/player/model/ModelPlayerAPI", "beforeLocalConstructing", "(Lapi/player/model/IModelPlayerAPI;FFIIZ)V", false);
		}
	}

	public void visitInsn(int opcode)
	{
		if(createApi && opcode == Opcodes.RETURN)
		{
			mv.visitVarInsn(Opcodes.ALOAD, 0);
			mv.visitVarInsn(Opcodes.FLOAD, 1);
			mv.visitVarInsn(Opcodes.FLOAD, 2);
			mv.visitVarInsn(Opcodes.ILOAD, 3);
			mv.visitVarInsn(Opcodes.ILOAD, 4);
			mv.visitLdcInsn(false);
			mv.visitMethodInsn(Opcodes.INVOKESTATIC, "api/player/model/ModelPlayerAPI", "afterLocalConstructing", "(Lapi/player/model/IModelPlayerAPI;FFIIZ)V", false);
		}
		super.visitInsn(opcode);
	}
}
