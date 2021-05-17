import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");

        System.out.println("Gostaria de executar qual opção");
        int opcao = tec.nextInt();

        System.out.println("Informe o primeiro valor: ");
        int valorA = tec.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valorB = tec.nextInt();

        switch (opcao)
        {
            case 1:
                System.out.println(valorA + valorB);
                break;
            
            case 2:
                System.out.println(Math.abs(valorA - valorB));
                break;

            case 3:
                System.out.println(valorA * valorB);
                break;
            case 4:
                if (valorB == 0)
                    System.out.println("Impossível dividir por 0");
                else
                    System.out.println(valorA / valorB);
                
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
        
        tec.close();
    }
}
