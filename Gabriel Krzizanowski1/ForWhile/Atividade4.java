package atividadeforwhile;

public class Atividade4 {

	public static void main(String[] args) {
		
		for(
	            int index = 0, cima = 3,baixo = 2, contador = 0; 
	            index < 20; 
	            cima += 2, baixo += (4+contador), contador+=2, index++){

	            System.out.println(cima+"/"+baixo);

	        }
		
		
		
		
	}

}
