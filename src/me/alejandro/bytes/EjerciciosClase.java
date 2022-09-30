package me.alejandro.bytes;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Ejercicios en clase
 * @author Alejandro Ruiz Bonillo
 * @version 1.0
 */

public class EjerciciosClase {

	public static void main(String[] args) throws IOException {
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

			System.out.println("Copiado correctamente el ejercicio 1.");

		} catch (IOException e){
			System.out.println("Hay un error en el ejercicio 1.");
			e.printStackTrace();
		}
	}

	public void ejercicio2() throws IOException {
		File archivo = new File("datos.dat"); // Fichero a utilizar
		
		FileInputStream fos = new FileInputStream(archivo);
		DataInputStream dis = new DataInputStream(fos);
		
		
		
	}

}
