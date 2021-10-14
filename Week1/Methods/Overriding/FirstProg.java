package Week1.Methods.Overriding;

public class FirstProg {
    public static void main(String[] args){
        Son son = new Son();
        son.home(); // it will call father class home method
        son.car(); // it will call Son class car method 
    }
}

class Father{
    void home(){
        System.out.println("This is father's home.");
    }
    void car(){
        System.out.println("This is father's car.");
    }
}

class Son extends Father{ 
    void car(){
        System.out.println("This is son's car.");
    }
}
