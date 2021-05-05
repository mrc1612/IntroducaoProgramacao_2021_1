public class Uni5Exe21 {
    public static void main(String[] args) {
        
        double alturaZe = 1.10;
        double alturaChico = 1.50;

        boolean zeMaiorQueChico = false;

        int anos = 0;

        while (!zeMaiorQueChico) {

            alturaZe += 0.03;
            alturaChico += 0.02;

            if (alturaZe > alturaChico) {
                zeMaiorQueChico = true;
            }

            anos++;

        }

        System.out.println("Levou " + anos + " anos");
        System.out.println("Altura Zé = " + alturaZe);
        System.out.println("Altura Chico = " + alturaChico);

    }
}
