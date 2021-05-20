

public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {
    double a = 0;
    double b = 0;
    for (double i = 1; i <= 100; i++) {
        a = (1/i);
        b = b + a;
    }
    System.out.print("a soma é"+b);    
    }
}

