/**
 * Created by tjc on 6/2/17.
 */
public class LinkedStackTest {
    public static void main(String[] args) {
        Stack ls = new LinkedStack();
        ls.push("Dette");
        ls.push("err");
        ls.show();
        ls.pop();
        ls.show();
    }
}
