package ar.edu.unlp.info.oo2.Parcial1_2024;

public class Aceptado extends State{

	public Aceptado() {
		// TODO Auto-generated constructor stub
	}
	
	public void pagarCuota(Prestamo prestamo) {
		prestamo.setPagoCuota();
		if(prestamo.getCantCuotas() == prestamo.getCuotasPagadas()) {
			prestamo.setEstado(new Finalizado());
		}
	}
	
	public double gastoCancelacion(Prestamo prestamo) {
		return prestamo.montoRestante() + prestamo.getValorAdministrativo() + prestamo.getValorSellado(); 
	}

}
