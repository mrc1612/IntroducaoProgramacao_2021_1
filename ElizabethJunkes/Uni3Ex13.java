import java.util.Scanner;

public class Uni3Ex13 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double comprimento, azulejos, altura, area_parede, quantia_gasta;
        azulejos = 112.50; 
        System.out.print("Informe o comprimento e a altura total da parede (nessa ordem): ");
        comprimento = input.nextDouble();
        altura = input.nextDouble();
        area_parede = (comprimento * altura);
        quantia_gasta = (area_parede * azulejos);
        System.out.println("A quantia total a pagar é de R$" + quantia_gasta);
    }
}
  