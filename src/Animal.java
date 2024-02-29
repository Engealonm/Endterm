public class Animal extends Organism{
    public Animal(String organismType, int age) {
        super(organismType, age);
    }
    public void make_sound(){
        System.out.println("Animal makes sound");
    }
}
