import java.util.Scanner;

public class Time {
    
    String nome;
    Tecnico tec = new Tecnico();
    String nomeTecnico;
    int anos;

    Torcedor[] torcedores = new Torcedor[5];

    public Time(String nome) {
        this.nome = nome;
    }
    public void vincularTecnico(String nome, int anosExperiencia) {
        tec.nome = nome;
        tec.anosExperiencia = anosExperiencia;
        System.out.println("Técnico " + tec.nome + " com "+ tec.anosExperiencia +" anos de experiencia foi "+ " vinculado ao time: " + this.nome);
    }
    
    public void saberTecnico() {
        System.out.println("O técnico do time " + this.nome + " é: " + tec.nome + " com " + tec.anosExperiencia + " anos de experiência");
    }
    public void imprimirTorcedor() {
        System.out.println("Imprimindo torcedores do time: " + this.nome);
        for(int i = 0; i < torcedores.length; i++) {
            if(torcedores[i] == null) {
                continue;
            }
            System.out.println("Nome: " + torcedores[i].nome);
            System.out.println("Jogos assistidos: " + torcedores[i].jogosAssistidos);
            System.out.println("Sócio: " + torcedores[i].socio);
            System.out.println("--------------------------");
        }
    }

    public void atribuirPag(){
        System.out.println("Atribuindo pagamentos para os sócios do time: " + this.nome);
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < torcedores.length; i++) {
            if(torcedores[i] == null || torcedores[i].socio == false) {
                continue;
            }else{
                System.out.println("Atribua os pagamentos para o torcedor: " + torcedores[i].nome);

                for(int j = 0; j < torcedores[i].pagamentos.length; j++){
                    System.out.println("O torcedor " + torcedores[i].nome + " pagou a mensalidade do  " + (j+1) + " trimestre?");
                    boolean resp = sc.nextBoolean();
                    if(resp == true){
                        torcedores[i].pagamentos[j] = true;
                }
            }
        }
    }
    }

    public void imprimirPag(){
        System.out.println("Imprimindo pagamentos dos sócios do time: " + this.nome);
        System.out.println("--------------------------");
        for(int i = 0; i < torcedores.length; i++) {
            if(torcedores[i] == null || torcedores[i].socio == false) {
                continue;
            }else{
                System.out.println("Pagamentos do torcedor: " + torcedores[i].nome);
                for(int j = 0; j < torcedores[i].pagamentos.length; j++){
                    System.out.println("Pagamento do " + (j+1) + " trimestre: " + torcedores[i].pagamentos[j]);
                }
                System.out.println("--------------------------");
            }
        }
    }

    public boolean bomTorcedor(int i){
        int cont = 0;
            for(int j = 0; j < 4; j++){
                if(torcedores[i].socio == false){
                  continue;
                }
                else{
                    if(torcedores[i].pagamentos[j] == true){
                        cont++;
                    }
                }
            }
            return cont >=3;
        
    }

    public boolean fanatico(Torcedor torcedor){
        if(torcedor.jogosAssistidos >= 20){
            return true;
        }
        else{
            return false;
        }
    }

}