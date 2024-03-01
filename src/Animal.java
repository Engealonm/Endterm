public abstract class Animal extends Organism{
    public Animal(String organismType, int age) {
        super(organismType, age);
    }

    public abstract void make_sound();
    public void findFood() {
        System.out.println("Animal is searching for food.");
    }
    public void eatPlant() {
        System.out.println("Animal is eating the plant.");
    }
}
