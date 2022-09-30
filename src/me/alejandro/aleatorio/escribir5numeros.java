package me.alejandro.aleatorio;

import java.io.IOException;
import java.io.RandomAccessFile;

public class escribir5numeros {

	public static void main(String[] args) {
		escribir();
		leerYCambiarPor1();

	}
	
	public static void escribir() {
		try {
			RandomAccessFile raf = new RandomAccessFile("datos.dat", "rw");
			
			raf.writeInt(12);
			raf.seek(0);
			System.out.println(raf.readInt());
			
		} catch (IOException e) {
			System.out.println("Error en escribir()");
			e.printStackTrace();
		}
	}
	
	public static void leerYCambiarPor1() {
		try {
			RandomAccessFile raf = new RandomAccessFile("datos.dat", "rw");
			int n=0;
			
			while (true) {
				n = raf.readInt();
				if (n>2) {
					raf.seek(raf.getFilePointer()-4);
					raf.writeInt(0);
				}
			}
			
		} catch (IOException e) {
			System.out.println("Error en leerYCambiarPor1()");
			e.printStackTrace();
		}
	}

}
