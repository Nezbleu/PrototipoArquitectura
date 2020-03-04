package edu.presentacion;

import javax.swing.JOptionPane;

import com.cableado.IRecaudo;

public class Pagos implements IRecaudo {

	@Override
	public void captarPago() {
		JOptionPane.showMessageDialog(null, "captarPago");

	}

}
