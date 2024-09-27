public class Pais {
    private String nome;
    private double populacao;
    private double dimensao;


    public Pais(String nome, double populacao, double dimensao){
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    
}
