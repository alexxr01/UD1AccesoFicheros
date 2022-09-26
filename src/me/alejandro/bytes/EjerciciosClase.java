package me.alejandro.bytes;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Ejercicios en clase
 * @author usuario
 *
 */

public class EjerciciosClase {

	public static void main(String[] args) {
		EjerciciosClase ejecutar = new EjerciciosClase();
		ejecutar.ejercicio1(); // Ejecución ejercicio 1
		ejecutar.ejercicio2(); // Ejecución ejercicio 2

	}

	public void ejercicio1() {
		File origen = new File("/home/usuario/Desktop/copiar.jpg");
		File destino = new File("/home/usuario/Desktop/MIO/copiar.jpg");

		try {
			InputStream in = new FileInputStream(origen);
			OutputStream out = new FileOutputStream(destino);

			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			in.close();
			out.close();

			System.out.println("Copiado correctamente.");

		} catch (IOException e){
			System.out.println("Hay un error.");
			e.printStackTrace();
		}
	}

	public void ejercicio2() throws FileNotFoundException {
		int num1, num2, num3, num4;
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = new FileOutputStream("datos.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		System.out.println("Introduce nº1:");
		num1 = sc.nextInt();
		System.out.println("Introduce nº2:");
		num2 = sc.nextInt();
		System.out.println("Introduce nº3:");
		num3 = sc.nextInt();
		System.out.println("Introduce nº4:");
		num4 = sc.nextInt();
		
		
		
		
	}

}
