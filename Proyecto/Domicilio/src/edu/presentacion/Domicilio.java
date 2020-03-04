package edu.presentacion;

import javax.swing.JOptionPane;

import com.cableado.IDespacho;

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
