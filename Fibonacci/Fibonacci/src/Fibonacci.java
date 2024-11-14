import java.util.Scanner;//biblioteca

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a posição da série de fibonacci?");//imprimir na tela
        int n = s.nextInt();//usuario digitar na tela
        int r = calcularFib(n);//trazer na variavel r o resultado da funcao calcularFib de n (n é o numero que usuario digitou)
        System.out.println("O valor da posição " + n + " é " + r);// aqui  vainimprimir na tela
        s.close();
    }

    //função para calcular o valor de acordo com a  posição digitada pelo usuario.
    public static int calcularFib(int n){
        if (n <= 1){//se n for menor ou igual a 1
            return n;//retorne n.
        }else{//caso contrario
            return calcularFib(n-1) + calcularFib(n-2);//retorne calculaFib de n menos 1 mais calculaFib menos 2
        }
    }
}
