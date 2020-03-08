package cableado;

public interface ILienzo {
	Object construirPlatillo();
	boolean guardarElDestinoDlPlatillo(Object platillo);
	boolean anadirIngrediente(int id);
	boolean eliminarIngrediente(int id);
}
