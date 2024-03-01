public class Cat extends Animal{

    public Cat(String organismType, int age) {
        super(organismType, age);
    }
    @Override
    public void make_sound(){
        System.out.println(" says meow");
    }

}
