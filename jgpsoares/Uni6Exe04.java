import java.util.Scanner;

public class Uni6Exe04 {

    public Uni6Exe04() {
        int[] array = new int[10];
        int[] array1 = new int[10];
        int[] arraySum = new int[10];
        readyValueArray(array, array1);
        sumArray(array, array1, arraySum);
        writeArray(array, array1, arraySum, 0);

    }

 
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
        for (int i = 0; i < arraySum.length; i++) {
            
            arraySum[i] = array[i] + array1[i];


        }
	}
    
   public void writeArray(int[] array, int[] array1, int[] arraySum, int sumArray) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]: " + array[i]);

        }
    
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array1[" + i + "]: " + array1[i]);

        }
        for (int i = 0; i < arraySum.length; i++) {
            System.out.println("arraySum[" + i + "]: " + arraySum[i]);

        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe04();
    }
}
