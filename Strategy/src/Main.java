
interface QuackBeavior {
    public void quack();
}

interface FlyBehavoir {
    public void fly();
}

abstract class Duck {
    QuackBeavior quackBeavior;
    FlyBehavoir flyBehavoir;

    public Duck() {
    };


    public void performQuack() {
        quackBeavior.quack();
    }

    public void performFly() {
        flyBehavoir.fly();
    }

    public void swin() {
        System.out.println("all Ducks float even decoys");
    }

    public void setQuackBeavior(QuackBeavior qb){
        quackBeavior = qb;
    }

    public void setFlyBehavoir( FlyBehavoir fb){
        flyBehavoir = fb;
    }
}

class MallardDuck extends Duck {
    public MallardDuck() {
        quackBeavior = new Quack();
        flyBehavoir = new FlyWithWings();
    }
}

class FlyWithWings implements FlyBehavoir {
    public void fly() {
        System.out.println("I am flying");
    }
}

class FlyNoWay implements FlyBehavoir {
    public void fly() {
        System.out.println("I cant't fly");
    }
}

class Quack implements QuackBeavior {
    public void quack() {
        System.out.println("Quack");
    }
}

class MuteQuack implements QuackBeavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}

class Squeak implements QuackBeavior {
    public void quack() {
        System.out.println("Squack");
    }
}

class FlyRocketPowered implements FlyBehavoir{
    public void fly(){
        System.out.printf("I am flying with a rocket");
    }
}

class ModeDuck extends Duck{
    public ModeDuck(){
        flyBehavoir = new FlyNoWay();
        quackBeavior = new Quack();
    }

    public void display(){
        System.out.println("I am model duck");
    }
}

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        Duck modeduck = new ModeDuck();
        modeduck.setFlyBehavoir(new FlyRocketPowered());
        modeduck.performFly();
    }
}