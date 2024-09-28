public class Continente{
    private String nome;
    private double populacaoCont;
    private double dimensao;
    private double densidade = populacaoCont/dimensao;
    Pais[] paises;

    public Continente(String nome, int numeroPaises){
        this.nome = nome;
        paises = new Pais[numeroPaises];
    }

    public String getNome() {
        return nome;
    }

    public double populacaoCont(){
        for(int i = 0; i < paises.length; i++){
            populacaoCont += paises[i].getPopulacao();
        }
        return populacaoCont;
    }

    public double dimensao(){
        for(int i = 0; i < paises.length; i++){
            dimensao += paises[i].getDimensao();
        }
        return dimensao;
    }

    public double getDimensao() {
        return dimensao;
    }
    public void calcularDensidade(){
        densidade = populacaoCont/dimensao;
    }
    public double getDensidade() {
        return densidade;
    }

    public Pais maiorPopulacao(){
        Pais maior = paises[0];
        for(int i = 0; i < paises.length; i++){
            if(paises[i].getPopulacao() > maior.getPopulacao()){
                maior = paises[i];
            }
        }
        return maior;
    }

    
    public Pais menorPopulacao(){
        Pais menor = paises[0];
        for(int i = 0; i < paises.length; i++){
            if(paises[i].getPopulacao() < menor.getPopulacao()){
                menor = paises[i];
            }
        }
        return menor;
    }

    
    public Pais maiorDimensao(){
        Pais maior = paises[0];
        for(int i = 0; i < paises.length; i++){
            if(paises[i].getDimensao() > maior.getDimensao()){
                maior = paises[i];
            }
        }
        return maior;
    }
    
    public Pais menorDimensao(){
        Pais menor = paises[0];
        for(int i = 0; i < paises.length; i++){
            if(paises[i].getDimensao() < menor.getDimensao()){
                menor = paises[i];
            }
        }
        return menor;
    }

    public double razaoTerritorial(){
        return maiorDimensao().getDimensao()/menorDimensao().getDimensao();
    }

    
}