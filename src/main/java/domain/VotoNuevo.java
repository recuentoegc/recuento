package domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VotoNuevo {
	
	String id;
	String idVotacion;
	Map<String,String> preguntaRespuesta;
	Integer edad;
	String genero;
	String comunidad;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdVotacion() {
		return idVotacion;
	}
	public void setIdVotacion(String idVotacion) {
		this.idVotacion = idVotacion;
	}
	public Map<String, String> getPreguntaRespuesta() {
		return preguntaRespuesta;
	}
	public void setPreguntaRespuesta(Map<String, String> preguntaRespuesta) {
		this.preguntaRespuesta = preguntaRespuesta;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getComunidad() {
		return comunidad;
	}
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}
	
}