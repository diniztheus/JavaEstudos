package Pokemon;

public class Jogo {
    public static void main(String[] args) {
        Pokemon poke = new Pokemon("Pikachu", 50, 10);
        Curar curar = new Curar();
        curar.curarPokemon(poke);
        System.out.println("Vida do " + poke.getNome() + ": " + poke.getVida());
    }
}
