import java.util.Scanner;

public class Uni6Exe04 {

    public Uni6Exe04() {
        int[] array = new int[10];
        int[] array1 = new int[10];
        int[] arraySum = new int[10];
        readyValueArray(array, array1);
        writeArray(array, array1);
        sumArray(array, array1, arraySum);
    }

    // READY
    public void readyValueArray(int[] array, int[] array1) {
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < array.length; index++) {
            System.out.print("Digite os valores do Array 1: ");
            array[index] = scanner.nextInt();
        }
            for (int index1 = 0; index1 < array1.length; index1++) {
                System.out.print("Digite os valores do Array 2: ");
                array1[index1] = scanner.nextInt();
            }
    
            scanner.close();
        }
    public void sumArray(int[] array, int[] array1, int[] arraySum) {    
        for (int i = 0; i < array.length; i++) {
        float sum = array[i];

        }
    
        for (int j = 0; j < array1.length; j++) {
            float sum1 = array[j];
        
    }
}
    
   public void writeArray(int[] array, int[] array1) {
        for (int i = 0; i < array.length; i++) {
            //System.out.println("array[" + i + "]: " + array[i]);

        }
    
        for (int j = 0; j < array1.length; j++) {
            //System.out.println("array1[" + j + "]: " + array1[j]);

        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe04();
    }
}