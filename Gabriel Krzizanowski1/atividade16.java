
import java.util.Scanner;

public class atividade16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

     System.out.println("Informe o nome e idade do rapaz: ");

      String name1 = sc.next();

      int age1 = sc.nextInt();

     System.out.println("Informe o nome e idade do segundo rapaz: ");

      String name2 = sc.next();

      int age2 = sc.nextInt();

     System.out.println("Informe o nome e idade da garota: ");

      String name3 = sc.next();

      int age3 = sc.nextInt();

     System.out.println("Informe o nome e idade da segunda garota: ");

      String name4 = sc.next();

      int age4 = sc.nextInt();

      if(age1 > age2 && age3 > age4){

        System.out.println(" Garoto: " + name1  +  "  Idade:  " + age1 + "  Garota: " +  name3  +  "  idade : "+ age3);

      } else if(age1 > age2 &&  age4 > age3){

        System.out.println(" Garoto: "+  name1  +" Idade:  " + age1 + "  Garota "+ name4 +"  idade 4: "+ age4);

      } else if(age2 > age1 && age3 > age4){

        System.out.println("Garoto: "+  name2 +"  Idade 2:  " + age2 + "Garota: "+  name3  +"  idade 3: "+ age3);

      } else if(age2 > age1 && age4 > age3){

        System.out.println("Garoto: "+ name2  +"Idade 2:  " + age2 + "Garota: "+  name4  +"  idade 4: "+ age4);

      }

      sc.close();

    }
    
}
