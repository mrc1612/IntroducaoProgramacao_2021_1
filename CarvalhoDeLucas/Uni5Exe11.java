public class Uni5Exe11 {
    public static void main(String[] args) {
        
        int vezes = 3;
        int biscoito = 0;

        for (int i = 1; i <= 3; i++) {

            if (i == 1) {
                biscoito += 1;
            } else if (i == 2) {
                biscoito += 3;
            } else {
                vezes = vezes * 3;
                biscoito += vezes;
            }

        }

        System.out.println(biscoito);

    }
}
