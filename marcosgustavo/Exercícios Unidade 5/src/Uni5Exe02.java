

public class Uni5Exe02 {
    public static void main(String[] args) throws Exception {
    int i = 0;
    int pares = 0;
    int impares = 0;
    for (i = 0; i <= 100; i++) {
        if (i%2==0) {
            pares = (i+pares);
        } else{
            impares = (impares + i);
        }
    
    }
    System.out.print("A soma dos números pares é "+pares+". e a soma dos números ímpares é "+impares);    
    }
}

