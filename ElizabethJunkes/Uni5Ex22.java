import java.util.Scanner;
public class Uni5Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int ano = 1997; int aumento = 30; int salario = 2000; int aumentoFornecido; int salarioFinal= 0;
        while (ano <= 2021){
            aumento *= 2;
            ano ++;
        aumentoFornecido = aumento;
        salarioFinal = (salario + aumentoFornecido);
        }
        System.out.println("O salário do funcionário é de: R$" + salarioFinal);
    }
}