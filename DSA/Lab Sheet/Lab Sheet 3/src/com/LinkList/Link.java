package com.LinkList;

public class Link {
    public String Name;
    public double Average;
    public Link Next;

    public Link(String name, double avg){
        this.Name = name;
        this.Average = avg;
        Next = null;
    }

    public void displayDetails(){
        System.out.println(Name+" "+Average);
    }



}
