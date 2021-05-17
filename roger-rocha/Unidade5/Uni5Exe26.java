import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = 0, valorPedagio = 1, muitoCaro = 0;
        int i = 1, x = 0 , trechoCaro = 0, trecho150 = 0;

        System.out.println("Quanto voce se nega a pagar em um pedagio: ");
        muitoCaro = sc.nextDouble();

        while (valorPedagio > 0) 
        {
            System.out.println("Custo pedagio " + i);
            valorPedagio = sc.nextDouble();
            if(valorPedagio < 0)
            {
                break;
            }
            System.out.println("Quanto km percorridos ate o pedagio " + i);
            distancia = sc.nextInt();
            i++;
            x++;
            if(valorPedagio >= muitoCaro)
            {
                trechoCaro++;
            }
            if(distancia > 150 && valorPedagio < muitoCaro)
            {
                trecho150++;
            }           
        }
        System.out.println(trechoCaro +" trechos que ele se recusa a pagar");
        System.out.println(x +" trechos que foram informados");
        System.out.println(trecho150 + " trechos que sao acima de 150km e ele pode pagar");

    }
}
