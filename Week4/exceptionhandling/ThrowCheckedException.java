package Week4.exceptionhandling;

import java.io.IOException;

public class ThrowCheckedException {
    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("program ended successfully....");
    }

    static void display() throws IOException{
        throw new IOException("checked exception is thrown");
    }
}
