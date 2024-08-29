package ex.pratica.aulas.carro;

public class Carro {
    // Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
    // Implemente métodos para definir o nome do modelo, os preços médios para cada ano,
    // e calcular e exibir o menor e o maior preço.

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    double menorPreco;
    double maiorPreco;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibeInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço do ano 1: " + precoAno1);
        System.out.println("Preço do ano 2: " + precoAno2);
        System.out.println("Preço do ano 3: " + precoAno3);
    }

    public void calculaMenorPreco() {
        menorPreco = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
    }

    public void calculaMaiorPreco() {
        maiorPreco = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
    }

    public void exibeMaiorEMenorPreco() {
        calculaMenorPreco();
        calculaMaiorPreco();
        System.out.println("Modelo: " + modelo);
        System.out.println("Menor preço: " + menorPreco);
        System.out.println("Maior preço: " + maiorPreco);
    }
}
