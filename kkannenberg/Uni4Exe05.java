import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = sc.nextBoolean();

        if(resposta == true){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
        sc.close();
        
    }
}
