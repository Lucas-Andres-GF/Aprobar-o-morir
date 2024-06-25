package ar.edu.unlp.info.oo2.Parcial1_2024;

public class Cliente {
	
	private Prestamo prestamo;
	private String nombre;
	private double salarioMensual; 

	public Cliente(String nombre, double salarioMensual) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre; 
		this.salarioMensual = salarioMensual; 
	}
	
	public void solicitarPrestamoSimple(double monto, int cantCuotas, double interes) {
		this.prestamo = new Simple(cantCuotas, monto, interes, this); 
		prestamo.solicitarPrestamo();
	}
	
	public void solicitarPrestamoUVA(double monto, int cantCuotas) {
		this.prestamo = new UVA(cantCuotas, monto, this); 
		prestamo.solicitarPrestamo();
	}
	
	public double getSalarioMensaul() {
		return this.salarioMensual;
	}
}
