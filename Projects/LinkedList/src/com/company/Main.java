package com.company;

public class Main {

    public static void main(String[] args) {
        LinkeList theList = new LinkeList();
        theList.insert(12);
        theList.insert(1123);
        theList.insert(10);
        theList.insert(18);
        theList.insert(17);
        theList.insert(16);
        theList.insert(15);
        theList.insert(14);
        theList.displayList();

//        while(!theList.isEmpty()){
//            Link link = theList.deleteFirst();
//            System.out.print("Deleted : ");
//            link.displayLink();
//            System.out.println("");
//        }
        System.out.println(theList.find(1123));
//        theList.displayList();
    }
}
