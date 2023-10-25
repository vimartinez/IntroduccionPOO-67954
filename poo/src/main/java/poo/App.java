package poo;

import poo.encapsulamiento.CuentaBancaria;
import poo.encapsulamiento.CuentaBancariaEncapsulada;
import poo.herencia.ClaseA;
import poo.herencia.ClaseB;
import poo.herencia.ClaseC;

public class App {

	public static void main(String[] args) {

		System.out.println("Intro POO");
		
		//Encapsulamiento mal implentado se puede modificar los atributos del objeto desde afuera de la clase
/*		CuentaBancaria cuenta1 = new CuentaBancaria();
		System.out.println("Cuenta no encapsulada: Activa:" +  cuenta1.activa + " Saldo:" + cuenta1.saldo);
		cuenta1.saldo = 15478.25F;
		System.out.println("Cuenta no encapsulada: Activa:" +  cuenta1.activa + " Saldo:" + cuenta1.saldo);*/
		
		
		//Encapsulamiento correcto
		/*CuentaBancariaEncapsulada cuentaEncapsulada = new CuentaBancariaEncapsulada();
		System.out.println("Cuenta encapsulada Saldo:" + cuentaEncapsulada.verSaldoDeLaCuenta());
		cuentaEncapsulada.cargarSaldoALaCuenta(15000.00F);
		System.out.println("Cuenta encapsulada Saldo:" + cuentaEncapsulada.verSaldoDeLaCuenta());
		cuentaEncapsulada.cargarSaldoALaCuenta(8000.00F);
		System.out.println("Cuenta encapsulada Saldo:" + cuentaEncapsulada.verSaldoDeLaCuenta());*/
		
		System.out.println("Herencia");
		
		ClaseA obj1 = new ClaseA();
		
		obj1.metodo1();
		obj1.metodo2();
		
		ClaseB obj2 = new ClaseB();
		
		obj2.metodo1();
		obj2.metodo2();
		
		ClaseC obj3 = new ClaseC();
	
		obj3.metodo1();
		obj3.metodo2();
		
	}

}
