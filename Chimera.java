package monsters_examples;

public class Chimera implements Omnivore {
    @Override
    public void eatPlants() {
        System.out.println("Chimera is eating plants.");
    }

    @Override
    public void eatMeat() {
        System.out.println("Chimera is eating meat.");
    }

    @Override
    public void eatAnything() {
        System.out.println("Chimera is eating anything.");
    }

    public static void main(String[] args) {
        Chimera chimera = new Chimera();
        chimera.eatPlants();
        chimera.eatMeat();
        chimera.eatAnything();
    }
}
