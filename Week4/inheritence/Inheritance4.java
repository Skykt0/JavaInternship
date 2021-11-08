package Week4.inheritence;

// Has-A relation (Assosiation)

public class Inheritance4 {
    public static void main(String args[]){
        Address address1 = new Address("Jaipur","Rajsthan","India");
        Address address2 = new Address("Jodhpur","Rajsthan","India");

        Employee emp1 = new Employee("Akash", 102, address1);
        Employee emp2 = new Employee("Ajay", 104, address2);
        emp1.showDetails();
        emp2.showDetails();
    }
}

class Employee{
    String name;
    int id;
    Address address;

    Employee(String name, int id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    void showDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee Address: "+address.city+", "+address.state+", "+address.country);
    }
}

class Address{
    String city;
    String state;
    String country;
    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
