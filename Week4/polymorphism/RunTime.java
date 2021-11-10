package Week4.polymorphism;

public class RunTime {
    public static void main(String[] args)
    {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Lion();

        for(int i=0; i<animal.length; i++)
        {
            animal[i].eat();
        }
    }
}

abstract class Animal
{
    abstract void eat();
}

class Dog extends Animal{
    void eat()
    {
        System.out.println("dog eating bread...");
    }
}
class Cat extends Animal{
    void eat()
    {
        System.out.println("cat eating fish..");
    }
}
class Lion extends Animal{
    void eat()
    {
        System.out.println("lion eating meat...");
    }
}
