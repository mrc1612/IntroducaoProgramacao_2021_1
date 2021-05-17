import java.util.Scanner;

public class Uni4Exe15 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de meses que o funcionário foi admitido: ");
        int meses = input.nextInt();

        if (meses < 12){
            System.out.println("O reajuste será de 5%");
        }else{
            if (meses >= 13 && meses <= 48 ){
                System.out.println("O reajuste será de 7%");
            }
        }

        input.close();
    }

}