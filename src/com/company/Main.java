package com.company;

public class Main {

    public static void main(String[] args) {
	final int max = 100;
	final int generateRandomAge =generateRandomAge (max);
        System.out.println("Случайный возраст:  "+ generateRandomAge);

    }
    public static int generateRandomAge (int max) {
        return (int) (Math.random()* ++max);
    }
}
