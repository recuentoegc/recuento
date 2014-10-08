package com.egc.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Algoritmo {
	//Suponemos que la base de datos almacenará la información de la siguiente manera: "PP", "PSOE", "PP", "PODEMOS", ...
	//Recorreremos toda esa colección, de forma que obtengamos los nombres de cada votación, y los almacenaremos en un hashset (para que no se repitan valores)
	
	//La supuesta lista que nos pasan
	List<Voto> lista = new ArrayList<Voto>();
	
	//Suponemos que la coleccion "lista" es lo que hemos recuperado de la base de datos

	Set<String> claves = new HashSet<String>(); 
	foreach (String s:lista)
	{
		claves.add(s);
	}
	//Ahora, una vez tenemos las claves, crearemos un mapa al que asignaremos a cada clave su valor.
	Map<String,Integer> resultados = new HashMap<String,Integer>();

	foreach(String s: claves)
	{
		resultados.put(s,0);
	}

	foreach(String s:lista)
	{
		for (int i=0;i<resultados.keySet().size();i++)
		{
			if (s.equals(resultados.getKey(i))
			{
				resultados.put(s,resultados.get(s)++);
			}
		}
	}

}
