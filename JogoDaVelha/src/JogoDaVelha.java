import java.util.Scanner;//importei bliblioteca

public class JogoDaVelha {//classe principal1  

    /*Implemente, em java, o jogo da velha para dois usuários humanos.
O programa deverá ter as seguintes funções: */
    private static char[][] tabuleiro = new char[3][3];//essa é variavel global com tamanho de 3 por 3 com total de nove posições do tabuleiros para jogada
    private static char jogadorAtual = 'X'; //variavel globlar para armazenar qual jogador esta fazendo a jogada. Jgose Inicia com jogador X. 

    public static void main(String[] args) {
        inicializaTabuleiro();//aqui esta chamando a função que inicializa o tabuleito em branco.
        int jogadas = 0;

        while (true) {
            interfaceTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", escolha uma posição (1-9):");
            Scanner scanner = new Scanner(System.in);
            int posicao = scanner.nextInt();

            if (validacao(posicao)) {
                realizarJogada(posicao);
                jogadas++;

                if (vitoria()) {
                    interfaceTabuleiro();
                    exibeFim(1);
                    break;
                } else if (empate(jogadas)) {
                    interfaceTabuleiro();
                    exibeFim(0);
                    break;
                }

                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X'; // Alterna jogador
            } else {
                restricao();
            }
        }
    }

    //função para iniciar o tabuleiro em branco.
    private static void inicializaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    /*1) int interface( int ) – exibe o tabuleiro do jogo antes de cada jogada, as posições do
 tabuleiro, e a leitura da jogada a ser feita */
    private static void interfaceTabuleiro() {
        System.out.println("Tabuleiro Atual:");
        System.out.println("\n");
        
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + tabuleiro[i][0] + " ");
            System.out.print("| " + tabuleiro[i][1] + " ");
            System.out.print("| " + tabuleiro[i][2]);
            System.out.println();
        }

        System.out.println(" ");
        System.out.println(" 1 | 2 | 3");
        System.out.println(" 4 | 5 | 6");
        System.out.println(" 7 | 8 | 9");
        System.out.println("\n");
    }

    /*2) boolean validação( int ) – verifica se a jogada atual é válida. Caso seja, a função retorna true. Caso contrário, a função retorna false.*/
    private static boolean validacao(int posicao) {
        if (posicao < 1 || posicao > 9) {
            return false;
        }
        int linha = (posicao - 1) / 3;
        int coluna = (posicao - 1) % 3;
        return tabuleiro[linha][coluna] == ' ';
    }

    /*3) void restrição( ) - Não sendo uma posição válida, exiba uma mensagem informando que a jogada é inválida  */
    private static void restricao() {
        System.out.println("Jogada inválida. Tente novamente.");
    }

    /*4) boolean empate( ) – verifica se a jogada atual gerou a situação de “velha” */
    private static boolean empate(int jogadas) {
        return jogadas == 9; //retorno tem numero de jagadas igual a 9.
    }

    /*5) boolean vitória( ) – verifica se a jogada atual gerou a vitória do jogador */
    private static boolean vitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true; // Vitoria na linha
            }
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true; // Vitoria na coluna
            }
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true; // Vitoria diagonal
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true; // Vitoria diagonal
        }
        return false;
    }

    private static void realizarJogada(int posicao) {
        int linha = (posicao - 1) / 3;
        int coluna = (posicao - 1) % 3;
        tabuleiro[linha][coluna] = jogadorAtual;
    }

    /*6) void exibeFim( int ) – exibe um texto informando que deu “velha” ou que o jogador tal ganhou o jogo*/
    private static void exibeFim(int resultado) {
        if (resultado == 1) {
            System.out.println("Jogador " + jogadorAtual + " ganhou!");
        } else {
            System.out.println("Deu velha!");
        }
    }
}
