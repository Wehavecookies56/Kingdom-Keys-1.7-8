package api.player.model;

public abstract class ModelPlayerBase
{
	public ModelPlayerBase(ModelPlayerAPI modelPlayerAPI)
	{
		this.internalModelPlayerAPI = modelPlayerAPI;
		this.modelPlayerAPI = modelPlayerAPI.modelPlayer;
		this.modelBiped = modelPlayerAPI.modelPlayer.getModelPlayer();
		this.modelPlayer = this.modelBiped instanceof net.minecraft.client.model.ModelPlayer ? (net.minecraft.client.model.ModelPlayer)this.modelBiped : null;
		this.modelPlayerArmor = this.modelBiped instanceof api.player.model.ModelPlayerArmor ? (api.player.model.ModelPlayerArmor)this.modelBiped : null;
	}

	public void beforeBaseAttach(boolean onTheFly)
	{
	}

	public void afterBaseAttach(boolean onTheFly)
	{
	}

	public void beforeLocalConstructing(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, boolean paramBoolean)
	{
	}

	public void afterLocalConstructing(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, boolean paramBoolean)
	{
	}

	public void beforeBaseDetach(boolean onTheFly)
	{
	}

	public void afterBaseDetach(boolean onTheFly)
	{
	}

	public Object dynamic(String key, Object[] parameters)
	{
		return internalModelPlayerAPI.dynamicOverwritten(key, parameters, this);
	}

	public final int hashCode()
	{
		return super.hashCode();
	}

	public void beforeGetRandomModelBox(java.util.Random paramRandom)
	{
	}

	public net.minecraft.client.model.ModelRenderer getRandomModelBox(java.util.Random paramRandom)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenGetRandomModelBox(this);

		net.minecraft.client.model.ModelRenderer _result;
		if(overwritten == null)
			_result = modelPlayerAPI.localGetRandomModelBox(paramRandom);
		else if(overwritten != this)
			_result = overwritten.getRandomModelBox(paramRandom);
		else
			_result = null;

		return _result;
	}

	public void afterGetRandomModelBox(java.util.Random paramRandom)
	{
	}

	public void beforeGetTextureOffset(String paramString)
	{
	}

	public net.minecraft.client.model.TextureOffset getTextureOffset(String paramString)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenGetTextureOffset(this);

		net.minecraft.client.model.TextureOffset _result;
		if(overwritten == null)
			_result = modelPlayerAPI.localGetTextureOffset(paramString);
		else if(overwritten != this)
			_result = overwritten.getTextureOffset(paramString);
		else
			_result = null;

		return _result;
	}

	public void afterGetTextureOffset(String paramString)
	{
	}

	public void beforePostRenderArm(float paramFloat)
	{
	}

	public void postRenderArm(float paramFloat)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenPostRenderArm(this);

		if(overwritten == null)
			modelPlayerAPI.localPostRenderArm(paramFloat);
		else if(overwritten != this)
			overwritten.postRenderArm(paramFloat);

	}

	public void afterPostRenderArm(float paramFloat)
	{
	}

	public void beforeRender(net.minecraft.entity.Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
	{
	}

	public void render(net.minecraft.entity.Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenRender(this);

		if(overwritten == null)
			modelPlayerAPI.localRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
		else if(overwritten != this)
			overwritten.render(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);

	}

	public void afterRender(net.minecraft.entity.Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
	{
	}

	public void beforeRenderCape(float paramFloat)
	{
	}

	public void renderCape(float paramFloat)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenRenderCape(this);

		if(overwritten == null)
			modelPlayerAPI.localRenderCape(paramFloat);
		else if(overwritten != this)
			overwritten.renderCape(paramFloat);

	}

	public void afterRenderCape(float paramFloat)
	{
	}

	public void beforeRenderDeadmau5Head(float paramFloat)
	{
	}

	public void renderDeadmau5Head(float paramFloat)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenRenderDeadmau5Head(this);

		if(overwritten == null)
			modelPlayerAPI.localRenderDeadmau5Head(paramFloat);
		else if(overwritten != this)
			overwritten.renderDeadmau5Head(paramFloat);

	}

	public void afterRenderDeadmau5Head(float paramFloat)
	{
	}

	public void beforeRenderLeftArm()
	{
	}

	public void renderLeftArm()
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenRenderLeftArm(this);

		if(overwritten == null)
			modelPlayerAPI.localRenderLeftArm();
		else if(overwritten != this)
			overwritten.renderLeftArm();

	}

	public void afterRenderLeftArm()
	{
	}

	public void beforeRenderRightArm()
	{
	}

	public void renderRightArm()
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenRenderRightArm(this);

		if(overwritten == null)
			modelPlayerAPI.localRenderRightArm();
		else if(overwritten != this)
			overwritten.renderRightArm();

	}

	public void afterRenderRightArm()
	{
	}

	public void beforeSetInvisible(boolean paramBoolean)
	{
	}

	public void setInvisible(boolean paramBoolean)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenSetInvisible(this);

		if(overwritten == null)
			modelPlayerAPI.localSetInvisible(paramBoolean);
		else if(overwritten != this)
			overwritten.setInvisible(paramBoolean);

	}

	public void afterSetInvisible(boolean paramBoolean)
	{
	}

	public void beforeSetLivingAnimations(net.minecraft.entity.EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3)
	{
	}

	public void setLivingAnimations(net.minecraft.entity.EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenSetLivingAnimations(this);

		if(overwritten == null)
			modelPlayerAPI.localSetLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
		else if(overwritten != this)
			overwritten.setLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);

	}

	public void afterSetLivingAnimations(net.minecraft.entity.EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3)
	{
	}

	public void beforeSetModelAttributes(net.minecraft.client.model.ModelBase paramModelBase)
	{
	}

	public void setModelAttributes(net.minecraft.client.model.ModelBase paramModelBase)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenSetModelAttributes(this);

		if(overwritten == null)
			modelPlayerAPI.localSetModelAttributes(paramModelBase);
		else if(overwritten != this)
			overwritten.setModelAttributes(paramModelBase);

	}

	public void afterSetModelAttributes(net.minecraft.client.model.ModelBase paramModelBase)
	{
	}

	public void beforeSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
	}

	public void setRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenSetRotationAngles(this);

		if(overwritten == null)
			modelPlayerAPI.localSetRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
		else if(overwritten != this)
			overwritten.setRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);

	}

	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
	}

	public void beforeSetTextureOffset(String paramString, int paramInt1, int paramInt2)
	{
	}

	public void setTextureOffset(String paramString, int paramInt1, int paramInt2)
	{
		ModelPlayerBase overwritten = internalModelPlayerAPI.GetOverwrittenSetTextureOffset(this);

		if(overwritten == null)
			modelPlayerAPI.localSetTextureOffset(paramString, paramInt1, paramInt2);
		else if(overwritten != this)
			overwritten.setTextureOffset(paramString, paramInt1, paramInt2);

	}

	public void afterSetTextureOffset(String paramString, int paramInt1, int paramInt2)
	{
	}

	protected final net.minecraft.client.model.ModelBiped modelBiped;
	protected final net.minecraft.client.model.ModelPlayer modelPlayer;
	protected final api.player.model.ModelPlayerArmor modelPlayerArmor;
	protected final IModelPlayer modelPlayerAPI;
	private final ModelPlayerAPI internalModelPlayerAPI;
}
