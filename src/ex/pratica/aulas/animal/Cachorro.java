package ex.pratica.aulas.animal;

public class Cachorro extends Animal {
    public static void main(String[] args) {
        Animal cachorro = new Animal();
        cachorro.setNome("Totó");
        cachorro.setEspecie("Canino");
        cachorro.emitirSom();
        cachorro.exibeAnimal();
        Cachorro.abanarRabo();
    }

    public static void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late.");
    }
}
