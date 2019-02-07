package com.dkm;

import java.util.ArrayList;

public class Stack
{
    public ArrayList<String> stack;

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
        if (stack.size() == 0)
        {
            return "There are no items in your Stack";
        }
        else
        {
            return String.valueOf(stack.size());
        }
    }
}
