package algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import domain.Voto;



public class Algoritmo {
	//Suponemos que la base de datos almacenará la información de la siguiente manera: "PP", "PSOE", "PP", "PODEMOS", ...
	//Recorreremos toda esa colección, de forma que obtengamos los nombres de cada votación, y los almacenaremos en un hashset (para que no se repitan valores)
	
	//La supuesta lista que nos pasan
	
	public void Algoritmo(){
	List<Voto> lista = new ArrayList<Voto>();
	
	//Suponemos que la coleccion "lista" es lo que hemos recuperado de la base de datos

	List<String> claves = new ArrayList();
	
	//Esto es una locura
	for (Voto s:lista){
		claves.add(s.getNombre());
	}
	//Ahora, una vez tenemos las claves, crearemos un mapa al que asignaremos a cada clave su valor.
	Map<Voto,Integer> resultados = new HashMap<Voto,Integer>();

	for(Voto s1: lista){
		resultados.put(s1,0);
	}

	for(Voto s2:lista){
		for (int i=0;i<resultados.keySet().size();i++){
			if (s2.equals(resultados.get(i))){
				resultados.put(s2,resultados.get(s2));
			}
		}
	}
}
	//TODO EL MUNDO TOCA EL ALGORITMO
	
	//NACHO ODIA A LA GORDA
}
