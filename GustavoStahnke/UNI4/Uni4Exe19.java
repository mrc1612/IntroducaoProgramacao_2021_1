import java.util.Scanner;

public class Uni4Exe19 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe X: ");
        int x = input.nextInt();

        System.out.println("Informe Y: ");
        int y = input.nextInt();

        if(x == 0 && y == 0){
            System.out.println("Quadrante 0");
        }
        else{
            if(x > 0 && y > 0){
                System.out.println("Quadrante 1");
            }
            else{
                if(x > 0 && y < 0){
                    System.out.println("Quadrante 2");
                }
                else{
                    if(x < 0 && y < 0){
                        System.out.println("Quadrante 3");
                    }
                    else{
                            System.out.println("Quadrante 4");
                    }
                }
            }
        }

        input.close();
    }

}