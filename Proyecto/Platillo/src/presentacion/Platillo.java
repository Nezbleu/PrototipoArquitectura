package presentacion;
import javax.swing.JOptionPane;

import cableado.ILienzo;

public class Platillo implements ILienzo{

	@Override
	public Object construirPlatillo() {
		JOptionPane.showMessageDialog(null, "Platillo construido");
		return null;
	}

	@Override
	public void guardarElDestinoDlPlatillo() {
		JOptionPane.showMessageDialog(null, "Platillo guardado");
		
	}

}
