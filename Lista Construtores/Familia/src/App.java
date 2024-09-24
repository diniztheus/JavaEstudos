public class App {
    public static void main(String[] args) throws Exception {
        Arvore family = new Arvore("Family");
        Pessoa p1 = new Pessoa("Alice", "Bob", "Carol");
        Pessoa p2 = new Pessoa("Bob", "David", "Eva");
        Pessoa p3 = new Pessoa("Carol", "Frank", "Grace");
        Pessoa p4 = new Pessoa("David", "Henry", "Ivy");
        Pessoa p5 = new Pessoa("Eva", "Jack", "Lily");
        Pessoa p6 = new Pessoa("Carol", "Frank", "Grace");

        family.pessoas[0] = p1;
        family.pessoas[1] = p2;
        family.pessoas[2] = p3;
        family.pessoas[3] = p4;
        family.pessoas[4] = p5;
        family.pessoas[5] = p6;

        System.out.println(family.saoIguais(p3, p6));
        System.out.println(family.saoIrmas(p3, p6));
        System.out.println(family.ehAntecessora(p4, p2));

        
    }
}
