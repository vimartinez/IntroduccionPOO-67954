package poo.encapsulamiento;

public class CuentaBancariaEncapsulada {
	
	//cuenta correctamente encapsulada métodos públicas y atributos privados
	
	//atributos privados
	private Long id = 0L;
	private Float saldo = 0.0F;
	private Boolean activa = true;
	
	
	//métodos públicos
	public Float verSaldoDeLaCuenta() {
		return saldo;
	}
	
	public void cargarSaldoALaCuenta(Float cantidad) {
		saldo = saldo + cantidad;
	}
	
	private void deshabilitarCuenta() {
		activa = false;
	}

}
