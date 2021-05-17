/*Os regulamentos de uma competição de pesca impõem um limite no peso total 
de pesca de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas)
 e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca 
 obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem
  e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos 
  de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o
   peso de mais um peixe: s (SIM) / n (NÃO)?”.*/
import java.util.Scanner;
public class Uni5Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        char dados = 'S';
        double limite, limiteGrama, limiteDiario, peso=0, pesoTotal=0;

        System.out.println("Informe o limite do peso total de pesca diário em quilograma:");
            limite = ler.nextInt();
            limiteGrama = (limite*1000);
            limiteDiario = limiteGrama;
            System.out.println(limiteDiario);


        while (dados == 'S' || dados == 's' ){ 
        
            System.out.println("Informe o peso do peixe:");   
            peso = ler.nextInt();
            pesoTotal += peso;
            if(pesoTotal> limiteDiario){
                System.out.println("O limite diário foi excedido");
                break;
            }

            System.out.println("Peso total da pesca: "+ pesoTotal);
            

System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
dados = ler.next().charAt(0);

}}}
