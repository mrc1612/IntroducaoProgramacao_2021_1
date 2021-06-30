import java.util.Scanner;

public class Uni6Exe02 {


    public Uni6Exe02() {

        float[] vectorNumb = new float[12];

        float sum = ReadyValue(vectorNumb);
        float average = mathAverage(sum, vectorNumb.length);

        higherValues(vectorNumb, average);
    }

    public float ReadyValue(float vectorNumb[]) {
        float sum = 0;
        Scanner scanner = new Scanner(System.in);


        for (int index = 0; index < vectorNumb.length; index++) {
            System.out.print("Digite um valor real: ");
            vectorNumb[index] = scanner.nextFloat();
            sum += vectorNumb[index];
        }

        scanner.close();
        return sum;
    }

    public float mathAverage(float sum, int vectorSize) {

        float average = sum / vectorSize;
        System.out.println("Média " + average);

        return average;
    }

    public void higherValues(float[] vector, float average) {

        String bigger = "";
        for (int index = 0; index < vector.length; index++) {
            if (vector[index] > average) {
                bigger += vector[index] + "\n";
            }
        }

        System.out.println(bigger);
    }

    public static void main(String[] args) {
      new Uni6Exe02();
    }
}