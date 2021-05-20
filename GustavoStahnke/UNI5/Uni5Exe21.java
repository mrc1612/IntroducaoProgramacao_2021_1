import java.util.Scanner;

public class Uni5Exe21 {

    public static void main(String[] args) throws Exception {
       
        double alturaChico = 1.5;
        double alturaZe = 1.1;

        int anos = 0;

        while (alturaChico > alturaZe)
        {
            alturaChico += .02;
            alturaZe += .03;
            anos++;
        }

        System.out.println("Anos percorridos: " + anos);

    }
}