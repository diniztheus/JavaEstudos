public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1);
        conta.depositar(100);
        conta.consultarSaldo();
        conta.sacar(50);
        conta.consultarSaldo();
        conta.sacar(100);
        conta.consultarSaldo();
        conta.depositar(100);
        conta.depositar(100);
        conta.depositar(100);
        conta.clienteVip();
    }
}