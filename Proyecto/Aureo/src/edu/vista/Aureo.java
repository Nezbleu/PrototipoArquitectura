package edu.vista;

import com.cableado.ILienzo;
import com.cableado.IRecaudo;
import com.utilitario.Cargador; 

public class Aureo {
	public static void main(String args[]) {
		Cargador cf = new Cargador("front");
		Class cls=null;
		
		try {
			cls=  cf.getClase("Platillo");
			if(cls!=null) {
				ILienzo il = (ILienzo)cls.newInstance();
				il.construirPlatillo();
				il.guardarElDestinoDlPlatillo();
			}
			
		}catch(Exception e) {}	
		
		Cargador cb = new Cargador("back");
		try {
			cls=  cb.getClase("Pagos");
			if(cls!=null) {
				IRecaudo ir = (IRecaudo)cls.newInstance();
				ir.captarPago();
			}
			
		}catch(Exception e) {}		
	}
	
} 