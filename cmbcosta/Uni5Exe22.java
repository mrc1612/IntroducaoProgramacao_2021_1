public class Uni5Exe22 {
    public static void main(String[] args) throws Exception {

    int ano = 1997;
    double aumento = 0.015;
    double salario = 2000;
    double AumentoFornecido;
    double salarioFinal= 0;

while (ano <= 2021){
    aumento *= 2;
    ano ++;
AumentoFornecido = aumento;
salarioFinal = (salario + AumentoFornecido);
}
System.out.println("O salário atual do funcionário é de: R$" +salarioFinal);

    }

    }