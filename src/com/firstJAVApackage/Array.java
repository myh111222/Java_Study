package com.firstJAVApackage;


import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;
    public Array(int length){
        items = new int [length];
    }

    public void print (){
        for (int i=0; i<count;i++){
            System.out.println(items[i]);
        }
    }

    public void addArray(int item){
        if (count >= items.length) {
            System.out.println("FULL");
        }
        else {
            items[count] = item;
            count++;
            System.out.println("haha " + item);
        }
    }
}
