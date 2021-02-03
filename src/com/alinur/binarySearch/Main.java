package com.alinur.binarySearch;

public class Main {

    public static void main(String[] args) {
	    HighArray array = new HighArray((int)(Math.random()*50)+1);
        array.print();
        System.out.println(array.find(39));
    }
}
