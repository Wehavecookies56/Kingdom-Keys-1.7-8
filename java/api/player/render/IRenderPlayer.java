package api.player.render;

public interface IRenderPlayer
{
	RenderPlayerBase getRenderPlayerBase(String baseId);

	java.util.Set<String> getRenderPlayerBaseIds();

	Object dynamic(String key, Object[] parameters);

	boolean realAddLayer(net.minecraft.client.renderer.entity.layers.LayerRenderer paramLayerRenderer);

	boolean superAddLayer(net.minecraft.client.renderer.entity.layers.LayerRenderer paramLayerRenderer);

	boolean localAddLayer(net.minecraft.client.renderer.entity.layers.LayerRenderer paramLayerRenderer);

	boolean realBindEntityTexture(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	boolean superBindEntityTexture(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	boolean localBindEntityTexture(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void realBindTexture(net.minecraft.util.ResourceLocation paramResourceLocation);

	void superBindTexture(net.minecraft.util.ResourceLocation paramResourceLocation);

	void localBindTexture(net.minecraft.util.ResourceLocation paramResourceLocation);

	boolean realCanRenderName(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	boolean superCanRenderName(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	boolean localCanRenderName(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void realDoRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	void localDoRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	void realDoRenderShadowAndFire(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	void superDoRenderShadowAndFire(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	void localDoRenderShadowAndFire(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	int realGetColorMultiplier(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2);

	int superGetColorMultiplier(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2);

	int localGetColorMultiplier(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2);

	float realGetDeathMaxRotation(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	float superGetDeathMaxRotation(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	float localGetDeathMaxRotation(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	net.minecraft.util.ResourceLocation realGetEntityTexture(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	net.minecraft.util.ResourceLocation localGetEntityTexture(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	net.minecraft.client.gui.FontRenderer realGetFontRendererFromRenderManager();

	net.minecraft.client.gui.FontRenderer superGetFontRendererFromRenderManager();

	net.minecraft.client.gui.FontRenderer localGetFontRendererFromRenderManager();

	net.minecraft.client.model.ModelBase realGetMainModel();

	net.minecraft.client.model.ModelBase superGetMainModel();

	net.minecraft.client.model.ModelBase localGetMainModel();

	net.minecraft.client.model.ModelPlayer realGetPlayerModel();

	net.minecraft.client.model.ModelPlayer localGetPlayerModel();

	net.minecraft.client.renderer.entity.RenderManager realGetRenderManager();

	net.minecraft.client.renderer.entity.RenderManager superGetRenderManager();

	net.minecraft.client.renderer.entity.RenderManager localGetRenderManager();

	float realGetSwingProgress(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	float superGetSwingProgress(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	float localGetSwingProgress(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	float realHandleRotationFloat(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	float superHandleRotationFloat(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	float localHandleRotationFloat(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	float realInterpolateRotation(float paramFloat1, float paramFloat2, float paramFloat3);

	float superInterpolateRotation(float paramFloat1, float paramFloat2, float paramFloat3);

	float localInterpolateRotation(float paramFloat1, float paramFloat2, float paramFloat3);

	void realPassSpecialRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void superPassSpecialRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void localPassSpecialRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void realPreRenderCallback(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	void localPreRenderCallback(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	boolean realRemoveLayer(net.minecraft.client.renderer.entity.layers.LayerRenderer paramLayerRenderer);

	boolean superRemoveLayer(net.minecraft.client.renderer.entity.layers.LayerRenderer paramLayerRenderer);

	boolean localRemoveLayer(net.minecraft.client.renderer.entity.layers.LayerRenderer paramLayerRenderer);

	void realRenderLayers(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7);

	void superRenderLayers(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7);

	void localRenderLayers(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7);

	void realRenderLeftArm(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void localRenderLeftArm(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void realRenderLivingAt(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void localRenderLivingAt(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void realRenderLivingLabel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt);

	void superRenderLivingLabel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt);

	void localRenderLivingLabel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt);

	void realRenderModel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6);

	void superRenderModel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6);

	void localRenderModel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6);

	void realRenderName(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void superRenderName(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void localRenderName(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3);

	void realRenderOffsetLivingLabel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4);

	void localRenderOffsetLivingLabel(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4);

	void realRenderRightArm(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void localRenderRightArm(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void realRotateCorpse(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3);

	void localRotateCorpse(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3);

	boolean realSetBrightness(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat, boolean paramBoolean);

	boolean superSetBrightness(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat, boolean paramBoolean);

	boolean localSetBrightness(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat, boolean paramBoolean);

	boolean realSetDoRenderBrightness(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	boolean superSetDoRenderBrightness(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	boolean localSetDoRenderBrightness(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, float paramFloat);

	void realSetModelVisibilities(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void localSetModelVisibilities(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	void realSetRenderOutlines(boolean paramBoolean);

	void superSetRenderOutlines(boolean paramBoolean);

	void localSetRenderOutlines(boolean paramBoolean);

	boolean realSetScoreTeamColor(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	boolean superSetScoreTeamColor(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	boolean localSetScoreTeamColor(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer);

	boolean realShouldRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, net.minecraft.client.renderer.culling.ICamera paramICamera, double paramDouble1, double paramDouble2, double paramDouble3);

	boolean superShouldRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, net.minecraft.client.renderer.culling.ICamera paramICamera, double paramDouble1, double paramDouble2, double paramDouble3);

	boolean localShouldRender(net.minecraft.client.entity.AbstractClientPlayer paramAbstractClientPlayer, net.minecraft.client.renderer.culling.ICamera paramICamera, double paramDouble1, double paramDouble2, double paramDouble3);

	void realTransformHeldFull3DItemLayer();

	void superTransformHeldFull3DItemLayer();

	void localTransformHeldFull3DItemLayer();

	void realUnsetBrightness();

	void superUnsetBrightness();

	void localUnsetBrightness();

	void realUnsetScoreTeamColor();

	void superUnsetScoreTeamColor();

	void localUnsetScoreTeamColor();

	java.nio.FloatBuffer getBrightnessBufferField();

	void setBrightnessBufferField(java.nio.FloatBuffer brightnessBuffer);

	java.util.List<?> getLayerRenderersField();

	void setLayerRenderersField(java.util.List<?> layerRenderers);

	net.minecraft.client.model.ModelBase getMainModelField();

	void setMainModelField(net.minecraft.client.model.ModelBase mainModel);

	net.minecraft.client.renderer.entity.RenderManager getRenderManagerField();

	boolean getRenderOutlinesField();

	void setRenderOutlinesField(boolean renderOutlines);

	float getShadowOpaqueField();

	void setShadowOpaqueField(float shadowOpaque);

	float getShadowSizeField();

	void setShadowSizeField(float shadowSize);

	boolean getSmallArmsField();

	void setSmallArmsField(boolean smallArms);

}
