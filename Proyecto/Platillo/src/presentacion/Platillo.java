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
	public boolean guardarElDestinoDlPlatillo() {
		JOptionPane.showMessageDialog(null, "Platillo guardado");
		return false;
		
	}

	@Override
	public boolean anadirIngrediente(int arg0) {
		return false;
	}

	@Override
	public boolean eliminarIngrediente(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	


}
