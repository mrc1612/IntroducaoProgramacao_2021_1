import java.util.Scanner;
public class atividade24 {
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
        System.out.println("Deseja informar o peso de mais um peixe: S (SIM) / N (NÃO)?");
        dados = ler.next().charAt(0);
}
}
}