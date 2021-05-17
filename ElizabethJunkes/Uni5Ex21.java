public class Uni5Ex21 {
    public static void main(String[] args) throws Exception {
    double chico = (double) 1.5;
    double ze = (double) 1.1;
    int tempo = 0;
    while (chico > ze){
        ze += 3;
        chico += 2;
        tempo ++;
    }
    System.out.println("No total, será preciso: " + tempo + " anos para que Zé seja maior que o Chico.");
    }
}