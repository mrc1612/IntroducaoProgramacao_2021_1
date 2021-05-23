import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        int idade_m, idade_z, idade_l;

            System.out.println("Informe a Idade de Marquinhos: ");
            idade_m = teclado.nextInt();

            System.out.println("Informe a Idade de Zezinho: ");
            idade_z = teclado.nextInt();

            System.out.println("Informe a Idade de Luluzinha: ");
            idade_l = teclado.nextInt();

            if(idade_m < idade_z && idade_m < idade_l) {
                
                System.out.println("Marquinho é o caçula da família");
            }

            if(idade_z < idade_m && idade_z < idade_l) {
                
                System.out.println("Zezinho é o caçula da família");
            }

            if(idade_l < idade_m && idade_l < idade_z) {
                
                System.out.println("Luluzinha é o caçula da família");
            }

            if(idade_m == idade_z && idade_m == idade_l){
                System.out.println("Informe as Idades novamente");
            }

            teclado.close();
    }
    
}
