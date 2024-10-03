package Pokemon;

public class Curar {
    int contador = 0;

    public Pokemon curarPokemon(Pokemon pokemon){
        if(pokemon.getVida() == 100){
            return pokemon;
        }
        contador++;
        pokemon.setVida(pokemon.getVida() + 10);
        if(pokemon.getVida() > 100){
            pokemon.setVida(100);
        }
        System.out.println("Curando " + pokemon.getNome() + " pela " + contador + "ª vez");
        return curarPokemon(pokemon);    
    }
}