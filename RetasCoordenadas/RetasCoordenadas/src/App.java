import java.util.Scanner;

public class App {

    //funcao le as coordenadas
    public static double leCoordenada(int numero) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a coordenada " + numero + ": ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;

        do {
            //1 - ler a coordenadas - chama o metodo lecoordenadas na class app
            double x1 = leCoordenada(1);
            double y1 = leCoordenada(2);
            double x2 = leCoordenada(3);
            double y2 = leCoordenada(4);

            //2 - chamada do valida - chama o metodo valida da classe Validacao
            if (Validacao.valida(x1, y1, x2, y2)) {

                //2.1 - instanciar a classe retas
                Retas reta = new Retas(x1, y1, x2, y2);

                //2.2 - calcula o comprimento - chama o metodo exibe da classe retas
                System.out.println(reta.exibe());

                //2.3 - contar retas - chama o get da classe retas
                System.out.println("Número de retas criadas: " + Retas.getCont());
            } else {
                //se der errado, mostra a mensagem
                System.out.println("Coordenadas inválidas. Todas devem estar no primeiro quadrante.");
            }

            //2.4 - se deseja repetir
            //entrada com sim/nao como texto e converte para um booleano
            System.out.print("Deseja repetir? (sim/não): ");
            String resposta = scanner.next().toLowerCase();//colocado tudo pra minusculo para facilitar a comparação
            continuar = resposta.equals("sim");

        } while (continuar);

        scanner.close();
    }
}