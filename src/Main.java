import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Animal some_animal = new Cat("Barsik", 3);
        some_animal.grow();
        some_animal.move("East");

        some_animal.findFood();
        some_animal.eatPlant();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Cat",5));

        for(Animal a : animals){
            System.out.print(a.getOrganismType());
            a.make_sound();
        }
        Plant tree = new Plant("Tree", 5);
        tree.grow();
        tree.photosynthesize();

        some_animal.interact(tree);

        OrganismBehavior some_Organism = new Organism("Person", 2);
        some_Organism.move("South");

    }

}