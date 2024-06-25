package ar.edu.unlp.info.oo2.Parcial1_2024;

import java.util.List;
import java.util.ArrayList; 

public class Banco {
	
	private List<Cliente> clientes; 

	public Banco() {
		this.clientes = new ArrayList<>(); 
	}
	
	public Cliente registrarCliente(String nombre, double salarioMensual) {
		Cliente cliente = new Cliente(nombre,salarioMensual); 
		this.clientes.add(cliente); 
		return cliente; 
	}
	
	public void solicitarPrestamoSimple(String nombre, double salarioMensual, double monto, int cantCuotas, double interes) {
		Cliente cliente = this.registrarCliente(nombre, salarioMensual); 
		cliente.solicitarPrestamoSimple(monto, cantCuotas, interes);
	}
	
	public void solicitarPrestamoUVA(String nombre, double salarioMensual, double monto, int cantCuotas) {
		Cliente cliente = this.registrarCliente(nombre, salarioMensual); 
		cliente.solicitarPrestamoUVA(monto, cantCuotas);
	}

}
