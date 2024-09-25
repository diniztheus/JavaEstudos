import java.util.Scanner;

public class TimeFutebol {
    private String nome;
    private String tecnicoNome;
    Jogador[] jogadores = new Jogador[11];
    private int qtdJogadores = 0;
    Scanner sc = new Scanner(System.in);
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;

    public TimeFutebol(String nome, String tecnicoNome) {
        this.nome = nome;
        this.tecnicoNome = tecnicoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnicoNome() {
        return tecnicoNome;
    }

    public void setTecnicoNome(String tecnicoNome) {
        this.tecnicoNome = tecnicoNome;
    }
    
    public void adicionarJogador(Jogador jogador) {
        if (qtdJogadores < 11) {
            jogadores[qtdJogadores] = jogador;
            qtdJogadores++;
        } else {
            System.out.println("Time completo!");
        }
    }

    public void removerJogador(Jogador jogador) {
        for (int i = 0; i < qtdJogadores; i++) {
            if (jogadores[i] == jogador) {
                jogadores[i] = null;
                qtdJogadores--;
                break;
            }
        }
    }

    public void registrarPartida(){
        System.out.println("Digite a data da partida: ");
        String data = sc.next();
        System.out.println("Digite o nome do adversario: ");
        String adversario = sc.next();
        System.out.println("Digite o placar do: "+ getNome());
        int placarTime = sc.nextInt();
        System.out.println("Digite o placar do: "+ adversario);
        int placarAdversario = sc.nextInt();
        if (placarTime > placarAdversario) {
            vitorias++;
        } else if (placarTime < placarAdversario) {
            derrotas++;
        } else {
            empates++;
        }
        System.out.println("A partida realizada em: " + data + " contra o time: " + adversario + " terminou com o placar: " + getNome() + " " + placarTime + " x " + placarAdversario + " " + adversario);
    }

    public void exibirEstatisticas() {
        System.out.println("Vitorias: "+ vitorias);
        System.out.println("Derrotas: "+ derrotas);
        System.out.println("Empates: "+ empates);
    }


    public void artilheiro() {
        Jogador artilheiro = jogadores[0];
        for (int i = 0; i < qtdJogadores; i++) {
            System.out.println("Quantos gols o jogador " + jogadores[i].getNome() + " fez?");
            jogadores[i].setGols(sc.nextInt());
            if (jogadores[i].getGols() > artilheiro.getGols()) {
                artilheiro = jogadores[i];
            }
        }
        System.out.println("O artilheiro do time é: "+ artilheiro.getNome() + " com "+ artilheiro.getGols()+ " gols");
    }

    public void maisJogou() {
        Jogador maisJogou = jogadores[0];
        for (int i = 0; i < qtdJogadores; i++) {
            System.out.println("Quantas partidas o jogador " + jogadores[i].getNome() + " jogou?");
            jogadores[i].setPartidas(sc.nextInt());
            if (jogadores[i].getPartidas() > maisJogou.getPartidas()) {
                maisJogou = jogadores[i];
            }
        }
        System.out.println("O jogador que mais jogou foi: "+ maisJogou.getNome()+ " com "+ maisJogou.getPartidas()+ " partidas");
    }

    public void imprimirJogadores() {
        for (int i = 0; i < qtdJogadores; i++) {
            System.out.println("------------------------------------------------------");
            System.out.println("Nome: "+ jogadores[i].getNome());
            System.out.println("Posicao: "+ jogadores[i].getPosicao());
            System.out.println("Gols: "+ jogadores[i].getGols());
            System.out.println("Partidas: "+ jogadores[i].getPartidas());
            System.out.println("------------------------------------------------------");
        }
    }
}
