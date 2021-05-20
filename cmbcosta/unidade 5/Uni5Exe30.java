import java.util.Scanner;
 
public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite N");
        int n = scanner.nextInt();

        int n1=n;
 
        System.out.println("Digite k");
        int k = scanner.nextInt();
 
        System.out.println("Digite M");
        int m = scanner.nextInt();
 
        int dentro =0;
        int fora =0;
 
       
        
 
        String s1 ="";
        String s2 ="";
        while (n >= 0){
            s1 += n+" ";
                       
            if (m > 0){
               s2 += n+" ";
               m--;
              
            }            
            n = n -k;
        }
        
        System.out.println(s1 + "\n" + s2);
    }
}