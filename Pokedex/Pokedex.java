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


}
