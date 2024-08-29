package ex.pratica.aulas.animal;

public class Gato extends Animal {
    public static void main(String[] args) {
        Animal gato = new Animal();
        gato.setNome("Miau");
        gato.setEspecie("Felino");
        gato.emitirSom();
        gato.exibeAnimal();
        Gato.ronronar();
    }

    public static void ronronar() {
        System.out.println("O gato está ronronando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia.");
    }
}
