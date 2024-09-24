public class App {
    public static void main(String[] args) throws Exception {
        Continente c1 = new Continente("America");
        Pais p1 = new Pais("Brasil", 200, 100);
        Pais p2 = new Pais("Argentina", 100, 50);
        Pais p3 = new Pais("Chile", 50, 25);
        Pais p4 = new Pais("Uruguai", 25, 12);
        Pais p5 = new Pais("Paraguai", 12, 6);
        c1.paises[0] = p1;
        c1.paises[1] = p2;
        c1.paises[2] = p3;
        c1.paises[3] = p4;
        c1.paises[4] = p5;

        System.out.println("A Dimensao total do continente eh igual = " + c1.dimensao() + " km²");
        System.out.println("A populacao do continente eh igual = " + c1.populacaoCont()+ " Milhoes de habitantes");
        c1.calcularDensidade();
        System.out.println("A densidade populacional do continente eh igual = " + c1.getDensidade() + " hab/km²");
        System.out.println("O pais com maior populacao eh = " + c1.maiorPopulacao().getNome());
        System.out.println("O pais com menor populacao eh = " + c1.menorPopulacao().getNome());
        System.out.println("O pais com maior dimensao eh = " + c1.maiorDimensao().getNome());
        System.out.println("O pais com menor dimensao eh = " + c1.menorDimensao().getNome());
        System.out.println("Um metodo que retorne a razao territorial do maior pais = "+ c1.maiorDimensao().getNome()+ " em relacao ao menor pais =  "+ c1.menorDimensao().getNome() +" eh = " + c1.razaoTerritorial());
    }
}
