import java.util.Scanner;

public class Uni5Exe01 {
    
    public static void main(String[] args)throws Exception {

        Scanner input = new Scanner(System.in);

        int num = 0;

        for(int i = 0; i < 20; i++)
        {
            System.out.print(" Informe um numero:");
            num = input.nextInt();
            
            if(num % 2==0)
                System.out.println(num + " é par");

            else
                System.out.println(num + " é impar");
        }

        input.close();

    }
}
