package Vehiculos;

public class Vehiculo {

	private String tipo;
	int ruedas;
	boolean enMarcha;
	
	public  Vehiculo(){
		
	
	}

	//Mostrar info
	
	public void mostrarInfo(){
		System.out.println("El vehiculo es de tipo: " +getTipo() + "tiene " +getRuedas() +"ruedas"  + "¿Esta en marcha?" +isEnMarcha() );
	}
	
	
	//Getters & Setters
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
}
