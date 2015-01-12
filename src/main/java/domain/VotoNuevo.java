package domain;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VotoNuevo {
	
	String id;
	String id_poll;
	Integer age;
	String genre;
	String autonomous_community;
	private List<Answer> answers;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId_poll() {
		return id_poll;
	}
	public void setId_poll(String id_poll) {
		this.id_poll = id_poll;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAutonomous_community() {
		return autonomous_community;
	}
	public void setAutonomous_community(String autonomous_community) {
		this.autonomous_community = autonomous_community;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
	
}
