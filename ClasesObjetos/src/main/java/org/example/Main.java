package org.example;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Harry Potter", "J. K. Rowling", 20);
        System.out.println(libro.toString());
        System.out.println("La cantidad de ejemplares en stock es de: " + libro.getEjemplares());

    }
}