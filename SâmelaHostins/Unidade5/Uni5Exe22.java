/*Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. 
Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem
 ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.*/
import java.util.Scanner;
public class Uni5Exe22 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
    int ano = 1995;
    double aumento = 1.5;
    double salario = 2000;
    double AumentoFornecido;
    double salarioFinal= 0;

while (ano <= 2021){
    aumento *= 2;
    ano ++;
    double aumento1 = aumento/ 100;
double aumentoReal = aumento1;
AumentoFornecido = salario * aumentoReal;
salarioFinal = (salario + AumentoFornecido);

}
System.out.println("O salário atual do funcionário é de: R$" +salarioFinal);

    }
}
