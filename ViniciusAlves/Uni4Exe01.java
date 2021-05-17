import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int NHTM, qtdHE;
        double salario, salarioPH, salarioEX, salarioTT, valorH;

        System.out.println("Informe o número de horas trabalhadas em um mês:");
        NHTM = teclado.nextInt();

        System.out.println("Informe o salário por hora:");
        salarioPH = teclado.nextDouble(); 

        if (NHTM <= 160) {
            System.out.println("Você receberá:"+NHTM*salarioPH+" Reais");
            System.out.println("Valor extra: 0");
        } else {
            
            salario = (160*salarioPH);
            qtdHE = (NHTM-160);
            valorH = (salarioPH + (salarioPH*50)/100);
            salarioEX = (valorH*qtdHE);

            salarioTT = (salario + salarioEX);

            System.out.println("O salário total do funcionário acrescido com horas extras foi de: "+salarioTT);
        }

        

        

    }
}