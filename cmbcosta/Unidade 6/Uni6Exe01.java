import java.util.Scanner;

public class Uni6Exe01 {

    public Uni6Exe01() {
        int[] array = new int[10];

        readyValueArray(array);
        writeArray(array);
    }

    public void readyValueArray(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < array.length; index++) {
            System.out.print("Digite um número: ");
            array[index] = scanner.nextInt();
        }

        scanner.close();
    }

    public void writeArray(int[] array) {
        for (int indexReverse = array.length-1; indexReverse >= 0; indexReverse--) {
            System.out.println("array[" + indexReverse + "]: " + array[indexReverse]);
        }
    }

     public static void main(String[] args) {
        new Uni6Exe01();
    }
}
