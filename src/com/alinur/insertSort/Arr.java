package com.alinur.insertSort;

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

    public void insertionSort()
    {
        int in, out;
        for(out=1; out<nElems; out++) // out - разделительный маркер
        {
            long temp = a[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while(in>0 && a[in-1] >= temp) // Пока не найден меньший элемент
            {
                a[in] = a[in-1]; // Сдвинуть элемент вправо
                in--; // Перейти на одну позицию влево
            }
            a[in] = (int) temp; // Вставить помеченный элемент
        }
        print();
    }

    private void replace(int start, int out){
        for(int i = out; i > start; i++){
            a[i] = a[i-1];
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
