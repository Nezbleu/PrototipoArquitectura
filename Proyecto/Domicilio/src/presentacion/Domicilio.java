package presentacion;

import javax.swing.JOptionPane;
import cableado.IDespacho;

public class Domicilio implements IDespacho {

	@Override
	public boolean despacharPedido(int idFactura) {
		JOptionPane.showMessageDialog(null, "despacharPedido");
		return false;

	}

	@Override
	public boolean verificarEntrega(int idFactura) {
		JOptionPane.showMessageDialog(null, "verificarEntrega");
		return false;
	}

}
