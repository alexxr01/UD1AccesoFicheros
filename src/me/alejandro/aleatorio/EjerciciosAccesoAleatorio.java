package me.alejandro.aleatorio;

/**
 * Realización de ejercicios Acceso Aleatorio.
 * @author Alejandro Ruiz Bonillo
 * @version 1.0
 */

import java.io.RandomAccessFile;
import java.util.Scanner;

public class EjerciciosAccesoAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 = Ejercicio 1");
		System.out.println("2 = Ejercicio 2\n");
		System.out.println("Introduce el numero:");
		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			ejercicio1();
			break;
			
		case 2:
			ejercicio2();
			break;

		default:
			System.out.println("La opción no es valida.");
			break;
		}		
	}
	
	// CODIGO EJERCICIOS
	
	public static void ejercicio1() {
		
		try {
			String contenido = "Hola, esto es un fichero para realizar PRUEBAS.";
			RandomAccessFile raf = new RandomAccessFile("ejercicioaccesoaleatorio.txt", "rw");
			System.out.println("Contenido del fichero:");
			System.out.println(raf.readLine() + "\n");
			
			// Eliminar espacios
			System.out.println(raf.readLine().replace(" ", ""));
			
			
			
		} catch (Exception e) {
			System.out.println("Error en ejercicio1()");
			e.printStackTrace();
		}
		
	}
	
	public static void ejercicio2() {
		int numerosRecogidos[] = null;
		int sumaTotal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numeros, pulsa enter para terminar:");
		
		for (int i = 0; i < numerosRecogidos.length; i++) {
			numerosRecogidos[i] = sc.nextInt();
			sumaTotal+=numerosRecogidos[i];
			if (numerosRecogidos.toString().contains(" ")) {
				System.out.println("Se ha encontrado un espacio, cerrando recolecta.");
			}
		}
		System.out.println("Suma: " + sumaTotal);
		
	}

}
