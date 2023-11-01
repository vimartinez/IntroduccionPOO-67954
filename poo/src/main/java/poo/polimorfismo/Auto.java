package poo.polimorfismo;

public class Auto extends Vehiculo {

	
	public Auto(String marca, String modelo, Integer combustible) {
		super(marca, modelo, combustible);
	}

	@Override
	public void desplazarse(Integer metros) {
		System.out.println("El auto " + getModelo() + " se mueve " + metros + " metros");
	}

	@Override
	public void desplazarseMucho(Integer metros) {
		// TODO Auto-generated method stub
		
	}

}