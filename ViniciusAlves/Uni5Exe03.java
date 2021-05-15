public class Uni5Exe03 {
    

    public static void main(String[] args) {
        
        
        final double divisor = 1;
        double soma = 0;

        for (double dividendo = 1; dividendo <= 100; dividendo++) {
            
            soma += divisor/dividendo;
        }

        System.out.println(soma);

    }
}