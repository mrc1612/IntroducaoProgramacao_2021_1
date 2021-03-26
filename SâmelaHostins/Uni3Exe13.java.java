import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double azulejo, areaParede, comprimento, altura, valorGasto;
        azulejo = 112.50; 
        System.out.println("Informe o comprimento e a altura da parede respectivamente");
        comprimento = ler.nextDouble();
        altura = ler.nextDouble();
        areaParede = (comprimento * altura);
        valorGasto = (areaParede * azulejo);
        System.out.println("O valor a ser pago é R$" + valorGasto);
    }
}
