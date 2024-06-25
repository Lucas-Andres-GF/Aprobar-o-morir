package ar.edu.unlp.info.oo2.Parcial1_2024;

public class Simple extends Prestamo
{
	
	private double interes; 
	
	public Simple(int cantCuotas, double monto, double interes, Cliente cliente) {
		// TODO Auto-generated constructor stub
		super(cantCuotas, monto, cliente);
		this.interes = interes; 
		
	}
	
	public double calcularTasaInteres() {
		return this.interes; 
	}
	
	public double getValorSellado() {
		return 5000; 
	}
}
