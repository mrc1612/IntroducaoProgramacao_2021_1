import java.util.Scanner;

public class Uni3Exe11 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    

        double temp_fahrenheit = tec.nextDouble();
        double temp_celsius = (temp_fahrenheit -32)* (5.0/9.0);

        System.out.println(" A tempetura em celsius é: " + temp_celsius);

        tec.close();
    }

}
