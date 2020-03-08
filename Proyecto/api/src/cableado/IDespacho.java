package cableado;

public interface IDespacho {
	boolean despacharPedido(int idFactura);
	boolean verificarEntrega(int idFactura);
}
