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
	public boolean anadirIngrediente(String id) {
		return false;
	}

	@Override
	public boolean eliminarIngrediente(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	


}
