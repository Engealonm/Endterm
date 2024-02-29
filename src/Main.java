public class Main {
    public static void main(String[] args) {
        Animal some_animal = new Animal("Barsik", 3);
        some_animal.grow();
        some_animal.move("East");
        some_animal.make_sound();

        Plant tree = new Plant("Tree", 5);
        tree.grow();
        tree.photosynthesize();


        OrganismBehavior some_Organism = new Organism("Person", 2);
        some_Organism.move("South");
    }

}