package edu;

import javax.swing.JOptionPane;
import cableado.IGestor;

public class Admon implements IGestor{

	@Override
	public void gestioarVentas() {
		JOptionPane.showMessageDialog(null, "gestioarVentas");

	}

	@Override
	public void gestionarInventario() {
		JOptionPane.showMessageDialog(null, "gestionarInventario");

	}

	@Override
	public void gestionarElemento() {
		JOptionPane.showMessageDialog(null, "gestionarElemento");

	}

	@Override
	public void gestionarFondos() {
		JOptionPane.showMessageDialog(null, "gestionarFondos");

	}

}
