package colecaoelementos;
import java.util.Scanner;
import java.lang.Math;

/*
* Guilherme Araujo Sette TIA: 41783441
* Luiz Henrique Monteiro de Carvalho TIA: 41719468
* */

public class colecaoElemento {
    private listaPonto lista1;
    private Ponto ponto1;


    public colecaoElemento(listaPonto lista1, Ponto ponto1) {
        this.lista1 = lista1;
        this.ponto1 = ponto1;
    }


    public static void main(String[] args) {
        Ponto p1;
        listaPonto l1;
        colecaoElemento colecao;
        int numeroposicoes;
        int x, y;
        int posicao;
        double raio;
        listaPonto vetor;
        int escolha;

        Scanner input    = new Scanner(System.in);

        System.out.print("--------------------------------------------\n");
        System.out.print("|");
        System.out.print("                                          |\n");
        System.out.print("|        Coleção de elementos         |\n");
        System.out.print("|");
        System.out.print("                                          |\n");
        System.out.print("--------------------------------------------\n");
        System.out.print("\n");
        System.out.print("Bem-vindo\n");

        System.out.print("Quantas posicoes vão ter na lista?: ");
        numeroposicoes = input.nextInt();
        vetor = new listaPonto(numeroposicoes);


        while (true) {
            System.out.println("----------------------\n");
            System.out.println("Menu - Calculadora\n");
            System.out.print("1.) Adicionar um elemento no final da coleção.\n");
            System.out.print("2.) Adicionar um elemento na posicao especifca da coleção.\n");
            System.out.print("3.) Retornar o índice da primeira ocorrência de um elemento especificado na coleção\n");
            System.out.print("4.) Remover um elemento em uma posição na coleção\n");
            System.out.print("5.) Calcular a distância dos dois pontos mais distantes na coleção.\n");
            System.out.print("6.) Retornar uma coleção de pontos contido em uma circunferência.\n");
            System.out.print("0.) Sair\n");
            System.out.print("\nDigite sua opção: ");
            System.out.println("----------------------\n");

            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Adicionar um elemento no final da coleção. ");
                    System.out.println("Vamos criar o ponto\n");
                    System.out.println("Digite o x: ");
                    x = input.nextInt();
                    System.out.println("Digite o y: ");
                    y = input.nextInt();
                    p1 = new Ponto(x, y);
                    vetor.adiciona_final(p1);
                    vetor.mostra();
                    break;
                case 2:
                    System.out.println("Adicionar um elemento na posicao especifica da coleção. ");
                    System.out.println("Vamos criar o ponto\n");
                    System.out.println("Digite o x: ");
                    x = input.nextInt();
                    System.out.println("Digite o y: ");
                    y = input.nextInt();
                    p1 = new Ponto(x, y);
                    System.out.println("Digite a posicao: ");
                    posicao = input.nextInt();
                    vetor.adiciona_posicao_especifica(p1,posicao);
                    vetor.mostra();
                    break;
                case 3:
                    System.out.println("Retornar o indice da primeira ocorrência de um elemento especificado na coleção.");
                    System.out.println("Vamos criar o ponto\n");
                    System.out.println("Digite o x: ");
                    x = input.nextInt();
                    System.out.println("Digite o y: ");
                    y = input.nextInt();
                    p1 = new Ponto(x, y);
                    System.out.println("O elemento esta na posicao: "+vetor.busca_ponto(p1)+"\n");
                    break;

                case 4:
                    System.out.println("Remover um elemento em uma posição na coleção");
                    System.out.println("Digite a posicao: ");
                    posicao = input.nextInt();
                    vetor.remove_ponto(posicao);
                    break;
                case 5:
                    System.out.println("Calcular a distância dos dois pontos mais distantes na coleção.");
                    System.out.println("Distancia: "+vetor.calcula_distancia());
                    break;

                case 6:
                    System.out.println("Retornar uma coleção de pontos contido em uma circunferência.");
                    System.out.println("Vamos criar o ponto\n");
                    System.out.println("Digite o x: ");
                    x = input.nextInt();
                    System.out.println("Digite o y: ");
                    y = input.nextInt();
                    p1 = new Ponto(x, y);
                    System.out.println("Digite o raio da circunferencia: ");
                    raio = input.nextDouble();
                    vetor.pontos_circunferencia(raio, p1).mostra();
                    break;

                case 0:
                    System.out.println("Ate mais...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        }
    }
}
