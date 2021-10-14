package Week2.classes_and_objects;

class Animal {
        String name;
        String color;
        
        void run(){
            System.out.println(name+" is running. ");
        }

        void eat(){
            System.out.println(name+" is eating.");
        }
}

public class Test{
    public static void main(String[] args){
        Animal dog = new Animal();
        dog.name = "duzo";
        dog.color = "black";
        dog.run();

        Animal cat = new Animal();
        cat.name = "juli";
        cat.color = "white";
        cat.eat();

    }
}

