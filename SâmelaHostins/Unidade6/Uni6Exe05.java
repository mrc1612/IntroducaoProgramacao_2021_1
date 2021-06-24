
import java.util.Scanner;
public class Uni6Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int h [] = new int [5];
        int m [] = new int [5];
        int i, j;
        int indice = 0;

       System.out.println("Gosta de música sertaneja?");
       System.out.println("Gosta de futebol?");
       System.out.println("Gosta de seriados?");
       System.out.println("Gosta de redes sociais?");
       System.out.println("Gosta da Oktoberfest?");
       System.out.println(" ");
       System.out.println("A resposta a cada pergunta pode ser: SIM = 1, NÃO = 2 ou IND = 3");

       for (i = 0; i < 5; i++){
           System.out.println("Digite os numeros das respostas do rapza para cada pergunta respectivamente");
           h[i] = ler.nextInt();
        }

        for (i = 0; i < 5; i++){
           System.out.println("Digite os numeros das respostas da moça para cada pergunta respectivamente");
           m[i] = ler.nextInt();
        }

        for(j=0; j < 5; j++)
        {
            if(h[j] == m[j])
                indice += 3;
            else if(m[j] == 3 && h[j] == 1 || h[j] == 3 && m[j] == 1 || m[j] == 2 && h[j] == 3 || h[j] == 2 && m[j] == 3)
                indice++;
            else
                indice -= 2;
                System.out.println("O indice é de: " + indice);
        }

        //mensagem de afinidade
        if (indice == 15){
            System.out.println("Casem!");
        }
        if (indice >=10 && indice<=14){
            System.out.println("Vocês têm muita coisa em comum!");
        }
        if (indice >=5 && indice<=9){
            System.out.println("Talvez não dê certo :(");
        }
        if (indice >=0 && indice<=4){
            System.out.println("Vale um encontro.");
        }
        if (indice >=-9 && indice<=-1){
            System.out.println("Melhor não perder tempo");
        }
        if (indice == -10){
            System.out.println("Vocês se odeiam!");
        }
          
        
    }
}
