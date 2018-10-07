package com.company;

public class MergeSort {

    private int[] divide(int arr[],int start,int last){

        if(arr.length==1){

return arr;
        }

else {

           int n1=last/2-start+1;
            int n2=last-last/2;
           int arr1[]=new int[n1];
           for(int i=0;i<n1;i++){
               arr1[i]=arr[i];
           }
            int arr2[]=new int[n2];
            for(int i=0,k=last/2+1;i<n2;i++){
                arr2[i]=arr[i+k];
            }

            arr1=divide(arr1,0,arr1.length-1);
            arr2=divide(arr2,0,arr2.length-1);

            return conquer(arr1, arr2);
        }
    }
    private void print(int arr[]){
        for (int var: arr){
            System.out.print(var+" ");
        }
        System.out.println();
    }
    private int[] conquer(int arr1[], int arr2[]){

        int totalLength=arr1.length+arr2.length;
        int tempArray[]=new int[totalLength];
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]>arr2[j]){
                tempArray[k]=arr2[j];
                j++;
            }
            else{
                tempArray[k]=arr1[i];
                i++;
            }
            k++;

            }
            while(i<arr1.length){
                tempArray[k]=arr1[i];i++;k++;
            }
            while(j<arr2.length){
            tempArray[k]=arr2[j];j++;k++;
            }

         return tempArray;
        }


    public static void main(String[] args) {

        MergeSort m=new MergeSort();
        int result[]=m.divide(new int[]{1,6,4,2,7,9,3},0,6);
        m.print(result);
    }
}
