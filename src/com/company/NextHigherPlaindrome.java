package com.company;


import java.sql.SQLOutput;

public class NextHigherPlaindrome {

    public static int[] mirror(int arr[],int n){


            for(int i=0,j=n-1;i<j&&i<n&&j>=0;i++,j--){
                arr[j]=arr[i];
                //System.out.println(arr[i]);
            }
        return  arr;

    }
    public static void print(int arr[],int n){
        for(int i=0;i<n;i++) System.out.print(arr[i]);
        System.out.println();
    }
    public static int[] increment(int arr[],int n){

        //System.out.println(arr);

        int index=0;
        if(n%2==1){
            index=n/2;
        }
        else{index=(n/2)-1;}
        int currentNumber=arr[index];
        //System.out.println("CurrentNumber"+currentNumber);
        int carry=1;
    while(index>=0){
        currentNumber=arr[index]+carry;
        arr[index]=(currentNumber)%10;
        carry=currentNumber/10;
        index--;
    }
        return arr;
    }
    public static void main(String[] args) {

        int arr[]=new int[]{1,2,9,4,5,6};
        arr=mirror(arr,6);

        print(mirror(increment(arr,6),6),6);

    }
}
