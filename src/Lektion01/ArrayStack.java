/**
 * Created by tjc on 30/1/17.
 */

public class ArrayStack implements Stack {
    String[] stack;
    int top = 0;

    public ArrayStack(int size) {
        this.stack = new String[size];
    }

    @Override
    public void push(String e) {
        if (!full()) {
            stack[top++] = e;    // adds e as top element and increments top.
        }
//            String[] tempstak = stack;
//            stack[stack.length + 1] = e;
//            for (int i = stack.length+1; i < stack.length; i++) {
//                tempstak[i] = stack[i-1];
//                stack = tempstak;
//            }
    }

    @Override
    public String pop() {
        return stack[--top]; // returns top element
    }

    @Override
    public boolean empty() {
        return top == 0;
    }

    @Override
    public boolean full() {
        return top >= stack.length;
    }

    @Override
    public void show() {    // printer elementerne i arrayet startende fra toppen
        for (int i=top-1; i>=0; i--) {  // top-1 fordi top et et tomt element
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
