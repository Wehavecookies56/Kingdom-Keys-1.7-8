package api.player.model;

public interface IModelPlayerAPI extends IModelPlayer
{
	ModelPlayerAPI getModelPlayerAPI();

	net.minecraft.client.model.ModelBiped getModelPlayer();
}
