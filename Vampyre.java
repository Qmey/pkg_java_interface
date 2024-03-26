package monsters_examples;

public class Vampyre implements Monster {
    @Override
    public void drinkBlood() {
        System.out.println("Vampyre is drinking blood.");
    }

    @Override
    public void rest() {
        System.out.println("Vampyre is resting.");
    }

    public void transformIntoBat() {
        System.out.println("Vampyre is transforming into a bat.");
    }

    public static void main(String[] args) {
        Vampyre vampyre = new Vampyre();
        vampyre.drinkBlood();
        vampyre.rest();
        vampyre.transformIntoBat();
    }
}
