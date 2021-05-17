import java.util.Scanner;

import org.graalvm.compiler.asm.amd64.AMD64Address.Scale;

public class Uni4Exe23 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
    
        int mes;

        System.out.println("Informe o número do mês:");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                    break;
            case 2:
                System.out.println("Fevereiro");
                    break;
            case 3:
                System.out.println("Março");
                    break;
            case 4:
                System.out.println("Abril");
                    break;        
            case 5:
                System.out.println("Maio");
                    break;
            case 6:
                System.out.println("Junho");
                    break;
            case 7:
                System.out.println("Julho");
                    break;
            case 8:
                System.out.println("Agosto");
                    break;
            case 9:
                System.out.println("Setembro");
                    break;
            case 10:
                System.out.println("Outubro");
                    break;
            case 11:
                System.out.println("Novembro");
                    break;
            case 12:
                System.out.println("Dezembro");
                    break;
            default:
                System.out.println("Número inválido");
                    break;
    }
    
    teclado.close();
    
    }
}
