package com.dkm;

import java.util.ArrayList;

class Stack
{
    private ArrayList<String> stack;

    public Stack()
    {
        this.stack = new ArrayList<>(1000);
    }

    ArrayList<String> print()
    {
        return stack;
    }

    void push(String plate)
    {
        stack.add(plate);
    }

    String pop()
    {
        return stack.remove(stack.size() - 1);
    }

    String numOfItems()
    {
        if (stack == null)
        {
            return "There are no items in your Stack";
        }
        else
        {
            return String.valueOf(stack.size());
        }
    }

    @Override
    public String toString()
    {
        return "" + stack;
    }
}
