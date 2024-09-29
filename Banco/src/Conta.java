public class Conta {
    private double saldo;
    private int id;
    private int pontos;

    public Conta(int id) {
        this.id = id;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        pontos++;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            if(pontos > 0) {
                pontos--;
            }
            return;
        }else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso o novo saldo é: " + this.saldo);
        }
    }

    public void clienteVip(){
        String vip = pontos >= 5 ? "Cliente VIP" : pontos >= 3 ? "Cliente Especial" : "Cliente Normal";
        System.out.println(vip);
    }
}
