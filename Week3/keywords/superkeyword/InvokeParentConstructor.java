package Week2.keywords.superkeyword;

class SuperConstructor
{
    SuperConstructor(){
        System.out.println("Hi, this is SuperConstructor");
    }
}
public class InvokeParentConstructor extends SuperConstructor
{
    InvokeParentConstructor(){
        super();
        System.out.println("Hi, this is ParentConstructor");
    }
    public static void main(String[] args){
        InvokeParentConstructor obj1 = new InvokeParentConstructor();
    }
}
