import java.util.Scanner;

public class Uni5Exe25 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        int pontosDireito = 0;
        int pontosEsquerdo = 0;

        char codigo = 0;

        while( !(pontosDireito >= 21 && (pontosDireito - pontosEsquerdo >= 2)) && !(pontosEsquerdo >=  21 && (pontosEsquerdo - pontosDireito >= 2)))
        {
            System.out.print("\nQuem fez ponto? (D - direita   E - esquerda): ");
            codigo = tec.next().charAt(0);

            if (codigo == 'D')
                ++pontosDireito;
            else
                ++pontosEsquerdo;

            System.out.print("Placar (D - " + pontosDireito + "| E -" + pontosEsquerdo + " )\n");
        }
        
        tec.close();
    }
}