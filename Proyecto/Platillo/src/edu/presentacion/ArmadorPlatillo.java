package edu.presentacion;

import javax.swing.JOptionPane;

import com.cableado.ILienzo;


public class ArmadorPlatillo implements ILienzo{

	@Override
	public Platillo construirPlatillo() {
		JOptionPane.showMessageDialog(null, "ARMAR PLATILLO LÓGICA");
		return new Platillo();
	}

	@Override
	public void guardarElDestinoDlPlatillo() {
		/*Logica*/
		JOptionPane.showMessageDialog(null, "GUARDAR PLATILLO LÓGICA");
		
	}

}
