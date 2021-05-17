import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        System.out.println("Informe o curso: ");
        System.out.println("1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação");
        int Curso = tec.nextInt();

        String Titulo = "";
        switch (Curso)
        {
            case 1:
                Titulo = "Bacharel em Ciência da Computação";
                
                break;
            
            case 2:
                Titulo = "Licenciado em Computação";
                break;

            case 3:
                Titulo = "Bacharel em Sistemas de Informação";
                break;
                
        }
        System.out.println("Titulo: " + Titulo);
        

        tec.close();
    }
}
