public class Uni5Exe02 {


    public static void main(String[] args) {
        
        int somaPar = 0;
        int somaImpar = 0;

        for (int num = 1; num <= 100; num += 1) {
            
            if (num % 2 == 0 ) {
               somaPar = somaPar + num;  
            } else {
               somaImpar = somaImpar + num;
            }

        }

        System.out.println(somaPar);
        System.out.println(somaImpar);
    }
}