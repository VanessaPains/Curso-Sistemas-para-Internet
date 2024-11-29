import java.util.Scanner;

public class App {
    private static Pessoa pessoa;
    private static Formacao formacao;
    private static Scanner sc = new Scanner(System.in);

    //le pessoa
    public static Pessoa lePessoa() {
        System.out.println("Informe o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Informe o sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();  // Limpa o buffer
        return new Pessoa(nome, sexo, idade);   
    }

    //le formação
    public static Formacao leFormacao() {
        System.out.println("Informe o nível da formação: ");
        String nivel = sc.nextLine();
        System.out.println("Concluído? (true/false): ");
        boolean concluido = sc.nextBoolean();
        sc.nextLine();  // Limpa o buffer
        System.out.println("Informe a instituição: ");
        String instituicao = sc.nextLine();
        System.out.println("Informe o ano de conclusão: ");
        int ano = sc.nextInt();
        sc.nextLine();  // Limpa o buffer
        return new Formacao(nivel, concluido, instituicao, ano);
    }

    public static void exibePessoa() {
        if (pessoa != null) {
            System.out.println("Informações da Pessoa:");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Sexo: " + pessoa.getSexo());
            System.out.println("Idade: " + pessoa.getIdade());
        } else {
            System.out.println("Pessoa não cadastrada.");
        }
    }

    public static void exibeFormacao() {
        if (formacao != null) {
            System.out.println("Informações da Formação:");
            System.out.println("Nível: " + formacao.getNivel());
            System.out.println("Concluído: " + (formacao.isConcluido() ? "Sim" : "Não"));
            System.out.println("Instituição: " + formacao.getInstituicao());
            System.out.println("Ano: " + formacao.getAno());
        } else {
            System.out.println("Formação não cadastrada.");
        }
    }

    //main
    public static void main(String[] args) {
        int opcao;

        //menu
        do {
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Cadastrar Formação");
            System.out.println("3- Exibir Informações");
            System.out.println("4- Atualizar Idade");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();// Limpa o buffer

            switch (opcao) {
                case 1:
                    pessoa = lePessoa();
                    break;
                case 2:
                    formacao = leFormacao();
                    break;
                case 3:
                    exibePessoa();
                    exibeFormacao();
                    break;
                case 4:
                    if (pessoa != null) {
                        System.out.println("Informe a nova idade: ");
                        int novaIdade = sc.nextInt();
                        pessoa.setIdade(novaIdade);
                        System.out.println("Idade atualizada com sucesso!");
                    } else {
                        System.out.println("Pessoa não cadastrada.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
    }
}