package Pokedex;

public class Pokemon {
    private String nome;
    private int id;
    private int hp;
    private int atk;

    public Pokemon(String nome, int id, int hp, int atk) {
        this.nome = nome;
        this.id = id;
        this.hp = hp;
        this.atk = atk;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    
    
}
