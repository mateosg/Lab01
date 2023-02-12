package fp.tipos.musica.test;

import java.util.ArrayList;
import java.util.List;

import fp.tipos.musica.Cancion;
import fp.tipos.musica.ListaReproduccion;
import fp.utiles.Ficheros;

public class TestMusica {
	
	private static List<Cancion> cargaFichero(){
		String path="src/fp/tipos/musica/test/canciones.txt";
		List<String> lineas=Ficheros.leeFichero("Fichero no encontrado", path);
		List<Cancion> listaCanciones=new ArrayList<>();
		for(String linea:lineas) {
			Cancion c = Cancion.parse(linea);
			listaCanciones.add(c);
			System.out.println(c + " procesada");
		}
		return listaCanciones;
	}

	public static void main(String[] args) {
		//NOTA: Los errores desaparecer�n cuando se implementen los tipos
		
		//1.- Llama a la funci�n 'cargaFichero' y guarda el resultado en una lista
		
		//2.- Crea un objeto 'ListaReproduccion' con la lista anterior, y mu�strala por pantalla
		
		//3.- Agrega a la lista de reproducci�n la canci�n: The Winner Takes It All;ABBA;4:55;21-07-1980;POP
		
		//4.- Ordena las canciones de la lista de reproducci�n, y mu�stralas por pantalla (muestre las canciones)
		
	}

}
