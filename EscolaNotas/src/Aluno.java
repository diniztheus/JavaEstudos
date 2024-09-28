public class Aluno {
    private String nome;
    private int idade;
    private int nota1, nota2, nota3, nota4;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }
    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public boolean aprovado(){
        boolean aprovado = (nota1 + nota2 + nota3 + nota4)/4 >= 7;
        System.out.println(aprovado ? "Aluno "+ getNome() +" aprovado" : "Aluno "+ getNome() +" reprovado");
        return aprovado;
    }
}
