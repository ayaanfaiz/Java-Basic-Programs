import java.io.*;
public class linkedList
{
    class node
    {
        int data;
        node next;
        node(int a)
        {
            data = a;
            next = null;
        }
    }
    node head;
    public void insert(int a)
    {
        node newnode = new node(a);
        if(head == null)
        {
            head = newnode;
            head.next = null;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }
    public void display()
    {
        while(head!=null)
        {
            System.out.println(head.data+" ");
            head = head.next;
        }
    }        
   // node head;
    public static void main(String[] args)
    {
        linkedList list = new linkedList();
        list.insert(5);
        list.insert(10);
        list.display();
    }
}
