package atividadesVetor;

import java.util.Scanner;

public class Atvd10 {
    int opcao = 0;
    Scanner input = new Scanner(System.in);
    int tamanho = 10;
    int[] vetor = new int[tamanho];

    public static void main(String[] args) {
        Atvd10 atividade = new Atvd10();
        atividade.leituraDosValoresDoVetor();
    }

    public void leituraDosValoresDoVetor() {
        System.out.println("Informe cinquenta valores: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = input.nextInt();
        }
        menu();
    }

    public void menu() {
        do {
            System.out.println("Opcoes do Menu: ");
            System.out.println("");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Sair do sistema");
            System.out.println("");
            System.out.print("Escolha uma das opcoes acima: ");
            opcao = input.nextInt();
        } while (validarOpcoes(opcao) == false);
        opcoes(opcao);
    }

    public boolean validarOpcoes(int opcao) {
        if (opcao < 1 || opcao > 7) {
            return false;
        }
        return true;
    }

    public void opcoes(int opcao) {
        if (opcao != 7) {
            switch (opcao) {
                case 1:
                    opcaoNumeroUm();
                    break;
                case 2:
                    opcaoNumeroDois();
                    break;

                case 3:
                    terceiraOpcao();
                    break;

                case 4:
                    quartaOpcao();
                    break;

                case 5:
                    quintaOpcao();
                    break;

                case 6:
                    sextaOpcao();
                    break;

                default:
                    break;
            }
            menu();
        }
    }

    public void opcaoNumeroUm() {
        if (vetor[tamanho - 1] == 0) {
            vetor[tamanho - 1] = input.nextInt();
            System.out.println("Valor foi alocado");
            return;
        }
        System.out.println("Valor não foi alocado");

    }

    public void opcaoNumeroDois() {
        int valorInformado = input.nextInt();
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorInformado) {
                System.out.println("O valor está no vetor na posição: " + i);
                return;
            }

        }
        System.out.println("O valor não está no vetor");
    }

    public void terceiraOpcao() {
        System.out.print("Informe o valor que ja exista no vetor: ");
        int valorInformado = input.nextInt();
        System.out.print("Informe o valor a ser alocado no lugar: ");
        int novoValor = input.nextInt();
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorInformado) {
                vetor[i] = novoValor;
                System.out.println("O valor " + novoValor + " foi alocado no lugar do numero informado");
                return;
            }

        }
        System.out.println("número não encontrado");
    }

    public void quartaOpcao() {
        System.out.println("Informe um valor que ja exista no vetor para ser excluido: ");
        int valorExcluido = input.nextInt();
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorExcluido) {
                if (i != tamanho - 1) {
                    vetor[i] = vetor[i + 1];
                    for (int j = i; j < tamanho; j++) {
                        if (j != tamanho - 1) {
                            vetor[j] = vetor[j + 1];
                        }
                    }
                    System.out.println("Valor excluido");
                }

            }
        }
        System.out.println("Valor nao excluido");
    }

    public void quintaOpcao() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void sextaOpcao() {
        int aux = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}

