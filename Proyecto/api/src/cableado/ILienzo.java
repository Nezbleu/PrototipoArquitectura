package cableado;

public interface ILienzo {
	Object construirPlatillo();
	boolean guardarElDestinoDlPlatillo();
	boolean anadirIngrediente(int id);
	boolean eliminarIngrediente(int id);
}
