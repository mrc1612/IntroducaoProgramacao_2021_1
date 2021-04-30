import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            
        System.out.println("Massa ?");
        float massa = teclado.nextFloat();
        
        System.out.println("Altura?");
        double altura = teclado.nextDouble();

        double IMC = (massa/(altura * altura));


        if (IMC < 18.5){
            System.out.printf("Magreza %.2f " , + IMC);
        } else if ((IMC >= 18.5) && (IMC < 24.9)){
            System.out.printf("Saudável %.2f " , + IMC);
        } else if ((IMC >= 25) && (IMC <= 29.9)){
            System.out.printf("Sobrepeso %.2f " , + IMC);
        } else if ((IMC >= 30) && (IMC <= 34.9)){
            System.out.printf("Obesidade Grau I %.2f " , + IMC);
        } else if ((IMC >= 35) && (IMC <= 39.9)){
            System.out.printf("Obesidade Grau II (severa) %.2f " , + IMC);
        } else if ((IMC >= 40)){
            System.out.printf("Obesidade Grau III (mórbida) %.2f " , + IMC);
        }
    }
}