package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Tree[] arboles = new Tree[5];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree("Pino");
        arboles[4] = new Tree("Roble", 3);

        for (Tree tree : arboles) {
            System.out.println(tree);
        }

    }
}
