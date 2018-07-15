///Program to find the total number of sets and displays the sets which have sum of given number.

//Uses recursion, starts from an empty set and gradually add each number and generates all possibility of sets from given array.


package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindNoOfSetsFromSum {
    public static HashMap memo=new HashMap();
    public static List totalSets=new ArrayList();



    public static int recur(int arr[],int sum,int index,List l){


        if(sum==0){
            totalSets.add(l);
            return 1;}
        else if(index<0)return 0;
        else if(sum<0){return 0;}
        else {
            List s=new ArrayList(l);
            s.add(arr[index]);
            //System.out.println("S: "+s+", L: "+l);
            return recur(arr,sum-arr[index],index-1,s)+recur(arr,sum,index-1,l);
            }


    }

    public static void main(String[] args){


        int arr[]=new int[]{2,4,6,10};
        List set=new ArrayList();
        int sum=16;
        int answer=FindNoOfSetsFromSum.recur(arr,sum,arr.length-1,set);
        System.out.println(answer);
        if(answer>0){
            System.out.println(FindNoOfSetsFromSum.totalSets);
        }

    }
}
