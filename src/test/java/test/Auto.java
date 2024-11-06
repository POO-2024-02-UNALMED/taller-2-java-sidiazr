package test;

public class Auto {
	
	static String cantidadCreados;
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	int cantidadAsientos() {
		
		int cantAsientos = 0;
		for (int i = 0; i <= asientos.length; i++) {
			if (asientos[i] != null) {
				cantAsientos++;
				}
		}
		
		return cantAsientos;
	}
	
	String verificarIntegridad() {
		
		boolean es_original = true;
		int registroReal = asientos[0].registro;
		
		for (int i = 0; i <= asientos.length; i++) {
			
			if (asientos[i].registro != registroReal) {
				es_original = false;
				break;
			} else if (registro != registroReal || registro != motor.registro) {
				es_original = false;
				
			}
		}
		
		if (es_original == false) {
			return "Las piezas no son originales";
		} else {
			return "Auto original";
			
		}
	}

}
