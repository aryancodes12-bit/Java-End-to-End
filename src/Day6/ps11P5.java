package Day6;

interface BasicAnimal1{
    void eat();
    void sleep();
}
class monkey1{
    public void jump() {

        System.out.println("jumping...");
    }
    public void bite(){
        System.out.println("biting");
    }
}
class Human1 extends monkey implements BasicAnimal1{
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
public class ps11P5 {
    public static void main(String[] args) {
       // Human1 h=new Human1();
//        h.bite();
//        h.jump();
//        h.sleep();
//        h.eat();
        BasicAnimal1 b= new Human1();
        b.eat();
        b.sleep();
    }
}



