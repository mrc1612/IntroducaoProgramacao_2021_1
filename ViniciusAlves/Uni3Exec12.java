import java.util.Scanner;
public class Uni3Exec12 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double nHoraTrabalho, nDependentes, inss, impostoDeRenda, saláriobruto, descontando, saláriolíquido;

        System.out.println("Informe o número de horas que você trabalho neste mês");
        nHoraTrabalho = teclado.nextDouble();

        System.out.println("Informe quantos dependentes você tem, se não tiver nenhum, coloque zero");
        nDependentes = teclado.nextDouble();

        saláriobruto = ((nHoraTrabalho * 10) + (nDependentes * 60));

        inss = 0.085;
        
        impostoDeRenda = 0.05;
        
        descontando = (saláriobruto * (inss + impostoDeRenda));
        
        saláriolíquido = (saláriobruto - descontando);
        System.out.println("Seu salário bruto é de R$" + saláriobruto);
        System.out.println("Seu salário líquido é de R$" + saláriolíquido);
        
        teclado.close();

    }
}