public class Globo {
    private String nome = "Terra";
    Continente[] continentes = new Continente[5];

    public void adicionarContinente(Continente continente){
        for(int i = 0; i < continentes.length; i++){
            if(continentes[i] == null){
                continentes[i] = continente;
                break;
            }
        }
    }

    public double dimensao(){
        double dimensao = 0;
        for(int i = 0; i < continentes.length; i++){
            if(continentes[i] != null){
                dimensao += continentes[i].dimensao();
            }
        }
        return dimensao;
    }

    public double populacao(){
        double populacao = 0;
        for(int i = 0; i < continentes.length; i++){
            if(continentes[i] != null){
                populacao += continentes[i].populacaoCont();
            }
        }
        return populacao;
    }

    public double densidade(){
        return populacao()/dimensao();
    }

    public Continente maiorPopulacao(){
        Continente maior = continentes[0];
        for(int i = 0; i < continentes.length; i++){
            if(continentes[i] != null && continentes[i].populacaoCont() > maior.populacaoCont()){
                maior = continentes[i];
            }
        }
        return maior;
    }

    public double razaoTerritorial(){
        return maiorPopulacao().dimensao()/maiorPopulacao().menorDimensao().getDimensao();
    }

}
