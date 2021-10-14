package Week2.constructor;

import org.graalvm.compiler.lir.LIRInstruction.Def;

public class DefaultConst {
    
    String name;
    int empId;

    public static void main(String[] args){
        DefaultConst emp1 = new DefaultConst();
        /* using new keyword emp1 object is created and using default constructor call its attributes are initialized to their default values*/

        System.out.println("emp1 name is: "+emp1.name);
        System.out.println("emp1 id is: "+emp1.empId);
    }
}
