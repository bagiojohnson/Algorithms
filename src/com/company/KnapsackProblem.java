package com.company;

public class KnapsackProblem {
    public static int weightArr[]=new int[]{1,3,4,5};
    public static int valueArr[]=new int[]{1,4,5,7};


    public static int recur(int availableWeight,int index){
        if(availableWeight==0){return 0;}
        else if(index<0){return 0;}
        else{
            if(availableWeight<weightArr[index]){
                System.out.println("recur("+availableWeight+","+(index-1)+")");
                return recur(availableWeight,index-1);

            }
            else{
                int tmp1=valueArr[index]+recur(availableWeight-weightArr[index],index-1);
                int tmp2=recur(availableWeight,index-1);
                return maxOf(tmp1,tmp2);


            }
        }

    }
public static int maxOf(int a, int b){
if(a>b){return a;}
else return b;
    }



    public static void main(String[] args){

        System.out.println(recur(7,weightArr.length-1));
    }

}
