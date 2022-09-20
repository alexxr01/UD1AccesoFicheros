package me.alejandro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Metodos {
	
public void flujoscaracteres() throws IOException {
		
		// 1
		File fichero = new File("/home/usuario/Desktop/fichero.txt");
		fichero.createNewFile();
		
		FileWriter fw = new FileWriter(fichero);
		PrintWriter pw = new PrintWriter(fw);
		
		fw.write("Hola mundo.");
		
		// 2
		pw.println();
		pw.println("Hola, me llamo Alejandro.");
		
		// 3 y 4
		try {
			String linea;
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Contenido de " + fichero.getName() + ":");
			while ((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
			
			br.close(); // Cerrar flujo
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Cerramos flujo
		fw.close();
		pw.close();
		
		// 5
		
	}

}
