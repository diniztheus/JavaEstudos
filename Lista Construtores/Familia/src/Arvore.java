public class Arvore {
   
    Pessoa[] pessoas = new Pessoa[6];
    private String nome;

    public Arvore(String nome) {
        this.nome = nome;
    }

    public boolean saoIguais(Pessoa p1, Pessoa p2) {
        if (p1.getNome().equals(p2.getNome()) && p1.getMae().equals(p2.getMae())) {
            return true;
        }
        return false;
    }

    
    public boolean saoIrmas(Pessoa p1, Pessoa p2) {
        if (p1.getMae().equals(p2.getMae()) && !p1.getNome().equals(p2.getNome())) {
            return true;
        }
        return false;
    }

    public boolean ehAntecessora(Pessoa p1, Pessoa p2) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equals(p2.getPai()) || pessoas[i].getNome().equals(p2.getMae())) {
                return true;
            }
        }
        return false;
    }
}
