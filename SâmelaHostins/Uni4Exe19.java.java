import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int x, y;
        System.out.println("Informe um numero x");
        x=ler.nextInt();
        System.out.println("Informe um numero y");
        y=ler.nextInt();
        if(x ==0 && y ==0){
            System.out.println("X e Y ficam no quadrante zero");   
        }else{
        if(x >=1 && y >= 1){
            System.out.println("X e Y ficam no primeiro quadrante");
        }else{
            if(x >=1 && y < 0){
                System.out.println("X e Y ficam no segundo quadrante");
        }else{
            if(x < 0 && y < 0){
                System.out.println("X e Y ficam no terceiro quadrante");
        }else{
            if(x < 0 && y >= 1){
                System.out.println("X e Y ficam no quarto quadrante");        
            }
}}}}}}
