import java.util.Scanner;

public class Uni3Exe16 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);    

        double preco = teclado.nextDouble();
        double pagamento = teclado.nextDouble();

        double troco = pagamento-preco;

        if (troco > 0){

            int notas100 = (int)troco/100;
            troco -= notas100*100;
    
            int notas10 = (int)troco/10;
            troco -= notas10*10;
    
            System.out.println(notas100 + " centena(s)  " + notas10 +" dezena(s) " + troco + " unidade(s)");

        }
        else{
            System.out.println("Não haverá troco!");
        }
    
        teclado.close();
    }

}
