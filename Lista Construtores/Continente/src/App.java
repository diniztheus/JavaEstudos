public class App {
    public static void main(String[] args) throws Exception {
        Continente c1 = new Continente("America");
        Pais p1 = new Pais("Brasil", 200, 100);
        Pais p2 = new Pais("Argentina", 100, 50);
        Pais p3 = new Pais("Chile", 50, 25);
        Pais p4 = new Pais("Uruguai", 25, 12);
        Pais p5 = new Pais("Paraguai", 12, 6);
        Pais p6 = new Pais("Bolivia", 6, 3);
        Pais p7 = new Pais("Estados Unidos", 331, 9834);
        Pais p8 = new Pais("Canada", 38, 9985);
        Pais p9 = new Pais("Mexico", 128, 1964);
        Pais p10 = new Pais("Colombia", 50, 1142);
        Pais p11 = new Pais("Venezuela", 28, 916);
        Pais p12 = new Pais("Peru", 33, 1285);
        Pais p13 = new Pais("Ecuador", 17, 283);
        c1.paises[0] = p1;
        c1.paises[1] = p2;
        c1.paises[2] = p3;
        c1.paises[3] = p4;
        c1.paises[4] = p5;
        c1.paises[5] = p6;
        c1.paises[6] = p7;
        c1.paises[7] = p8;
        c1.paises[8] = p9;
        c1.paises[9] = p10;
        c1.paises[10] = p11;
        c1.paises[11] = p12;
        c1.paises[12] = p13;

        Continente c2 = new Continente("Europa");
        Pais p14 = new Pais("Alemanha", 83, 357);
        Pais p15 = new Pais("Franca", 67, 551);
        Pais p16 = new Pais("Reino Unido", 66, 243);
        Pais p17 = new Pais("Italia", 60, 301);
        Pais p18 = new Pais("Espanha", 47, 505);
        Pais p19 = new Pais("Polonia", 38, 312);
        Pais p20 = new Pais("Romenia", 19, 238);
        Pais p21 = new Pais("Holanda", 17, 41);
        Pais p22 = new Pais("Belgica", 11, 30);
        Pais p23 = new Pais("Grecia", 10, 132);
        Pais p24 = new Pais("Portugal", 10, 92);
        Pais p25 = new Pais("Suecia", 10, 450);
        Pais p26 = new Pais("Hungria", 9, 93);

        c2.paises[0] = p14;
        c2.paises[1] = p15;
        c2.paises[2] = p16;
        c2.paises[3] = p17;
        c2.paises[4] = p18;
        c2.paises[5] = p19;
        c2.paises[6] = p20;
        c2.paises[7] = p21;
        c2.paises[8] = p22;
        c2.paises[9] = p23;
        c2.paises[10] = p24;
        c2.paises[11] = p25;
        c2.paises[12] = p26;

        Continente c3 = new Continente("Africa");
        Pais p27 = new Pais("Nigeria", 206, 923);
        Pais p28 = new Pais("Ethiopia", 114, 1104);
        Pais p29 = new Pais("Egypt", 102, 1002);
        Pais p30 = new Pais("Congo", 89, 2345);
        Pais p31 = new Pais("Tanzania", 59, 947);
        Pais p32 = new Pais("South Africa", 59, 1221);
        Pais p33 = new Pais("Kenya", 54, 580);
        Pais p34 = new Pais("Uganda", 45, 241);
        Pais p35 = new Pais("Algeria", 43, 2382);
        Pais p36 = new Pais("Sudan", 43, 1861);
        Pais p37 = new Pais("Morocco", 36, 446);
        Pais p38 = new Pais("Angola", 32, 1247);
        Pais p39 = new Pais("Ghana", 31, 239);

        c3.paises[0] = p27;
        c3.paises[1] = p28;
        c3.paises[2] = p29;
        c3.paises[3] = p30;
        c3.paises[4] = p31;
        c3.paises[5] = p32;
        c3.paises[6] = p33;
        c3.paises[7] = p34;
        c3.paises[8] = p35;
        c3.paises[9] = p36;
        c3.paises[10] = p37;
        c3.paises[11] = p38;
        c3.paises[12] = p39;

        Continente c4 = new Continente("Asia");
        Pais p40 = new Pais("China", 1441, 9597);
        Pais p41 = new Pais("India", 1393, 3287);
        Pais p42 = new Pais("Indonesia", 273, 1905);
        Pais p43 = new Pais("Pakistan", 225, 881);
        Pais p44 = new Pais("Bangladesh", 166, 147);
        Pais p45 = new Pais("Japan", 126, 377);
        Pais p46 = new Pais("Philippines", 109, 300);
        Pais p47 = new Pais("Vietnam", 97, 331);
        Pais p48 = new Pais("Turkey", 84, 783);
        Pais p49 = new Pais("Iran", 83, 1648);
        Pais p50 = new Pais("Thailand", 70, 513);
        Pais p51 = new Pais("Myanmar", 54, 676);
        Pais p52 = new Pais("South Korea", 52, 100);
        Pais p53 = new Pais("Iraq", 41, 438);

        c4.paises[0] = p40;
        c4.paises[1] = p41;
        c4.paises[2] = p42;
        c4.paises[3] = p43;
        c4.paises[4] = p44;
        c4.paises[5] = p45;
        c4.paises[6] = p46;
        c4.paises[7] = p47;
        c4.paises[8] = p48;
        c4.paises[9] = p49;
        c4.paises[10] = p50;
        c4.paises[11] = p51;
        c4.paises[12] = p52;
        c4.paises[13] = p53;

        Continente c5 = new Continente("Oceania");
        Pais p54 = new Pais("Australia", 25, 7692);
        Pais p55 = new Pais("Papua New Guinea", 9, 462);
        Pais p56 = new Pais("New Zealand", 5, 268);
        Pais p57 = new Pais("Fiji", 0.9, 18);
        Pais p58 = new Pais("Solomon Islands", 0.7, 28);
        Pais p59 = new Pais("Micronesia", 0.1, 0.7);
        Pais p60 = new Pais("Vanuatu", 0.3, 12);
        Pais p61 = new Pais("Samoa", 0.2, 2.8);
        Pais p62 = new Pais("Kiribati", 0.1, 0.8);
        Pais p63 = new Pais("Tonga", 0.1, 0.7);
        Pais p64 = new Pais("Marshall Islands", 0.06, 0.18);
        Pais p65 = new Pais("Palau", 0.02, 0.46);
        Pais p66 = new Pais("Nauru", 0.01, 0.02);

        c5.paises[0] = p54;
        c5.paises[1] = p55;
        c5.paises[2] = p56;
        c5.paises[3] = p57;
        c5.paises[4] = p58;
        c5.paises[5] = p59;
        c5.paises[6] = p60;
        c5.paises[7] = p61;
        c5.paises[8] = p62;
        c5.paises[9] = p63;
        c5.paises[10] = p64;
        c5.paises[11] = p65;
        c5.paises[12] = p66;

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
