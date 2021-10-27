package Week3.keywords.thisKeyword;

public class InvokeConstructor {

    String name; 
    int id;
    public static void main(String args[]){
        InvokeConstructor obj1 = new InvokeConstructor("Akash",101);
    }

    InvokeConstructor(){
        System.out.println("message from no argument constructor");
    }

    InvokeConstructor(String name, int id){
        this();
        this.name = name;
        this.id = id;
        System.out.println("output from parameterized constructor");
        System.out.println("Name is: "+this.name);
        System.out.println("Id is: "+this.id);
    }
}
