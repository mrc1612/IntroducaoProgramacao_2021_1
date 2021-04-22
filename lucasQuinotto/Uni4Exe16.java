import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int h1, h2, m1, m2, hv, hn, mv, mn, prod, soma;

        System.out.println("Digite a idade do 1º homem:");
        h1 = teclado.nextInt();

        System.out.println("Digite a idade do 2º homem:");
        h2 = teclado.nextInt();

        System.out.println("Digite a idade da 1ª mulher:");
        m1 = teclado.nextInt();

        System.out.println("Digite a idade da 2ª mulher:");
        m2 = teclado.nextInt();

        if (h1 < h2) 
        {
            hn = h1;
            hv = h2;
        } 
        else  
        {
           hn = h2;
           hv = h1;
        }

        if (m1 < m2) 
        {
            mn = m1;
            mv = m2;
        } 
        else  
        {
           mn = m2;
           mv = m1;
        }

        soma = hv + mn;
        prod = hn * mv;

        System.out.println("Soma da idade do homem mais velho com a mulher mais nova "+soma+"");
        System.out.println("Produto do homem mais novo com a mulher mais velha "+prod+"");

        teclado.close();
    }
    
}
