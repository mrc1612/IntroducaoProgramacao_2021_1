import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);



        System.out.println("Informe o lado 1: ");
        double lado1 = input.nextDouble();

        System.out.println("Informe o lado 2: ");
        double lado2 = input.nextDouble();

        System.out.println("Informe o lado 3: ");
        double lado3 = input.nextDouble();

        if (lado1 <= lado2 + lado3 || lado2 <= lado1 + lado3 || lado3 <= lado2 + lado1) {

            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triangulo Equilátero");
            }
            else{
                if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ){
                    System.out.println("Triangulo Escaleno");
                }
                else{
                    System.out.println("Triangulo Isócele");
                }
            }
        } 
        else {
                System.out.println("Não forma um triangulo");
            }
        

        input.close();
    }
}
