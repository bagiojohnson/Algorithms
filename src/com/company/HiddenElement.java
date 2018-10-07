package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Arrays;
import java.util.Scanner;

/*
* Hidden Number
You are given an array  of  integers. Now there is another integer  which is unknown but you know its properties. The properties of the unknown number are:

. It is an integer.

. If you subtract all the elements of the array  individually from the number  and add all the differences then it adds to .

Your goal is to find the number .

Input
The first line contains an integer  denoting the total number of test cases.
The first line of each test case contains an integer  as input.
Next line of each test case contains  space separated integers.

Output
In the output you need to print the number  if it exists or else you need to print .


*
* */
public class HiddenElement {

public static int checksum(int arr[],int n){
    int sum=0;
    for(int var:arr){
        sum=sum+(var-n);
    }
    //System.out.println("Sum of "+n+":="+sum);
   return sum;
}
public static int binarySearch(int arr[],int start,int end){
    int m=(end+start)/2;
    //System.out.println("Middle:"+m);

    if(checksum(arr,arr[m])==0){return arr[m];}
    if(start>end){return 99999;}


    if(checksum(arr,arr[m])>0){
        //System.out.println("Right"+(m+1)+" "+end);
        return binarySearch(arr,m+1,end);
    }
    else {
        //System.out.println(start+" "+(m-1));
        return binarySearch(arr,start,m-1);

    }


}


public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    int times = s.nextInt();
    while (times > 0) {
        int len = s.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }


        Arrays.sort(arr);
        int result = binarySearch(arr, 0, arr.length);
        if (result == 99999) {
            System.out.println("-1");
        } else System.out.println(result);

        times--;
    }


}
}
