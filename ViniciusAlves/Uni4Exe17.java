import java.util.Scanner;
public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float rendaAnual, dependentes; 
        double rendaLiquida;

        System.out.println("Informe a sua renda anual:");
        rendaAnual = teclado.nextFloat();

        System.out.println("Informe quantas pessoas dependem da sua renda:");
        dependentes = teclado.nextInt();

        rendaLiquida = (rendaAnual - ((rendaAnual * 0.02) * dependentes));

        if (rendaLiquida <= 2000){
            System.out.println("Você não paga imposto.");
        } else if (rendaLiquida > 2000 && rendaLiquida <= 5000) {
            System.out.println("Você paga 5% de imposto sobre o valor da sua renda líquida = " + (rendaLiquida * 0.05));
        } else if (rendaLiquida > 5000 && rendaLiquida <= 10000) { 
            System.out.println("Você paga 10% de imposto sobre o valor da sua renda líquida:  " + (rendaLiquida * 0.1));
        } else {
            System.out.println("Você paga 15% de imposto sobre o valor da sua renda líquida " + (rendaLiquida * 0.15));
        }

    }    
}