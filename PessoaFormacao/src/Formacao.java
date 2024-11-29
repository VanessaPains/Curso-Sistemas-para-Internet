public class Formacao {
    private String nivel;
    private boolean concluido;
    private String instituicao;
    private int ano;

    public Formacao(String nivel, boolean concluido, String instituicao, int ano) {
        this.nivel = nivel;
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.ano = ano;
    }

    public String getNivel() {
        return nivel;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public int getAno() {
        return ano;
    }
}