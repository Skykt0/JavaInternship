package Week2.accessmodifiers.privatemodifier;

public class PrivateModifier
{
        public static void main(String[] args)
        {
            PrivateModifier obj1 = new PrivateModifier();
    
            obj1.name = "Akash Tanwar"; // compile time error
            obj1.setName(); // compile time error
        }
}
    
class PrivateMembers
{
        private String name;
        private void showName()
        {
            System.out.println("Name is: "+this.name);
        }
}