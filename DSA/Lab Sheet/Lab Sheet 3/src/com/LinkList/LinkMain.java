package com.LinkList;

public class LinkMain {
    public static void main(String[] args){
       // Link L1 = new Link("Nipuna",53.5);
       // Link L2 = new Link("Aravinda",78.0);
       // Link L3 = new Link("Prashani",69.5);

       // L1.Next = L2;
       // L2.Next = L3;
       // L3.Next = null;

        //L1.Next.Next.displayDetails();
       // L1.Next.displayDetails();

        LinkList theLink = new LinkList();

        theLink.insertFirst("Nipuna",53.5);
        theLink.insertFirst("Aravinda",78.0);
        theLink.insertFirst("Prabashani",69.5);
        theLink.displayList();

        theLink.deleteLink("Prabashani");
        theLink.displayList();
    }

}
