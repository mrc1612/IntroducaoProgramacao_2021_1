import java.util.Scanner;

public class Uni6Exe03 {

    public Uni6Exe03() {
        float[] array = new float[12];

        readValueArray(array);
        oddPair(array);
        writeArray(array, 0);
    }

    // READY
    public void readValueArray(float[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < array.length; index++) {
            System.out.print("Digite um número: ");
            array[index] = scanner.nextInt();
        }

        scanner.close();
    }

    public void oddPair(float[] array){
        for (int i = 0; i < array.length; i++) {
            //se par
            if (i % 2 == 0) {
            float pair = array[i]; 
            float result1 = (pair * 0.02f);
            float result2 = result1 + pair; 
            array[i] = result2;  
            }else{
            float odd = array[i];
            float result3 = (odd * 0.05f);
            float result4 = result3 + odd;
            array[i] = result4; 
            //float result1 = odds . 0.05;
            }
            
        }
    }


   public void writeArray(float[] array, float oddPair) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]: " + array[i]);

        }
    }
    

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
