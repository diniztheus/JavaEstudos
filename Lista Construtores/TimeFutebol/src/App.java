public class App {
    public static void main(String[] args) throws Exception {
        TimeFutebol time = new TimeFutebol("Corinthians", "Ramon Diaz");

        Jogador jogador1 = new Jogador("Ronaldo", "Atacante");
        Jogador jogador2 = new Jogador("Cafu", "Lateral");
        Jogador jogador3 = new Jogador("Rivaldo", "Meio Campo");
        Jogador jogador4 = new Jogador("Dida", "Goleiro");
        Jogador jogador5 = new Jogador("Vampeta", "Volante");
        Jogador jogador6 = new Jogador("Edilson", "Atacante");
        Jogador jogador7 = new Jogador("Marcelinho Carioca", "Meio Campo");
        Jogador jogador8 = new Jogador("Gamarra", "Zagueiro");
        Jogador jogador9 = new Jogador("Rincon", "Volante");
        Jogador jogador10 = new Jogador("Luizao", "Atacante");
        Jogador jogador11 = new Jogador("Kleber", "Lateral");

        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);
        time.adicionarJogador(jogador4);
        time.adicionarJogador(jogador5);
        time.adicionarJogador(jogador6);
        time.adicionarJogador(jogador7);
        time.adicionarJogador(jogador8);
        time.adicionarJogador(jogador9);
        time.adicionarJogador(jogador10);
        time.adicionarJogador(jogador11);

        time.registrarPartida();
        time.registrarPartida();
        time.registrarPartida();

        time.exibirEstatisticas();
        time.artilheiro();
        time.maisJogou();
        time.imprimirJogadores();
        time.removerJogador(jogador11);
        time.imprimirJogadores();


    }
}
