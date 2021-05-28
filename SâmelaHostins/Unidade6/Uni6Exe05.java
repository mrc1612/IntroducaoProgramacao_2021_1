
import java.util.Scanner;
public class Uni6Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String v[] = new String [5]; // declaração vetor 1
        String vet[] = new String [5]; // declaração vetor 2
        int i; // posição
        int soma = 0;

       System.out.println("Gosta de música sertaneja?");
       System.out.println("Gosta de futebol?");
       System.out.println("Gosta de seriados?");
       System.out.println("Gosta de redes sociais?");
       System.out.println("Gosta da Oktoberfest?");
       System.out.println(" ");
       System.out.println("A resposta a cada pergunta pode ser: SIM, NÃO ou IND");

        //Entrada de dados vetor 1
        for (i = 0; i<5; i++){         
        System.out.println("Resposta da questão do rapaz");
              v[i] = ler.next(); 
        }

        //Entrada de dados vetor 2
        for (i = 0; i<5; i++){         
            System.out.println("Resposta da questão da moça");
                  vet[i] = ler.next(); 
            }

       //medindo a afinidade
       //for (i = 0; i<5; i++){ 
          if( v[0] == vet[0] || v[1] == vet[1] || v[2] == vet[2] || v[3] == vet[3] || v[4] == vet[4]){
               soma += 3;
           }
          if(v[1] == "SIM" && vet[1] == "IND" || v[2] == "SIM" && vet[2] == "IND" || v[3] == "SIM" && vet[3] == "IND" || v[4] == "SIM" && vet[4] == "IND" || v[0] == "SIM" && vet[0] == "IND") {
               soma += 1;
          }
          if(v[1] == "NAO" && vet[1] == "IND" || v[2] == "NAO" && vet[2] == "IND" || v[3] == "NAO" && vet[3] == "IND" || v[4] == "NAO" && vet[4] == "IND" || v[0] == "NAO" && vet[0] == "IND") {
               soma += 1;
          }
          if(v[1] == "IND" && vet[1] == "SIM" || v[2] == "IND" && vet[2] == "SIM" || v[3] == "IND" && vet[3] == "SIM" || v[4] == "IND" && vet[4] == "SIM" || v[0] == "IND" && vet[0] == "SIM") {
               soma += 1;
            }
          if(v[1] == "IND" && vet[1] == "NAO" || v[2] == "IND" && vet[2] == "NAO" || v[3] == "IND" && vet[3] == "NAO" || v[4] == "IND" && vet[4] == "NAO" || v[0] == "IND" && vet[0] == "NAO") {
               soma += 1;
            }
          if(v[1] == "SIM" && vet[1] == "NAO" || v[2] == "SIM" && vet[2] == "NAO" || v[3] == "SIM" && vet[3] == "NAO" || v[4] == "SIM" && vet[4] == "NAO" || v[0] == "SIM" && vet[0] == "NAO") {
                soma -= 2;
           }
          if(v[1] == "NAO" && vet[1] == "SIM" || v[2] == "NAO" && vet[2] == "SIM" || v[3] == "NAO" && vet[3] == "SIM" || v[4] == "NAO" && vet[4] == "SIM" || v[0] == "NAO" && vet[0] == "SIM") {
                soma -= 2;
           }
      //  }

        //mensagem de afinidade
        if (soma == 15){
            System.out.println("Casem!");
        }
        if (soma >=10 && soma<=14){
            System.out.println("Vocês têm muita coisa em comum!");
        }
        if (soma >=5 && soma<=9){
            System.out.println("Talvez não dê certo :(");
        }
        if (soma >=0 && soma<=4){
            System.out.println("Vale um encontro.");
        }
        if (soma >=-9 && soma<=-1){
            System.out.println("Melhor não perder tempo");
        }
        if (soma == -10){
            System.out.println("Vocês se odeiam!");
        }

        //saida de dados (escrevendo vetor 2)
           for (i = 0; i<5; i++){
              System.out.print(v[i] + " ");
            }
            //saida de dados (escrevendo vetor 2)
           for (i = 0; i<5; i++){
            System.out.print(vet[i] + " ");
          }


    }
}
