package ar.edu.unlp.info.oo2.Parcial1_2024;

public abstract class State {

	public State() {
		// TODO Auto-generated constructor stub
	}
	
	public void solicitarPrestamo(Prestamo prestamo) {
		if(prestamo.getCliente().getSalarioMensaul() < 0.3* prestamo.calcularCuota()) {
			prestamo.setEstado(new Aceptado());
		}
		else {
			prestamo.setEstado(new Cancelado());
		}
	}
	
	public void pagarCuota(Prestamo prestamo) {
		throw new Error("error"); 
	}
	
	public abstract double gastoCancelacion(Prestamo prestamo); 

}
