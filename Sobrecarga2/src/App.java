import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        //fazer menu
        //a aplicacao nao pode ter as variais que representa os numeros inteiros e reias
        //setar no contrutores os valores


        //fazendo a instancia classe
        Adicao1 adicao1 = new Adicao1();


        do {
            //opcao de menu
            System.out.println("\n---Menu---");
            System.out.println("1 - Inteiro");
            System.out.println("2 - Real");
            System.out.println("3 - Sair");
            System.out.print("Qual opção deseja escolher: ");

            //vai le a opção que usuario digitou
            op = scanner.nextInt();

            //aqui executar
            //não tem a leInt e leFloat ainda
            //jogado direto no
            switch (op) {
                case 1:
                    Dados1 dados1 = new Dados1(1, 2);
                    System.out.println(adicao1.exibe(dados1.getA(), dados1.getB(), adicao1.add(dados1.getA(),dados1.getB())));
                    break;
                case 2:
                    Dados1 dados2 = new Dados1(10.5f, 1.5f);
                    System.out.println(adicao1.exibe(dados2.getC(), dados2.getD(), adicao1.add(dados2.getC(),dados2.getD())));
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 3);

        scanner.close();



        
    }
}
