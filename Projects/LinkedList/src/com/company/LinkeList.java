package com.company;

public class LinkeList {
    private Link first;
    private Link next;

    public LinkeList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(int value) {
        Link link = new Link(value);
        link.next = first;
        first = link;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List : ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public Link find(int key) {
        Link current = first;
        while (current.data != key) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
}