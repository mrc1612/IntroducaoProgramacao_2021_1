import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1, age2, age3, age4;
        String name1, name2, name3, name4;

     System.out.println("Informe o nome e idade do rapaz: ");
      name1 = sc.next();
      age1 = sc.nextInt();

     System.out.println("Informe o nome e idade do segundo rapaz: ");
      name2 = sc.next();
      age2 = sc.nextInt();

     System.out.println("Informe o nome e idade da garota: ");
     name3 = sc.next();
     age3 = sc.nextInt();

     System.out.println("Informe o nome e idade da segunda garota: ");
     name4 = sc.next();
     age4 = sc.nextInt();

      if (age1 > age2 && age3 > age4) {
        System.out.println(" Garoto: " + name1  +  " Idade:  " + age1 + " Garota: " +  name3  +  " Idade : "+ age3);
      } else if (age1 > age2 &&  age4 > age3) {
        System.out.println(" Garoto: "+  name1  +" Idade:  " + age1 + " Garota "+ name4 +" Idade: "+ age4);
      } else if (age2 > age1 && age3 > age4) {
        System.out.println(" Garoto: "+  name2 +" Idade:  " + age2 + " Garota: "+  name3  +" Idade: "+ age3);
      } else if (age2 > age1 && age4 > age3) {
        System.out.println(" Garoto: "+ name2  +" Idade:  " + age2 + " Garota: "+  name4  +" Idade: "+ age4);
      }
    }
}