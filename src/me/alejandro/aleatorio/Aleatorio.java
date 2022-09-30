package me.alejandro.aleatorio;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Aleatorio {

	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("datos.dat", "rw");
			
			raf.writeInt(12);
			raf.seek(0);
			System.out.println(raf.readInt());
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
