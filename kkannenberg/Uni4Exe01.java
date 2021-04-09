import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        
        
        double HorasTrab, SalHora, SalFinal, HorasSem;

        System.out.println("Infome quantas horas você trabalhou!");
        Scanner sc = new Scanner(System.in);
        HorasTrab = sc.nextDouble();

        System.out.println("Infome quanto você recebe por hora!");
        SalHora = sc.nextDouble();

        HorasSem = HorasTrab / 4;
        SalFinal = HorasTrab * SalHora;

        if (HorasSem <= 40) {
            System.out.println("Seu sálario final é RS$" + SalFinal);
        } else {
            SalFinal = SalFinal + ((HorasSem - 40) * (SalHora *  1.5));
            System.out.println("Seu sálario final é RS$"+ SalFinal);
        }
        sc.close();


    }
}
