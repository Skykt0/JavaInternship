package Week3.keywords.thisKeyword;

public class ThisKeyword {
    String name;
    int id;

    void setValues(String name, int id){
        this.name = name;
        this.id = id;
    }

    void showDetails(){
        System.out.println("Name is: "+name);
        System.out.println("Id is: "+id);
    }
    public static void main(String[] args){
        ThisKeyword obj1 = new ThisKeyword();
        obj1.setValues("Akash", 101);
        obj1.showDetails();
    }
}
