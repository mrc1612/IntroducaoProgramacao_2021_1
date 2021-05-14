public class Uni5Exe04 {
    public static void main(String[] args) {

        double soma = 0;
        double numerador = 3;
		double denominador = 2;
		double apoio = 4;

        soma = 0;
        numerador = 3;
		double denominador1 = 2;
        double denominador2 = 6;
		apoio = 2;
        //6 - 2 = 4 + A(2) = 6
        //6 + 6 = 12
    
        //12 - 6 = 6 + A(2) = 8
        //8 + 12 = 20
       
        soma += (numerador / denominador1);
        numerador += 2;
        soma += (numerador / denominador2);
        
        for (int count = 2; count < 20; count++) { //os próximos 18 numeros
            numerador += 2;
            denominador = (denominador2 - denominador1) + apoio;
            denominador = denominador + denominador2;

			soma = soma + (numerador / denominador);
			
            denominador1 = denominador2;
            denominador2 = denominador;
            
		}
		System.out.println("A soma é: "+soma);


    
    }
}
