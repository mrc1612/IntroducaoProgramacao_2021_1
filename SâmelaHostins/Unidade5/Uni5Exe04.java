//Considerando os 20 primeiros termos, descreva um algoritmo para calcular o valor de S dado por:
// 3/2; 5/6; 7/12; 9/20; 11/30...

//Ou seja vai em cima de 2 em 2. E em baixo é a diferença somando 2 em 2.!


public class Uni5Exe04 {
    public static void main(String[] args) throws Exception {
    
        //Números que vão iniciar as variáveis
        double s = 0;
        double numerador = 3;
        double denominador = 2;

        for (int i=1; i<=20; i++){
            s = s + (numerador/denominador);
            //fará com que some de 2 em 2: 3+2=5, 5+2=7
            numerador += 2;
            //exemplo termo sendo "2" -> 2 x 2 = 4 + 2 = 6
            denominador += 2 + (2*i);
        }
        System.out.println("O valor de s é: " +s);
   }}









        /*for (double denominador=1; denominador<=100; denominador++){
        soma += (numerador / denominador);    


}System.out.println("A soma dos 100 termos é: " +soma);
}
    }
    
        double soma = 0;
    double numerador = 3;
    double denominador = 2;
    double apoio = 4;


         
        double soma2  = 0; 
        double numerador2  =  3; 
        double   denominador1  =  2 ; 
        double   denominador2  =  6 ; 
        double apoio2  =  2 ; 
        
         //6 - 2 = 4 + A(2) = 6 
        //6 + 6 = 12 
        //12 - 6 = 6 + A(2) = 8 
        //8 + 12 = 20 
        
         soma  += ( numerador  /  denominador1 ); 
        numerador  +=  2 ; 
        soma  += ( numerador  /  denominador2 ); 
        
        for  ( int   count  =  2 ;  count  <  20 ;  count ++) {​​​​​  //os próximos 18 numeros 
        numerador  +=  2 ; 
        denominador  = ( denominador2  -  denominador1 ) +  apoio ; 
        denominador  =  denominador  +  denominador2 ; 
        soma  =  soma  + ( numerador  /  denominador ); 
        denominador1  =  denominador2 ; 
         denominador2  =  denominador ; 
        }​​​​​ 
        System . out . println ( "A soma é: " + soma ); 
  }​​​​​}​​​​​}}

*/

