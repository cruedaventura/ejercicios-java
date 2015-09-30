package com.company;

public class Tree
{
    private int    altura;
    private String nombre;

    public Tree()
    {
        this(null, 0);
    }

    public Tree(int altura)
    {
        this(null, altura);
    }

    public Tree(String nombre)
    {
        this(nombre, 0);
    }

    public Tree(String nombre, int altura)
    {
        this.altura = altura;
        this.nombre = nombre;
    }


    public String toString()
    {
        String sentence = "Un ";

        if (this.nombre == null) {
            sentence += "arbol";
        } else {
            sentence += this.nombre;
        }

        if (this.altura > 0) {
            sentence += " que mide " + this.altura + " metros";
        }

        return sentence;
    }


}
