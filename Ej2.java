package exceptions;

//import java.io.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ej2 {
	public static void main(String[] args) {
		String path = "C:/simo/UNI/telemática/5º Cuatri/DSA/numeros.txt";
		int i;
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(path);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				i = Integer.parseInt(linea);
				try {
					numero(i);
					System.out.println(i);
				} catch (Exception BigNumberException) {
					System.out.println("numero mas grande que 1000");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static Exception BigNumberException; 
	

	public static void numero(int i) throws Exception {

		if (i >= 1000)
			throw BigNumberException;

	}
}