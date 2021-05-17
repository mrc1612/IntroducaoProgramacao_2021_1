/*Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. 
Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem
 ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.*/
import java.util.Scanner;
public class Uni5Exe22 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int ano = 1997;
    int aumento = 30;
    int salario = 2000;
    int AumentoFornecido;
    int salarioFinal= 0;

while (ano <= 2021){
    aumento *= 2;
    ano ++;
AumentoFornecido = aumento;
salarioFinal = (salario + AumentoFornecido);
}
System.out.println("O salário atual do funcionário é de: R$" +salarioFinal);

    }

    }
