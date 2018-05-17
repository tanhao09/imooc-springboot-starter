package com.imooc.example.array;

public class ArrayInt {
    private int[] data;
    private int size;
    public  ArrayInt(int capacity){
        data=new int[capacity];
        size=0;
    }
    public  ArrayInt(){
        this(10);
    }

    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return data.length;
    }
    public void addLast(int param){
//        if (size==data.length){
//            throw new IllegalArgumentException("add Last failed");
//        }
//        data[size]=param;
//        size++;
        addPostion(size,param);
    }
    public void addPostion(int index,int param){

        if(size==data.length){
            throw new IllegalArgumentException("add failed");
        }
        if(index<0||index >size){
            throw new IllegalArgumentException("index out od Bound ");
        }
        for(int i=size-1;i>=index ;i--){
            data[i+1]=data[i];
        }
        data[index]=param;
        size++;
    }
    public void addFirst(int param){
        addPostion(0,param);
    }






}
