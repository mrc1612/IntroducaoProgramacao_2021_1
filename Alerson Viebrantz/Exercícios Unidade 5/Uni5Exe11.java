import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class Uni5Exe11 {
    public static void main(String[] args) throws Exception {
        
        int den = 3;

        for (int i=1; i<=16; i++) {
            den *= 3;
        }

        int s = den + 1;
        System.out.println("A quantidade de biscoitos quebrados em 16h é de: "+s);
    }
}
