
//Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
// 1/1+ 1/2+ 1/3+ 1/4...+ 1/100
public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {
        /*Somatório dos números é dada por uma progressão aritmética
        uma sequência numérica em que cada termo, a partir do segundo, 
        é igual à soma do termo anterior com uma constante r. 
        O número r é chamado de razão ou diferença comum da progressão aritmética*/
        double soma = 0;
        double numerador = 1;
        for (double denominador=1; denominador<=100; denominador++){
        soma += (numerador / denominador);    


}System.out.println("A soma dos 100 termos é: " +soma);
}
    }

