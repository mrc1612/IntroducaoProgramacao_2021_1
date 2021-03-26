import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double catetoAdjacente, catetoOposto, hipotenusa;
        System.out.println("Informe o cateto adjacente e o cateto oposto respectivamente");
        catetoAdjacente = ler.nextDouble();
        catetoOposto = ler.nextDouble();

        hipotenusa = ((catetoAdjacente*catetoAdjacente) + (catetoOposto*catetoOposto)); 


        System.out.println("A hipotenusa é: "+hipotenusa);

    }
}
