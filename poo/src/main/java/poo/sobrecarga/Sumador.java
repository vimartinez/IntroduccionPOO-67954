package poo.sobrecarga;

public class Sumador {
	
	//ejemplo para sobrecarga de métodos únicamente
	
	public void sumar(int nro1, int nro2) {
		Integer resultado = 0;
		resultado = nro1 + nro2;
		System.out.println("El resultado de la suma es: "+ resultado.toString());
	}
	
	public void sumar(Float nro1, Float nro2) {
		Float resultado = 0F;
		resultado = nro1 + nro2;
		System.out.println("El resultado de la suma es: "+ resultado.toString());
	}
	
	public void sumar(Double nro1, Double nro2) {
		Double resultado = 0.0;
		resultado = nro1 + nro2;
		System.out.println("El resultado de la suma es: "+ resultado.toString());
	}

}
