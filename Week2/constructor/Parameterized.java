package Week2.constructor;

public class Parameterized {
    
    String name;
    int empId;

    Parameterized(String name, int empId){
        this.name = name;
        this.empId = empId;;
    }
    void display(){
        System.out.println("Name is: "+this.name +" Id is: "+ this.empId);
    }
    public static void main(String[] args){
        Parameterized emp1 = new Parameterized("Akash",101);
        Parameterized emp2 = new Parameterized("Dheeraj",102);

        emp1.display();
        emp2.display();
    }
}
