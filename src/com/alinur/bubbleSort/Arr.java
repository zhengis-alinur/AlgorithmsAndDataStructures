package com.alinur.bubbleSort;

public class Arr {
    int[] a;
    private int nElems;

    public Arr(int limit){
        this.nElems = (int)(Math.random()*limit)+1;
        a = new int[nElems];
        for(int i = 0; i < nElems; i++){
            a[i] = (int)(Math.random()*1000);
        }
    }
    public int getnElems(){
        return nElems;
    }

    public void bubbleSort()
    {
        print();
        int out, in;
        for(out=nElems-1; out>1; out--){ // Внешний цикл (обратный)
            for(in=0; in<out; in++){ // Внутренний цикл (прямой)
                if( a[in] > a[in+1] ) // Порядок нарушен?
                    swap(in, in+1); // Поменять местами
            }
            print();
        }
    }
    private void swap(int i, int j){
        int temp = a[i+1];
        a[j] = a[i];
        a[i] = temp;
    }

    public void print(){
        for(int i = 0; i < nElems; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
