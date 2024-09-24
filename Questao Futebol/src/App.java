public class App {
    public static void main(String[] args) throws Exception {
        Time t1 = new Time("Corinthians");

        Tecnico tec1 = new Tecnico("Diniz", 10);
        

        Torcedor tor1 = new Torcedor("Diniz", 10, false);
        Torcedor tor2 = new Torcedor("Yago", 4, true);
        Torcedor tor3 = new Torcedor("Roberto", 19, false);
        Torcedor tor4 = new Torcedor("Monma", 18, false);
        Torcedor tor5 = new Torcedor("Ricardo", 20, true);

        t1.torcedores[0] = tor1;
        t1.torcedores[1] = tor2;
        t1.torcedores[2] = tor3;
        t1.torcedores[3] = tor4;
        t1.torcedores[4] = tor5;

        t1.vincularTecnico("Ramon Diaz", 15);
        t1.imprimirTorcedor();
        t1.saberTecnico();
        t1.atribuirPag();
        t1.imprimirPag();
        System.out.println(t1.bomTorcedor(1));
        System.out.println(t1.fanatico(tor5));
        
    }
}