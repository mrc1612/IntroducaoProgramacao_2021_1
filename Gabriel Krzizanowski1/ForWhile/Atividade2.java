package atividadeforwhile;


public class Atividade2 {

	public static void main(String[] args) {
		
		int impar = 0, par = 0;
		
		
		for(int i =1;  i <=100; i++  ) {
			
			if(i % 2 ==0){
				
				par += i;
				
			} else {
				
				impar += i;
				
			}
			
		}
		
		System.out.println("Impar: "+ impar);
		
		System.out.println("Par: "+ par);
	

	}

}
