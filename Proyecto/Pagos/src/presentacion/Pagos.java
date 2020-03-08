package presentacion;

import javax.swing.JOptionPane;

import cableado.IRecaudo;

public class Pagos implements IRecaudo {

	@Override
	public void captarPago() {
		JOptionPane.showMessageDialog(null, "captarPago");

	}

}
