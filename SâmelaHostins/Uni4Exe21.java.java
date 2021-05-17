import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float peso, altura, imc;
        System.out.println("Informe seu peso");
peso=ler.nextFloat();
System.out.println();
System.out.println("Informe sua altura");
altura=ler.nextFloat();
imc = (peso / (altura*altura));
if(imc < 18.5){
    System.out.println("De acordo com seu imc: " + imc + " você está magro.");
}else{
    if(imc >= 18.5 && imc <= 24.9){
        System.out.println("De acordo com seu imc: " + imc + " você está saudável.");
}else{
    if(imc >= 25 && imc <= 29.9){
        System.out.println("De acordo com seu imc: " + imc + " você está sobrepeso."); 
}else{
    if(imc >= 30 && imc <= 34.9){
        System.out.println("De acordo com seu imc: " + imc + " você está com obesidade grau I.");  
}else{
    if(imc >= 35 && imc <= 39.9){
        System.out.println("De acordo com seu imc: " + imc + " você está com obesidade grau II."); 
}else{
    if(imc >= 34){
        System.out.println("De acordo com seu imc: " + imc + " você está com obesidade grau III.");  
}

    }
}}}}}}
