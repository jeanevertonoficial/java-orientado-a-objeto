package ex.pratica.aulas.conta;

public class Conta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNome("Jean Everton");
        conta.setTipoConta(true);
        conta.depositar(1000);
        conta.sacar(500);
        conta.consultarSaldo();
        conta.exibeConta();
    }
}
