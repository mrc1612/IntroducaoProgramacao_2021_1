public class Uni5Exe02 {

    public static void main(String[] args) throws Exception {
          int soma = 0;
          int soma2 = 0;
          // Mostrando o somatório dos números pares
          for (int i=1; i<=100; i++){
          if (i % 2 == 0){
          soma += i;
        }}
          for (int i=1; i<=100; i++){
          if (i % 2 != 0){
          soma2 += i;
        }}
        System.out.println("A soma dos numeros pares é: "+ soma);
        System.out.println("A soma dos numeros pares é: "+ soma2);
              }
}