import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("x ?");
        double x = scanner.nextDouble();
        System.out.println("y?");
        double y = scanner.nextDouble();
        if((x == 0) && (y == 0)){
            System.out.println("0, se os dois valores forem zero");  
        }else if((x > 0) && (y > 0)){
            System.out.println("1, se os dois valores forem positivos"); 
        }else if((x > 0) && (y < 0)){
            System.out.println("2, se x for positivo e y, negativo"); 
        }else if((x < 0) && (y < 0)){
            System.out.println("3, se os dois valores forem negativos"); 
        }else if((x < 0) && (y > 0)){
            System.out.println("4, se x for negativo e y, positivo"); 
        }



        scanner.close();
    }
}