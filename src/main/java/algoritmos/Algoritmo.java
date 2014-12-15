package algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import domain.Resultado;
import domain.VotoAntiguo;
import domain.VotoNuevo;

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

		// Iniciamos el mapa con los valores a cero
		for (String s1 : claves) {
			resultados.put(s1, 0);
		}
		// Recorremos la lista de votos y adjudicamos el número de veces
		// repetida a su
		// nombre
		for (String s2 : votos) {
			if (resultados.containsKey(s2)) {
				resultados.put(s2, resultados.get(s2) + 1);
			}
		}

		return resultados;
	}

	// En el caso de que no se nos pase una lista de strings, sino una lista de
	// votos
	// se usará este algoritmo, que hace lo mismo que el algoritmo de arriba,
	// pero sacando de la
	// entidad "VotoAntiguo" su nombre.
	public static Map<String, Integer> algoritmo2(List<VotoAntiguo> votos) {
		Set<String> claves = new HashSet<String>();
		List<String> votaciones = new ArrayList<String>();
		for (VotoAntiguo v : votos) {
			votaciones.add(v.getNombre());
		}
		for (String s : votaciones) {
			claves.add(s);
		}
		Map<String, Integer> resultados = new HashMap<String, Integer>();
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

	public static List<Resultado> algoritmo3() // (List<VotoNuevo> votos)
	{
		VotoNuevo voto1 = new VotoNuevo();
		Map<String, String> preguntaRespuesta = new HashMap<String, String>();
		preguntaRespuesta.put("¿esta asignatura es útil?", "no");
		preguntaRespuesta.put("¿cambiarías algo de esta asignatura?", "si");
		//preguntaRespuesta.put("¿llegará tarde Neira?", "si");
		voto1.setId("1");
		voto1.setIdVotacion("1");
		voto1.setPreguntaRespuesta(preguntaRespuesta);

		VotoNuevo voto2 = new VotoNuevo();
		voto2.setId("2");
		voto2.setIdVotacion("1");
		Map<String, String> preguntaRespuesta2 = new HashMap<String, String>();
		preguntaRespuesta2.put("¿esta asignatura es útil?", "si");
		preguntaRespuesta2.put("¿cambiarías algo de esta asignatura?", "no");
		preguntaRespuesta2.put("¿llegará tarde Neira?", "si");
		voto2.setPreguntaRespuesta(preguntaRespuesta2);

		VotoNuevo voto3 = new VotoNuevo();
		voto3.setId("3");
		voto3.setIdVotacion("1");
		Map<String, String> preguntaRespuesta3 = new HashMap<String, String>();
		preguntaRespuesta3.put("¿esta asignatura es útil?", "no");
		preguntaRespuesta3.put("¿cambiarías algo de esta asignatura?", "si");
		preguntaRespuesta3.put("¿llegará tarde Neira?", "si");
		voto3.setPreguntaRespuesta(preguntaRespuesta3);

		List<VotoNuevo> votes = new ArrayList<VotoNuevo>();
		votes.add(voto1);
		votes.add(voto2);
		votes.add(voto3);

		// Algoritmo

		Set<String> claves = new HashSet<String>();
		for (VotoNuevo v : votes) {
			claves.addAll(v.getPreguntaRespuesta().keySet());
		}
		List<Resultado> resultados = new ArrayList<Resultado>();
		for (String c : claves) {
			resultados.add(new Resultado(c, 0, 0));
		}
		for (VotoNuevo v : votes) {
			for (Resultado r : resultados) {
				if (v.getPreguntaRespuesta().get(r.getPregunta())!=null) {
					if (v.getPreguntaRespuesta().get(r.getPregunta())
							.equals("si")) {
						r.setNumeroSi(r.getNumeroSi() + 1);
					} else if (v.getPreguntaRespuesta().get(r.getPregunta())
							.equals("no")) {
						r.setNumeroNo(r.getNumeroNo() + 1);
					}
				}
			}
		}
		return resultados;
	}
}