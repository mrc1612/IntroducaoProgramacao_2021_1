import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);    

        double preco = teclado.nextDouble();
        double pag = teclado.nextDouble();

        double troco = pag - preco;

        if (troco > 0){

            int notas100 = (int)troco/100;
            troco -= notas100 * 100;
    
            int notas10 = (int)troco/10;
            troco -= notas10 * 10;
    
            System.out.println(notas100 + " centena(s)  " + notas10 + " dezena(s) " + troco + " unidade(s)");
        }
        else{
            System.out.println("Nao tera troco");
        }
        teclado.close();
    }
}
