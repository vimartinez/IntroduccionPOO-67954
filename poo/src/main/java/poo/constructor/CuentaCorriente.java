package poo.constructor;

public class CuentaCorriente {
	
	private Integer id;
	private Float saldo;
	private Boolean activa;
	private String CBU;
	
	//Constructor por defecto
	public CuentaCorriente() {
		
	}
	
	//Constructor con un atributo
	public CuentaCorriente(Integer id) {
		this.id = id;
		
	}
	
	//Constructor con otro nombre que no usa this
	public CuentaCorriente(Integer idDeLaCuenta, Float saldo) {
		id = idDeLaCuenta;
		this.saldo = saldo;
		
	}
	
	
	public Float obtenerSaldo() {
		return saldo;
	}
	

}
