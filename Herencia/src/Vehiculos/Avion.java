package Vehiculos;

public class Avion extends Vehiculo{

	private boolean volando;
	
	public  Avion(){
		
	}

	//Mostrar info
	public Avion(boolean volando){
		this.volando = volando;
	}
	
	
	//Getters & Setters
	public boolean isVolando() {
		return volando;
	}

	public void setVolando(boolean volando) {
		this.volando = volando;
	}
	
	
	
	
	
	
	
	
	
}
