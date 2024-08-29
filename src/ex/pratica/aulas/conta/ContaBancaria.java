package ex.pratica.aulas.conta;

public class ContaBancaria extends ContaCorrente {
    // Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
    // consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
    // Adicione um método específico para a subclasse, como cobrarTarifaMensal(),
    // que desconta uma tarifa mensal da conta corrente.
    private double saldo;
    private String nome;
    private boolean tipoConta;
    private String nomeTipo;

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            System.out.println("Depósito realizado com sucesso");
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido");
        }
        return this.saldo;
    }

    public double sacar(double valor) {
        if (this.saldo <= valor) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
            this.saldo -= valor;
        }
        return this.saldo;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public boolean isTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(boolean tipoConta) {
        if (tipoConta) {
            this.saldo -= this.cobrarTarifaMensal();
            this.nomeTipo = "Conta corrente";
        } else {
            this.nomeTipo = "Conta poupança";
        }
        this.tipoConta = tipoConta;
    }

    public void exibeConta() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Tipo de conta: " + this.nomeTipo);
    }

}
