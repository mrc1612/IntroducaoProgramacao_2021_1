package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade1 = scanner.nextInt();
        int idade2 = scanner.nextInt();
        int idade3 = scanner.nextInt();
        
        int[] idades = {idade1,idade2, idade3};

        int minValue = idades[0]; 
        for(int i=1;i<idades.length;i++){ 
            if(idades[i] < minValue){ 
                minValue = idades[i]; 
            }      
        }    

        System.out.println(minValue);
       
        scanner.close();
    }
}
