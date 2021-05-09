/*Descreva um algoritmo que leia o número de inscrição e a altura 
de um atleta em uma competição e informe:
    -o número de inscrição e a altura do atleta mais alto;
    -o número de inscrição e a altura do atleta mais baixo;
    -a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.*/
import java.util.Scanner;
public class Uni5Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double altura=0;
        double maior = 0;
        double menor = 1000;
        int numero = 1, AtletasTotais =0;
        double alturaTotal =0;
        double mediaAlturaAtletas =0;
        int numeroDoMaiorAtleta = 0, numeroDoMenorAtleta = 0;

        while (numero != 0) {

            System.out.println("Informe seu numero de inscrição");
            numero = ler.nextInt();  

            System.out.println("Informe a sua altura");
            altura = ler.nextDouble();

            //Mostrará o número de inscrições totais e a soma das alturas fornecidas
            AtletasTotais ++;
            alturaTotal += altura;

            if (altura >= maior) {
                maior = altura;
                numeroDoMaiorAtleta =numero;
            }
     
            if (altura <= menor) {
                menor = altura;
                numeroDoMenorAtleta = numero;
            }}
            mediaAlturaAtletas = alturaTotal / AtletasTotais;
            System.out.println("O atleta da inscrição número " + numeroDoMaiorAtleta + " possui a maior altura de: "+ maior);
            System.out.println("O atleta da inscrição número " + numeroDoMenorAtleta + " possui a menor altura de: "+ menor);
            System.out.println("A altura média do grupo de atletas é de: " + mediaAlturaAtletas);


    }
}    
