package api.player.model;

import java.util.*;

public final class ModelPlayerBaseSorting
{
	private String[] beforeLocalConstructingSuperiors = null;
	private String[] beforeLocalConstructingInferiors = null;
	private String[] afterLocalConstructingSuperiors = null;
	private String[] afterLocalConstructingInferiors = null;

	private Map<String, String[]> dynamicBeforeSuperiors = null;
	private Map<String, String[]> dynamicBeforeInferiors = null;
	private Map<String, String[]> dynamicOverrideSuperiors = null;
	private Map<String, String[]> dynamicOverrideInferiors = null;
	private Map<String, String[]> dynamicAfterSuperiors = null;
	private Map<String, String[]> dynamicAfterInferiors = null;

	private String[] beforeGetRandomModelBoxSuperiors = null;
	private String[] beforeGetRandomModelBoxInferiors = null;
	private String[] overrideGetRandomModelBoxSuperiors = null;
	private String[] overrideGetRandomModelBoxInferiors = null;
	private String[] afterGetRandomModelBoxSuperiors = null;
	private String[] afterGetRandomModelBoxInferiors = null;

	private String[] beforeGetTextureOffsetSuperiors = null;
	private String[] beforeGetTextureOffsetInferiors = null;
	private String[] overrideGetTextureOffsetSuperiors = null;
	private String[] overrideGetTextureOffsetInferiors = null;
	private String[] afterGetTextureOffsetSuperiors = null;
	private String[] afterGetTextureOffsetInferiors = null;

	private String[] beforePostRenderArmSuperiors = null;
	private String[] beforePostRenderArmInferiors = null;
	private String[] overridePostRenderArmSuperiors = null;
	private String[] overridePostRenderArmInferiors = null;
	private String[] afterPostRenderArmSuperiors = null;
	private String[] afterPostRenderArmInferiors = null;

	private String[] beforeRenderSuperiors = null;
	private String[] beforeRenderInferiors = null;
	private String[] overrideRenderSuperiors = null;
	private String[] overrideRenderInferiors = null;
	private String[] afterRenderSuperiors = null;
	private String[] afterRenderInferiors = null;

	private String[] beforeRenderCapeSuperiors = null;
	private String[] beforeRenderCapeInferiors = null;
	private String[] overrideRenderCapeSuperiors = null;
	private String[] overrideRenderCapeInferiors = null;
	private String[] afterRenderCapeSuperiors = null;
	private String[] afterRenderCapeInferiors = null;

	private String[] beforeRenderDeadmau5HeadSuperiors = null;
	private String[] beforeRenderDeadmau5HeadInferiors = null;
	private String[] overrideRenderDeadmau5HeadSuperiors = null;
	private String[] overrideRenderDeadmau5HeadInferiors = null;
	private String[] afterRenderDeadmau5HeadSuperiors = null;
	private String[] afterRenderDeadmau5HeadInferiors = null;

	private String[] beforeRenderLeftArmSuperiors = null;
	private String[] beforeRenderLeftArmInferiors = null;
	private String[] overrideRenderLeftArmSuperiors = null;
	private String[] overrideRenderLeftArmInferiors = null;
	private String[] afterRenderLeftArmSuperiors = null;
	private String[] afterRenderLeftArmInferiors = null;

	private String[] beforeRenderRightArmSuperiors = null;
	private String[] beforeRenderRightArmInferiors = null;
	private String[] overrideRenderRightArmSuperiors = null;
	private String[] overrideRenderRightArmInferiors = null;
	private String[] afterRenderRightArmSuperiors = null;
	private String[] afterRenderRightArmInferiors = null;

	private String[] beforeSetInvisibleSuperiors = null;
	private String[] beforeSetInvisibleInferiors = null;
	private String[] overrideSetInvisibleSuperiors = null;
	private String[] overrideSetInvisibleInferiors = null;
	private String[] afterSetInvisibleSuperiors = null;
	private String[] afterSetInvisibleInferiors = null;

	private String[] beforeSetLivingAnimationsSuperiors = null;
	private String[] beforeSetLivingAnimationsInferiors = null;
	private String[] overrideSetLivingAnimationsSuperiors = null;
	private String[] overrideSetLivingAnimationsInferiors = null;
	private String[] afterSetLivingAnimationsSuperiors = null;
	private String[] afterSetLivingAnimationsInferiors = null;

	private String[] beforeSetModelAttributesSuperiors = null;
	private String[] beforeSetModelAttributesInferiors = null;
	private String[] overrideSetModelAttributesSuperiors = null;
	private String[] overrideSetModelAttributesInferiors = null;
	private String[] afterSetModelAttributesSuperiors = null;
	private String[] afterSetModelAttributesInferiors = null;

	private String[] beforeSetRotationAnglesSuperiors = null;
	private String[] beforeSetRotationAnglesInferiors = null;
	private String[] overrideSetRotationAnglesSuperiors = null;
	private String[] overrideSetRotationAnglesInferiors = null;
	private String[] afterSetRotationAnglesSuperiors = null;
	private String[] afterSetRotationAnglesInferiors = null;

	private String[] beforeSetTextureOffsetSuperiors = null;
	private String[] beforeSetTextureOffsetInferiors = null;
	private String[] overrideSetTextureOffsetSuperiors = null;
	private String[] overrideSetTextureOffsetInferiors = null;
	private String[] afterSetTextureOffsetSuperiors = null;
	private String[] afterSetTextureOffsetInferiors = null;


	public String[] getBeforeLocalConstructingSuperiors()
	{
		return beforeLocalConstructingSuperiors;
	}

	public String[] getBeforeLocalConstructingInferiors()
	{
		return beforeLocalConstructingInferiors;
	}

	public String[] getAfterLocalConstructingSuperiors()
	{
		return afterLocalConstructingSuperiors;
	}

	public String[] getAfterLocalConstructingInferiors()
	{
		return afterLocalConstructingInferiors;
	}

	public void setBeforeLocalConstructingSuperiors(String[] value)
	{
		beforeLocalConstructingSuperiors = value;
	}

	public void setBeforeLocalConstructingInferiors(String[] value)
	{
		beforeLocalConstructingInferiors = value;
	}

	public void setAfterLocalConstructingSuperiors(String[] value)
	{
		afterLocalConstructingSuperiors = value;
	}

	public void setAfterLocalConstructingInferiors(String[] value)
	{
		afterLocalConstructingInferiors = value;
	}

	public Map<String, String[]> getDynamicBeforeSuperiors()
	{
		return dynamicBeforeSuperiors;
	}

	public Map<String, String[]> getDynamicBeforeInferiors()
	{
		return dynamicBeforeInferiors;
	}

	public Map<String, String[]> getDynamicOverrideSuperiors()
	{
		return dynamicOverrideSuperiors;
	}

	public Map<String, String[]> getDynamicOverrideInferiors()
	{
		return dynamicOverrideInferiors;
	}

	public Map<String, String[]> getDynamicAfterSuperiors()
	{
		return dynamicAfterSuperiors;
	}

	public Map<String, String[]> getDynamicAfterInferiors()
	{
		return dynamicAfterInferiors;
	}

	public void setDynamicBeforeSuperiors(String name, String[] superiors)
	{
		dynamicBeforeSuperiors = setDynamic(name, superiors, dynamicBeforeSuperiors);
	}

	public void setDynamicBeforeInferiors(String name, String[] inferiors)
	{
		dynamicBeforeInferiors = setDynamic(name, inferiors, dynamicBeforeInferiors);
	}

	public void setDynamicOverrideSuperiors(String name, String[] superiors)
	{
		dynamicOverrideSuperiors = setDynamic(name, superiors, dynamicOverrideSuperiors);
	}

	public void setDynamicOverrideInferiors(String name, String[] inferiors)
	{
		dynamicOverrideInferiors = setDynamic(name, inferiors, dynamicOverrideInferiors);
	}

	public void setDynamicAfterSuperiors(String name, String[] superiors)
	{
		dynamicAfterSuperiors = setDynamic(name, superiors, dynamicAfterSuperiors);
	}

	public void setDynamicAfterInferiors(String name, String[] inferiors)
	{
		dynamicAfterInferiors = setDynamic(name, inferiors, dynamicAfterInferiors);
	}

	private Map<String, String[]> setDynamic(String name, String[] names, Map<String, String[]> map)
	{
		if(name == null)
			throw new IllegalArgumentException("Parameter 'name' may not be null");

		if(names == null)
		{
			if(map != null)
				map.remove(name);
			return map;
		}

		if(map == null)
			map = new HashMap<String, String[]>();
		map.put(name, names);

		return map;
	}

	public String[] getBeforeGetRandomModelBoxSuperiors()
	{
		return beforeGetRandomModelBoxSuperiors;
	}

	public String[] getBeforeGetRandomModelBoxInferiors()
	{
		return beforeGetRandomModelBoxInferiors;
	}

	public String[] getOverrideGetRandomModelBoxSuperiors()
	{
		return overrideGetRandomModelBoxSuperiors;
	}

	public String[] getOverrideGetRandomModelBoxInferiors()
	{
		return overrideGetRandomModelBoxInferiors;
	}

	public String[] getAfterGetRandomModelBoxSuperiors()
	{
		return afterGetRandomModelBoxSuperiors;
	}

	public String[] getAfterGetRandomModelBoxInferiors()
	{
		return afterGetRandomModelBoxInferiors;
	}

	public void setBeforeGetRandomModelBoxSuperiors(String[] value)
	{
		beforeGetRandomModelBoxSuperiors = value;
	}

	public void setBeforeGetRandomModelBoxInferiors(String[] value)
	{
		beforeGetRandomModelBoxInferiors = value;
	}

	public void setOverrideGetRandomModelBoxSuperiors(String[] value)
	{
		overrideGetRandomModelBoxSuperiors = value;
	}

	public void setOverrideGetRandomModelBoxInferiors(String[] value)
	{
		overrideGetRandomModelBoxInferiors = value;
	}

	public void setAfterGetRandomModelBoxSuperiors(String[] value)
	{
		afterGetRandomModelBoxSuperiors = value;
	}

	public void setAfterGetRandomModelBoxInferiors(String[] value)
	{
		afterGetRandomModelBoxInferiors = value;
	}

	public String[] getBeforeGetTextureOffsetSuperiors()
	{
		return beforeGetTextureOffsetSuperiors;
	}

	public String[] getBeforeGetTextureOffsetInferiors()
	{
		return beforeGetTextureOffsetInferiors;
	}

	public String[] getOverrideGetTextureOffsetSuperiors()
	{
		return overrideGetTextureOffsetSuperiors;
	}

	public String[] getOverrideGetTextureOffsetInferiors()
	{
		return overrideGetTextureOffsetInferiors;
	}

	public String[] getAfterGetTextureOffsetSuperiors()
	{
		return afterGetTextureOffsetSuperiors;
	}

	public String[] getAfterGetTextureOffsetInferiors()
	{
		return afterGetTextureOffsetInferiors;
	}

	public void setBeforeGetTextureOffsetSuperiors(String[] value)
	{
		beforeGetTextureOffsetSuperiors = value;
	}

	public void setBeforeGetTextureOffsetInferiors(String[] value)
	{
		beforeGetTextureOffsetInferiors = value;
	}

	public void setOverrideGetTextureOffsetSuperiors(String[] value)
	{
		overrideGetTextureOffsetSuperiors = value;
	}

	public void setOverrideGetTextureOffsetInferiors(String[] value)
	{
		overrideGetTextureOffsetInferiors = value;
	}

	public void setAfterGetTextureOffsetSuperiors(String[] value)
	{
		afterGetTextureOffsetSuperiors = value;
	}

	public void setAfterGetTextureOffsetInferiors(String[] value)
	{
		afterGetTextureOffsetInferiors = value;
	}

	public String[] getBeforePostRenderArmSuperiors()
	{
		return beforePostRenderArmSuperiors;
	}

	public String[] getBeforePostRenderArmInferiors()
	{
		return beforePostRenderArmInferiors;
	}

	public String[] getOverridePostRenderArmSuperiors()
	{
		return overridePostRenderArmSuperiors;
	}

	public String[] getOverridePostRenderArmInferiors()
	{
		return overridePostRenderArmInferiors;
	}

	public String[] getAfterPostRenderArmSuperiors()
	{
		return afterPostRenderArmSuperiors;
	}

	public String[] getAfterPostRenderArmInferiors()
	{
		return afterPostRenderArmInferiors;
	}

	public void setBeforePostRenderArmSuperiors(String[] value)
	{
		beforePostRenderArmSuperiors = value;
	}

	public void setBeforePostRenderArmInferiors(String[] value)
	{
		beforePostRenderArmInferiors = value;
	}

	public void setOverridePostRenderArmSuperiors(String[] value)
	{
		overridePostRenderArmSuperiors = value;
	}

	public void setOverridePostRenderArmInferiors(String[] value)
	{
		overridePostRenderArmInferiors = value;
	}

	public void setAfterPostRenderArmSuperiors(String[] value)
	{
		afterPostRenderArmSuperiors = value;
	}

	public void setAfterPostRenderArmInferiors(String[] value)
	{
		afterPostRenderArmInferiors = value;
	}

	public String[] getBeforeRenderSuperiors()
	{
		return beforeRenderSuperiors;
	}

	public String[] getBeforeRenderInferiors()
	{
		return beforeRenderInferiors;
	}

	public String[] getOverrideRenderSuperiors()
	{
		return overrideRenderSuperiors;
	}

	public String[] getOverrideRenderInferiors()
	{
		return overrideRenderInferiors;
	}

	public String[] getAfterRenderSuperiors()
	{
		return afterRenderSuperiors;
	}

	public String[] getAfterRenderInferiors()
	{
		return afterRenderInferiors;
	}

	public void setBeforeRenderSuperiors(String[] value)
	{
		beforeRenderSuperiors = value;
	}

	public void setBeforeRenderInferiors(String[] value)
	{
		beforeRenderInferiors = value;
	}

	public void setOverrideRenderSuperiors(String[] value)
	{
		overrideRenderSuperiors = value;
	}

	public void setOverrideRenderInferiors(String[] value)
	{
		overrideRenderInferiors = value;
	}

	public void setAfterRenderSuperiors(String[] value)
	{
		afterRenderSuperiors = value;
	}

	public void setAfterRenderInferiors(String[] value)
	{
		afterRenderInferiors = value;
	}

	public String[] getBeforeRenderCapeSuperiors()
	{
		return beforeRenderCapeSuperiors;
	}

	public String[] getBeforeRenderCapeInferiors()
	{
		return beforeRenderCapeInferiors;
	}

	public String[] getOverrideRenderCapeSuperiors()
	{
		return overrideRenderCapeSuperiors;
	}

	public String[] getOverrideRenderCapeInferiors()
	{
		return overrideRenderCapeInferiors;
	}

	public String[] getAfterRenderCapeSuperiors()
	{
		return afterRenderCapeSuperiors;
	}

	public String[] getAfterRenderCapeInferiors()
	{
		return afterRenderCapeInferiors;
	}

	public void setBeforeRenderCapeSuperiors(String[] value)
	{
		beforeRenderCapeSuperiors = value;
	}

	public void setBeforeRenderCapeInferiors(String[] value)
	{
		beforeRenderCapeInferiors = value;
	}

	public void setOverrideRenderCapeSuperiors(String[] value)
	{
		overrideRenderCapeSuperiors = value;
	}

	public void setOverrideRenderCapeInferiors(String[] value)
	{
		overrideRenderCapeInferiors = value;
	}

	public void setAfterRenderCapeSuperiors(String[] value)
	{
		afterRenderCapeSuperiors = value;
	}

	public void setAfterRenderCapeInferiors(String[] value)
	{
		afterRenderCapeInferiors = value;
	}

	public String[] getBeforeRenderDeadmau5HeadSuperiors()
	{
		return beforeRenderDeadmau5HeadSuperiors;
	}

	public String[] getBeforeRenderDeadmau5HeadInferiors()
	{
		return beforeRenderDeadmau5HeadInferiors;
	}

	public String[] getOverrideRenderDeadmau5HeadSuperiors()
	{
		return overrideRenderDeadmau5HeadSuperiors;
	}

	public String[] getOverrideRenderDeadmau5HeadInferiors()
	{
		return overrideRenderDeadmau5HeadInferiors;
	}

	public String[] getAfterRenderDeadmau5HeadSuperiors()
	{
		return afterRenderDeadmau5HeadSuperiors;
	}

	public String[] getAfterRenderDeadmau5HeadInferiors()
	{
		return afterRenderDeadmau5HeadInferiors;
	}

	public void setBeforeRenderDeadmau5HeadSuperiors(String[] value)
	{
		beforeRenderDeadmau5HeadSuperiors = value;
	}

	public void setBeforeRenderDeadmau5HeadInferiors(String[] value)
	{
		beforeRenderDeadmau5HeadInferiors = value;
	}

	public void setOverrideRenderDeadmau5HeadSuperiors(String[] value)
	{
		overrideRenderDeadmau5HeadSuperiors = value;
	}

	public void setOverrideRenderDeadmau5HeadInferiors(String[] value)
	{
		overrideRenderDeadmau5HeadInferiors = value;
	}

	public void setAfterRenderDeadmau5HeadSuperiors(String[] value)
	{
		afterRenderDeadmau5HeadSuperiors = value;
	}

	public void setAfterRenderDeadmau5HeadInferiors(String[] value)
	{
		afterRenderDeadmau5HeadInferiors = value;
	}

	public String[] getBeforeRenderLeftArmSuperiors()
	{
		return beforeRenderLeftArmSuperiors;
	}

	public String[] getBeforeRenderLeftArmInferiors()
	{
		return beforeRenderLeftArmInferiors;
	}

	public String[] getOverrideRenderLeftArmSuperiors()
	{
		return overrideRenderLeftArmSuperiors;
	}

	public String[] getOverrideRenderLeftArmInferiors()
	{
		return overrideRenderLeftArmInferiors;
	}

	public String[] getAfterRenderLeftArmSuperiors()
	{
		return afterRenderLeftArmSuperiors;
	}

	public String[] getAfterRenderLeftArmInferiors()
	{
		return afterRenderLeftArmInferiors;
	}

	public void setBeforeRenderLeftArmSuperiors(String[] value)
	{
		beforeRenderLeftArmSuperiors = value;
	}

	public void setBeforeRenderLeftArmInferiors(String[] value)
	{
		beforeRenderLeftArmInferiors = value;
	}

	public void setOverrideRenderLeftArmSuperiors(String[] value)
	{
		overrideRenderLeftArmSuperiors = value;
	}

	public void setOverrideRenderLeftArmInferiors(String[] value)
	{
		overrideRenderLeftArmInferiors = value;
	}

	public void setAfterRenderLeftArmSuperiors(String[] value)
	{
		afterRenderLeftArmSuperiors = value;
	}

	public void setAfterRenderLeftArmInferiors(String[] value)
	{
		afterRenderLeftArmInferiors = value;
	}

	public String[] getBeforeRenderRightArmSuperiors()
	{
		return beforeRenderRightArmSuperiors;
	}

	public String[] getBeforeRenderRightArmInferiors()
	{
		return beforeRenderRightArmInferiors;
	}

	public String[] getOverrideRenderRightArmSuperiors()
	{
		return overrideRenderRightArmSuperiors;
	}

	public String[] getOverrideRenderRightArmInferiors()
	{
		return overrideRenderRightArmInferiors;
	}

	public String[] getAfterRenderRightArmSuperiors()
	{
		return afterRenderRightArmSuperiors;
	}

	public String[] getAfterRenderRightArmInferiors()
	{
		return afterRenderRightArmInferiors;
	}

	public void setBeforeRenderRightArmSuperiors(String[] value)
	{
		beforeRenderRightArmSuperiors = value;
	}

	public void setBeforeRenderRightArmInferiors(String[] value)
	{
		beforeRenderRightArmInferiors = value;
	}

	public void setOverrideRenderRightArmSuperiors(String[] value)
	{
		overrideRenderRightArmSuperiors = value;
	}

	public void setOverrideRenderRightArmInferiors(String[] value)
	{
		overrideRenderRightArmInferiors = value;
	}

	public void setAfterRenderRightArmSuperiors(String[] value)
	{
		afterRenderRightArmSuperiors = value;
	}

	public void setAfterRenderRightArmInferiors(String[] value)
	{
		afterRenderRightArmInferiors = value;
	}

	public String[] getBeforeSetInvisibleSuperiors()
	{
		return beforeSetInvisibleSuperiors;
	}

	public String[] getBeforeSetInvisibleInferiors()
	{
		return beforeSetInvisibleInferiors;
	}

	public String[] getOverrideSetInvisibleSuperiors()
	{
		return overrideSetInvisibleSuperiors;
	}

	public String[] getOverrideSetInvisibleInferiors()
	{
		return overrideSetInvisibleInferiors;
	}

	public String[] getAfterSetInvisibleSuperiors()
	{
		return afterSetInvisibleSuperiors;
	}

	public String[] getAfterSetInvisibleInferiors()
	{
		return afterSetInvisibleInferiors;
	}

	public void setBeforeSetInvisibleSuperiors(String[] value)
	{
		beforeSetInvisibleSuperiors = value;
	}

	public void setBeforeSetInvisibleInferiors(String[] value)
	{
		beforeSetInvisibleInferiors = value;
	}

	public void setOverrideSetInvisibleSuperiors(String[] value)
	{
		overrideSetInvisibleSuperiors = value;
	}

	public void setOverrideSetInvisibleInferiors(String[] value)
	{
		overrideSetInvisibleInferiors = value;
	}

	public void setAfterSetInvisibleSuperiors(String[] value)
	{
		afterSetInvisibleSuperiors = value;
	}

	public void setAfterSetInvisibleInferiors(String[] value)
	{
		afterSetInvisibleInferiors = value;
	}

	public String[] getBeforeSetLivingAnimationsSuperiors()
	{
		return beforeSetLivingAnimationsSuperiors;
	}

	public String[] getBeforeSetLivingAnimationsInferiors()
	{
		return beforeSetLivingAnimationsInferiors;
	}

	public String[] getOverrideSetLivingAnimationsSuperiors()
	{
		return overrideSetLivingAnimationsSuperiors;
	}

	public String[] getOverrideSetLivingAnimationsInferiors()
	{
		return overrideSetLivingAnimationsInferiors;
	}

	public String[] getAfterSetLivingAnimationsSuperiors()
	{
		return afterSetLivingAnimationsSuperiors;
	}

	public String[] getAfterSetLivingAnimationsInferiors()
	{
		return afterSetLivingAnimationsInferiors;
	}

	public void setBeforeSetLivingAnimationsSuperiors(String[] value)
	{
		beforeSetLivingAnimationsSuperiors = value;
	}

	public void setBeforeSetLivingAnimationsInferiors(String[] value)
	{
		beforeSetLivingAnimationsInferiors = value;
	}

	public void setOverrideSetLivingAnimationsSuperiors(String[] value)
	{
		overrideSetLivingAnimationsSuperiors = value;
	}

	public void setOverrideSetLivingAnimationsInferiors(String[] value)
	{
		overrideSetLivingAnimationsInferiors = value;
	}

	public void setAfterSetLivingAnimationsSuperiors(String[] value)
	{
		afterSetLivingAnimationsSuperiors = value;
	}

	public void setAfterSetLivingAnimationsInferiors(String[] value)
	{
		afterSetLivingAnimationsInferiors = value;
	}

	public String[] getBeforeSetModelAttributesSuperiors()
	{
		return beforeSetModelAttributesSuperiors;
	}

	public String[] getBeforeSetModelAttributesInferiors()
	{
		return beforeSetModelAttributesInferiors;
	}

	public String[] getOverrideSetModelAttributesSuperiors()
	{
		return overrideSetModelAttributesSuperiors;
	}

	public String[] getOverrideSetModelAttributesInferiors()
	{
		return overrideSetModelAttributesInferiors;
	}

	public String[] getAfterSetModelAttributesSuperiors()
	{
		return afterSetModelAttributesSuperiors;
	}

	public String[] getAfterSetModelAttributesInferiors()
	{
		return afterSetModelAttributesInferiors;
	}

	public void setBeforeSetModelAttributesSuperiors(String[] value)
	{
		beforeSetModelAttributesSuperiors = value;
	}

	public void setBeforeSetModelAttributesInferiors(String[] value)
	{
		beforeSetModelAttributesInferiors = value;
	}

	public void setOverrideSetModelAttributesSuperiors(String[] value)
	{
		overrideSetModelAttributesSuperiors = value;
	}

	public void setOverrideSetModelAttributesInferiors(String[] value)
	{
		overrideSetModelAttributesInferiors = value;
	}

	public void setAfterSetModelAttributesSuperiors(String[] value)
	{
		afterSetModelAttributesSuperiors = value;
	}

	public void setAfterSetModelAttributesInferiors(String[] value)
	{
		afterSetModelAttributesInferiors = value;
	}

	public String[] getBeforeSetRotationAnglesSuperiors()
	{
		return beforeSetRotationAnglesSuperiors;
	}

	public String[] getBeforeSetRotationAnglesInferiors()
	{
		return beforeSetRotationAnglesInferiors;
	}

	public String[] getOverrideSetRotationAnglesSuperiors()
	{
		return overrideSetRotationAnglesSuperiors;
	}

	public String[] getOverrideSetRotationAnglesInferiors()
	{
		return overrideSetRotationAnglesInferiors;
	}

	public String[] getAfterSetRotationAnglesSuperiors()
	{
		return afterSetRotationAnglesSuperiors;
	}

	public String[] getAfterSetRotationAnglesInferiors()
	{
		return afterSetRotationAnglesInferiors;
	}

	public void setBeforeSetRotationAnglesSuperiors(String[] value)
	{
		beforeSetRotationAnglesSuperiors = value;
	}

	public void setBeforeSetRotationAnglesInferiors(String[] value)
	{
		beforeSetRotationAnglesInferiors = value;
	}

	public void setOverrideSetRotationAnglesSuperiors(String[] value)
	{
		overrideSetRotationAnglesSuperiors = value;
	}

	public void setOverrideSetRotationAnglesInferiors(String[] value)
	{
		overrideSetRotationAnglesInferiors = value;
	}

	public void setAfterSetRotationAnglesSuperiors(String[] value)
	{
		afterSetRotationAnglesSuperiors = value;
	}

	public void setAfterSetRotationAnglesInferiors(String[] value)
	{
		afterSetRotationAnglesInferiors = value;
	}

	public String[] getBeforeSetTextureOffsetSuperiors()
	{
		return beforeSetTextureOffsetSuperiors;
	}

	public String[] getBeforeSetTextureOffsetInferiors()
	{
		return beforeSetTextureOffsetInferiors;
	}

	public String[] getOverrideSetTextureOffsetSuperiors()
	{
		return overrideSetTextureOffsetSuperiors;
	}

	public String[] getOverrideSetTextureOffsetInferiors()
	{
		return overrideSetTextureOffsetInferiors;
	}

	public String[] getAfterSetTextureOffsetSuperiors()
	{
		return afterSetTextureOffsetSuperiors;
	}

	public String[] getAfterSetTextureOffsetInferiors()
	{
		return afterSetTextureOffsetInferiors;
	}

	public void setBeforeSetTextureOffsetSuperiors(String[] value)
	{
		beforeSetTextureOffsetSuperiors = value;
	}

	public void setBeforeSetTextureOffsetInferiors(String[] value)
	{
		beforeSetTextureOffsetInferiors = value;
	}

	public void setOverrideSetTextureOffsetSuperiors(String[] value)
	{
		overrideSetTextureOffsetSuperiors = value;
	}

	public void setOverrideSetTextureOffsetInferiors(String[] value)
	{
		overrideSetTextureOffsetInferiors = value;
	}

	public void setAfterSetTextureOffsetSuperiors(String[] value)
	{
		afterSetTextureOffsetSuperiors = value;
	}

	public void setAfterSetTextureOffsetInferiors(String[] value)
	{
		afterSetTextureOffsetInferiors = value;
	}

}
