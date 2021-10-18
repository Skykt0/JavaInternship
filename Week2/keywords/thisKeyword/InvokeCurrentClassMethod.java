package Week2.keywords.thisKeyword;

public class InvokeCurrentClassMethod {
    String name; 
    int id;

    void setValues(String name, int id){
        this.name = name;
        this.id = id;
        showDetails(); // same as this.showDetails();


    }

    void showDetails(){
        System.out.println("Name is: "+this.name);
        System.out.println("Id is: "+this.id);
    }
    public static void main(String[] args){
        InvokeCurrentClassMethod obj1 = new InvokeCurrentClassMethod();
        obj1.setValues("Akash Tanwar", 101);

        // output :
        // Name is: Akash Tanwar
        // Id is: 101
    }   
}
