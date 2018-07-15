package com.company;

public class LinkedList {

    node start;
    node temp;

    private class node{
         int number;
         node pointer;
     }

    public void init(int n){
         temp=new node();
         temp.number=n;
         temp.pointer=null;
         start=temp;
         temp=null;
    }


    public void add(int n){
        temp=new node();
        temp.number=n;
        temp.pointer=null;
        node parser=start;
        while (parser.pointer!= null) {
                parser = parser.pointer;
            }
            parser.pointer=temp;
            temp=null;

    }
    public boolean deleteNumber(int n){
        node parser=start;
        if(parser.number==n){
            start=parser.pointer;
            return true;
        }
        while(parser.pointer!=null){
            if(parser.pointer.number==n){
                parser.pointer=parser.pointer.pointer;
                return true;
                }
            parser=parser.pointer;
        }
        return false;
        }

    public void display(){
        node parser=start;

        while (parser.pointer!= null) {
            System.out.print(parser.number+" -> ");
            parser = parser.pointer;
        }
        System.out.print(parser.number);

    }

    public static void main(String[] args){
        LinkedList l=new LinkedList();
        System.out.print("Linked List\n");
        l.init(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.display();
        System.out.println("\nDelete Node 6");

        if(!l.deleteNumber(3)){
            System.out.print("Number not found");
            }
            else System.out.print("Number Deleted\n");
        l.display();
        }
}
