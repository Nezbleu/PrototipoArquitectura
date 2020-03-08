package presentacion;

import javax.swing.JOptionPane;

import cableado.IRecaudo;

public class Pagos implements IRecaudo {

	@Override
	public boolean captarPago(int idFactura, double valor) {
		JOptionPane.showMessageDialog(null, "captarPago");
		return false;
	}

}
  