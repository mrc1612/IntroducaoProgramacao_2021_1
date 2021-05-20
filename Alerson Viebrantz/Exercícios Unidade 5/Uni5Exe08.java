import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) throws Exception {
      
        Scanner teclado = new Scanner(System.in);

        int n;
        int menor = 1000;
        int soma = 0;
        int numpos = 0;
        

        System.out.println("Informe a quantidade de números que deseja informar:");
        n = teclado.nextInt();

        for (int i=1; i<= n; i++) {
            System.out.println("Informe os números: ");
            int n2= teclado.nextInt();

            if (n2 >= 0){
            soma = n2 + soma;
            numpos ++;

            }
        
            if (n2 <= menor) {
                menor = n2;
        }

    }
        System.out.println("O menor número negativo informado é " +menor);
        System.out.print("A média dos números informados é de " +soma/numpos);

        teclado.close();
}
}
