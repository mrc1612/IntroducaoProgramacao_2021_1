import java.util.Scanner;

public class Uni3Exe15 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    

        int num = tec.nextInt();

        int centenas = num/100;
        num -= centenas*100;

        int dezenas = num/10;
        num -= dezenas*10;

        System.out.println(centenas + " centena(s)  " + dezenas +" dezena(s) " + num + " unidade(s)");

        tec.close();
    }

}
