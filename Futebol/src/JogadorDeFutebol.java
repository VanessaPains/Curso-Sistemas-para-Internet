import java.time.LocalDate;

public class JogadorDeFutebol {

    //atributos
    private String nome;
    private int ano;
    private Double altura;
    private Double peso;
    private String nacionalidade;
    private String posicao;


    //Jogador 
    public JogadorDeFutebol(String nome, int ano, Double altura, Double peso, String nacionalidade, String posicao) {
        this.nome = nome;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;
    }

    //metodoa para calcular a idade
    public static int calculaIdade(Integer ano){
        int anoAtual = LocalDate.now().getYear();//pegar somente a data local da maquina
        int anoNovo = anoAtual -  ano;
        return anoNovo;
    }

    //inicio dos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}