package Day6;
interface BasicAnimal{
    void eat();
    void sleep();
}
class monkey{
    public void jump() {

        System.out.println("jumping...");
    }
public void bite(){
    System.out.println("biting");
}
}
class Human extends monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println(" i am human eating food");
    }

    @Override
    public void sleep() {
        System.out.println("human sleeps");
    }

    @Override
    public void bite() {
        super.bite();
        System.out.println("humans can bite");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("humans can jump");
    }
}
public class ps11P3 {
    public static void main(String[] args) {
        Human h=new Human();
        h.bite();
        h.jump();
        h.sleep();
        h.eat();
    }
}
