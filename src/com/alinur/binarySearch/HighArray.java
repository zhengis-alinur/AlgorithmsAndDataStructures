package com.alinur.binarySearch;

public class HighArray {
    int[] a;
    private int nElems;

    public HighArray(int nElems){
        this.nElems = nElems;
        a = new int[nElems];
        int rand = (int)(Math.random()*10);
        a[0] = rand;
        for(int i = 1; i < getnElems(); i++){
            rand = (int)(Math.random()*10);
            a[i] = a[i-1] + rand;
        }
    }
    public int getnElems(){
        return nElems;
    }

    public int find(long searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true)
        {
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn]==searchKey)
                return curIn; // Элемент найден
 else if(lowerBound > upperBound)
            return nElems; // Элемент не найден
        else // Деление диапазона
        {
            if(a[curIn] < searchKey)
                lowerBound = curIn + 1; // В верхней половине
            else
                upperBound = curIn - 1; // В нижней половине
        }
        }
    }

    public void print(){
        for(int i = 0; i < nElems; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
