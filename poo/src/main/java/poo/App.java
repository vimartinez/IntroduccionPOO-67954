package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import poo.constructor.CuentaCorriente;
import poo.encapsulamiento.CuentaBancaria;
import poo.encapsulamiento.CuentaBancariaEncapsulada;
import poo.gettersetter.CajaDeAhorro;
import poo.herencia.ClaseA;
import poo.herencia.ClaseB;
import poo.herencia.ClaseC;
import poo.sobrecarga.Sumador;
import poo.polimorfismo.Auto;
import poo.polimorfismo.Barco;
import poo.polimorfismo.Helicoptero;
import poo.polimorfismo.Moto;
import poo.polimorfismo.Vehiculo;

public class App {

	public static void main(String[] args) {
		

		

		System.out.println("Intro POO");
		
		//Encapsulamiento mal implentado se puede modificar los atributos del objeto desde afuera de la clase
		CuentaBancaria cuenta1 = new CuentaBancaria();
		System.out.println("Cuenta no encapsulada: Activa:" +  cuenta1.activa + " Saldo:" + cuenta1.saldo);
		cuenta1.saldo = 15478.25F;
		System.out.println("Cuenta no encapsulada: Activa:" +  cuenta1.activa + " Saldo:" + cuenta1.saldo);
		
		
		//Encapsulamiento correcto
		CuentaBancariaEncapsulada cuentaEncapsulada = new CuentaBancariaEncapsulada();
		System.out.println("Cuenta encapsulada Saldo:" + cuentaEncapsulada.verSaldoDeLaCuenta());
		cuentaEncapsulada.cargarSaldoALaCuenta(15000.00F);
		System.out.println("Cuenta encapsulada Saldo:" + cuentaEncapsulada.verSaldoDeLaCuenta());
		cuentaEncapsulada.cargarSaldoALaCuenta(8000.00F);
		System.out.println("Cuenta encapsulada Saldo:" + cuentaEncapsulada.verSaldoDeLaCuenta());
		
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
		
		System.out.println("Constructores - getter y setter");
		
		CuentaCorriente cc1 = new CuentaCorriente();
		CuentaCorriente cc2 = new CuentaCorriente(5);
		CuentaCorriente cc3 = new CuentaCorriente(8,7895.8F);
		
		System.out.println("El saldo de cc3 es: " + cc3.obtenerSaldo());
		
		
		CajaDeAhorro ca = new CajaDeAhorro(8, 158000F);
		System.out.println("El saldo de la caja de ahorro es: "+ ca.getSaldo());
		
		System.out.println("Sobrecarga de métodos");
		
		Sumador sumador = new Sumador();
		
		sumador.sumar(3,25);
		sumador.sumar(8.1, 12.6);
		sumador.sumar(7F, 1.1F);
		
		
		System.out.println("Polimorfismo");
		
		Vehiculo auto1 = new Auto("VW", "Gol", 30);
		Vehiculo auto2 = new Auto("Ferrari", "F40", 55);
		Vehiculo auto3 = new Auto("Renault", "Logan", 25);
		
		List <Vehiculo> flota = new ArrayList<Vehiculo>();
		
		flota.add(auto1);
		flota.add(auto2);
		flota.add(auto3);
		
		for (Vehiculo vehiculo : flota) {
			vehiculo.desplazarse(20);
		}
		
		System.out.println("Agregar más vehículos!");
		Vehiculo barco1 = new Barco("Marca Barco", "Bote", 300);
		Vehiculo heli1 = new Helicoptero("Heli1", "Heli 2", 500);
		Vehiculo moto1 = new Moto("Honda", "Twister", 25);
		
		flota.add(barco1);
		flota.add(heli1);
		flota.add(moto1);
		
		for (Vehiculo vehiculo : flota) {
			vehiculo.desplazarse(50);
		}
	}

}
