package me.alejandro.directorios;

/**
 * Clase donde crearemos los metodos para posterior ejecución
 * @author Alejandro Ruiz
 * @version 1.0
 */

import java.io.File;
import java.util.Scanner;

public class Metodos {

	// MENSAJES
	private String msgError, msgCorrecto, ej1, ej2, ej3, ej4, ej5;
	{
		msgError = "ERROR! Algo no ha ido bien...";
		msgCorrecto = "SI! Ejecución correcta.";

		// Identificar ejercicios
		ej1 = "EJERCICIO 1: ";
		ej2 = "EJERCICIO 2: ";
		ej3 = "EJERCICIO 3: ";
		ej4 = "EJERCICIO 4: ";
		ej5 = "EJERCICIO 5: ";
	}

	public void ejercicio1() {
		File raiz = new File("/home/usuario/Desktop/d/");
		File f1 = new File(raiz, "/d1");
		File f2 = new File(f1, "/f11");
		File f3 = new File(f1, "/f12");
		File f4 = new File(raiz, "/d2");
		File f5 = new File(f4, "/d21");
		File f6 = new File(f4, "/f21");
		File f7 = new File(f4, "/d22");
		File f8 = new File(f7, "/f222");
		File f9 = new File(raiz, "/d3");
		File f10 = new File(f9, "/d31");

		if (raiz.mkdir()) {
			System.out.println(ej1 + msgCorrecto + " Se crearán subdirectorios.");
			f2.mkdirs();
			f3.mkdirs();
			f5.mkdirs();
			f6.mkdirs();
			f8.mkdirs();
			f10.mkdirs();
		} else if (raiz.exists()) {
			System.out.println(ej1 + "El directorio ya existe.");
		} else {
			System.out.println(ej1 + msgError);
		}
	}

	public void ejercicio2() {
		String directorio = "/home/usuario/Desktop/d/";
		String tab = "	";

		File f1 = new File(directorio);
		String[] contenido = f1.list();

		if (f1.isDirectory()) {
			System.out.println(ej2 + "Este es el contenido del directorio");
			for (int i = 0; i < contenido.length; i++) {
				System.out.println(contenido[i] + tab);
				if (f1.isDirectory()) {
					System.out.println("Es un directorio");
				}
			}
		} else {
			System.out.println(ej2 + msgError);
		}
		
		
		/*
		 * if (f1.isDirectory()) {
			System.out.println(ej2 + "Este es el contenido del directorio");
			for (int i = 0; i < contenido.length; i++) {
				System.out.println(contenido[i]);
			}
		} else {
			System.out.println(ej2 + msgError);
		}
		 */

	}

	public void ejercicio3() {
		String recogerDirectorio;

		Scanner sc = new Scanner(System.in);
		System.out.println(ej3 + "Introduce el directorio a analizar:");
		recogerDirectorio = sc.next();
		
		File f1 = new File(recogerDirectorio);
		String[] contenido = f1.list();

		if (f1.isDirectory()) {
			System.out.println(ej3 + "Este es el contenido del directorio");
			for (int i = 0; i < contenido.length; i++) {
				System.out.println(contenido[i]);
			}
		} else {
			System.out.println(ej3 + msgError);
		}

	}
	
	public void ejercicio4() {
		System.out.println(ej4);
	}
	
	public void ejercicio5() {
		String recogerDirectorio = null;
		
		File f1 = new File(recogerDirectorio);
		File[] contenido = f1.listFiles();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(ej5 + "Introduce el directorio a eliminar los archivos .txt");
		recogerDirectorio = sc.next();
		
		if (f1.isDirectory()) {
			System.out.println(ej5 + "Es un directorio, se van a eliminar todos los archivos .txt");
			for (File file : contenido) {
				String archivo = file.getName();
				if (archivo.endsWith(".txt")) {
					file.delete();
					System.out.println(ej5 + "Eliminados.");
				}
			}
		} else {
			System.out.println(ej5 + "msgError");
		}
		
	}

}
