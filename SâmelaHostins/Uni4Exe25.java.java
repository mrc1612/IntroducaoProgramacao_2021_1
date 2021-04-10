import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1, n2, operacao, soma, diferenca, produto, divisao;
        System.out.println("1 = Soma de dois números");
        System.out.println("2 = Diferença entre dois números");
        System.out.println("3 = Produto entre dois números");
        System.out.println("4 = Divisão entre dois números");

System.out.println("Informe o número 1.");
n1 = ler.nextInt();
System.out.println("Informe o número 2, não pode ser zero.");
n2 = ler.nextInt();
System.out.println("Informe a operação que você quer fazer com estes numeros.");
operacao = ler.nextInt();

switch (operacao){

    case 1:
    soma = (n1 + n2);
        System.out.println("soma= "+soma);
            break;
    
    case 2:
    diferenca = (n1 - n2);
            System.out.println("diferença= " + diferenca);
            break;
    
    case 3:
    produto = (n1*n2);
    System.out.println("produto= " +produto);
            break;

    case 4:
    divisao = (n1 / n2);
        System.out.println("divisao= "+divisao);
            break;
        
    default:
    System.out.println("Nenhuma opção foi selecionada");  
}
}
    }

