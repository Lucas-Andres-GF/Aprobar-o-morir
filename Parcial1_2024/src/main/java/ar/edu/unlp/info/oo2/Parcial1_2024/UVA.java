package ar.edu.unlp.info.oo2.Parcial1_2024;

import java.util.Random;

public class UVA extends Prestamo
{

	public UVA(int cantCuotas, double monto, Cliente cliente) {
		// TODO Auto-generated constructor stub
		super(cantCuotas, monto, cliente);
	}

	public double calcularTasaInteres() {
		Random random = new Random(); 
		double indiceActual = random.nextDouble(); 
		
		return indiceActual; 
	}
	
	public double getValorSellado() {
		return 0; 
	}
}
