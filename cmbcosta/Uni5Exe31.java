import java.util.Scanner;
public class Uni5Exe31 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int div = 2;
        System.out.println("Informe um numero positivo:");
        int valor = scanner.nextInt();

        while (valor != 1) {
if ( valor % div == 0){
    System.out.println(div);
    valor = valor/ div;
}else{
    div ++;
}}}
        }				 
