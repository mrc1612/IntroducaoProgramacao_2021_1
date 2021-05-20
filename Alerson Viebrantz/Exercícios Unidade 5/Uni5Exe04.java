public class App {
    public static void main(String[] args) throws Exception {

        double s=0;
        double num = 3;
        double den = 2;

        for (int i=1; i<=20; i++) {
            s = s + (num/den);
            num += 2;
            den += 2 + (2*i);        
        }
        System.out.println("S é = " +s);
    }

}
