package exceptions;

//import java.io.FileReader;

import java.io.*;

public class Ej1 {
	public static void main(String[] args) {
		String path = "C:/simo/UNI/telemática/5º Cuatri/DSA/numeros.txt";
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
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
