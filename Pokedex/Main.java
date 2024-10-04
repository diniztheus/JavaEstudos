package Pokedex;

public class Main {
    public static void main(String[] args) {
        Pokemon pika = new Pokemon("Pikachu", 25, 35, 55);
        Pokemon cha = new Pokemon("Charmander", 4, 39, 52);

        Pokedex pokedex = new Pokedex("Pokedex do Zear");

        pokedex.capturarPokemon(pika);
        pokedex.capturarPokemon(cha);

        pokedex.listarPokemons();

        System.out.println("Media de ataque: " + pokedex.calcularMediaAtk());
        System.out.println("Media de vida: " + pokedex.mediaVida());
        pokedex.maiorAtaque();
        pokedex.lutaPokemon(pika, cha);
    }
}
