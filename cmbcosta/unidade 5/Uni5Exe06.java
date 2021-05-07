import java.util.Scanner;

public class Uni5Exe06 {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    float total = 0;

    for (int quantidade = 0; quantidade < 20; quantidade++) { 
        System.out.println("Digite altura");
        float num = scanner.nextFloat();

        total = total + num;
        

        }
        System.out.println(total/20);
        


 
    scanner.close();
    }
}
