//Chico tem 1,50 metro e cresce 2 centímetros por ano,
//enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano.
//Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
public class Uni5Exe21 
{
    public static void main(String[] args) 
    {
        double chico = 1.50;
        double ze = 1.10;
        int ano = 0;
        while(chico > ze)
        {
            chico += 0.02;
            ze += 0.03;
            ano++;
        }
        System.out.println("Serao necessarios " + ano + " anos para ze ser maior que chico");

    
        
    }
    

}
