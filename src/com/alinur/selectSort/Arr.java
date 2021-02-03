package com.alinur.selectSort;

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

    public void selectSort()
    {
        print();
        int out, in;
        for(out = 0; out < nElems - 2; out++){ // Внешний цикл (обратный)
            int min = out;
            for(in = out + 1; in < nElems; in++){ // Внутренний цикл (прямой)
                if(a[min] > a[in]){
                    min = in;
                }
            }
            swap(out, min);
            print();
        }
    }
    private void swap(int i, int j){
        int temp = a[j];
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
