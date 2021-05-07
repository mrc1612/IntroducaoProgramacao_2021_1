/*Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela 
quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte 
ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e 
assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados 
no final de cada dia (a máquina opera 16 horas por dia).*/

public class Uni5Exe11 {
    public static void main(String[] args) throws Exception {

        /*Vai da segunda hora em diantes
        Começando por 3, fará 3 elevado ao número fornecido por i,
        ex: 3 elevado a 4 = 81. */
        int denominador = 3;
        for (int i=1; i<=16; i++){
            denominador *= 3;
        }
        int s = denominador + 1;
        System.out.println("O valor de s é: " +s);
   }}

