import java.util.Scanner;

public class Escola {
    private String nome;
    Aluno[] alunos;
    Scanner sc = new Scanner(System.in);

    public Escola(String nome, int quantidadeEstudantes) {
        this.nome = nome;
        this.alunos = new Aluno[quantidadeEstudantes];
    }

    public void darNotas(){
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite a nota 1 do aluno " + alunos[i].getNome() + ":");
            alunos[i].setNota1(sc.nextInt());
            System.out.println("Digite a nota 2 do aluno " + alunos[i].getNome() + ":");
            alunos[i].setNota2(sc.nextInt());
            System.out.println("Digite a nota 3 do aluno " + alunos[i].getNome() + ":");
            alunos[i].setNota3(sc.nextInt());
            System.out.println("Digite a nota 4 do aluno " + alunos[i].getNome() + ":");
            alunos[i].setNota4(sc.nextInt());
        }
    }

    public void imprimirResultado(){
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i].getNome());
            System.out.println("Idade: " + alunos[i].getIdade());
            System.out.println("Nota 1: " + alunos[i].getNota1());
            System.out.println("Nota 2: " + alunos[i].getNota2());
            System.out.println("Nota 3: " + alunos[i].getNota3());
            System.out.println("Nota 4: " + alunos[i].getNota4());
            alunos[i].aprovado();
        }
    }
}
