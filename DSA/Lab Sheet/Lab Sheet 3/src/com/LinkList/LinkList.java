package com.LinkList;

public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(String name, double avg){
        Link newLink = new Link(name,avg);
        newLink.Next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.Next;
        return temp;
    }

    public Link deleteLink(String name){
       Link current = first;
       Link previous = first;

       while (current.Name!=name){
           if (current.Next==null){
                return null;
           }
           else{
               previous = current;
               current = current.Next;

           }
       }
       if(current==first){
           first=first.Next;
       }
       else{
           previous.Next=current.Next;
       }
       return current;
    }


    public void displayList(){
        System.out.println("List from first Link to the last Link");

        Link current = first;
        while(current != null){
            current.displayDetails();
            current = current.Next;
        }

    }


}
