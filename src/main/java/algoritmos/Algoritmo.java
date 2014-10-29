package algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import domain.Voto;

public class Algoritmo {
	// Suponemos que la base de datos almacenará la información de la siguiente
	// manera: "PP", "PSOE", "PP", "PODEMOS", ...
	// Recorreremos toda esa colección, de forma que obtengamos los nombres de
	// cada votación, y los almacenaremos en un hashset (para que no se repitan
	// valores)

	// La supuesta lista que nos pasan

	Set<String> claves = new HashSet<String>();

	public static Map<String, Integer> Algoritmo() {

		List<String> votos = new ArrayList<String>();

		votos.add("equipo1");
		votos.add("equipo1");
		votos.add("equipo1");
		votos.add("equipo1");
		votos.add("equipo1");
		votos.add("equipo1");
		votos.add("equipo1");
		votos.add("equipo2");
		votos.add("equipo3");
		votos.add("equipo3");
		votos.add("equipo3");
		votos.add("equipo3");
		votos.add("equipo3");

		// Suponemos que la coleccion "lista" es lo que hemos recuperado de la
		// base de datos

		Set<String> claves = new HashSet<String>();

		for (String s : votos) {
			claves.add(s);
		}
		// Ahora, una vez tenemos las claves,crearemos un mapa al que
		// asignaremos a cada clave su valor.
		Map<String, Integer> resultados = new HashMap<String, Integer>();

		for (String s1 : claves) {
			resultados.put(s1, 0);
		}

		for (String s2 : votos) {
			for (int i = 0; i < resultados.keySet().size(); i++) {
				if (s2.equals(resultados.get(i))) {
					resultados.put(s2, resultados.get(s2));
				}
			}
		}
		return resultados;
	}

}
