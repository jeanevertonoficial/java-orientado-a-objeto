package ex.pratica.aulas.animal;

public class Animal {
    // Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam
    // da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar
    // que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse,
    // como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

    private String nome;
    private String especie;

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void exibeAnimal() {
        System.out.println("O animal é um " + especie + " e se chama " + nome);
    }
}
