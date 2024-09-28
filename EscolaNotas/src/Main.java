public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola de Teste", 2);
        escola.alunos[0] = new Aluno("João", 15);
        escola.alunos[1] = new Aluno("Maria", 16);
        escola.darNotas();
        escola.imprimirResultado();
    }
}