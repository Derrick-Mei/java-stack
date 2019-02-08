package com.dkm;

class Main {

    public static void main(String[] args)
    {
        Stack s = new Stack();

        System.out.println(s.numOfItems());

        s.push("first");
        s.push("second");
        s.push("third");

        System.out.println(s.numOfItems());
        System.out.println(s.print());

        s.pop();
        System.out.println(s.print());

        s.pop();
        System.out.println(s.print());

        s.pop();
        System.out.println(s.print());

        System.out.println(s.numOfItems());


    }
}
