package poo.polimorfismo;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private Integer combustible;
	
	
	public Vehiculo(String marca, String modelo, Integer combustible) {
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
	}
	
	public abstract void desplazarseMucho(Integer metros);
	
	public void desplazarse(Integer metros) {
		System.out.println("El vehículo se desplaza " + metros + " metros");
	}
	
	public void arrancar() {
		System.out.println("El vehículo arranca.");
	}
	
	public void apagar() {
		System.out.println("El vehículo se apaga.");
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getCombustible() {
		return combustible;
	}


	public void setCombustible(Integer combustible) {
		this.combustible = combustible;
	}
	
	

}