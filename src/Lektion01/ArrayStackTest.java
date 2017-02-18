package Lektion01;

/**
 * Created by tjc on 30/1/17.
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        Stack stack1 = new ArrayStack(5);
        stack1.push("Dette");
        stack1.push("er");
        stack1.push("en");
        stack1.push("mærkelig");
        stack1.push("sætning");
        stack1.show();

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        stack1.show();

        stack1.push("mærkelig");
        stack1.push("sætning");

        stack1.show();
        System.out.println("Full: " + stack1.full());
        System.out.println("Empty: " + stack1.empty());
    }
}
