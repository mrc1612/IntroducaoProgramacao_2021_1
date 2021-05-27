import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int escolha = 0;
        int[] vetor = new int[50];
        int cont = 0;

        while (escolha != 7) {

            System.out.println("-- ESCOLHA --");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Sair do sistema");
            escolha = teclado.nextInt();
            System.out.println("--------------------");

            switch (escolha) {
                case 1:
                    System.out.print("Digite um número para colocar no vetor: ");
                    vetor[cont] = teclado.nextInt();
                    cont++;
                    break;
                case 2:
                    System.out.print("Número para pesquisar: ");
                    int pesquisar = teclado.nextInt();
                    boolean temValor = false;

                    for (int i = 0; i < cont; i++) {
                        if (vetor[i] == pesquisar) {
                            temValor = true;
                            break;
                        }
                    }

                    if (!temValor) {
                        System.out.println("Valor não consta no vetor");
                    } else {
                        System.out.println("Valor consta no vetor");
                    }

                    break;
                case 3:
                    System.out.print("Número para pesquisar: ");
                    int pesquisa = teclado.nextInt();
                    boolean valorExiste = false;

                    for (int i = 0; i < cont; i++) {
                        if (vetor[i] == pesquisa) {
                            System.out.println("Informe novo número: ");
                            int novo = teclado.nextInt();
                            vetor[i] = novo;
                            System.out.println("Número alterado");
                            valorExiste = true;
                            break;
                        }
                    }

                    if (!valorExiste) {
                        System.out.println("Número não encontrado");
                    }
                    break;

                case 4:

                    System.out.print("Número para excluir: ");
                    int pesquisar1 = teclado.nextInt();
                    boolean temValor1 = false;

                    for (int i = 0; i < cont; i++) {
                        if (vetor[i] == pesquisar1) {
                            temValor = true;

                            if (i + 1 == cont) {
                                break;
                            }

                            for (int j = 0; j < cont; j++) {
                                vetor[i + j] = vetor[i + j + 1];
                                if (i + j + 2 == cont) {
                                    break;
                                }
                            }

                            break;
                        }
                    }

                    if (!temValor1) {
                        System.out.println("Valor não consta no vetor");
                    } else {
                        System.out.println("Valor excluído");
                    }

                    break;

                case 5:

                    for (int i = 0; i < cont; i++) {
                        System.out.println(vetor[i]);
                    }

                    break;

                case 6:

                    for (int i = 0; i < cont; i++) {

                        vetor[i] = -vetor[i];
                    }

                    Arrays.sort(vetor);

                    for (int i = 0; i < cont; i++) {

                        vetor[i] = -vetor[i];
                    }

                    for (int i = 0; i < cont; i++) {
                        System.out.println(vetor[(cont - 1) - i]);
                    }

                    break;

                case 7:

                    System.out.println("Saindo do sistema!");

                    break;
            }

        }

        teclado.close();

    }
}
