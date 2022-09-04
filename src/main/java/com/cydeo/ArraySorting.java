package com.cydeo;

public class ArraySorting {//QuickSort,BubbleSort

    public static void main(String[] args) {
        ArraySorting as=new ArraySorting();
        BubbleSort bs=new BubbleSort();
        QuickSort qs=new QuickSort();
        as.sort1(bs);
        as.sort1(qs);
    }

    private void sort1(Sorting sorting){
        sorting.sort();
    }
}
