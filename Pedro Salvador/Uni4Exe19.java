import java.util.Scanner;

public class Uni4Ex19 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int x, y;
        System.out.print("Informe um número x: ");
        x = teclado.nextInt();
        System.out.print("Informe um número y: ");
        y = teclado.nextInt();
        if(x ==0 && y ==0) {
            System.out.println("X e Y ficam no quadrante zero");   
        }
        else {
            if(x >= 1 && y >= 1) {
                System.out.println("X e y estão no primeiro quadrante.");
            }
            else {
                if(x >= 1 && y < 0){
                    System.out.println("X e y estão no segundo quadrante.");
            }
                else {
                    if(x < 0 && y < 0){
                        System.out.println("X e y estão no terceiro quadrante.");
                } 
                    else {
                        if(x < 0 && y >= 1){
                            System.out.println("X e y estão no quarto quadrante.");              
}}}}}}}
