import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       int idadeH1, idadeH2, idadeM1, idadeM2, soma, produto;
        System.out.println("Considerando que a idade entre homens e mulheres sempre serão diferentes");
       System.out.println("Informe a idade do primeiro homem");
idadeH1= ler.nextInt();
System.out.println("Informe a idade do segundo homem");
idadeH2= ler.nextInt();
System.out.println("Informe a idade da primeira mulher");
idadeM1= ler.nextInt();
System.out.println("Informe a idade da segunda mulher");
idadeM2= ler.nextInt();
if(idadeH1>idadeH2 && idadeM1<idadeM2 ){
soma = (idadeH1 + idadeM1);
produto = (idadeH2*idadeM2);
System.out.println("A soma das idades entre o Homem mais velho e a mulher mais nova é " + soma);
System.out.println("O produto das idades entre o Homem mais novo e a mulher mais velha é " + produto);
}else{
if(idadeH1>idadeH2 && idadeM2<idadeM1 ){
soma = (idadeH1 + idadeM2);
produto= (idadeH2*idadeM1);
System.out.println("A soma das idades entre o Homem mais velho e a mulher mais nova é " + soma);
System.out.println("O produto das idades entre o Homem mais novo e a mulher mais velha é " + produto);
}else{
if(idadeH2>idadeH1 && idadeM1<idadeM2 ){
    soma= (idadeH2 + idadeM1);
    produto= (idadeH1*idadeM2);
    System.out.println("A soma das idades entre o Homem mais velho e a mulher mais nova é " + soma);
System.out.println("O produto das idades entre o Homem mais novo e a mulher mais velha é " + produto);
}else{
    if(idadeH2>idadeH1 && idadeM2<idadeM1 ){
        soma= (idadeH2 + idadeM2);
        produto= (idadeH1*idadeM1);   
        System.out.println("A soma das idades entre o Homem mais velho e a mulher mais nova é " + soma);
System.out.println("O produto das idades entre o Homem mais novo e a mulher mais velha é " + produto);
}
}
}}
}}


