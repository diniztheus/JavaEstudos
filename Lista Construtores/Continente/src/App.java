public class App {
    public static void main(String[] args) throws Exception {
        Continente c1 = new Continente("America", 13);
        c1.paises[0] = new Pais("Brasil", 200, 100);
        c1.paises[1] = new Pais("Argentina", 100, 50);
        c1.paises[2] = new Pais("Chile", 50, 25);
        c1.paises[3] = new Pais("Uruguai", 25, 12);
        c1.paises[4] = new Pais("Paraguai", 12, 6);
        c1.paises[5] = new Pais("Bolivia", 6, 3);
        c1.paises[6] = new Pais("Estados Unidos", 331, 9834);
        c1.paises[7] = new Pais("Canada", 38, 9985);
        c1.paises[8] = new Pais("Mexico", 128, 1964);
        c1.paises[9] = new Pais("Colombia", 50, 1142);
        c1.paises[10] = new Pais("Venezuela", 28, 916);
        c1.paises[11] = new Pais("Peru", 33, 1285);
        c1.paises[12] = new Pais("Ecuador", 17, 283);


        Continente c2 = new Continente("Europa", 13);
        c2.paises[0] = new Pais("Alemanha", 83, 357);
        c2.paises[1] = new Pais("Franca", 67, 551);
        c2.paises[2] = new Pais("Reino Unido", 66, 243);
        c2.paises[3] = new Pais("Italia", 60, 301);
        c2.paises[4] = new Pais("Espanha", 47, 505);
        c2.paises[5] = new Pais("Polonia", 38, 312);
        c2.paises[6] = new Pais("Romenia", 19, 238);
        c2.paises[7] = new Pais("Holanda", 17, 41);
        c2.paises[8] = new Pais("Belgica", 11, 30);
        c2.paises[9] = new Pais("Grecia", 10, 132);
        c2.paises[10] = new Pais("Portugal", 10, 92);
        c2.paises[11] = new Pais("Suecia", 10, 450);
        c2.paises[12] = new Pais("Hungria", 9, 93);


        Continente c3 = new Continente("Africa", 13);
        c3.paises[0] = new Pais("Nigeria", 206, 923);
        c3.paises[1] = new Pais("Ethiopia", 114, 1104);
        c3.paises[2] = new Pais("Egypt", 102, 1002);
        c3.paises[3] = new Pais("Congo", 89, 2345);
        c3.paises[4] = new Pais("Tanzania", 59, 947);
        c3.paises[5] = new Pais("South Africa", 59, 1221);
        c3.paises[6] = new Pais("Kenya", 54, 580);
        c3.paises[7] = new Pais("Uganda", 45, 241);
        c3.paises[8] = new Pais("Algeria", 43, 2382);
        c3.paises[9] = new Pais("Sudan", 43, 1861);
        c3.paises[10] = new Pais("Morocco", 36, 446);
        c3.paises[11] = new Pais("Angola", 32, 1247);
        c3.paises[12] = new Pais("Ghana", 31, 239);


        Continente c4 = new Continente("Asia", 14);
        c4.paises[0] = new Pais("China", 1441, 9597);
        c4.paises[1] = new Pais("India", 1393, 3287);
        c4.paises[2] = new Pais("Indonesia", 273, 1905);
        c4.paises[3] = new Pais("Pakistan", 225, 881);
        c4.paises[4] = new Pais("Bangladesh", 166, 147);
        c4.paises[5] = new Pais("Japan", 126, 377);
        c4.paises[6] = new Pais("Philippines", 109, 300);
        c4.paises[7] = new Pais("Vietnam", 97, 331);
        c4.paises[8] = new Pais("Turkey", 84, 783);
        c4.paises[9] = new Pais("Iran", 83, 1648);
        c4.paises[10] = new Pais("Thailand", 70, 513);
        c4.paises[11] = new Pais("Myanmar", 54, 676);
        c4.paises[12] = new Pais("South Korea", 52, 100);
        c4.paises[13] = new Pais("Iraq", 41, 438);

        Continente c5 = new Continente("Oceania", 13);
        c5.paises[0] = new Pais("Australia", 25, 7692);
        c5.paises[1] = new Pais("Papua New Guinea", 9, 462);
        c5.paises[2] = new Pais("New Zealand", 5, 268);
        c5.paises[3] = new Pais("Fiji", 0.9, 18);
        c5.paises[4] = new Pais("Solomon Islands", 0.7, 28);
        c5.paises[5] = new Pais("Micronesia", 0.1, 0.7);
        c5.paises[6] = new Pais("Vanuatu", 0.3, 12);
        c5.paises[7] = new Pais("Samoa", 0.2, 2.8);
        c5.paises[8] = new Pais("Kiribati", 0.1, 0.8);
        c5.paises[9] = new Pais("Tonga", 0.1, 0.7);
        c5.paises[10] = new Pais("Marshall Islands", 0.06, 0.18);
        c5.paises[11] = new Pais("Palau", 0.02, 0.46);
        c5.paises[12] = new Pais("Nauru", 0.01, 0.02);


        Globo globo = new Globo();
        globo.adicionarContinente(c1);
        globo.adicionarContinente(c2);
        globo.adicionarContinente(c3);
        globo.adicionarContinente(c4);
        globo.adicionarContinente(c5);

        System.out.println("A dimensao total dos paises do globo somados eh igual = " + globo.dimensao() + " km²");
        System.out.println("A populacao total dos paises do globo somados eh igual = " + globo.populacao() + " Milhoes de habitantes");
        System.out.println("A densidade populacional dos paises do globo somados eh igual = " + globo.densidade() + " hab/km²");
        System.out.println("O continente com maior populacao eh = " + globo.maiorPopulacao().getNome());
        System.out.println("A razao territorial do continente com maior populacao em relacao ao continente com menor populacao eh = " + globo.razaoTerritorial());
        /*System.out.println("A Dimensao total do continente eh igual = " + c1.dimensao() + " km²");
        System.out.println("A populacao do continente eh igual = " + c1.populacaoCont()+ " Milhoes de habitantes");
        c1.calcularDensidade();
        System.out.println("A densidade populacional do continente eh igual = " + c1.getDensidade() + " hab/km²");
        System.out.println("O pais com maior populacao eh = " + c1.maiorPopulacao().getNome());
        System.out.println("O pais com menor populacao eh = " + c1.menorPopulacao().getNome());
        System.out.println("O pais com maior dimensao eh = " + c1.maiorDimensao().getNome());
        System.out.println("O pais com menor dimensao eh = " + c1.menorDimensao().getNome());
        System.out.println("Um metodo que retorne a razao territorial do maior pais = "+ c1.maiorDimensao().getNome()+ " em relacao ao menor pais =  "+ c1.menorDimensao().getNome() +" eh = " + c1.razaoTerritorial());*/
    }
}
