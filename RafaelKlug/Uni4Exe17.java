import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Entrada
        System.out.println("Qual sua renda líquida:");
        double rendaBruta = tec.nextDouble();
        System.out.println("Quantos dependentes você tem:");
        int dependetes = tec.nextInt();

        double rendaLiquida;
        rendaLiquida = rendaBruta;

        if (dependetes == 0) {
            rendaLiquida = rendaBruta;
        } else {
            rendaBruta = rendaBruta * (dependetes * 0.02);
            rendaLiquida = (rendaLiquida - rendaBruta);
        }

        double imposto;

        // Processo
        if (rendaLiquida <= 2000) {
            System.out.println("Não paga imposto");
        }
        if (rendaLiquida >= 2001 && rendaLiquida < 5000) {
            imposto = (rendaLiquida * 0.05);
            System.out.println("O valor do seu imposto de renda é: R$" + imposto);
        }
        if (rendaLiquida >= 5001 && rendaLiquida < 10000) {
            imposto = (rendaLiquida * 0.1);
            System.out.println("O valor do seu imposto de renda é: R$" + imposto);
        }
        if (rendaLiquida >= 10001) {
            imposto = (rendaLiquida * 0.15);
            System.out.println("O valor do seu imposto de renda é: R$" + imposto);
        }

        tec.close();
    }
}

// Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda
// anual e o número de dependentes do contribuinte. A renda líquida é calculada
// sobre a renda anual com um desconto de 2% para cada dependente do
// contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não
// paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$
// 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas
// líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$
// 10.000,00 pagam 15% de imposto.
