package me.alejandro.bytes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytes {
	public static void leer() {
		File f = new File("");

		try {
			FileInputStream fis = new FileInputStream(f);

			int letra = fis.read();
			System.out.println((char)letra);
			while (letra!=-1) {
				letra = fis.read();
				System.out.println((char)letra);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void escribirTiposPrimitivos() throws IOException {
		File f = new File("datos.dat");

		try {
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);

			dos.writeInt(3);

			// Cerramos flujos
			fos.close();
			dos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void leerTiposPrimitivos() {
		File f = new File("datos.dat");

		try {
			FileInputStream fos = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fos);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
