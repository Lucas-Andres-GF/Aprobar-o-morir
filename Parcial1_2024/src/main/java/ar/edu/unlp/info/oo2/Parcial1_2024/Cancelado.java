package ar.edu.unlp.info.oo2.Parcial1_2024;

public class Cancelado extends State{

	public Cancelado() {
	}
	
	public double gastoCancelacion(Prestamo prestamo) {
		throw new Error("error");  
	}
}
