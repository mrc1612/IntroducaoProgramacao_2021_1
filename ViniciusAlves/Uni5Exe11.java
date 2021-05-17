public class Uni5Exe11 {
    public static void main(String[] args) {	
		int contador = 0;						
		for(int i = 1; i <=16; i++) {
			
			if(i == 1) {				
				contador =1;				
			} else if (i == 2){				
				contador += 3;				
			} else {				
				contador *= 3;				
			}			 
			System.out.println(contador);			
		}		
  }
}