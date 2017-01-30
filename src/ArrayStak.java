/**
 * Created by tjc on 30/1/17.
 */

public class ArrayStak implements Stak {
    String[] stak;
    int top = 0;

    public ArrayStak(int size) {
        this.stak = new String[size];
    }

    @Override
    public void push(String e) {
        if (!full()) {
            stak[top++] = e;    // adds e as top element and increments top.
        }
//            String[] tempstak = stak;
//            stak[stak.length + 1] = e;
//            for (int i = stak.length+1; i < stak.length; i++) {
//                tempstak[i] = stak[i-1];
//                stak = tempstak;
//            }
    }

    @Override
    public String pop() {
        return stak[--top]; // returns top element
    }

    @Override
    public boolean empty() {
        return top == 0;
    }

    @Override
    public boolean full() {
        return top >= stak.length;
    }

    @Override
    public void show() {    // printer elementerne i arrayet startende fra toppen
        for (int i=top-1; i>=0; i--) {  // top-1 fordi top et et tomt element
            System.out.print(stak[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
