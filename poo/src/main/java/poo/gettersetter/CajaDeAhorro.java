package poo.gettersetter;

import java.time.LocalDate;

public class CajaDeAhorro {
	private Integer id;
	private Float saldo;
	private String numeroDeCuenta;
	private String cbu;
	private Boolean activa;
	private LocalDate fechaApertura;
	private String descripcion;
	
	
	public CajaDeAhorro(Integer id, Float saldo) {
		//super();
		this.id = id;
		this.saldo = saldo;
	}


	public CajaDeAhorro(Integer id, Float saldo, String numeroDeCuenta, String cbu, Boolean activa,
			LocalDate fechaApertura, String descripcion) {
		//super();
		this.id = id;
		this.saldo = saldo;
		this.numeroDeCuenta = numeroDeCuenta;
		this.cbu = cbu;
		this.activa = activa;
		this.fechaApertura = fechaApertura;
		this.descripcion = descripcion;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Float getSaldo() {
		return saldo;
	}


	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}


	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}


	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}


	public String getCbu() {
		return cbu;
	}


	public void setCbu(String cbu) {
		this.cbu = cbu;
	}


	public Boolean getActiva() {
		return activa;
	}


	public void setActiva(Boolean activa) {
		this.activa = activa;
	}


	public LocalDate getFechaApertura() {
		return fechaApertura;
	}


	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	

}
