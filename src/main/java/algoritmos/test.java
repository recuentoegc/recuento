package algoritmos;

import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;

import main.Authority;
import main.AuthorityImpl;

public class test {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, BadPaddingException {
		String voto = "{\"age\": \"24\",\"answers\":[{\"question\":\"Pregunta 1\",\"answer_question\":\"SI\"}"
				+ "],\"id\": 1,\"autonomous_community\": \"Andalucia\",\"genre\": \"Masculino\",\"id_poll\": 32778}";
		Authority aut = new AuthorityImpl();
		String publicKey = aut.getPublicKey("4");
		
		byte[] cifrado = aut.encrypt("4", voto);
		
		//String des = aut.decrypt("4", cifrado);
		
		//System.out.print(des);
		
		
	}

}
