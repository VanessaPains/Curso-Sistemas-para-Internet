import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static FichaPessoal leFichaPessoal() {
        FichaPessoal p;
        System.out.println("Digite o Nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a Idade: ");
        int idade = sc.nextInt();

        p = new FichaPessoal(nome, idade);

        return p;
    }

    public static void exibeFichaPessoal(List<FichaPessoal> cadastro) {
        for(FichaPessoal c : cadastro){
            System.out.println("Nome: "+ c.getNome());
            System.out.println("Idade: " + c.getIdade());
        }
    }

    public static void main(String[] args) {
        List<FichaPessoal> cadastro = new ArrayList<>();
        String resposta;
        do{
            cadastro.add(leFichaPessoal());
            System.out.println("Dseja Cadastrar novamente? (s/n)");
            resposta = sc.nextLine();
        }while((resposta=="sim")|| (resposta=="s"));


        //exibeFichaPessoal(cadastro);

        //System.out.println("resposta"+FichaPessoal.getQuantidade());
    }
}
