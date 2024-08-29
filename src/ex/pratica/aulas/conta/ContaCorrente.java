package ex.pratica.aulas.conta;

public class ContaCorrente {
    // Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
    // consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
    // Adicione um método específico para a subclasse, como cobrarTarifaMensal(),
    // que desconta uma tarifa mensal da conta corrente.
    private double tarifaMensal = 0.05;

    public double cobrarTarifaMensal() {
        return this.tarifaMensal;
    }
}
