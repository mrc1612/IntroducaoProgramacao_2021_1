package atividadeforwhile;

public class Atividade10 {

	public static void main(String[] args) {
		
	     for(int i = 1000; i<=999999; i++){
	         
	         int d1 = i / 100;
	         int d2 = i % (d1 * 100);
	         int soma = d1 + d2;
	         
	         if(Math.pow(soma, 2) == i){                                     
	           System.out.printf("%d+%d = %d^2 = %d\n",d1,d2,soma,i);
	         }
	      }
	   }
	 }
