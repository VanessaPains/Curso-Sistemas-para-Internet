import java.util.Scanner;

public class App {
    public static JogadorDeFutebol jogadorDeFutebol;
    public static Scanner sc = new Scanner(System.in);

     //metodo le formação
     public static JogadorDeFutebol leJogador() {
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Ano: ");
        Integer ano = sc.nextInt();

        System.out.println("Altura: ");
        Double altura = sc.nextDouble();

        System.out.println("Peso: ");
        Double peso = sc.nextDouble();

        sc.nextLine();//limpa o buffer

        System.out.println("Nacionalidade: ");
        String nacionalidade = sc.nextLine();

        System.out.println("Posição: ");
        String posicao = sc.nextLine();

        sc.close();
        return new JogadorDeFutebol(nome, ano, altura, peso, nacionalidade, posicao);
    }

    //metodo exibe jogador
    public static JogadorDeFutebol exibeJogador(JogadorDeFutebol j) {
        System.out.println("Informações do Jogador:");
        System.out.println("Nome: " + jogadorDeFutebol.getNome());//classe jogadorDeFutebol chama os gets
        System.out.println("Ano: " + jogadorDeFutebol.getAno());
        System.out.println("Altura: " + jogadorDeFutebol.getAltura());
        System.out.println("Peso: " + jogadorDeFutebol.getPeso());
        System.out.println("Nacionalidade: " + jogadorDeFutebol.getNacionalidade());
        System.out.println("posicao: " + jogadorDeFutebol.getPosicao());
        System.out.println("Jogador não cadastrado.");
  
        return j;
    }

    public static JogadorDeFutebol aposentar(JogadorDeFutebol jogadorDeFutebol){
        if ((jogadorDeFutebol.getPosicao().equals("atacante") && JogadorDeFutebol.calculaIdade(jogadorDeFutebol.getAno()) < 35) ||
            (jogadorDeFutebol.getPosicao().equals("defesa") && JogadorDeFutebol.calculaIdade(jogadorDeFutebol.getAno()) < 40) ||
            (jogadorDeFutebol.getPosicao().equals("meio de campo") && JogadorDeFutebol.calculaIdade(jogadorDeFutebol.getAno()) < 38))
        {
            int idadePosiAposentar = 35 - JogadorDeFutebol.calculaIdade(jogadorDeFutebol.getAno());
            System.out.println("Faltam " + idadePosiAposentar + " anos para o jogador " + jogadorDeFutebol.getNome() + " se aposentar.");
        } else {
            System.out.println("O jogador " + jogadorDeFutebol.getNome() + " já pode se aposentar.");
        }
        return jogadorDeFutebol;
    }

    public static void main(String[] args) {
        jogadorDeFutebol = leJogador();//inicializa jogadorDeFutebol com o retorno de leJogador
        aposentar(jogadorDeFutebol);
    }
}
