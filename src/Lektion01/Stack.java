package Lektion01;

/**
 * Created by tjc on 30/1/17.
 */
//interface givet fra opgave
public interface Stack {
    void push(String e);
    String pop();
    boolean empty();
    boolean full();
    void show();
}
