package ar.edu.unlp.info.oo2.Parcial1_2024;

public abstract class Prestamo {
	
	private int cantCuotas; 
	private int cuotasPagadas; 
	private double monto;
	private State estado;
	private Cliente cliente; 

	public Prestamo(int cantCuotas, double monto, Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cantCuotas = cantCuotas; 
		this.monto = monto; 
		this.cliente = cliente; 
		this.cuotasPagadas = 0 ;
	}
	
	public double calcularCuota() {
		return ( this.monto / this.cantCuotas ) * this.calcularTasaInteres();  
	}
	
	public void solicitarPrestamo() {
		this.estado.solicitarPrestamo(this);
	}
	
	public abstract double calcularTasaInteres(); 
	
	public void setEstado(State estado) {
		this.estado = estado;
	}
	
	public Cliente getCliente() {
		return this.cliente; 
	}
	
	public void setPagoCuota() {
		this.cuotasPagadas = this.cuotasPagadas + 1 ;
	}
	
	public int getCantCuotas() {
		return this.cantCuotas;
	}
	
	public int getCuotasPagadas() {
		return this.cuotasPagadas;
	}
	
	public double montoPagado() {
		return this.calcularCuota() * this.cuotasPagadas;
	}
	
	public double montoRestante() {
		return this.calcularCuota() * (this.cantCuotas - this.cuotasPagadas); 
	}
	
	public double getValorAdministrativo() {
		return this.montoRestante() * 0.1; 
	}
	
	public abstract double getValorSellado();
	
}
