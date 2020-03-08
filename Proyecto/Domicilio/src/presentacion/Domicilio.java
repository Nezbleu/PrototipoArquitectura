package presentacion;

import javax.swing.JOptionPane;
import cableado.IDespacho;

public class Domicilio implements IDespacho {

	@Override
	public void despacharPedido() {
		JOptionPane.showMessageDialog(null, "despacharPedido");

	}

	@Override
	public void verificarEntrega() {
		JOptionPane.showMessageDialog(null, "verificarEntrega");

	}

}
