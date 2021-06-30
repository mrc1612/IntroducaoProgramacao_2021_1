public class Uni5Exe04 {
    public static void main(String[] args) {
        double s = 0;
        double numerador = 3;
        double denominador = 2;
        for (int i=1; i<=20; i++){
            s = s + (numerador / denominador);
            numerador += 2;
            denominador += 2 + (2*i);
        }
        System.out.println("O valor de s é de: " + s);
   }
}