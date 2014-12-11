package algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import domain.Voto;
import domain.VotoAntiguo;

public class Algoritmo {
	// Suponemos que la base de datos almacenará la información de la siguiente
	// manera: "PP", "PSOE", "PP", "PODEMOS", ...
	// Recorreremos toda esa colección, de forma que obtengamos los nombres de
	// cada votación, y los almacenaremos en un hashset (para que no se repitan
	// valores)

	// La supuesta lista que nos pasan


	public static Map<String, Integer> Algoritmo(List<String> votos) {

		// Suponemos que la coleccion "votos" es lo que hemos recuperado de la
		// base de datos

		Set<String> claves = new HashSet<String>();

		for (String s : votos) {
			claves.add(s);
		}
		// Ahora, una vez tenemos las claves,crearemos un mapa al que
		// asignaremos a cada clave su valor.
		Map<String, Integer> resultados = new HashMap<String, Integer>();

		//Iniciamos el mapa con los valores a cero
		for (String s1 : claves) {
			resultados.put(s1, 0);
		}
		//Recorremos la lista de votos y adjudicamos el número de veces repetida a su
		//nombre
		for (String s2 : votos) {
			if (resultados.containsKey(s2)) {
				resultados.put(s2, resultados.get(s2) + 1);
			}
		}

		return resultados;
	}

	
	//En el caso de que no se nos pase una lista de strings, sino una lista de votos
	//se usará este algoritmo, que hace lo mismo que el algoritmo de arriba, pero sacando de la
	//entidad "VotoAntiguo" su nombre.
	public static Map<String,Integer> algoritmo2(List<VotoAntiguo> votos)
	{
		Set<String> claves = new HashSet<String>();
		List<String> votaciones = new ArrayList<String>();
		for (VotoAntiguo v:votos)
		{
			votaciones.add(v.getNombre());
		}
		for (String s : votaciones) {
			claves.add(s);
		}
		Map<String, Integer> resultados = new HashMap<String,Integer>();
		for (String s1 : claves) {
			resultados.put(s1, 0);
		}
		for (String s2 : votaciones) {
			if (resultados.containsKey(s2)) {
				resultados.put(s2, resultados.get(s2) + 1);
			}
		}
		return resultados;
	}
}
