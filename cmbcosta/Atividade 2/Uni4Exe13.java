import java.util.Scanner;

public class Uni4Exe13 
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor das suas 3 cartas");
        System.out.println("1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei");
        System.out.println("Digite o valor da primerira carta: ");
        int carta = scanner.nextInt();
        System.out.println("Digite o valor da segunda carta: ");
        int carta2 = scanner.nextInt();
        System.out.println("Digite o valor da terceira carta: ");
        int carta3 = scanner.nextInt();
        String truco = (String) ("TRUCO");
        String seis = (String) ("SEIS");


        if((carta == 1 || carta == 2 || carta == 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3))
        {
            System.out.println(truco);
        }
        if((carta != 1 && carta != 2 && carta != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3))
        {
            System.out.println(truco);
        }
        if((carta != 1 && carta != 2 && carta != 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3))
        {
            System.out.println(truco);
        }

        if((carta == 1 || carta == 2 || carta == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3))
        {
            System.out.println(seis);
        }
        else if((carta == 1 || carta == 2 || carta == 3) && (carta2 != 1 && carta2 == 2 && carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3))
        {
            System.out.println(seis);
        }
        else if((carta != 1 && carta != 2 && carta != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3))
        {
            System.out.println(seis);
        }

        if(((carta == 1 || carta == 2 || carta == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)))
        {
            System.out.println("NOVE");
        }
        
        scanner.close();
    }    
}