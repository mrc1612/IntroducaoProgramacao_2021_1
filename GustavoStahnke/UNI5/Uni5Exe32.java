import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        System.out.print("Informe o dia da semana em que inicia (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int diaInicio = tec.nextInt();
        
        System.out.print("Informe o numero de dias do mes: ");
        int numeroDias = tec.nextInt();
        
        System.out.println("| D | S | T | Q | Q | S | S |");

        int diaPos = 1;
        int dia = 1;

        while (diaPos < diaInicio)
        {
            System.out.print("    ");
            diaPos++;
        }

        while (dia <= numeroDias)
        {
            while (diaPos < 8 && dia <= numeroDias)
            {
                if (dia < 10)
                    System.out.print("  " + dia + " ");
                else
                    System.out.print(" " + dia + " ");
                    
                ++dia;
                ++diaPos;
            }

            diaPos = 1;
            System.out.print("\n");
        }

        tec.close();
    }
}