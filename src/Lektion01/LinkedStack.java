package Lektion01;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by tjc on 6/2/17.
 */
public class LinkedStack implements Stack {
    private Node first;
    private Node last;
    private int size = 0;


    private void linkFirst(String item) {
        final Node FIRST = this.first;
        final Node NEWNODE = new Node(null, item, FIRST);
        this.first = NEWNODE;
        if (FIRST == null) {
            this.last = NEWNODE;
        } else {
            FIRST.next = NEWNODE;
        }
        size++;
    }

    private void linkLast(String item) {
        final Node LAST = this.last;
        final Node NEWNODE = new Node(LAST, item, null);
        this.last = NEWNODE;
        if (LAST == null) {
            this.first = NEWNODE;
        } else {
            LAST.next = NEWNODE; // setting ref for second to last to the new last.
        }
        size++;
    }

    private String unlinkLast(Node last) {
        final String ELEMENT = this.last.item;
        final Node PREV = this.last.prev;
        last.item = null;
        last.prev = null;
        if (PREV == null) {     // check if it is first element
            this.first = null;
        } else {
            this.last = PREV;
        }
        size--;
        return ELEMENT;
    }

    @Override
    public void push(String e) {
        if (size == 0) {
            linkFirst(e);
        } else {
            linkLast(e);
        }
    }

    @Override
    public String pop() {
        return (last == null) ? null : unlinkLast(last);
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public boolean full() {
        throw new NotImplementedException();
    }

    @Override
    public void show() {
        for (Node x = first; x != null; x = x.next) {
            System.out.print(x.item + " ");
        }
    }

    private class Node {
        Node prev;
        String item;
        Node next;

        Node(Node prev, String item, Node next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}
