//Programa Gasolina


package AtividadesFurb;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos litros você quer colocar: ");

        int litros = sc.nextInt();

        double PrecoGasolina = 5.60;

        double Valortotal = litros * PrecoGasolina;

        System.out.println("O valor total da abastecimento é de: ");
        
        System.out.println(Valortotal);




            sc.close();





        
    }
    
}
