package Pokedex;

import java.util.ArrayList;

public class Pokedex {
    private String nome;
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    public Pokedex(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void capturarPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void listarPokemons(){
        System.out.println("-------------------");
        System.out.println("Pokemons capturados: ");
        for(int i = 0; i < pokemons.size(); i++){
            System.out.println("Nome: " + pokemons.get(i).getNome());
            System.out.println("ID: " + pokemons.get(i).getId());
            System.out.println("HP: " + pokemons.get(i).getHp());
            System.out.println("Ataque: " + pokemons.get(i).getAtk());
            System.out.println("-------------------");
        }
    }

    public double calcularMediaAtk(){
        double media = 0;
        for(int i = 0; i < pokemons.size(); i++){
            media += pokemons.get(i).getAtk();
        }
        return media/pokemons.size();
    }

    public double mediaVida(){
        double media = 0;
        for(int i = 0; i < pokemons.size(); i++){
            media += pokemons.get(i).getHp();
        }
        return media/pokemons.size();
    }

    public void maiorAtaque(){
        Pokemon maiorAtk = pokemons.get(0);
        for(int i = 0; i < pokemons.size(); i++){
            if(pokemons.get(i).getAtk() > maiorAtk.getAtk()){
                maiorAtk = pokemons.get(i);
            }
        }
        System.out.println("Pokemon com maior ataque: " + maiorAtk.getNome() + " com " + maiorAtk.getAtk() + " de ataque.");
    }

    public Pokemon lutaPokemon(Pokemon p1, Pokemon p2){
        System.out.println(p1.getNome() + " ataca " + p2.getNome());
        p2.setHp(p2.getHp() - p1.getAtk());
        if(p2.getHp() <= 0){
            System.out.println(p2.getNome() + " foi derrotado!");
            return p1;
        }
        System.out.println(p2.getNome() + " ataca " + p1.getNome());
        p1.setHp(p1.getHp() - p2.getAtk());
        if(p1.getHp() <= 0){
            System.out.println(p1.getNome() + " foi derrotado!");
            return p2;
        }
        return lutaPokemon(p1, p2);
    }

    public Pokemon curarPokemon(Pokemon pokemon){
        if(pokemon.getHp() == 100){
            return pokemon;
        }
        pokemon.setHp(pokemon.getHp() + 10);
        if(pokemon.getHp() > 100){
            pokemon.setHp(100);
        }
        return curarPokemon(pokemon);    
    }


}
