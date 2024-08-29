package ex.pratica.aulas.carro;

public class Modelo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("Gol");
        carro.definePrecos(21.000, 22.000, 23.000);
        carro.exibeInformacoes();
        carro.exibeMaiorEMenorPreco();
    }
}
