import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Entre com a idade de Marquinhos: ");
        System.out.println("Entre com a idade de Zezinho");
        System.out.println("Entre com a idade de Luluzinha");
        
        int idadeMarquinhos = tec.nextInt();
        int idadeZezinho = tec.nextInt();
        int idadeLuluzinha = tec.nextInt();

        //Processo e Saida
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("Marquinhos é o caçula"); 
        }
        else {
            if(idadeZezinho < idadeLuluzinha){
                System.out.println("Zézinho caçula");
            }
            else {
                System.out.println("Luluzinha é a caçula");
            }
        }

        tec.close();
    }
}
