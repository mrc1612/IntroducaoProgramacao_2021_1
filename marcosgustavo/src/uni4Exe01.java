import java.util.Scanner;

public class uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Double valorhora = 8.0;
        System.out.println("Digite as horas trabalhadas: ");
        Double horaT = teclado.nextDouble();
        Double horaE = 0.0;
        Double pagamento;
        if (horaT >= 40); {
            horaE = (horaT - 40);
        }
        horaT = horaT - horaE;
        horaE = horaE * (valorhora + 50/100);
        pagamento = horaT + horaE;

        System.out.print("o Pagamento é: "+pagamento);

        teclado.close();
    }
}
