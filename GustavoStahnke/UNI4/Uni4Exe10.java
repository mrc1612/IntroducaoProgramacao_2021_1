import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        


        System.out.println("Informe a idade de Marquinhos: ");
        int idade_Marquinhos = input.nextInt();

        System.out.println("Informe a idade de Zezinho: ");
        int idade_Zezinho = input.nextInt();

        System.out.println("Informe a idade de Luluzinha: ");
        int idade_Luluzinha = input.nextInt();

        String cacula = "";

        if (idade_Marquinhos < idade_Zezinho && idade_Marquinhos < idade_Luluzinha) {

            cacula = "Marquinhos";

        } 
        else {
            if (idade_Zezinho < idade_Luluzinha ) {

                cacula = "Zezinho";

            } else {

                cacula = "Luluzinha";

            }
        }

        System.out.println(cacula + " é o(a) caçula!");
        input.close();
    }
}
