public class Uni5Exe02 {
    public static void main(String[] args) throws Exception {
        int somapar = 0;
        int somaimpar = 0;

        for (int i=0; i<=100; i++) {
            if (i % 2 == 0) {
                somapar = somapar+i;
            }
        }
        for (int i=0; i<=100; i++) {
            if (i % 2 != 0){
                somaimpar = somaimpar+i;
            }
        }
        System.out.println("A soma dos números pares é de " +somapar);
        System.out.println("A soma dos números ímpares é de " +somaimpar);
    }
}
